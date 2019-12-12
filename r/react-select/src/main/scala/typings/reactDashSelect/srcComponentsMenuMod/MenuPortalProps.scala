package typings.reactDashSelect.srcComponentsMenuMod

import typings.react.reactMod.ReactNode
import typings.reactDashSelect.srcSelectMod.Props
import typings.reactDashSelect.srcTypesMod.ActionTypes
import typings.reactDashSelect.srcTypesMod.ClassNamesState
import typings.reactDashSelect.srcTypesMod.MenuPlacement
import typings.reactDashSelect.srcTypesMod.MenuPosition
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import typings.reactDashSelect.srcTypesMod.OptionsType
import typings.reactDashSelect.srcTypesMod.ValueType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-select.react-select/src/types.CommonProps<OptionType> & {  appendTo  :std.HTMLElement,   children  :react.react.ReactNode,   controlElement  :std.HTMLElement,   menuPlacement  :react-select.react-select/src/types.MenuPlacement,   menuPosition  :react-select.react-select/src/types.MenuPosition} */
@js.native
trait MenuPortalProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  var appendTo: HTMLElement = js.native
  var children: ReactNode = js.native
  var className: js.UndefOr[String] = js.native
   // ideally Menu<MenuProps>
  var controlElement: HTMLElement = js.native
  var hasValue: Boolean = js.native
  var isMulti: Boolean = js.native
  var menuPlacement: MenuPlacement = js.native
  var menuPosition: MenuPosition = js.native
  var options: OptionsType[OptionType] = js.native
  var selectProps: Props[OptionType] = js.native
  def clearValue(): Unit = js.native
  def cx(): String | Unit = js.native
  def cx(a: String): String | Unit = js.native
  def cx(a: String, b: js.UndefOr[ClassNamesState], c: String): String | Unit = js.native
  def cx(a: String, b: ClassNamesState): String | Unit = js.native
  def cx(a: Null, b: js.UndefOr[ClassNamesState], c: String): String | Unit = js.native
  def cx(a: Null, b: ClassNamesState): String | Unit = js.native
  /*
    Get the styles of a particular part of the select. Pass in the name of the
    property as the first argument, and the current props as the second argument.
    See the `styles` object for the properties available.
    */
  def getStyles(name: String, props: js.Any): js.Object = js.native
  def getValue(): ValueType[OptionType] = js.native
  def selectOption(option: OptionType): Unit = js.native
  def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
}

