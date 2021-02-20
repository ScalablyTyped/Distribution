package typings.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeBaseline extends StObject {
  
  var includeBaseline: js.UndefOr[Boolean] = js.native
  
  var metricNames: js.Array[String] = js.native
  
  var orderIndex: Double = js.native
}
object IncludeBaseline {
  
  @scala.inline
  def apply(metricNames: js.Array[String], orderIndex: Double): IncludeBaseline = {
    val __obj = js.Dynamic.literal(metricNames = metricNames.asInstanceOf[js.Any], orderIndex = orderIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeBaseline]
  }
  
  @scala.inline
  implicit class IncludeBaselineMutableBuilder[Self <: IncludeBaseline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeBaseline(value: Boolean): Self = StObject.set(x, "includeBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBaselineUndefined: Self = StObject.set(x, "includeBaseline", js.undefined)
    
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value :_*))
    
    @scala.inline
    def setOrderIndex(value: Double): Self = StObject.set(x, "orderIndex", value.asInstanceOf[js.Any])
  }
}
