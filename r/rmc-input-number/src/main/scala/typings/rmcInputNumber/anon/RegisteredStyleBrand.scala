package typings.rmcInputNumber.anon

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisteredStyleBrand extends js.Object {
  
  var __registeredStyleBrand: ViewStyle | TextStyle | ImageStyle = js.native
}
object RegisteredStyleBrand {
  
  @scala.inline
  def apply(__registeredStyleBrand: ViewStyle | TextStyle | ImageStyle): RegisteredStyleBrand = {
    val __obj = js.Dynamic.literal(__registeredStyleBrand = __registeredStyleBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredStyleBrand]
  }
  
  @scala.inline
  implicit class RegisteredStyleBrandOps[Self <: RegisteredStyleBrand] (val x: Self) extends AnyVal {
    
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
    def set__registeredStyleBrand(value: ViewStyle | TextStyle | ImageStyle): Self = this.set("__registeredStyleBrand", value.asInstanceOf[js.Any])
  }
}
