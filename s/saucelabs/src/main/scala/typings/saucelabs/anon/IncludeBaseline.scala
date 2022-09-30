package typings.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeBaseline extends StObject {
  
  var includeBaseline: js.UndefOr[Boolean] = js.undefined
  
  var metricNames: js.Array[String]
  
  var orderIndex: Double
}
object IncludeBaseline {
  
  inline def apply(metricNames: js.Array[String], orderIndex: Double): IncludeBaseline = {
    val __obj = js.Dynamic.literal(metricNames = metricNames.asInstanceOf[js.Any], orderIndex = orderIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeBaseline]
  }
  
  extension [Self <: IncludeBaseline](x: Self) {
    
    inline def setIncludeBaseline(value: Boolean): Self = StObject.set(x, "includeBaseline", value.asInstanceOf[js.Any])
    
    inline def setIncludeBaselineUndefined: Self = StObject.set(x, "includeBaseline", js.undefined)
    
    inline def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    inline def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value*))
    
    inline def setOrderIndex(value: Double): Self = StObject.set(x, "orderIndex", value.asInstanceOf[js.Any])
  }
}
