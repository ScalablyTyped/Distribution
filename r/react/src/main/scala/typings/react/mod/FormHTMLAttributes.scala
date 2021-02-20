package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var acceptCharset: js.UndefOr[String] = js.native
  
  var action: js.UndefOr[String] = js.native
  
  var autoComplete: js.UndefOr[String] = js.native
  
  var encType: js.UndefOr[String] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var noValidate: js.UndefOr[Boolean] = js.native
  
  var target: js.UndefOr[String] = js.native
}
object FormHTMLAttributes {
  
  @scala.inline
  def apply[T](): FormHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class FormHTMLAttributesMutableBuilder[Self <: FormHTMLAttributes[_], T] (val x: Self with FormHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    @scala.inline
    def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
