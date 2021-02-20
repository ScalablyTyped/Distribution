package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FormEvent
import typings.react.mod.FormHTMLAttributes
import typings.react.mod.FunctionComponent
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.formButtonMod.FormButtonProps
import typings.semanticUiReact.formCheckboxMod.FormCheckboxProps
import typings.semanticUiReact.formDropdownMod.FormDropdownProps
import typings.semanticUiReact.formFieldMod.FormFieldProps
import typings.semanticUiReact.formGroupMod.FormGroupProps
import typings.semanticUiReact.formInputMod.FormInputProps
import typings.semanticUiReact.formRadioMod.FormRadioProps
import typings.semanticUiReact.formSelectMod.FormSelectProps
import typings.semanticUiReact.formTextAreaMod.FormTextAreaProps
import typings.semanticUiReact.semanticUiReactStrings.equal
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFormMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Form/Form", JSImport.Default)
  @js.native
  val default: FormComponent = js.native
  
  @js.native
  trait FormComponent extends FunctionComponent[FormProps] {
    
    var Button: StatelessComponent[FormButtonProps] = js.native
    
    var Checkbox: StatelessComponent[FormCheckboxProps] = js.native
    
    var Dropdown: StatelessComponent[FormDropdownProps] = js.native
    
    var Field: StatelessComponent[FormFieldProps] = js.native
    
    var Group: StatelessComponent[FormGroupProps] = js.native
    
    var Input: StatelessComponent[FormInputProps] = js.native
    
    var Radio: StatelessComponent[FormRadioProps] = js.native
    
    var Select: StatelessComponent[FormSelectProps] = js.native
    
    var TextArea: StatelessComponent[FormTextAreaProps] = js.native
  }
  
  type FormProps = StrictFormProps
  
  @js.native
  trait StrictFormProps extends FormHTMLAttributes[HTMLFormElement] {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Automatically show any error Message children. */
    var error: js.UndefOr[Boolean] = js.native
    
    /** A form can have its color inverted for contrast. */
    var inverted: js.UndefOr[Boolean] = js.native
    
    /** Automatically show a loading indicator. */
    var loading: js.UndefOr[Boolean] = js.native
    
    /** The HTML form submit handler. */
    @JSName("onSubmit")
    var onSubmit_StrictFormProps: js.UndefOr[js.Function2[/* event */ FormEvent[HTMLFormElement], /* data */ FormProps, Unit]] = js.native
    
    /** A comment can contain a form to reply to a comment. This may have arbitrary content. */
    var reply: js.UndefOr[Boolean] = js.native
    
    /** A form can vary in size. */
    var size: js.UndefOr[String] = js.native
    
    /** Automatically show any success Message children. */
    var success: js.UndefOr[Boolean] = js.native
    
    /** A form can prevent itself from stacking on mobile. */
    var unstackable: js.UndefOr[Boolean] = js.native
    
    /** Automatically show any warning Message children. */
    var warning: js.UndefOr[Boolean] = js.native
    
    /** Forms can automatically divide fields to be equal width. */
    var widths: js.UndefOr[equal] = js.native
  }
  object StrictFormProps {
    
    @scala.inline
    def apply(): StrictFormProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFormProps]
    }
    
    @scala.inline
    implicit class StrictFormPropsMutableBuilder[Self <: StrictFormProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: (/* event */ FormEvent[HTMLFormElement], /* data */ FormProps) => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setReply(value: Boolean): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setUnstackable(value: Boolean): Self = StObject.set(x, "unstackable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstackableUndefined: Self = StObject.set(x, "unstackable", js.undefined)
      
      @scala.inline
      def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
      
      @scala.inline
      def setWidths(value: equal): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    }
  }
  
  type _To = FormComponent
  
  /* This means you don't have to write `default`, but can instead just say `formFormMod.foo` */
  override def _to: FormComponent = default
}
