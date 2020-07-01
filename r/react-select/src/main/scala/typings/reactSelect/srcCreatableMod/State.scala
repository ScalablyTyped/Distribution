package typings.reactSelect.srcCreatableMod

import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[OptionType /* <: OptionTypeBase */] extends js.Object {
  var newOption: js.UndefOr[OptionType] = js.undefined
  var options: OptionsType[OptionType]
}

object State {
  @scala.inline
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](options: OptionsType[OptionType], newOption: OptionType = null): State[OptionType] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (newOption != null) __obj.updateDynamic("newOption")(newOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
}

