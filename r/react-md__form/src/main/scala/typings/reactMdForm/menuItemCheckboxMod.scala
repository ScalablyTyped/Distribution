package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefAttributes
import typings.reactMdForm.menuItemInputToggleMod.BaseMenuItemInputToggleProps
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemCheckboxMod {
  
  @JSImport("@react-md/form/types/menu/MenuItemCheckbox", "MenuItemCheckbox")
  @js.native
  val MenuItemCheckbox: ForwardRefExoticComponent[MenuItemCheckboxProps & RefAttributes[HTMLLIElement]] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactMdForm.checkboxMod.IndeterminateCheckboxProps because var conflicts: `aria-controls`. Inlined indeterminate */ trait MenuItemCheckboxProps
    extends StObject
       with BaseMenuItemInputToggleProps {
    
    /**
      * Boolean if the checkbox can have an indeterminate state. This is used when
      * there is a checkbox group where a single checkbox and select/deselect all
      * related checkboxes. This should be enabled when not all the related
      * checkboxes have been checked.
      */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
  }
  object MenuItemCheckboxProps {
    
    inline def apply(
      checked: Boolean,
      id: String,
      onCheckedChange: (Boolean, MouseEvent[HTMLLIElement, NativeMouseEvent]) => Unit
    ): MenuItemCheckboxProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onCheckedChange = js.Any.fromFunction2(onCheckedChange))
      __obj.asInstanceOf[MenuItemCheckboxProps]
    }
    
    extension [Self <: MenuItemCheckboxProps](x: Self) {
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    }
  }
}
