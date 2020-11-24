package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertDetails
  extends /* key */ StringDictionary[js.Any] {
  
  var baseline: js.UndefOr[Double] = js.native
  
  var datetime: js.UndefOr[String] = js.native
  
  var job_id: js.UndefOr[String] = js.native
  
  var lower_boundary: js.UndefOr[Double] = js.native
  
  var order_index: js.UndefOr[Double] = js.native
  
  var outlier: js.UndefOr[OutlierDetails] = js.native
  
  var real_value: js.UndefOr[Double] = js.native
  
  var upper_boundary: js.UndefOr[Double] = js.native
}
object AssertDetails {
  
  @scala.inline
  def apply(): AssertDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertDetails]
  }
  
  @scala.inline
  implicit class AssertDetailsOps[Self <: AssertDetails] (val x: Self) extends AnyVal {
    
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
    def setBaseline(value: Double): Self = this.set("baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseline: Self = this.set("baseline", js.undefined)
    
    @scala.inline
    def setDatetime(value: String): Self = this.set("datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatetime: Self = this.set("datetime", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = this.set("job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob_id: Self = this.set("job_id", js.undefined)
    
    @scala.inline
    def setLower_boundary(value: Double): Self = this.set("lower_boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLower_boundary: Self = this.set("lower_boundary", js.undefined)
    
    @scala.inline
    def setOrder_index(value: Double): Self = this.set("order_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder_index: Self = this.set("order_index", js.undefined)
    
    @scala.inline
    def setOutlier(value: OutlierDetails): Self = this.set("outlier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlier: Self = this.set("outlier", js.undefined)
    
    @scala.inline
    def setReal_value(value: Double): Self = this.set("real_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReal_value: Self = this.set("real_value", js.undefined)
    
    @scala.inline
    def setUpper_boundary(value: Double): Self = this.set("upper_boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpper_boundary: Self = this.set("upper_boundary", js.undefined)
  }
}
