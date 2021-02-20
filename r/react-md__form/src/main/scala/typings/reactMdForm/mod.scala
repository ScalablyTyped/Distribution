package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdForm.anon.FormMessagePropsPartialFo
import typings.reactMdForm.anon.InputTogglePropstypecheck
import typings.reactMdForm.anon.InputTogglePropstyperadio
import typings.reactMdForm.asyncSwitchMod.AsyncSwitchProps
import typings.reactMdForm.checkboxMod.CheckboxProps
import typings.reactMdForm.fieldsetMod.FieldsetProps
import typings.reactMdForm.fileInputFileInputMod.FileInputProps
import typings.reactMdForm.formMod.FormProps
import typings.reactMdForm.formThemeProviderMod.FormThemeContext
import typings.reactMdForm.formThemeProviderMod.FormThemeOptions
import typings.reactMdForm.formThemeProviderMod.FormThemeProviderProps
import typings.reactMdForm.labelLabelMod.LabelProps
import typings.reactMdForm.listboxMod.ListboxProps
import typings.reactMdForm.nativeSelectMod.NativeSelectProps
import typings.reactMdForm.optionMod.OptionProps
import typings.reactMdForm.passwordMod.PasswordProps
import typings.reactMdForm.radioMod.RadioProps
import typings.reactMdForm.selectSelectMod.SelectProps
import typings.reactMdForm.switchMod.SwitchProps
import typings.reactMdForm.textAreaMod.TextAreaProps
import typings.reactMdForm.textFieldAddonMod.TextFieldAddonProps
import typings.reactMdForm.textFieldContainerMod.TextFieldContainerProps
import typings.reactMdForm.textFieldTextFieldMod.TextFieldProps
import typings.reactMdForm.toggleContainerMod.ToggleContainerProps
import typings.reactMdForm.useCheckedMod.ChangeEventHandler
import typings.reactMdForm.useCheckedMod.SetChecked
import typings.reactMdForm.useChoiceMod.InputElement
import typings.reactMdForm.useChoiceMod.SetValue
import typings.reactMdForm.useIndeterminateCheckedMod.IndeterminateCheckedReturnValue
import typings.reactMdForm.useSelectStateMod.DefaultValue
import typings.reactMdForm.useSelectStateMod.ReturnValue
import typings.reactMdForm.utilsMod.ListboxOption
import typings.reactMdList.listMod.ListElement
import typings.std.HTMLDivElement
import typings.std.HTMLFieldSetElement
import typings.std.HTMLFormElement
import typings.std.HTMLInputElement
import typings.std.HTMLLIElement
import typings.std.HTMLLabelElement
import typings.std.HTMLSelectElement
import typings.std.HTMLSpanElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/form", "AsyncSwitch")
  @js.native
  val AsyncSwitch: ForwardRefExoticComponent[AsyncSwitchProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "Checkbox")
  @js.native
  val Checkbox: ForwardRefExoticComponent[CheckboxProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "DEFAULT_GET_DISPLAY_LABEL")
  @js.native
  def DEFAULT_GET_DISPLAY_LABEL(option: ListboxOption, labelKey: String, includeLeft: Boolean): ReactNode = js.native
  
  @JSImport("@react-md/form", "DEFAULT_GET_OPTION_ID")
  @js.native
  def DEFAULT_GET_OPTION_ID(baseId: String, index: Double): String = js.native
  
  @JSImport("@react-md/form", "DEFAULT_GET_OPTION_LABEL")
  @js.native
  def DEFAULT_GET_OPTION_LABEL(option: ListboxOption, labelKey: String): ReactNode = js.native
  
  @JSImport("@react-md/form", "Fieldset")
  @js.native
  val Fieldset: ForwardRefExoticComponent[FieldsetProps with RefAttributes[HTMLFieldSetElement]] = js.native
  
  @JSImport("@react-md/form", "FileInput")
  @js.native
  val FileInput: ForwardRefExoticComponent[FileInputProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "Form")
  @js.native
  val Form: ForwardRefExoticComponent[FormProps with RefAttributes[HTMLFormElement]] = js.native
  
  @JSImport("@react-md/form", "FormMessage")
  @js.native
  val FormMessage: ForwardRefExoticComponent[FormMessagePropsPartialFo] = js.native
  
  @JSImport("@react-md/form", "FormThemeProvider")
  @js.native
  def FormThemeProvider(hasThemeUnderlineDirectionChildren: FormThemeProviderProps): ReactElement = js.native
  
  @JSImport("@react-md/form", "InputToggle")
  @js.native
  val InputToggle: ForwardRefExoticComponent[InputTogglePropstyperadio | InputTogglePropstypecheck] = js.native
  
  @JSImport("@react-md/form", "Label")
  @js.native
  val Label: ForwardRefExoticComponent[LabelProps with RefAttributes[HTMLLabelElement]] = js.native
  
  @JSImport("@react-md/form", "Listbox")
  @js.native
  val Listbox: ForwardRefExoticComponent[ListboxProps with RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/form", "NativeSelect")
  @js.native
  val NativeSelect: ForwardRefExoticComponent[NativeSelectProps with RefAttributes[HTMLSelectElement]] = js.native
  
  @JSImport("@react-md/form", "Option")
  @js.native
  val Option: ForwardRefExoticComponent[OptionProps with RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form", "Password")
  @js.native
  val Password: ForwardRefExoticComponent[PasswordProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "Radio")
  @js.native
  val Radio: ForwardRefExoticComponent[RadioProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "Select")
  @js.native
  val Select: ForwardRefExoticComponent[SelectProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form", "Switch")
  @js.native
  val Switch: ForwardRefExoticComponent[SwitchProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "TextArea")
  @js.native
  val TextArea: ForwardRefExoticComponent[TextAreaProps with RefAttributes[HTMLTextAreaElement]] = js.native
  
  @JSImport("@react-md/form", "TextField")
  @js.native
  val TextField: ForwardRefExoticComponent[TextFieldProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "TextFieldAddon")
  @js.native
  val TextFieldAddon: ForwardRefExoticComponent[TextFieldAddonProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/form", "TextFieldContainer")
  @js.native
  val TextFieldContainer: ForwardRefExoticComponent[TextFieldContainerProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form", "ToggleContainer")
  @js.native
  val ToggleContainer: ForwardRefExoticComponent[ToggleContainerProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form", "isListboxOptionProps")
  @js.native
  def isListboxOptionProps(option: ListboxOption): /* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean = js.native
  
  @JSImport("@react-md/form", "useChecked")
  @js.native
  def useChecked(defaultChecked: js.Function0[Boolean]): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  @JSImport("@react-md/form", "useChecked")
  @js.native
  def useChecked(defaultChecked: js.Function0[Boolean], onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  @JSImport("@react-md/form", "useChecked")
  @js.native
  def useChecked(defaultChecked: Boolean): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  @JSImport("@react-md/form", "useChecked")
  @js.native
  def useChecked(defaultChecked: Boolean, onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  
  @JSImport("@react-md/form", "useChoice")
  @js.native
  def useChoice[E /* <: InputElement */](defaultValue: String): js.Tuple3[String, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[String]] = js.native
  @JSImport("@react-md/form", "useChoice")
  @js.native
  def useChoice[E /* <: InputElement */](defaultValue: String, onChange: typings.reactMdForm.useChoiceMod.ChangeEventHandler[E]): js.Tuple3[String, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[String]] = js.native
  @JSImport("@react-md/form", "useChoice")
  @js.native
  def useChoice[E /* <: InputElement */](defaultValue: js.Array[String]): js.Tuple3[
    js.Array[String], 
    typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], 
    SetValue[js.Array[String]]
  ] = js.native
  @JSImport("@react-md/form", "useChoice")
  @js.native
  def useChoice[E /* <: InputElement */](defaultValue: js.Array[String], onChange: typings.reactMdForm.useChoiceMod.ChangeEventHandler[E]): js.Tuple3[
    js.Array[String], 
    typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], 
    SetValue[js.Array[String]]
  ] = js.native
  @JSImport("@react-md/form", "useChoice")
  @js.native
  def useChoice[E /* <: InputElement */](defaultValue: Double): js.Tuple3[Double, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[Double]] = js.native
  @JSImport("@react-md/form", "useChoice")
  @js.native
  def useChoice[E /* <: InputElement */](defaultValue: Double, onChange: typings.reactMdForm.useChoiceMod.ChangeEventHandler[E]): js.Tuple3[Double, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[Double]] = js.native
  @JSImport("@react-md/form", "useChoice")
  @js.native
  def useChoice[T /* <: js.Function0[String | Double | js.Array[String]] */, E /* <: InputElement */](defaultValue: T): js.Tuple3[T, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[T]] = js.native
  @JSImport("@react-md/form", "useChoice")
  @js.native
  def useChoice[T /* <: js.Function0[String | Double | js.Array[String]] */, E /* <: InputElement */](defaultValue: T, onChange: typings.reactMdForm.useChoiceMod.ChangeEventHandler[E]): js.Tuple3[T, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[T]] = js.native
  
  @JSImport("@react-md/form", "useFormTheme")
  @js.native
  def useFormTheme(): FormThemeContext = js.native
  @JSImport("@react-md/form", "useFormTheme")
  @js.native
  def useFormTheme(options: FormThemeOptions): FormThemeContext = js.native
  
  @JSImport("@react-md/form", "useIndeterminateChecked")
  @js.native
  def useIndeterminateChecked[T /* <: String */](values: js.Array[T]): IndeterminateCheckedReturnValue[T] = js.native
  @JSImport("@react-md/form", "useIndeterminateChecked")
  @js.native
  def useIndeterminateChecked[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.UndefOr[scala.Nothing],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = js.native
  @JSImport("@react-md/form", "useIndeterminateChecked")
  @js.native
  def useIndeterminateChecked[T /* <: String */](values: js.Array[T], defaultCheckedValues: js.Array[T]): IndeterminateCheckedReturnValue[T] = js.native
  @JSImport("@react-md/form", "useIndeterminateChecked")
  @js.native
  def useIndeterminateChecked[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.Array[T],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = js.native
  @JSImport("@react-md/form", "useIndeterminateChecked")
  @js.native
  def useIndeterminateChecked[T /* <: String */](values: js.Array[T], defaultCheckedValues: js.Function0[js.Array[T]]): IndeterminateCheckedReturnValue[T] = js.native
  @JSImport("@react-md/form", "useIndeterminateChecked")
  @js.native
  def useIndeterminateChecked[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.Function0[js.Array[T]],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = js.native
  
  @JSImport("@react-md/form", "useSelectState")
  @js.native
  def useSelectState[T /* <: String */](defaultValue: DefaultValue[T]): ReturnValue[T] = js.native
}
