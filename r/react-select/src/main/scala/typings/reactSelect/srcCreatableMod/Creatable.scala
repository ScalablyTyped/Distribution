package typings.reactSelect.srcCreatableMod

import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactSelect.typesMod.ActionMeta
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/Creatable", "Creatable")
@js.native
class Creatable[OptionType /* <: OptionTypeBase */] ()
  extends Component[Props[OptionType], State[OptionType], js.Any] {
  var select: Ref[_] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def onChange(newValue: ValueType[OptionType], actionMeta: ActionMeta): Unit = js.native
}

/* static members */
@JSImport("react-select/src/Creatable", "Creatable")
@js.native
object Creatable extends js.Object {
  var defaultProps: Props[_] = js.native
}

