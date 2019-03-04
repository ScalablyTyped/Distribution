package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFormat extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: scala.Double | java.lang.String
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var text: java.lang.String
}

object DataFormat {
  @scala.inline
  def apply(
    id: scala.Double | java.lang.String,
    text: java.lang.String,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined
  ): DataFormat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[DataFormat]
  }
}

