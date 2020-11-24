package typings.saucelabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeBaseline extends js.Object {
  
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
  implicit class IncludeBaselineOps[Self <: IncludeBaseline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = this.set("metricNames", js.Array(value :_*))
    
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = this.set("metricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIndex(value: Double): Self = this.set("orderIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBaseline(value: Boolean): Self = this.set("includeBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeBaseline: Self = this.set("includeBaseline", js.undefined)
  }
}
