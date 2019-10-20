package typings.rcDashTable.esTableMod

import typings.rcDashTable.Anon_True
import typings.rcDashTable.esInterfaceMod.ColumnType
import typings.rcDashTable.esInterfaceMod.DefaultValueType
import typings.rcDashTable.esInterfaceMod.GetComponentProps
import typings.rcDashTable.esInterfaceMod.GetRowKey
import typings.rcDashTable.esInterfaceMod.LegacyFunction
import typings.rcDashTable.esInterfaceMod.TableComponents
import typings.rcDashTable.rcDashTableStrings.fixed
import typings.react.Element
import typings.react.Event
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.react.reactMod.SyntheticEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof rc-table.rc-table/es/ExpandableTable.ExpandableTableProps<ValueType>, 'prefixCls' | 'children'> ]: rc-table.rc-table/es/ExpandableTable.ExpandableTableProps<ValueType>[P]} */ trait TableProps[ValueType] extends js.Object {
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var columns: js.UndefOr[js.Array[ColumnType[DefaultValueType]]] = js.undefined
  var components: js.UndefOr[TableComponents] = js.undefined
  var data: js.UndefOr[js.Array[ValueType]] = js.undefined
  var emptyText: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined
  var footer: js.UndefOr[js.Function1[/* data */ js.Array[ValueType], ReactNode]] = js.undefined
  var getBodyWrapper: js.UndefOr[js.Function1[/* body */ ReactElement, ReactElement]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onHeaderRow: js.UndefOr[GetComponentProps[js.Array[ColumnType[DefaultValueType]]]] = js.undefined
  var onRow: js.UndefOr[GetComponentProps[ValueType]] = js.undefined
  var onRowClick: js.UndefOr[LegacyFunction[ValueType]] = js.undefined
  var onRowContextMenu: js.UndefOr[LegacyFunction[ValueType]] = js.undefined
  var onRowDoubleClick: js.UndefOr[LegacyFunction[ValueType]] = js.undefined
  var onRowMouseEnter: js.UndefOr[LegacyFunction[ValueType]] = js.undefined
  var onRowMouseLeave: js.UndefOr[LegacyFunction[ValueType]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var rowClassName: js.UndefOr[
    String | (js.Function3[/* record */ ValueType, /* index */ Double, /* indent */ Double, String])
  ] = js.undefined
  var rowKey: js.UndefOr[String | GetRowKey[ValueType]] = js.undefined
  var rowRef: js.UndefOr[
    js.Function3[/* record */ ValueType, /* index */ Double, /* indent */ Double, Ref[ReactElement]]
  ] = js.undefined
  var scroll: js.UndefOr[Anon_True] = js.undefined
  var showHeader: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tableLayout: js.UndefOr[fixed] = js.undefined
  var title: js.UndefOr[js.Function1[/* data */ js.Array[ValueType], ReactNode]] = js.undefined
  var useFixedHeader: js.UndefOr[Boolean] = js.undefined
}

object TableProps {
  @scala.inline
  def apply[ValueType](
    bodyStyle: CSSProperties = null,
    children: ReactNode = null,
    className: String = null,
    columns: js.Array[ColumnType[DefaultValueType]] = null,
    components: TableComponents = null,
    data: js.Array[ValueType] = null,
    emptyText: ReactNode | js.Function0[ReactNode] = null,
    footer: /* data */ js.Array[ValueType] => ReactNode = null,
    getBodyWrapper: /* body */ ReactElement => ReactElement = null,
    id: String = null,
    onHeaderRow: (js.Array[ColumnType[DefaultValueType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    onRow: (ValueType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    onRowClick: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Element, Event]) => Unit = null,
    onRowContextMenu: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Element, Event]) => Unit = null,
    onRowDoubleClick: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Element, Event]) => Unit = null,
    onRowMouseEnter: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Element, Event]) => Unit = null,
    onRowMouseLeave: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Element, Event]) => Unit = null,
    prefixCls: String = null,
    rowClassName: String | (js.Function3[/* record */ ValueType, /* index */ Double, /* indent */ Double, String]) = null,
    rowKey: String | GetRowKey[ValueType] = null,
    rowRef: (/* record */ ValueType, /* index */ Double, /* indent */ Double) => Ref[ReactElement] = null,
    scroll: Anon_True = null,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tableLayout: fixed = null,
    title: /* data */ js.Array[ValueType] => ReactNode = null,
    useFixedHeader: js.UndefOr[Boolean] = js.undefined
  ): TableProps[ValueType] = {
    val __obj = js.Dynamic.literal()
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (components != null) __obj.updateDynamic("components")(components)
    if (data != null) __obj.updateDynamic("data")(data)
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1(footer))
    if (getBodyWrapper != null) __obj.updateDynamic("getBodyWrapper")(js.Any.fromFunction1(getBodyWrapper))
    if (id != null) __obj.updateDynamic("id")(id)
    if (onHeaderRow != null) __obj.updateDynamic("onHeaderRow")(js.Any.fromFunction2(onHeaderRow))
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2(onRow))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction3(onRowClick))
    if (onRowContextMenu != null) __obj.updateDynamic("onRowContextMenu")(js.Any.fromFunction3(onRowContextMenu))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction3(onRowDoubleClick))
    if (onRowMouseEnter != null) __obj.updateDynamic("onRowMouseEnter")(js.Any.fromFunction3(onRowMouseEnter))
    if (onRowMouseLeave != null) __obj.updateDynamic("onRowMouseLeave")(js.Any.fromFunction3(onRowMouseLeave))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(rowClassName.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (rowRef != null) __obj.updateDynamic("rowRef")(js.Any.fromFunction3(rowRef))
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tableLayout != null) __obj.updateDynamic("tableLayout")(tableLayout)
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1(title))
    if (!js.isUndefined(useFixedHeader)) __obj.updateDynamic("useFixedHeader")(useFixedHeader)
    __obj.asInstanceOf[TableProps[ValueType]]
  }
}

