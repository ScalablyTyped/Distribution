package typings.rcTable.colGroupMod

import typings.rcTable.interfaceMod.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColGroupProps[RecordType] extends js.Object {
  var colWidths: js.Array[Double | String]
  var columCount: js.UndefOr[Double] = js.undefined
  var columns: js.UndefOr[js.Array[ColumnType[RecordType]]] = js.undefined
}

object ColGroupProps {
  @scala.inline
  def apply[RecordType](
    colWidths: js.Array[Double | String],
    columCount: js.UndefOr[Double] = js.undefined,
    columns: js.Array[ColumnType[RecordType]] = null
  ): ColGroupProps[RecordType] = {
    val __obj = js.Dynamic.literal(colWidths = colWidths.asInstanceOf[js.Any])
    if (!js.isUndefined(columCount)) __obj.updateDynamic("columCount")(columCount.get.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColGroupProps[RecordType]]
  }
}

