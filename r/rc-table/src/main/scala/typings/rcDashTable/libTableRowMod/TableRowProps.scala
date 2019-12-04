package typings.rcDashTable.libTableRowMod

import typings.rcDashTable.libInterfaceMod.Cell
import typings.rcDashTable.libInterfaceMod.ColumnType
import typings.rcDashTable.libInterfaceMod.DefaultValueType
import typings.rcDashTable.libInterfaceMod.FixedType
import typings.rcDashTable.libInterfaceMod.GetComponentProps
import typings.rcDashTable.libInterfaceMod.Key
import typings.rcDashTable.libInterfaceMod.LegacyFunction
import typings.rcDashTable.libInterfaceMod.RenderNode
import typings.rcDashTable.libInterfaceMod.TableComponents
import typings.rcDashTable.libInterfaceMod.TableStore
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowProps[ValueType] extends js.Object {
  var ancestorKeys: js.Array[Key]
  var className: js.UndefOr[String] = js.undefined
  var columns: js.UndefOr[js.Array[ColumnType[DefaultValueType]]] = js.undefined
  var components: js.UndefOr[TableComponents] = js.undefined
  var expandedRow: js.UndefOr[Boolean] = js.undefined
  var fixed: js.UndefOr[FixedType] = js.undefined
  var hasExpandIcon: js.UndefOr[js.Function1[/* index */ Double, Boolean]] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var hovered: Boolean
  var indent: js.UndefOr[Double] = js.undefined
  var indentSize: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var isAnyColumnsFixed: js.UndefOr[Boolean] = js.undefined
  var onHover: js.UndefOr[js.Function2[/* hovered */ Boolean, /* rowKey */ Key, Unit]] = js.undefined
  var onRow: js.UndefOr[GetComponentProps[ValueType]] = js.undefined
  var onRowClick: js.UndefOr[LegacyFunction[ValueType]] = js.undefined
  var onRowContextMenu: js.UndefOr[LegacyFunction[ValueType]] = js.undefined
  var onRowDoubleClick: js.UndefOr[LegacyFunction[ValueType]] = js.undefined
  var onRowMouseEnter: js.UndefOr[LegacyFunction[ValueType]] = js.undefined
  var onRowMouseLeave: js.UndefOr[LegacyFunction[ValueType]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var record: js.UndefOr[ValueType] = js.undefined
  var renderExpandIcon: js.UndefOr[RenderNode] = js.undefined
  var renderExpandIconCell: js.UndefOr[js.Function1[/* cells */ js.Array[Cell], Unit]] = js.undefined
  var rowKey: Key
  var store: TableStore
  var visible: Boolean
}

object TableRowProps {
  @scala.inline
  def apply[ValueType](
    ancestorKeys: js.Array[Key],
    hovered: Boolean,
    rowKey: Key,
    store: TableStore,
    visible: Boolean,
    className: String = null,
    columns: js.Array[ColumnType[DefaultValueType]] = null,
    components: TableComponents = null,
    expandedRow: js.UndefOr[Boolean] = js.undefined,
    fixed: FixedType = null,
    hasExpandIcon: /* index */ Double => Boolean = null,
    height: String | Double = null,
    indent: Int | Double = null,
    indentSize: Int | Double = null,
    index: Int | Double = null,
    isAnyColumnsFixed: js.UndefOr[Boolean] = js.undefined,
    onHover: (/* hovered */ Boolean, /* rowKey */ Key) => Unit = null,
    onRow: (ValueType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    onRowClick: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Element, Event]) => Unit = null,
    onRowContextMenu: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Element, Event]) => Unit = null,
    onRowDoubleClick: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Element, Event]) => Unit = null,
    onRowMouseEnter: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Element, Event]) => Unit = null,
    onRowMouseLeave: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Element, Event]) => Unit = null,
    prefixCls: String = null,
    record: ValueType = null,
    renderExpandIcon: () => ReactNode = null,
    renderExpandIconCell: /* cells */ js.Array[Cell] => Unit = null
  ): TableRowProps[ValueType] = {
    val __obj = js.Dynamic.literal(ancestorKeys = ancestorKeys.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (!js.isUndefined(expandedRow)) __obj.updateDynamic("expandedRow")(expandedRow.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (hasExpandIcon != null) __obj.updateDynamic("hasExpandIcon")(js.Any.fromFunction1(hasExpandIcon))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnyColumnsFixed)) __obj.updateDynamic("isAnyColumnsFixed")(isAnyColumnsFixed.asInstanceOf[js.Any])
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction2(onHover))
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2(onRow))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction3(onRowClick))
    if (onRowContextMenu != null) __obj.updateDynamic("onRowContextMenu")(js.Any.fromFunction3(onRowContextMenu))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction3(onRowDoubleClick))
    if (onRowMouseEnter != null) __obj.updateDynamic("onRowMouseEnter")(js.Any.fromFunction3(onRowMouseEnter))
    if (onRowMouseLeave != null) __obj.updateDynamic("onRowMouseLeave")(js.Any.fromFunction3(onRowMouseLeave))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (record != null) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    if (renderExpandIcon != null) __obj.updateDynamic("renderExpandIcon")(js.Any.fromFunction0(renderExpandIcon))
    if (renderExpandIconCell != null) __obj.updateDynamic("renderExpandIconCell")(js.Any.fromFunction1(renderExpandIconCell))
    __obj.asInstanceOf[TableRowProps[ValueType]]
  }
}

