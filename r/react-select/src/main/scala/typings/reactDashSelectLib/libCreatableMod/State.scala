package typings
package reactDashSelectLib.libCreatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[OptionType] extends js.Object {
  var newOption: js.UndefOr[OptionType]
  var options: reactDashSelectLib.libTypesMod.OptionsType[OptionType]
}

object State {
  @scala.inline
  def apply[OptionType](options: reactDashSelectLib.libTypesMod.OptionsType[OptionType], newOption: OptionType = null): State[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    if (newOption != null) __obj.updateDynamic("newOption")(newOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
}

