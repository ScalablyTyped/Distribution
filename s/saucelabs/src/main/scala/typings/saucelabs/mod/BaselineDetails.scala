package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaselineDetails
  extends /* key */ StringDictionary[js.Any] {
  
  var baseline: js.UndefOr[Double] = js.native
  
  var lower_boundary: js.UndefOr[Double] = js.native
  
  var upper_boundary: js.UndefOr[Double] = js.native
  
  var values: js.UndefOr[js.Array[BaselineValues]] = js.native
}
object BaselineDetails {
  
  @scala.inline
  def apply(): BaselineDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineDetails]
  }
  
  @scala.inline
  implicit class BaselineDetailsOps[Self <: BaselineDetails] (val x: Self) extends AnyVal {
    
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
    def setLower_boundary(value: Double): Self = this.set("lower_boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLower_boundary: Self = this.set("lower_boundary", js.undefined)
    
    @scala.inline
    def setUpper_boundary(value: Double): Self = this.set("upper_boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpper_boundary: Self = this.set("upper_boundary", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: BaselineValues*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[BaselineValues]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
