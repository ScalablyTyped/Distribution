package typings.reactMdMenu

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdMenu.typesTypesMod.BaseMenuButtonProps
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuButtonMod {
  
  @JSImport("@react-md/menu/types/MenuButton", "MenuButton")
  @js.native
  val MenuButton: ForwardRefExoticComponent[MenuButtonProps & RefAttributes[HTMLButtonElement]] = js.native
  
  trait MenuButtonProps
    extends StObject
       with BaseMenuButtonProps {
    
    /**
      * Boolean if the menu is currently visible which will rotate the dropdown
      * icon when the {@link BaseMenuButtonProps.disableDropdownIcon} is not
      * `true`.
      */
    var visible: Boolean
  }
  object MenuButtonProps {
    
    inline def apply(id: String, visible: Boolean): MenuButtonProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuButtonProps]
    }
    
    extension [Self <: MenuButtonProps](x: Self) {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
