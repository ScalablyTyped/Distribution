package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisteredStyleBrand[T] extends js.Object {
  
  var __registeredStyleBrand: T = js.native
}
object RegisteredStyleBrand {
  
  @scala.inline
  def apply[T](__registeredStyleBrand: T): RegisteredStyleBrand[T] = {
    val __obj = js.Dynamic.literal(__registeredStyleBrand = __registeredStyleBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredStyleBrand[T]]
  }
  
  @scala.inline
  implicit class RegisteredStyleBrandOps[Self <: RegisteredStyleBrand[_], T] (val x: Self with RegisteredStyleBrand[T]) extends AnyVal {
    
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
    def set__registeredStyleBrand(value: T): Self = this.set("__registeredStyleBrand", value.asInstanceOf[js.Any])
  }
}
