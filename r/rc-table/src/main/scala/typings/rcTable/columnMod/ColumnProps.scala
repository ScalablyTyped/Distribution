package typings.rcTable.columnMod

import typings.rcTable.interfaceMod.AlignType
import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.DataIndex
import typings.rcTable.interfaceMod.FixedType
import typings.rcTable.interfaceMod.Key
import typings.rcTable.interfaceMod.RenderedCell
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnProps[RecordType] extends ColumnType[RecordType] {
  var children: js.UndefOr[Null] = js.undefined
}

object ColumnProps {
  @scala.inline
  def apply[RecordType](
    align: AlignType = null,
    children: js.UndefOr[scala.Nothing] = js.undefined,
    className: String = null,
    colSpan: Int | Double = null,
    dataIndex: DataIndex = null,
    ellipsis: js.UndefOr[Boolean] = js.undefined,
    fixed: FixedType = null,
    key: Key = null,
    onCell: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    onCellClick: (RecordType, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onHeaderCell: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    render: (/* value */ js.Any, RecordType, /* index */ Double) => ReactNode | RenderedCell[RecordType] = null,
    rowSpan: Int | Double = null,
    title: ReactNode = null,
    width: Double | String = null
  ): ColumnProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsis)) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onCell != null) __obj.updateDynamic("onCell")(js.Any.fromFunction2(onCell))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (onHeaderCell != null) __obj.updateDynamic("onHeaderCell")(js.Any.fromFunction2(onHeaderCell))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3(render))
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps[RecordType]]
  }
}

