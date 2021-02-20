package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdList.getListItemHeightMod.SimpleListItemProps
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionMod {
  
  @JSImport("@react-md/form/types/select/Option", "Option")
  @js.native
  val Option: ForwardRefExoticComponent[OptionProps with RefAttributes[HTMLLIElement]] = js.native
  
  @js.native
  trait OptionProps extends SimpleListItemProps {
    
    /**
      * Boolean if the option is currently selected via aria-activedescendant
      * movement.
      */
    var focused: Boolean = js.native
    
    /**
      * Boolean if the option's value is equal to the current listbox's value if it
      * is acting as a select component.
      */
    var selected: Boolean = js.native
  }
  object OptionProps {
    
    @scala.inline
    def apply(focused: Boolean, selected: Boolean): OptionProps = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionProps]
    }
    
    @scala.inline
    implicit class OptionPropsMutableBuilder[Self <: OptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
