package typings.rcDashTable.libInterfaceMod

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

trait InternalColumnType extends ColumnType[DefaultValueType] {
  var RC_TABLE_INTERNAL_COL_DEFINE: js.UndefOr[js.Object] = js.undefined
}

object InternalColumnType {
  @scala.inline
  def apply(
    RC_TABLE_INTERNAL_COL_DEFINE: js.Object = null,
    align: left | center | right = null,
    children: js.Array[ColumnType[DefaultValueType]] = null,
    className: String = null,
    colSpan: Int | Double = null,
    dataIndex: Key = null,
    ellipsis: js.UndefOr[Boolean] = js.undefined,
    fixed: FixedType = null,
    key: Key = null,
    onCell: (DefaultValueType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    onCellClick: (DefaultValueType, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onHeaderCell: (ColumnType[DefaultValueType], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    render: (/* value */ js.Any, DefaultValueType, /* index */ Double) => ReactNode | RenderedCell = null,
    rowSpan: Int | Double = null,
    title: ReactNode = null,
    width: Double | String = null
  ): InternalColumnType = {
    val __obj = js.Dynamic.literal()
    if (RC_TABLE_INTERNAL_COL_DEFINE != null) __obj.updateDynamic("RC_TABLE_INTERNAL_COL_DEFINE")(RC_TABLE_INTERNAL_COL_DEFINE.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[InternalColumnType]
  }
}

