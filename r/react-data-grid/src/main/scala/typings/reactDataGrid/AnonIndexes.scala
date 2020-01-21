package typings.reactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndexes extends js.Object {
  var indexes: js.UndefOr[js.Array[Double]] = js.undefined
  var isSelectedKey: js.UndefOr[String] = js.undefined
  var keys: js.UndefOr[AnonRowKey] = js.undefined
}

object AnonIndexes {
  @scala.inline
  def apply(indexes: js.Array[Double] = null, isSelectedKey: String = null, keys: AnonRowKey = null): AnonIndexes = {
    val __obj = js.Dynamic.literal()
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (isSelectedKey != null) __obj.updateDynamic("isSelectedKey")(isSelectedKey.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndexes]
  }
}

