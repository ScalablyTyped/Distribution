package typings.rcTable.valueUtilMod

import typings.rcTable.interfaceMod.DataIndex
import typings.rcTable.interfaceMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetColumnKeyColumn extends js.Object {
  var dataIndex: js.UndefOr[DataIndex] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
}

object GetColumnKeyColumn {
  @scala.inline
  def apply(dataIndex: DataIndex = null, key: Key = null): GetColumnKeyColumn = {
    val __obj = js.Dynamic.literal()
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetColumnKeyColumn]
  }
}

