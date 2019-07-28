package typings.select2.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupedDataFormat extends js.Object {
  var children: js.UndefOr[js.Array[DataFormat]] = js.undefined
  var id: js.UndefOr[scala.Nothing] = js.undefined
  var text: String
}

object GroupedDataFormat {
  @scala.inline
  def apply(text: String, children: js.Array[DataFormat] = null, id: js.UndefOr[scala.Nothing] = js.undefined): GroupedDataFormat = {
    val __obj = js.Dynamic.literal(text = text)
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GroupedDataFormat]
  }
}

