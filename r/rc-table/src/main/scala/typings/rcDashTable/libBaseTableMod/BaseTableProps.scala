package typings.rcDashTable.libBaseTableMod

import typings.rcDashTable.libInterfaceMod.ColumnType
import typings.rcDashTable.libInterfaceMod.DefaultValueType
import typings.rcDashTable.libInterfaceMod.Expander
import typings.rcDashTable.libInterfaceMod.FixedType
import typings.rcDashTable.libInterfaceMod.GetRowKey
import typings.rcDashTable.libInterfaceMod.Key
import typings.rcDashTable.libInterfaceMod.TableStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTableProps[ValueType] extends js.Object {
  var columns: js.Array[ColumnType[DefaultValueType]]
  var expander: Expander[ValueType]
  var fixed: js.UndefOr[FixedType] = js.undefined
  var getRowKey: js.UndefOr[GetRowKey[ValueType]] = js.undefined
  var hasBody: Boolean
  var hasHead: Boolean
  var isAnyColumnsFixed: js.UndefOr[Boolean] = js.undefined
  var store: TableStore
  var tableClassName: String
}

object BaseTableProps {
  @scala.inline
  def apply[ValueType](
    columns: js.Array[ColumnType[DefaultValueType]],
    expander: Expander[ValueType],
    hasBody: Boolean,
    hasHead: Boolean,
    store: TableStore,
    tableClassName: String,
    fixed: FixedType = null,
    getRowKey: (ValueType, /* index */ Double) => Key = null,
    isAnyColumnsFixed: js.UndefOr[Boolean] = js.undefined
  ): BaseTableProps[ValueType] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], expander = expander.asInstanceOf[js.Any], hasBody = hasBody.asInstanceOf[js.Any], hasHead = hasHead.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], tableClassName = tableClassName.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (getRowKey != null) __obj.updateDynamic("getRowKey")(js.Any.fromFunction2(getRowKey))
    if (!js.isUndefined(isAnyColumnsFixed)) __obj.updateDynamic("isAnyColumnsFixed")(isAnyColumnsFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTableProps[ValueType]]
  }
}

