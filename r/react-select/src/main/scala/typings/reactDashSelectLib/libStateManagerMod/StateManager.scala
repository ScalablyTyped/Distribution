package typings
package reactDashSelectLib.libStateManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/lib/stateManager", "StateManager")
@js.native
class StateManager[OptionType] ()
  extends reactLib.reactMod.Component[Props[OptionType], State[OptionType], js.Any] {
  var select: reactLib.reactMod.ReactNs.Ref[_] = js.native
  def blur(): scala.Unit = js.native
  def callProp(name: java.lang.String, args: js.Any*): js.Any = js.native
  def focus(): scala.Unit = js.native
  def getProp(key: java.lang.String): js.Any = js.native
  def onChange(value: js.Any, actionMeta: reactDashSelectLib.libTypesMod.ActionMeta): scala.Unit = js.native
  def onInputChange(value: js.Any, actionMeta: reactDashSelectLib.libTypesMod.InputActionMeta): scala.Unit = js.native
  def onMenuClose(): scala.Unit = js.native
  def onMenuOpen(): scala.Unit = js.native
}

@JSImport("react-select/lib/stateManager", "StateManager")
@js.native
object StateManager extends js.Object {
  var defaultProps: reactDashSelectLib.libStateManagerMod.Props[_] = js.native
}

