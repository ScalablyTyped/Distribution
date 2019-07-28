package typings.reactDashSelect.srcAsyncMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Component
import typings.react.reactMod.Ref
import typings.reactDashSelect.srcTypesMod.InputActionMeta
import typings.reactDashSelect.srcTypesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/Async", "Async")
@js.native
class Async[OptionType] ()
  extends Component[Props[OptionType], State[OptionType], js.Any] {
  var mounted: Boolean = js.native
  var optionsCache: StringDictionary[OptionsType[OptionType]] = js.native
  var select: Ref[_] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def handleInputChange(newValue: String, actionMeta: InputActionMeta): String = js.native
  def loadOptions(inputValue: String, callback: js.Function1[/* options */ OptionsType[OptionType], Unit]): Unit = js.native
}

/* static members */
@JSImport("react-select/src/Async", "Async")
@js.native
object Async extends js.Object {
  var defaultProps: Props[_] = js.native
}

