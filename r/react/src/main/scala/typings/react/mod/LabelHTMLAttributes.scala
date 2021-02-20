package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var form: js.UndefOr[String] = js.native
  
  var htmlFor: js.UndefOr[String] = js.native
}
object LabelHTMLAttributes {
  
  @scala.inline
  def apply[T](): LabelHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class LabelHTMLAttributesMutableBuilder[Self <: LabelHTMLAttributes[_], T] (val x: Self with LabelHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
  }
}
