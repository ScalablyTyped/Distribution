package typings.reactSelect.componentsMultiValueMod

import typings.react.mod.ReactNode
import typings.reactSelect.anon.OnClick
import typings.reactSelect.selectMod.Props
import typings.reactSelect.typesMod.ActionTypes
import typings.reactSelect.typesMod.ClassNamesState
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-select.react-select/src/types.CommonProps<OptionType> & {  children :react.react.ReactNode,   components :any,   cropWithEllipsis :boolean,   data :OptionType,   innerProps :any,   isFocused :boolean,   isDisabled :boolean,   removeProps :{onTouchEnd (event : any): void, onClick (event : any): void, onMouseDown (event : any): void}} */
@js.native
trait MultiValueProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  var children: ReactNode = js.native
  var className: js.UndefOr[String] = js.native
  var components: js.Any = js.native
  var cropWithEllipsis: Boolean = js.native
  var data: OptionType = js.native
  var hasValue: Boolean = js.native
  var innerProps: js.Any = js.native
  var isDisabled: Boolean = js.native
  var isFocused: Boolean = js.native
  var isMulti: Boolean = js.native
  var options: OptionsType[OptionType] = js.native
  var removeProps: OnClick = js.native
  var selectProps: Props[OptionType] = js.native
  def clearValue(): Unit = js.native
  def cx(): String = js.native
  def cx(state: js.UndefOr[ClassNamesState], className: String): String = js.native
  def cx(state: ClassNamesState): String = js.native
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

