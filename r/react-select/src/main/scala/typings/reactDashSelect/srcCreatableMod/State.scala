package typings.reactDashSelect.srcCreatableMod

import typings.reactDashSelect.srcTypesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[OptionType] extends js.Object {
  var newOption: js.UndefOr[OptionType] = js.undefined
  var options: OptionsType[OptionType]
}

object State {
  @scala.inline
  def apply[OptionType](options: OptionsType[OptionType], newOption: OptionType = null): State[OptionType] = {
    val __obj = js.Dynamic.literal(options = options)
    if (newOption != null) __obj.updateDynamic("newOption")(newOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
}

