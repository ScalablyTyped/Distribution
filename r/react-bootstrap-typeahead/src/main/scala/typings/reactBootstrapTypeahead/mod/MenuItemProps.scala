package typings.reactBootstrapTypeahead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItemProps[T /* <: TypeaheadModel */] extends BaseMenuItemProps {
  
  var option: T = js.native
  
  var position: Double = js.native
}
object MenuItemProps {
  
  @scala.inline
  def apply[T /* <: TypeaheadModel */](option: T, position: Double): MenuItemProps[T] = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemProps[T]]
  }
  
  @scala.inline
  implicit class MenuItemPropsMutableBuilder[Self <: MenuItemProps[_], T /* <: TypeaheadModel */] (val x: Self with MenuItemProps[T]) extends AnyVal {
    
    @scala.inline
    def setOption(value: T): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
