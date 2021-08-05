package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdList.getListItemHeightMod.SimpleListItemProps
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionMod {
  
  @JSImport("@react-md/form/types/select/Option", "Option")
  @js.native
  val Option: ForwardRefExoticComponent[OptionProps & RefAttributes[HTMLLIElement]] = js.native
  
  trait OptionProps
    extends StObject
       with SimpleListItemProps {
    
    /**
      * Boolean if the option is currently selected via aria-activedescendant
      * movement.
      */
    var focused: Boolean
    
    /**
      * Boolean if the option's value is equal to the current listbox's value if it
      * is acting as a select component.
      */
    var selected: Boolean
  }
  object OptionProps {
    
    inline def apply(focused: Boolean, selected: Boolean): OptionProps = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionProps]
    }
    
    extension [Self <: OptionProps](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
