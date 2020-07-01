package typings.reactSelect.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMeta[OptionType /* <: OptionTypeBase */] extends js.Object {
  var action: ActionTypes
  var name: js.UndefOr[String] = js.undefined
  var option: js.UndefOr[OptionType] = js.undefined
  var removedValue: js.UndefOr[OptionType] = js.undefined
}

object ActionMeta {
  @scala.inline
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](
    action: ActionTypes,
    name: String = null,
    option: OptionType = null,
    removedValue: OptionType = null
  ): ActionMeta[OptionType] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (removedValue != null) __obj.updateDynamic("removedValue")(removedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMeta[OptionType]]
  }
}

