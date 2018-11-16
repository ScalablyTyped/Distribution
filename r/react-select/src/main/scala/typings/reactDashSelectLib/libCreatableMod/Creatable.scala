package typings
package reactDashSelectLib.libCreatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/lib/Creatable", "Creatable")
@js.native
class Creatable[OptionType] ()
  extends reactLib.reactMod.Component[Props[OptionType], State[OptionType], js.Any] {
  var select: reactLib.reactMod.ReactNs.Ref[_] = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def onChange(
    newValue: reactDashSelectLib.libTypesMod.ValueType[OptionType],
    actionMeta: reactDashSelectLib.libTypesMod.ActionMeta
  ): scala.Unit = js.native
}

@JSImport("react-select/lib/Creatable", "Creatable")
@js.native
object Creatable extends js.Object {
  var defaultProps: reactDashSelectLib.libCreatableMod.Props[_] = js.native
}

