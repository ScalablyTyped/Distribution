package typings.select2.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFormat extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: Double | String
  var selected: js.UndefOr[Boolean] = js.undefined
  var text: String
}

object DataFormat {
  @scala.inline
  def apply(
    id: Double | String,
    text: String,
    disabled: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined
  ): DataFormat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[DataFormat]
  }
}

