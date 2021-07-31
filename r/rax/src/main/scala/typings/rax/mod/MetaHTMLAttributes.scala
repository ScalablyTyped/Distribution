package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var charSet: js.UndefOr[String] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var httpEquiv: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object MetaHTMLAttributes {
  
  @scala.inline
  def apply[T](): MetaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class MetaHTMLAttributesMutableBuilder[Self <: MetaHTMLAttributes[?], T] (val x: Self & MetaHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
