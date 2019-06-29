package typings
package reactDashSelectLib.srcStateManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/stateManager", "StateManager")
@js.native
class StateManager[OptionType, T /* <: reactDashSelectLib.srcSelectMod.default[OptionType] */] ()
  extends reactLib.reactMod.Component[
      StateProps[reactDashSelectLib.srcSelectMod.Props[OptionType]] with Props[OptionType] with reactDashSelectLib.srcSelectMod.Props[OptionType], 
      State[OptionType], 
      js.Any
    ] {
  var select: T = js.native
  def blur(): scala.Unit = js.native
  def callProp(name: java.lang.String, args: js.Any*): js.Any = js.native
  def focus(): scala.Unit = js.native
  def getProp(key: java.lang.String): js.Any = js.native
  def onChange(
    value: reactDashSelectLib.srcTypesMod.ValueType[OptionType],
    actionMeta: reactDashSelectLib.srcTypesMod.ActionMeta
  ): scala.Unit = js.native
  def onInputChange(
    value: reactDashSelectLib.srcTypesMod.ValueType[OptionType],
    actionMeta: reactDashSelectLib.srcTypesMod.InputActionMeta
  ): scala.Unit = js.native
  def onMenuClose(): scala.Unit = js.native
  def onMenuOpen(): scala.Unit = js.native
}

/* static members */
@JSImport("react-select/src/stateManager", "StateManager")
@js.native
object StateManager extends js.Object {
  var defaultProps: reactDashSelectLib.srcStateManagerMod.DefaultProps[_] = js.native
}

