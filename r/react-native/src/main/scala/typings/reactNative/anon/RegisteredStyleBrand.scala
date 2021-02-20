package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisteredStyleBrand[T] extends StObject {
  
  var __registeredStyleBrand: T = js.native
}
object RegisteredStyleBrand {
  
  @scala.inline
  def apply[T](__registeredStyleBrand: T): RegisteredStyleBrand[T] = {
    val __obj = js.Dynamic.literal(__registeredStyleBrand = __registeredStyleBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredStyleBrand[T]]
  }
  
  @scala.inline
  implicit class RegisteredStyleBrandMutableBuilder[Self <: RegisteredStyleBrand[_], T] (val x: Self with RegisteredStyleBrand[T]) extends AnyVal {
    
    @scala.inline
    def set__registeredStyleBrand(value: T): Self = StObject.set(x, "__registeredStyleBrand", value.asInstanceOf[js.Any])
  }
}
