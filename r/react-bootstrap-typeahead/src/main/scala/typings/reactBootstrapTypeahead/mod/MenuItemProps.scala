package typings.reactBootstrapTypeahead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItemProps[T /* <: TypeaheadModel */]
  extends StObject
     with BaseMenuItemProps {
  
  var option: T
  
  var position: Double
}
object MenuItemProps {
  
  inline def apply[T /* <: TypeaheadModel */](option: T, position: Double): MenuItemProps[T] = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuItemProps[?], T /* <: TypeaheadModel */] (val x: Self & MenuItemProps[T]) extends AnyVal {
    
    inline def setOption(value: T): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
