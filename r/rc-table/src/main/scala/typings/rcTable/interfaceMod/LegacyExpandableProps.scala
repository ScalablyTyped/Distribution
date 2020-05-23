package typings.rcTable.interfaceMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyExpandableProps[RecordType] extends js.Object {
  /** @deprecated Use `expandable.childrenColumnName` instead */
  var childrenColumnName: js.UndefOr[String] = js.undefined
  /** @deprecated Use `expandable.defaultExpandAllRows` instead */
  var defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Use `expandable.defaultExpandedRowKeys` instead */
  var defaultExpandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
  /** @deprecated Use `expandable.expandIcon` instead */
  var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.undefined
  /** @deprecated Use `expandable.expandIconColumnIndex` instead */
  var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
  /** @deprecated Use `expandable.expandRowByClick` instead */
  var expandRowByClick: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Use `expandable.expandedRowClassName` instead */
  var expandedRowClassName: js.UndefOr[RowClassName[RecordType]] = js.undefined
  /** @deprecated Use `expandable.expandedRowKeys` instead */
  var expandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
  /** @deprecated Use `expandable.expandedRowRender` instead */
  var expandedRowRender: js.UndefOr[ExpandedRowRender[RecordType]] = js.undefined
  /** @deprecated Use `expandable.indentSize` instead */
  var indentSize: js.UndefOr[Double] = js.undefined
  /** @deprecated Use `expandable.onExpand` instead */
  var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ RecordType, Unit]] = js.undefined
  /** @deprecated Use `expandable.onExpandedRowsChange` instead */
  var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.undefined
}

object LegacyExpandableProps {
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
    onExpand: (/* expanded */ Boolean, /* record */ RecordType) => Unit = null,
    onExpandedRowsChange: /* expandedKeys */ js.Array[Key] => Unit = null
  ): LegacyExpandableProps[RecordType] = {
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
    __obj.asInstanceOf[LegacyExpandableProps[RecordType]]
  }
}

