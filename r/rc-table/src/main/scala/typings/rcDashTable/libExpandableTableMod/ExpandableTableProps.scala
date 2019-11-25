package typings.rcDashTable.libExpandableTableMod

import typings.rcDashTable.Anon_ExpandableExpanded
import typings.rcDashTable.Anon_HandleExpandChangeNeedIndentSpaced
import typings.rcDashTable.libInterfaceMod.ExpandedRowRender
import typings.rcDashTable.libInterfaceMod.GetRowKey
import typings.rcDashTable.libInterfaceMod.Key
import typings.rcDashTable.libInterfaceMod.RenderExpandIcon
import typings.rcDashTable.libInterfaceMod.TableStore
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandableTableProps[ValueType] extends js.Object {
  var childrenColumnName: js.UndefOr[String] = js.undefined
  var columnManager: typings.rcDashTable.libColumnManagerMod.default
  var data: js.UndefOr[js.Array[ValueType]] = js.undefined
  var defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined
  var defaultExpandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
  var expandIcon: js.UndefOr[RenderExpandIcon[ValueType]] = js.undefined
  var expandIconAsCell: js.UndefOr[Boolean] = js.undefined
  var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
  var expandedRowClassName: js.UndefOr[
    js.Function3[/* record */ ValueType, /* index */ Double, /* indent */ Double, String]
  ] = js.undefined
  var expandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
  var expandedRowRender: js.UndefOr[ExpandedRowRender[ValueType]] = js.undefined
  var getRowKey: GetRowKey[ValueType]
  var indentSize: js.UndefOr[Double] = js.undefined
  var onExpand: js.UndefOr[ExpandEventHandler[ValueType]] = js.undefined
  var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.undefined
  var prefixCls: String
  var store: TableStore
  def children(info: Anon_HandleExpandChangeNeedIndentSpaced[ValueType]): ReactNode
}

object ExpandableTableProps {
  @scala.inline
  def apply[ValueType](
    children: Anon_HandleExpandChangeNeedIndentSpaced[ValueType] => ReactNode,
    columnManager: typings.rcDashTable.libColumnManagerMod.default,
    getRowKey: (ValueType, /* index */ Double) => Key,
    prefixCls: String,
    store: TableStore,
    childrenColumnName: String = null,
    data: js.Array[ValueType] = null,
    defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedRowKeys: js.Array[Key] = null,
    expandIcon: /* props */ Anon_ExpandableExpanded[ValueType] => ReactNode = null,
    expandIconAsCell: js.UndefOr[Boolean] = js.undefined,
    expandIconColumnIndex: Int | Double = null,
    expandedRowClassName: (/* record */ ValueType, /* index */ Double, /* indent */ Double) => String = null,
    expandedRowKeys: js.Array[Key] = null,
    expandedRowRender: (ValueType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode = null,
    indentSize: Int | Double = null,
    onExpand: (/* expanded */ Boolean, ValueType) => Unit = null,
    onExpandedRowsChange: /* expandedKeys */ js.Array[Key] => Unit = null
  ): ExpandableTableProps[ValueType] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), columnManager = columnManager.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), prefixCls = prefixCls.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    if (childrenColumnName != null) __obj.updateDynamic("childrenColumnName")(childrenColumnName.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandAllRows)) __obj.updateDynamic("defaultExpandAllRows")(defaultExpandAllRows.asInstanceOf[js.Any])
    if (defaultExpandedRowKeys != null) __obj.updateDynamic("defaultExpandedRowKeys")(defaultExpandedRowKeys.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1(expandIcon))
    if (!js.isUndefined(expandIconAsCell)) __obj.updateDynamic("expandIconAsCell")(expandIconAsCell.asInstanceOf[js.Any])
    if (expandIconColumnIndex != null) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.asInstanceOf[js.Any])
    if (expandedRowClassName != null) __obj.updateDynamic("expandedRowClassName")(js.Any.fromFunction3(expandedRowClassName))
    if (expandedRowKeys != null) __obj.updateDynamic("expandedRowKeys")(expandedRowKeys.asInstanceOf[js.Any])
    if (expandedRowRender != null) __obj.updateDynamic("expandedRowRender")(js.Any.fromFunction4(expandedRowRender))
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onExpandedRowsChange != null) __obj.updateDynamic("onExpandedRowsChange")(js.Any.fromFunction1(onExpandedRowsChange))
    __obj.asInstanceOf[ExpandableTableProps[ValueType]]
  }
}

