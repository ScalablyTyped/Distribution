package typings.reactSelect.selectMod

import typings.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuOptions[OptionType /* <: OptionTypeBase */] extends js.Object {
  var focusable: js.Array[OptionType]
  var render: js.Array[OptionType]
}

object MenuOptions {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](focusable: js.Array[OptionType], render: js.Array[OptionType]): MenuOptions[OptionType] = {
    val __obj = js.Dynamic.literal(focusable = focusable.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuOptions[OptionType]]
  }
}

