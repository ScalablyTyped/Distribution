package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var name: js.UndefOr[String] = js.undefined
}
object MapHTMLAttributes {
  
  @scala.inline
  def apply[T](): MapHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class MapHTMLAttributesMutableBuilder[Self <: MapHTMLAttributes[?], T] (val x: Self & MapHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
