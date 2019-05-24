package typings
package reactDashSelectLib.libStateManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/lib/stateManager", "StateManager")
@js.native
class StateManager[OptionType, T /* <: reactDashSelectLib.libSelectMod.default[OptionType] */] ()
  extends reactLib.reactMod.Component[
      StateProps[reactDashSelectLib.libSelectMod.Props[OptionType]] with Props[OptionType] with reactDashSelectLib.libSelectMod.Props[OptionType], 
      State[OptionType], 
      js.Any
    ] {
  var select: T = js.native
  def blur(): scala.Unit = js.native
  def callProp(name: java.lang.String, args: js.Any*): js.Any = js.native
  def focus(): scala.Unit = js.native
  def getProp(key: java.lang.String): js.Any = js.native
  def onChange(
    value: reactDashSelectLib.libTypesMod.ValueType[OptionType],
    actionMeta: reactDashSelectLib.libTypesMod.ActionMeta
  ): scala.Unit = js.native
  def onInputChange(
    value: reactDashSelectLib.libTypesMod.ValueType[OptionType],
    actionMeta: reactDashSelectLib.libTypesMod.InputActionMeta
  ): scala.Unit = js.native
  def onMenuClose(): scala.Unit = js.native
  def onMenuOpen(): scala.Unit = js.native
}

/* static members */
@JSImport("react-select/lib/stateManager", "StateManager")
@js.native
object StateManager extends js.Object {
  var defaultProps: reactDashSelectLib.libStateManagerMod.DefaultProps[_] = js.native
}

