package typings.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxStyle extends js.Object {
  
  var borderOffColor: js.UndefOr[String] = js.native
  
  var borderOnColor: js.UndefOr[String] = js.native
  
  var fillColor: js.UndefOr[String] = js.native
  
  var inset: js.UndefOr[Double] = js.native
  
  var rippleColor: js.UndefOr[String] = js.native
}
object CheckboxStyle {
  
  @scala.inline
  def apply(): CheckboxStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxStyle]
  }
  
  @scala.inline
  implicit class CheckboxStyleOps[Self <: CheckboxStyle] (val x: Self) extends AnyVal {
    
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
    def setBorderOffColor(value: String): Self = this.set("borderOffColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderOffColor: Self = this.set("borderOffColor", js.undefined)
    
    @scala.inline
    def setBorderOnColor(value: String): Self = this.set("borderOnColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderOnColor: Self = this.set("borderOnColor", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setInset(value: Double): Self = this.set("inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    
    @scala.inline
    def setRippleColor(value: String): Self = this.set("rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleColor: Self = this.set("rippleColor", js.undefined)
  }
}
