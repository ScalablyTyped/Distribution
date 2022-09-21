package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdForm.anon.NumberFieldHookOptionsdef
import typings.reactMdForm.anon.NumberFieldHookOptionsdefCounter
import typings.reactMdForm.anon.NumberFieldHookOptionsdefDefaultValue
import typings.reactMdForm.anon.NumberFieldHookOptionsdis
import typings.reactMdForm.anon.NumberFieldHookOptionsdisCounter
import typings.reactMdForm.anon.NumberFieldHookOptionsdisDefaultValue
import typings.reactMdForm.anon.PasswordPropsmessageProps
import typings.reactMdForm.anon.TextAreaPropsmessageProps
import typings.reactMdForm.anon.TextFieldHookOptionsdisab
import typings.reactMdForm.anon.TextFieldHookOptionsdisabCounter
import typings.reactMdForm.anon.TextFieldHookOptionsdisabDefaultValue
import typings.reactMdForm.anon.TextFieldPropsmessageProp
import typings.reactMdForm.getErrorIconMod.GetErrorIcon
import typings.reactMdForm.getErrorMessageMod.GetErrorMessage
import typings.reactMdForm.isErroredMod.IsErrored
import typings.reactMdForm.passwordMod.PasswordProps
import typings.reactMdForm.reactMdFormStrings.badInput
import typings.reactMdForm.reactMdFormStrings.customError
import typings.reactMdForm.reactMdFormStrings.patternMismatch
import typings.reactMdForm.reactMdFormStrings.rangeOverflow
import typings.reactMdForm.reactMdFormStrings.rangeUnderflow
import typings.reactMdForm.reactMdFormStrings.stepMismatch
import typings.reactMdForm.reactMdFormStrings.tooLong
import typings.reactMdForm.reactMdFormStrings.tooShort
import typings.reactMdForm.reactMdFormStrings.typeMismatch
import typings.reactMdForm.reactMdFormStrings.valid
import typings.reactMdForm.reactMdFormStrings.valueMissing
import typings.reactMdForm.textAreaMod.TextAreaProps
import typings.reactMdForm.textFieldAddonMod.TextFieldAddonProps
import typings.reactMdForm.textFieldContainerMod.TextFieldContainerProps
import typings.reactMdForm.textFieldTextFieldMod.TextFieldProps
import typings.reactMdForm.useNumberFieldMod.NumberFieldHookControls
import typings.reactMdForm.useNumberFieldMod.ProvidedNumberFieldMessageProps
import typings.reactMdForm.useNumberFieldMod.ProvidedNumberFieldProps
import typings.reactMdForm.useTextFieldMod.ProvidedTextFieldMessageProps
import typings.reactMdForm.useTextFieldMod.ProvidedTextFieldProps
import typings.reactMdForm.useTextFieldMod.TextFieldHookControls
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.HTMLSpanElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldMod {
  
  @JSImport("@react-md/form/types/text-field", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/form/types/text-field", "Password")
  @js.native
  val Password: ForwardRefExoticComponent[PasswordProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "PasswordWithMessage")
  @js.native
  val PasswordWithMessage: ForwardRefExoticComponent[PasswordPropsmessageProps] = js.native
  
  @JSImport("@react-md/form/types/text-field", "RECOMMENDED_NUMBER_STATE_KEYS")
  @js.native
  val RECOMMENDED_NUMBER_STATE_KEYS: js.Array[
    badInput | customError | patternMismatch | rangeOverflow | rangeUnderflow | stepMismatch | tooLong | tooShort | typeMismatch | valid | valueMissing
  ] = js.native
  
  @JSImport("@react-md/form/types/text-field", "RECOMMENDED_STATE_KEYS")
  @js.native
  val RECOMMENDED_STATE_KEYS: js.Array[
    badInput | customError | patternMismatch | rangeOverflow | rangeUnderflow | stepMismatch | tooLong | tooShort | typeMismatch | valid | valueMissing
  ] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextArea")
  @js.native
  val TextArea: ForwardRefExoticComponent[TextAreaProps & RefAttributes[HTMLTextAreaElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextAreaWithMessage")
  @js.native
  val TextAreaWithMessage: ForwardRefExoticComponent[TextAreaPropsmessageProps] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextField")
  @js.native
  val TextField: ForwardRefExoticComponent[TextFieldProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextFieldAddon")
  @js.native
  val TextFieldAddon: ForwardRefExoticComponent[TextFieldAddonProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextFieldContainer")
  @js.native
  val TextFieldContainer: ForwardRefExoticComponent[TextFieldContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextFieldWithMessage")
  @js.native
  val TextFieldWithMessage: ForwardRefExoticComponent[TextFieldPropsmessageProp] = js.native
  
  @JSImport("@react-md/form/types/text-field", "defaultGetErrorIcon")
  @js.native
  val defaultGetErrorIcon: GetErrorIcon = js.native
  
  @JSImport("@react-md/form/types/text-field", "defaultGetErrorMessage")
  @js.native
  val defaultGetErrorMessage: GetErrorMessage = js.native
  
  @JSImport("@react-md/form/types/text-field", "defaultIsErrored")
  @js.native
  val defaultIsErrored: IsErrored = js.native
  
  inline def useNumberField(options: NumberFieldHookOptionsdef): js.Tuple3[Double, ProvidedNumberFieldProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, ProvidedNumberFieldProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdefCounter): js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdefDefaultValue): js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdis): js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdisCounter): js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdisDefaultValue): js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  
  inline def useTextField(options: TextFieldHookOptionsdisab): js.Tuple3[String, ProvidedTextFieldProps, TextFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTextField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, ProvidedTextFieldProps, TextFieldHookControls]]
  inline def useTextField(options: TextFieldHookOptionsdisabCounter): js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTextField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls]]
  inline def useTextField(options: TextFieldHookOptionsdisabDefaultValue): js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTextField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls]]
}
