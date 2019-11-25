package typings.rcDashTable.esInterfaceMod

import typings.rcDashTable.rcDashTableStrings.center
import typings.rcDashTable.rcDashTableStrings.left
import typings.rcDashTable.rcDashTableStrings.right
import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnType[ValueType] extends js.Object {
  var align: js.UndefOr[left | center | right] = js.undefined
  var children: js.UndefOr[js.Array[ColumnType[DefaultValueType]]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var dataIndex: js.UndefOr[Key] = js.undefined
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  var fixed: js.UndefOr[FixedType] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var onCell: js.UndefOr[GetComponentProps[ValueType]] = js.undefined
  /** @deprecated Please use `onCell` instead */
  var onCellClick: js.UndefOr[
    js.Function2[/* record */ ValueType, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onHeaderCell: js.UndefOr[GetComponentProps[ColumnType[DefaultValueType]]] = js.undefined
  var render: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* record */ ValueType, 
      /* index */ Double, 
      ReactNode | RenderedCell
    ]
  ] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object ColumnType {
  @scala.inline
  def apply[ValueType](
    align: left | center | right = null,
    children: js.Array[ColumnType[DefaultValueType]] = null,
    className: String = null,
    colSpan: Int | Double = null,
    dataIndex: Key = null,
    ellipsis: js.UndefOr[Boolean] = js.undefined,
    fixed: FixedType = null,
    key: Key = null,
    onCell: (ValueType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    onCellClick: (/* record */ ValueType, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onHeaderCell: (ColumnType[DefaultValueType], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    render: (/* value */ js.Any, /* record */ ValueType, /* index */ Double) => ReactNode | RenderedCell = null,
    rowSpan: Int | Double = null,
    title: ReactNode = null,
    width: Double | String = null
  ): ColumnType[ValueType] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[ColumnType[ValueType]]
  }
}

