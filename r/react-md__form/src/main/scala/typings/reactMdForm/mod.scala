package typings.reactMdForm

import typings.react.mod.ChangeEvent
import typings.react.mod.EventHandler
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/form", "AsyncSwitch")
  @js.native
  val AsyncSwitch: ForwardRefExoticComponent[AsyncSwitchProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "Checkbox")
  @js.native
  val Checkbox: ForwardRefExoticComponent[CheckboxProps & RefAttributes[HTMLInputElement]] = js.native
  
  @scala.inline
  def DEFAULT_GET_DISPLAY_LABEL(option: ListboxOption, labelKey: String, includeLeft: Boolean): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_DISPLAY_LABEL")(option.asInstanceOf[js.Any], labelKey.asInstanceOf[js.Any], includeLeft.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  @scala.inline
  def DEFAULT_GET_OPTION_ID(baseId: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_OPTION_ID")(baseId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def DEFAULT_GET_OPTION_LABEL(option: ListboxOption, labelKey: String): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_OPTION_LABEL")(option.asInstanceOf[js.Any], labelKey.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  @JSImport("@react-md/form", "Fieldset")
  @js.native
  val Fieldset: ForwardRefExoticComponent[FieldsetProps & RefAttributes[HTMLFieldSetElement]] = js.native
  
  @JSImport("@react-md/form", "FileInput")
  @js.native
  val FileInput: ForwardRefExoticComponent[FileInputProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "Form")
  @js.native
  val Form: ForwardRefExoticComponent[FormProps & RefAttributes[HTMLFormElement]] = js.native
  
  @JSImport("@react-md/form", "FormMessage")
  @js.native
  val FormMessage: ForwardRefExoticComponent[FormMessagePropsPartialFo] = js.native
  
  @scala.inline
  def FormThemeProvider(hasThemeUnderlineDirectionChildren: FormThemeProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("FormThemeProvider")(hasThemeUnderlineDirectionChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/form", "InputToggle")
  @js.native
  val InputToggle: ForwardRefExoticComponent[InputTogglePropstyperadio | InputTogglePropstypecheck] = js.native
  
  @JSImport("@react-md/form", "Label")
  @js.native
  val Label: ForwardRefExoticComponent[LabelProps & RefAttributes[HTMLLabelElement]] = js.native
  
  @JSImport("@react-md/form", "Listbox")
  @js.native
  val Listbox: ForwardRefExoticComponent[ListboxProps & RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/form", "NativeSelect")
  @js.native
  val NativeSelect: ForwardRefExoticComponent[NativeSelectProps & RefAttributes[HTMLSelectElement]] = js.native
  
  @JSImport("@react-md/form", "Option")
  @js.native
  val Option: ForwardRefExoticComponent[OptionProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form", "Password")
  @js.native
  val Password: ForwardRefExoticComponent[PasswordProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "Radio")
  @js.native
  val Radio: ForwardRefExoticComponent[RadioProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "Select")
  @js.native
  val Select: ForwardRefExoticComponent[SelectProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form", "Switch")
  @js.native
  val Switch: ForwardRefExoticComponent[SwitchProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "TextArea")
  @js.native
  val TextArea: ForwardRefExoticComponent[TextAreaProps & RefAttributes[HTMLTextAreaElement]] = js.native
  
  @JSImport("@react-md/form", "TextField")
  @js.native
  val TextField: ForwardRefExoticComponent[TextFieldProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "TextFieldAddon")
  @js.native
  val TextFieldAddon: ForwardRefExoticComponent[TextFieldAddonProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/form", "TextFieldContainer")
  @js.native
  val TextFieldContainer: ForwardRefExoticComponent[TextFieldContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form", "ToggleContainer")
  @js.native
  val ToggleContainer: ForwardRefExoticComponent[ToggleContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  @scala.inline
  def isListboxOptionProps(option: ListboxOption): /* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isListboxOptionProps")(option.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean]
  
  @scala.inline
  def useChecked(defaultChecked: js.Function0[Boolean]): js.Tuple3[Boolean, typings.reactMdForm.useCheckedMod.ChangeEventHandler, SetChecked] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Boolean, typings.reactMdForm.useCheckedMod.ChangeEventHandler, SetChecked]]
  @scala.inline
  def useChecked(
    defaultChecked: js.Function0[Boolean],
    onChange: typings.reactMdForm.useCheckedMod.ChangeEventHandler
  ): js.Tuple3[Boolean, typings.reactMdForm.useCheckedMod.ChangeEventHandler, SetChecked] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Boolean, typings.reactMdForm.useCheckedMod.ChangeEventHandler, SetChecked]]
  @scala.inline
  def useChecked(defaultChecked: Boolean): js.Tuple3[Boolean, typings.reactMdForm.useCheckedMod.ChangeEventHandler, SetChecked] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Boolean, typings.reactMdForm.useCheckedMod.ChangeEventHandler, SetChecked]]
  @scala.inline
  def useChecked(defaultChecked: Boolean, onChange: typings.reactMdForm.useCheckedMod.ChangeEventHandler): js.Tuple3[Boolean, typings.reactMdForm.useCheckedMod.ChangeEventHandler, SetChecked] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Boolean, typings.reactMdForm.useCheckedMod.ChangeEventHandler, SetChecked]]
  
  @scala.inline
  def useChoice[E /* <: InputElement */](defaultValue: String): js.Tuple3[String, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[String]]]
  @scala.inline
  def useChoice[E /* <: InputElement */](defaultValue: String, onChange: typings.reactMdForm.useChoiceMod.ChangeEventHandler[E]): js.Tuple3[String, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[String, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[String]]]
  @scala.inline
  def useChoice[E /* <: InputElement */](defaultValue: js.Array[String]): js.Tuple3[
    js.Array[String], 
    typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], 
    SetValue[js.Array[String]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    js.Array[String], 
    typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], 
    SetValue[js.Array[String]]
  ]]
  @scala.inline
  def useChoice[E /* <: InputElement */](defaultValue: js.Array[String], onChange: typings.reactMdForm.useChoiceMod.ChangeEventHandler[E]): js.Tuple3[
    js.Array[String], 
    typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], 
    SetValue[js.Array[String]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    js.Array[String], 
    typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], 
    SetValue[js.Array[String]]
  ]]
  @scala.inline
  def useChoice[E /* <: InputElement */](defaultValue: Double): js.Tuple3[Double, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[Double]]]
  @scala.inline
  def useChoice[E /* <: InputElement */](defaultValue: Double, onChange: typings.reactMdForm.useChoiceMod.ChangeEventHandler[E]): js.Tuple3[Double, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[Double]]]
  @scala.inline
  def useChoice[T /* <: js.Function0[String | Double | js.Array[String]] */, E /* <: InputElement */](defaultValue: T): js.Tuple3[T, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[T, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[T]]]
  @scala.inline
  def useChoice[T /* <: js.Function0[String | Double | js.Array[String]] */, E /* <: InputElement */](defaultValue: T, onChange: typings.reactMdForm.useChoiceMod.ChangeEventHandler[E]): js.Tuple3[T, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[T]]]
  
  @scala.inline
  def useFormTheme(): FormThemeContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormTheme")().asInstanceOf[FormThemeContext]
  @scala.inline
  def useFormTheme(options: FormThemeOptions): FormThemeContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormTheme")(options.asInstanceOf[js.Any]).asInstanceOf[FormThemeContext]
  
  @scala.inline
  def useIndeterminateChecked[T /* <: String */](values: js.Array[T]): IndeterminateCheckedReturnValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any]).asInstanceOf[IndeterminateCheckedReturnValue[T]]
  @scala.inline
  def useIndeterminateChecked[T /* <: String */](values: js.Array[T], defaultCheckedValues: js.Array[T]): IndeterminateCheckedReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any], defaultCheckedValues.asInstanceOf[js.Any])).asInstanceOf[IndeterminateCheckedReturnValue[T]]
  @scala.inline
  def useIndeterminateChecked[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.Array[T],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any], defaultCheckedValues.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[IndeterminateCheckedReturnValue[T]]
  @scala.inline
  def useIndeterminateChecked[T /* <: String */](values: js.Array[T], defaultCheckedValues: js.Function0[js.Array[T]]): IndeterminateCheckedReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any], defaultCheckedValues.asInstanceOf[js.Any])).asInstanceOf[IndeterminateCheckedReturnValue[T]]
  @scala.inline
  def useIndeterminateChecked[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.Function0[js.Array[T]],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any], defaultCheckedValues.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[IndeterminateCheckedReturnValue[T]]
  @scala.inline
  def useIndeterminateChecked[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: Unit,
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any], defaultCheckedValues.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[IndeterminateCheckedReturnValue[T]]
  
  @scala.inline
  def useSelectState[T /* <: String */](defaultValue: DefaultValue[T]): ReturnValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectState")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[T]]
  
  @js.native
  trait ChangeEventHandler[E /* <: InputElement */] extends EventHandler[ChangeEvent[E | HTMLInputElement]]
}
