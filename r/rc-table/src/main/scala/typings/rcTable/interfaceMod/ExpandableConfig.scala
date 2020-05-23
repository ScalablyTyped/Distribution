package typings.rcTable.interfaceMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandableConfig[RecordType] extends LegacyExpandableProps[RecordType] {
  var rowExpandable: js.UndefOr[js.Function1[/* record */ RecordType, Boolean]] = js.undefined
}

object ExpandableConfig {
  @scala.inline
  def apply[RecordType](
    childrenColumnName: String = null,
    defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedRowKeys: js.Array[Key] = null,
    expandIcon: /* props */ RenderExpandIconProps[RecordType] => ReactNode = null,
    expandIconColumnIndex: js.UndefOr[Double] = js.undefined,
    expandRowByClick: js.UndefOr[Boolean] = js.undefined,
    expandedRowClassName: (RecordType, /* index */ Double, /* indent */ Double) => String = null,
    expandedRowKeys: js.Array[Key] = null,
    expandedRowRender: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode = null,
    indentSize: js.UndefOr[Double] = js.undefined,
    onExpand: (/* expanded */ Boolean, RecordType) => Unit = null,
    onExpandedRowsChange: /* expandedKeys */ js.Array[Key] => Unit = null,
    rowExpandable: /* record */ RecordType => Boolean = null
  ): ExpandableConfig[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (childrenColumnName != null) __obj.updateDynamic("childrenColumnName")(childrenColumnName.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandAllRows)) __obj.updateDynamic("defaultExpandAllRows")(defaultExpandAllRows.get.asInstanceOf[js.Any])
    if (defaultExpandedRowKeys != null) __obj.updateDynamic("defaultExpandedRowKeys")(defaultExpandedRowKeys.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1(expandIcon))
    if (!js.isUndefined(expandIconColumnIndex)) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandRowByClick)) __obj.updateDynamic("expandRowByClick")(expandRowByClick.get.asInstanceOf[js.Any])
    if (expandedRowClassName != null) __obj.updateDynamic("expandedRowClassName")(js.Any.fromFunction3(expandedRowClassName))
    if (expandedRowKeys != null) __obj.updateDynamic("expandedRowKeys")(expandedRowKeys.asInstanceOf[js.Any])
    if (expandedRowRender != null) __obj.updateDynamic("expandedRowRender")(js.Any.fromFunction4(expandedRowRender))
    if (!js.isUndefined(indentSize)) __obj.updateDynamic("indentSize")(indentSize.get.asInstanceOf[js.Any])
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onExpandedRowsChange != null) __obj.updateDynamic("onExpandedRowsChange")(js.Any.fromFunction1(onExpandedRowsChange))
    if (rowExpandable != null) __obj.updateDynamic("rowExpandable")(js.Any.fromFunction1(rowExpandable))
    __obj.asInstanceOf[ExpandableConfig[RecordType]]
  }
}

