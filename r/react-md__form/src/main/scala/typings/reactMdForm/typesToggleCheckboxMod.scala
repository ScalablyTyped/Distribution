package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdForm.typesToggleInputToggleMod.InputToggleProps
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesToggleCheckboxMod {
  
  @JSImport("@react-md/form/types/toggle/Checkbox", "Checkbox")
  @js.native
  val Checkbox: ForwardRefExoticComponent[CheckboxProps & RefAttributes[HTMLInputElement]] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactMdForm.typesToggleCheckboxMod.IndeterminateCheckboxProps because var conflicts: `aria-controls`. Inlined indeterminate */ trait CheckboxProps
    extends StObject
       with InputToggleProps {
    
    /**
      * Boolean if the checkbox can have an indeterminate state. This is used when
      * there is a checkbox group where a single checkbox and select/deselect all
      * related checkboxes. This should be enabled when not all the related
      * checkboxes have been checked.
      */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
  }
  object CheckboxProps {
    
    inline def apply(id: String): CheckboxProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    }
  }
  
  trait IndeterminateCheckboxProps extends StObject {
    
    /**
      * If the indeterminate prop is enabled, the this prop must be a
      * space-delimited string of **all** the checkboxes that it controls.
      */
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean if the checkbox can have an indeterminate state. This is used when
      * there is a checkbox group where a single checkbox and select/deselect all
      * related checkboxes. This should be enabled when not all the related
      * checkboxes have been checked.
      */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
  }
  object IndeterminateCheckboxProps {
    
    inline def apply(): IndeterminateCheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndeterminateCheckboxProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndeterminateCheckboxProps] (val x: Self) extends AnyVal {
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    }
  }
}
