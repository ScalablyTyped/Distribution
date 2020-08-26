package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdForm.listboxMod.ListboxProps
import typings.reactMdForm.nativeSelectMod.NativeSelectProps
import typings.reactMdForm.optionMod.OptionProps
import typings.reactMdForm.selectSelectMod.SelectProps
import typings.reactMdForm.utilsMod.ListboxOption
import typings.reactMdList.listMod.ListElement
import typings.std.HTMLDivElement
import typings.std.HTMLLIElement
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/form/types/select", JSImport.Namespace)
@js.native
object selectMod extends js.Object {
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
  def DEFAULT_GET_DISPLAY_LABEL(option: ListboxOption, labelKey: String, includeLeft: Boolean): ReactNode = js.native
  def DEFAULT_GET_OPTION_ID(baseId: String, index: Double): String = js.native
  def DEFAULT_GET_OPTION_LABEL(option: ListboxOption, labelKey: String): ReactNode = js.native
  def isListboxOptionProps(option: ListboxOption): /* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean = js.native
}

