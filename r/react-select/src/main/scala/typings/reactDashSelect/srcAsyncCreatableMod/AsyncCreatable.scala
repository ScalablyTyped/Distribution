package typings.reactDashSelect.srcAsyncCreatableMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Component
import typings.react.reactMod.Ref
import typings.reactDashSelect.srcTypesMod.ActionMeta
import typings.reactDashSelect.srcTypesMod.InputActionMeta
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import typings.reactDashSelect.srcTypesMod.OptionsType
import typings.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/AsyncCreatable", "AsyncCreatable")
@js.native
class AsyncCreatable[OptionType /* <: OptionTypeBase */] ()
  extends Component[Props[OptionType], State[OptionType], js.Any] {
  var mounted: Boolean = js.native
  var optionsCache: StringDictionary[OptionsType[OptionType]] = js.native
  var select: Ref[_] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def handleInputChange(newValue: String, actionMeta: InputActionMeta): String = js.native
  def loadOptions(inputValue: String, callback: js.Function1[/* options */ OptionsType[OptionType], Unit]): Unit = js.native
  def onChange(newValue: ValueType[OptionType], actionMeta: ActionMeta): Unit = js.native
}

/* static members */
@JSImport("react-select/src/AsyncCreatable", "AsyncCreatable")
@js.native
object AsyncCreatable extends js.Object {
  var defaultProps: Props[_] = js.native
}

