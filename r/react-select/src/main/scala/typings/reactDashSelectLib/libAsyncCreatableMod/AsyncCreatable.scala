package typings
package reactDashSelectLib.libAsyncCreatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/lib/AsyncCreatable", "AsyncCreatable")
@js.native
class AsyncCreatable[OptionType] ()
  extends reactLib.reactMod.Component[Props[OptionType], State[OptionType], js.Any] {
  var mounted: scala.Boolean = js.native
  var optionsCache: org.scalablytyped.runtime.StringDictionary[reactDashSelectLib.libTypesMod.OptionsType[OptionType]] = js.native
  var select: reactLib.reactMod.ReactNs.Ref[_] = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def handleInputChange(newValue: java.lang.String, actionMeta: reactDashSelectLib.libTypesMod.InputActionMeta): java.lang.String = js.native
  def loadOptions(
    inputValue: java.lang.String,
    callback: js.Function1[/* options */ reactDashSelectLib.libTypesMod.OptionsType[OptionType], scala.Unit]
  ): scala.Unit = js.native
  def onChange(
    newValue: reactDashSelectLib.libTypesMod.ValueType[OptionType],
    actionMeta: reactDashSelectLib.libTypesMod.ActionMeta
  ): scala.Unit = js.native
}

/* static members */
@JSImport("react-select/lib/AsyncCreatable", "AsyncCreatable")
@js.native
object AsyncCreatable extends js.Object {
  var defaultProps: reactDashSelectLib.libAsyncCreatableMod.Props[_] = js.native
}

