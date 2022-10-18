package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdForm.reactMdFormStrings.label
import typings.reactMdForm.reactMdFormStrings.span
import typings.std.HTMLLabelElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLabelLabelMod {
  
  @JSImport("@react-md/form/types/label/Label", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/form/types/label/Label", "Label")
  @js.native
  val Label: ForwardRefExoticComponent[LabelProps & RefAttributes[HTMLLabelElement]] = js.native
  
  inline def labelStyles(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("labelStyles")().asInstanceOf[String]
  inline def labelStyles(hasErrorActiveDisabled: LabelStates): String = ^.asInstanceOf[js.Dynamic].applyDynamic("labelStyles")(hasErrorActiveDisabled.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait LabelProps
    extends StObject
       with HTMLAttributes[HTMLLabelElement]
       with LabelStates {
    
    /**
      * The component to render the label as. This should be the default value of
      * `"label"` 99% of the time, but can also be rendered as a `"span"` for the
      * `Select` implementation where it needs to be rendered in a button.
      */
    var component: js.UndefOr[label | span] = js.undefined
    
    /**
      * An id for the `<input>` or `<textarea>` that this label is for. This is
      * required since all label's **should** point to a valid
      * `<input>`/`<textarea>`.
      */
    var htmlFor: String
  }
  object LabelProps {
    
    inline def apply(htmlFor: String): LabelProps = {
      val __obj = js.Dynamic.literal(htmlFor = htmlFor.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelProps]
    }
    
    extension [Self <: LabelProps](x: Self) {
      
      inline def setComponent(value: label | span): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
    }
  }
  
  trait LabelStates extends StObject {
    
    /**
      * Boolean if the label should gain the active state. This should normally be
      * enabled whenever the `<input>`/`<textarea>` gain focus. This is really more
      * for text input than anything else, and probably shouldn't be used for
      * checkbox, radio or switch components.
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the label should gain the disabled state.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the label should gain the error state.
      */
    var error: js.UndefOr[Boolean] = js.undefined
  }
  object LabelStates {
    
    inline def apply(): LabelStates = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelStates]
    }
    
    extension [Self <: LabelStates](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
}
