package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdForm.reactMdFormStrings.label
import typings.reactMdForm.reactMdFormStrings.span
import typings.std.HTMLLabelElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelLabelMod {
  
  @JSImport("@react-md/form/types/label/Label", "Label")
  @js.native
  val Label: ForwardRefExoticComponent[LabelProps with RefAttributes[HTMLLabelElement]] = js.native
  
  @js.native
  trait LabelProps extends HTMLAttributes[HTMLLabelElement] {
    
    /**
      * Boolean if the label should gain the active state. This should normally be
      * enabled whenever the `<input>`/`<textarea>` gain focus. This is really more
      * for text input than anything else, and probably shouldn't be used for
      * checkbox, radio or switch components.
      */
    var active: js.UndefOr[Boolean] = js.native
    
    /**
      * The component to render the label as. This should be the default value of
      * `"label"` 99% of the time, but can also be rendered as a `"span"` for the
      * `Select` implementation where it needs to be rendered in a button.
      */
    var component: js.UndefOr[label | span] = js.native
    
    /**
      * Boolean if the label should gain the disabled state.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the label should gain the error state.
      */
    var error: js.UndefOr[Boolean] = js.native
    
    /**
      * An id for the `<input>` or `<textarea>` that this label is for. This is
      * required since all label's **should** point to a valid
      * `<input>`/`<textarea>`.
      */
    var htmlFor: String = js.native
  }
  object LabelProps {
    
    @scala.inline
    def apply(htmlFor: String): LabelProps = {
      val __obj = js.Dynamic.literal(htmlFor = htmlFor.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelProps]
    }
    
    @scala.inline
    implicit class LabelPropsMutableBuilder[Self <: LabelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setComponent(value: label | span): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
    }
  }
}
