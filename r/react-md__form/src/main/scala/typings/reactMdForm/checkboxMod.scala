package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdForm.inputToggleMod.InputToggleProps
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  @JSImport("@react-md/form/types/toggle/Checkbox", "Checkbox")
  @js.native
  val Checkbox: ForwardRefExoticComponent[CheckboxProps with RefAttributes[HTMLInputElement]] = js.native
  
  @js.native
  trait CheckboxProps extends InputToggleProps {
    
    /**
      * Boolean if the checkbox can have an indeterminate state. This is used when
      * there is a checkbox group where a single checkbox and select/deselect all
      * related checkboxes. This should be enabled when not all the related
      * checkboxes have been checked.
      */
    var indeterminate: js.UndefOr[Boolean] = js.native
  }
  object CheckboxProps {
    
    @scala.inline
    def apply(id: String): CheckboxProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxProps]
    }
    
    @scala.inline
    implicit class CheckboxPropsMutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    }
  }
}
