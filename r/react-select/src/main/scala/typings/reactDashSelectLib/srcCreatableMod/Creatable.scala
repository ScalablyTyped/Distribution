package typings
package reactDashSelectLib.srcCreatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/Creatable", "Creatable")
@js.native
class Creatable[OptionType] ()
  extends reactLib.reactMod.Component[Props[OptionType], State[OptionType], js.Any] {
  var select: reactLib.reactMod.Ref[_] = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def onChange(
    newValue: reactDashSelectLib.srcTypesMod.ValueType[OptionType],
    actionMeta: reactDashSelectLib.srcTypesMod.ActionMeta
  ): scala.Unit = js.native
}

/* static members */
@JSImport("react-select/src/Creatable", "Creatable")
@js.native
object Creatable extends js.Object {
  var defaultProps: reactDashSelectLib.srcCreatableMod.Props[_] = js.native
}

