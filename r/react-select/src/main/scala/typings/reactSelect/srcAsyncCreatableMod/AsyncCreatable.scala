package typings.reactSelect.srcAsyncCreatableMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactSelect.typesMod.ActionMeta
import typings.reactSelect.typesMod.InputActionMeta
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
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

