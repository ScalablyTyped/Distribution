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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/form", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * This component will create an async switch that will show a loading indicator
    * and prevent the switch from being toggled while the loading state is true.
    */
  val AsyncSwitch: ForwardRefExoticComponent[AsyncSwitchProps with RefAttributes[HTMLInputElement]] = js.native
  /**
    * The `Checkbox` component is just a wrapper for the `InputToggle` that
    * defaults to reasonable defaults for a checkbox input.
    */
  val Checkbox: ForwardRefExoticComponent[CheckboxProps with RefAttributes[HTMLInputElement]] = js.native
  /**
    * This is a simple wrapper for the `<fieldset>` that defaults to removing
    * the default styles of a border, padding, and margin and having a screen-reader
    * visible only legend element for added accessibility.
    */
  val Fieldset: ForwardRefExoticComponent[FieldsetProps with RefAttributes[HTMLFieldSetElement]] = js.native
  /**
    * This component is a wrapper for the `<input type="file" />` that can be themed
    * like a button.
    */
  val FileInput: ForwardRefExoticComponent[FileInputProps with RefAttributes[HTMLInputElement]] = js.native
  /**
    * This is probably one of the least useful components available as it doesn't
    * do much styling or logic. All this form component will do is add basic flex
    * behavior and prevent the default form submit behavior.
    */
  val Form: ForwardRefExoticComponent[FormProps with RefAttributes[HTMLFormElement]] = js.native
  /**
    * The `FormMessage` component is used to create additional helper messages or
    * error messages and generally placed below the related `TextField`. If a
    * `length` (of the `value`) and `maxLength` are provided, a counter will also
    * be displayed to the right of the `children`.
    *
    * This component can also be used to create form-level validation messages by
    * setting the `role` prop to `"alert"`.
    */
  val FormMessage: ForwardRefExoticComponent[FormMessagePropsPartialFo] = js.native
  val InputToggle: ForwardRefExoticComponent[InputTogglePropstyperadio | InputTogglePropstypecheck] = js.native
  /**
    * The `Label` component should be used alongside any form elements but is
    * already built in to the majority of the `react-md` components by default.
    */
  val Label: ForwardRefExoticComponent[LabelProps with RefAttributes[HTMLLabelElement]] = js.native
  /**
    * This component is used to render the list part of a `<select>` element with
    * built-in accessibility and the ability to add custom styles. This should
    * probably not be used much outside of `react-md` itself and the `Select`
    * component, but I'm planning on adding support for an inline listbox at some
    * point.
    */
  val Listbox: ForwardRefExoticComponent[ListboxProps with RefAttributes[ListElement]] = js.native
  /**
    * This component is used to render a native `<select>` element with the text
    * field theme styles. This component is great to use for native behavior and
    * full accessibility.
    */
  val NativeSelect: ForwardRefExoticComponent[NativeSelectProps with RefAttributes[HTMLSelectElement]] = js.native
  /**
    * The Option component is a simple wrapper for the `SimpleListItem` that adds
    * some required a11y for behaving as the `option` role.
    */
  val Option: ForwardRefExoticComponent[OptionProps with RefAttributes[HTMLLIElement]] = js.native
  /**
    * This component is a simple wrapper of the `TextField` that can only be
    * rendered for password inputs. There is built-in functionality to be able to
    * temporarily show the password's value by swapping the `type` to `"text"`.
    */
  val Password: ForwardRefExoticComponent[PasswordProps with RefAttributes[HTMLInputElement]] = js.native
  /**
    * The `Radio` component is just a wrapper for the `InputToggle` that
    * defaults to reasonable defaults for a radio input.
    */
  val Radio: ForwardRefExoticComponent[RadioProps with RefAttributes[HTMLInputElement]] = js.native
  /**
    * This component is an accessible version of the `<select>` element that allows
    * for some more custom styles by using the `@react-md/list` package to render
    * the list of options.
    *
    * The `Select` component **must be controlled** with a `value` and `onChange`
    * handler.
    *
    * Note: Since this is not a native `<select>` component, the current value will
    * be rendered in an `<input type="hidden" />` element so that the value can be
    * sent along in forms. It is highly recommended to always provide a `name` prop
    * so this value is sent.
    */
  val Select: ForwardRefExoticComponent[SelectProps with RefAttributes[HTMLDivElement]] = js.native
  val Switch: ForwardRefExoticComponent[SwitchProps with RefAttributes[HTMLInputElement]] = js.native
  val TextArea: ForwardRefExoticComponent[TextAreaProps with RefAttributes[HTMLTextAreaElement]] = js.native
  /**
    * The text field is a wrapper of the `<input type="text" />` component with
    * some nice default themes. It can also be used to render other text input
    * types with _some_ support.
    */
  val TextField: ForwardRefExoticComponent[TextFieldProps with RefAttributes[HTMLInputElement]] = js.native
  /**
    * This component is used to add an an icon before or after the text field with
    * correct styling.
    */
  val TextFieldAddon: ForwardRefExoticComponent[TextFieldAddonProps with RefAttributes[HTMLSpanElement]] = js.native
  /**
    * This is a container component that is used to structure the text field with
    * different parts and themes.
    */
  val TextFieldContainer: ForwardRefExoticComponent[TextFieldContainerProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * The `ToggleContainer` component should generally be used around a
    * custom `"checkbox"`, `"radio"`, or `"switch"` component to help with
    * additional styles. This is mostly an internal component so I'm not
    * sure useful it will be though.
    */
  val ToggleContainer: ForwardRefExoticComponent[ToggleContainerProps with RefAttributes[HTMLDivElement]] = js.native
  def DEFAULT_GET_DISPLAY_LABEL(option: ListboxOption, labelKey: String, includeLeft: Boolean): ReactNode = js.native
  def DEFAULT_GET_OPTION_ID(baseId: String, index: Double): String = js.native
  def DEFAULT_GET_OPTION_LABEL(option: ListboxOption, labelKey: String): ReactNode = js.native
  def FormThemeProvider(hasThemeUnderlineDirectionChildren: FormThemeProviderProps): ReactElement = js.native
  def isListboxOptionProps(option: ListboxOption): /* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean = js.native
  def useChecked(defaultChecked: js.Function0[Boolean]): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def useChecked(defaultChecked: js.Function0[Boolean], onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def useChecked(defaultChecked: Boolean): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def useChecked(defaultChecked: Boolean, onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def useChoice[E /* <: InputElement */](defaultValue: String): js.Tuple3[String, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[String]] = js.native
  def useChoice[E /* <: InputElement */](defaultValue: String, onChange: typings.reactMdForm.useChoiceMod.ChangeEventHandler[E]): js.Tuple3[String, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[String]] = js.native
  def useChoice[E /* <: InputElement */](defaultValue: js.Array[String]): js.Tuple3[
    js.Array[String], 
    typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], 
    SetValue[js.Array[String]]
  ] = js.native
  def useChoice[E /* <: InputElement */](defaultValue: js.Array[String], onChange: typings.reactMdForm.useChoiceMod.ChangeEventHandler[E]): js.Tuple3[
    js.Array[String], 
    typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], 
    SetValue[js.Array[String]]
  ] = js.native
  def useChoice[E /* <: InputElement */](defaultValue: Double): js.Tuple3[Double, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[Double]] = js.native
  def useChoice[E /* <: InputElement */](defaultValue: Double, onChange: typings.reactMdForm.useChoiceMod.ChangeEventHandler[E]): js.Tuple3[Double, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[Double]] = js.native
  def useChoice[T /* <: js.Function0[String | Double | js.Array[String]] */, E /* <: InputElement */](defaultValue: T): js.Tuple3[T, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[T]] = js.native
  def useChoice[T /* <: js.Function0[String | Double | js.Array[String]] */, E /* <: InputElement */](defaultValue: T, onChange: typings.reactMdForm.useChoiceMod.ChangeEventHandler[E]): js.Tuple3[T, typings.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[T]] = js.native
  def useFormTheme(): FormThemeContext = js.native
  def useFormTheme(options: FormThemeOptions): FormThemeContext = js.native
  def useIndeterminateChecked[T /* <: String */](values: js.Array[T]): IndeterminateCheckedReturnValue[T] = js.native
  def useIndeterminateChecked[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.UndefOr[scala.Nothing],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = js.native
  def useIndeterminateChecked[T /* <: String */](values: js.Array[T], defaultCheckedValues: js.Array[T]): IndeterminateCheckedReturnValue[T] = js.native
  def useIndeterminateChecked[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.Array[T],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = js.native
  def useIndeterminateChecked[T /* <: String */](values: js.Array[T], defaultCheckedValues: js.Function0[js.Array[T]]): IndeterminateCheckedReturnValue[T] = js.native
  def useIndeterminateChecked[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.Function0[js.Array[T]],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = js.native
  def useSelectState[T /* <: String */](defaultValue: DefaultValue[T]): ReturnValue[T] = js.native
}

