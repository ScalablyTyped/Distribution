package typings.saucelabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderIndex extends js.Object {
  
  var metricNames: js.Array[String] = js.native
  
  var orderIndex: Double = js.native
  
  var regimeEnd: js.UndefOr[Double] = js.native
  
  var regimeStart: js.UndefOr[Double] = js.native
}
object OrderIndex {
  
  @scala.inline
  def apply(metricNames: js.Array[String], orderIndex: Double): OrderIndex = {
    val __obj = js.Dynamic.literal(metricNames = metricNames.asInstanceOf[js.Any], orderIndex = orderIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderIndex]
  }
  
  @scala.inline
  implicit class OrderIndexOps[Self <: OrderIndex] (val x: Self) extends AnyVal {
    
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
    def setRegimeEnd(value: Double): Self = this.set("regimeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegimeEnd: Self = this.set("regimeEnd", js.undefined)
    
    @scala.inline
    def setRegimeStart(value: Double): Self = this.set("regimeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegimeStart: Self = this.set("regimeStart", js.undefined)
  }
}
