package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupedDataFormat extends js.Object {
  var children: js.UndefOr[js.Array[DataFormat]] = js.undefined
  var id: js.UndefOr[scala.Nothing] = js.undefined
  var text: java.lang.String
}

object GroupedDataFormat {
  @scala.inline
  def apply(
    text: java.lang.String,
    children: js.Array[DataFormat] = null,
    id: js.UndefOr[scala.Nothing] = js.undefined
  ): GroupedDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GroupedDataFormat]
  }
}

