package typings
package reactDashSelectLib.srcAsyncCreatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/AsyncCreatable", "AsyncCreatable")
@js.native
class AsyncCreatable[OptionType] ()
  extends reactLib.reactMod.Component[Props[OptionType], State[OptionType], js.Any] {
  var mounted: scala.Boolean = js.native
  var optionsCache: org.scalablytyped.runtime.StringDictionary[reactDashSelectLib.srcTypesMod.OptionsType[OptionType]] = js.native
  var select: reactLib.reactMod.Ref[_] = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def handleInputChange(newValue: java.lang.String, actionMeta: reactDashSelectLib.srcTypesMod.InputActionMeta): java.lang.String = js.native
  def loadOptions(
    inputValue: java.lang.String,
    callback: js.Function1[/* options */ reactDashSelectLib.srcTypesMod.OptionsType[OptionType], scala.Unit]
  ): scala.Unit = js.native
  def onChange(
    newValue: reactDashSelectLib.srcTypesMod.ValueType[OptionType],
    actionMeta: reactDashSelectLib.srcTypesMod.ActionMeta
  ): scala.Unit = js.native
}

/* static members */
@JSImport("react-select/src/AsyncCreatable", "AsyncCreatable")
@js.native
object AsyncCreatable extends js.Object {
  var defaultProps: reactDashSelectLib.srcAsyncCreatableMod.Props[_] = js.native
}

