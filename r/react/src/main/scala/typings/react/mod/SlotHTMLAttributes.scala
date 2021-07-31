package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var name: js.UndefOr[String] = js.undefined
}
object SlotHTMLAttributes {
  
  @scala.inline
  def apply[T](): SlotHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class SlotHTMLAttributesMutableBuilder[Self <: SlotHTMLAttributes[?], T] (val x: Self & SlotHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
