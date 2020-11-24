package typings.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconToggleStyle extends js.Object {
  
  var offColor: js.UndefOr[String] = js.native
  
  var onColor: js.UndefOr[String] = js.native
  
  var rippleColor: js.UndefOr[String] = js.native
}
object IconToggleStyle {
  
  @scala.inline
  def apply(): IconToggleStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconToggleStyle]
  }
  
  @scala.inline
  implicit class IconToggleStyleOps[Self <: IconToggleStyle] (val x: Self) extends AnyVal {
    
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
    def setOffColor(value: String): Self = this.set("offColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffColor: Self = this.set("offColor", js.undefined)
    
    @scala.inline
    def setOnColor(value: String): Self = this.set("onColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnColor: Self = this.set("onColor", js.undefined)
    
    @scala.inline
    def setRippleColor(value: String): Self = this.set("rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleColor: Self = this.set("rippleColor", js.undefined)
  }
}
