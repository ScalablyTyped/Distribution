package typings.reactSelect.indicatorsMod

import typings.react.mod.ReactElement
import typings.reactSelect.selectMod.Props
import typings.reactSelect.typesMod.ActionTypes
import typings.reactSelect.typesMod.ClassNamesState
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-select.react-select/src/types.CommonProps<OptionType> & {  children  :react.react.ReactElement,   innerProps  :any,   isFocused  :boolean,   isRtl  :boolean} */
@js.native
trait IndicatorProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  /** The children to be rendered inside the indicator. */
  var children: ReactElement = js.native
  var className: js.UndefOr[String] = js.native
  var hasValue: Boolean = js.native
  /** Props that will be passed on to the children. */
  var innerProps: js.Any = js.native
  /** The focused state of the select. */
  var isFocused: Boolean = js.native
  var isMulti: Boolean = js.native
  /** Whether the text is right to left */
  var isRtl: Boolean = js.native
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

