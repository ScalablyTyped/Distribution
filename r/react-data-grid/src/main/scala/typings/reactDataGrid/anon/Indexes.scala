package typings.reactDataGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indexes extends js.Object {
  var indexes: js.UndefOr[js.Array[Double]] = js.undefined
  var isSelectedKey: js.UndefOr[String] = js.undefined
  var keys: js.UndefOr[RowKey] = js.undefined
}

object Indexes {
  @scala.inline
  def apply(indexes: js.Array[Double] = null, isSelectedKey: String = null, keys: RowKey = null): Indexes = {
    val __obj = js.Dynamic.literal()
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (isSelectedKey != null) __obj.updateDynamic("isSelectedKey")(isSelectedKey.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indexes]
  }
}

