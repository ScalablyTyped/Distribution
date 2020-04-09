package typings.rcTable.bodyContextMod

import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.ColumnsType
import typings.rcTable.interfaceMod.ExpandableType
import typings.rcTable.interfaceMod.ExpandedRowRender
import typings.rcTable.interfaceMod.RenderExpandIcon
import typings.rcTable.interfaceMod.RenderExpandIconProps
import typings.rcTable.interfaceMod.RowClassName
import typings.rcTable.interfaceMod.TableLayout
import typings.rcTable.interfaceMod.TriggerEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyContextProps[RecordType] extends js.Object {
  var columns: ColumnsType[RecordType]
  var componentWidth: Double
  var expandIcon: RenderExpandIcon[RecordType]
  var expandIconColumnIndex: Double
  var expandRowByClick: Boolean
  var expandableType: ExpandableType
  var expandedRowClassName: RowClassName[RecordType]
  var expandedRowRender: ExpandedRowRender[RecordType]
  var fixColumn: Boolean
  var fixHeader: Boolean
  var flattenColumns: js.Array[ColumnType[RecordType]]
  var horizonScroll: Boolean
  var indentSize: Double
  var onTriggerExpand: TriggerEventHandler[RecordType]
  var rowClassName: String | RowClassName[RecordType]
  var tableLayout: TableLayout
}

object BodyContextProps {
  @scala.inline
  def apply[RecordType](
    columns: ColumnsType[RecordType],
    componentWidth: Double,
    expandIcon: /* props */ RenderExpandIconProps[RecordType] => ReactNode,
    expandIconColumnIndex: Double,
    expandRowByClick: Boolean,
    expandableType: ExpandableType,
    expandedRowClassName: (RecordType, /* index */ Double, /* indent */ Double) => String,
    expandedRowRender: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode,
    fixColumn: Boolean,
    fixHeader: Boolean,
    flattenColumns: js.Array[ColumnType[RecordType]],
    horizonScroll: Boolean,
    indentSize: Double,
    onTriggerExpand: (RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit,
    rowClassName: String | RowClassName[RecordType],
    tableLayout: TableLayout
  ): BodyContextProps[RecordType] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], expandIcon = js.Any.fromFunction1(expandIcon), expandIconColumnIndex = expandIconColumnIndex.asInstanceOf[js.Any], expandRowByClick = expandRowByClick.asInstanceOf[js.Any], expandableType = expandableType.asInstanceOf[js.Any], expandedRowClassName = js.Any.fromFunction3(expandedRowClassName), expandedRowRender = js.Any.fromFunction4(expandedRowRender), fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], horizonScroll = horizonScroll.asInstanceOf[js.Any], indentSize = indentSize.asInstanceOf[js.Any], onTriggerExpand = js.Any.fromFunction2(onTriggerExpand), rowClassName = rowClassName.asInstanceOf[js.Any], tableLayout = tableLayout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BodyContextProps[RecordType]]
  }
}

