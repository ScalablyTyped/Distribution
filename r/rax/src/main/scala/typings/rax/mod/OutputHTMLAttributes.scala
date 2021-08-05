package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var form: js.UndefOr[String] = js.undefined
  
  var htmlFor: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object OutputHTMLAttributes {
  
  inline def apply[T](): OutputHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputHTMLAttributes[T]]
  }
  
  extension [Self <: OutputHTMLAttributes[?], T](x: Self & OutputHTMLAttributes[T]) {
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
    
    inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
