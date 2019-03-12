package typings
package reactDashToolboxLib.libTableTableCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * The column number of this cell.
    */
  var column: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true the cell is considered as numeric and the content will be displayed aligned to right.
    * @default false
    */
  var numeric: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The row number of the cell.
    */
  var row: js.UndefOr[scala.Double] = js.undefined
  /**
    * If you provide a value the cell will show an arrow pointing down or up depending on the value to indicate it is a sorted element. Useful only for columns.
    */
  var sorted: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.asc | reactDashToolboxLib.reactDashToolboxLibStrings.desc
  ] = js.undefined
  /**
    * The element tag, either `td` or `th`.
    * @default 'td'
    */
  var tagName: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.td | reactDashToolboxLib.reactDashToolboxLibStrings.th
  ] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TableCellTheme] = js.undefined
}

object TableCellProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    column: scala.Int | scala.Double = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    numeric: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: js.Function = null,
    onContextMenu: js.Function = null,
    onDoubleClick: js.Function = null,
    onDrag: js.Function = null,
    onDragEnd: js.Function = null,
    onDragEnter: js.Function = null,
    onDragExit: js.Function = null,
    onDragLeave: js.Function = null,
    onDragOver: js.Function = null,
    onDragStart: js.Function = null,
    onDrop: js.Function = null,
    onMouseDown: js.Function = null,
    onMouseEnter: js.Function = null,
    onMouseLeave: js.Function = null,
    onMouseMove: js.Function = null,
    onMouseOut: js.Function = null,
    onMouseOver: js.Function = null,
    onMouseUp: js.Function = null,
    onTouchCancel: js.Function = null,
    onTouchEnd: js.Function = null,
    onTouchMove: js.Function = null,
    onTouchStart: js.Function = null,
    row: scala.Int | scala.Double = null,
    sorted: reactDashToolboxLib.reactDashToolboxLibStrings.asc | reactDashToolboxLib.reactDashToolboxLibStrings.desc = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tagName: reactDashToolboxLib.reactDashToolboxLibStrings.td | reactDashToolboxLib.reactDashToolboxLibStrings.th = null,
    theme: TableCellTheme = null
  ): TableCellProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (sorted != null) __obj.updateDynamic("sorted")(sorted.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[TableCellProps]
  }
}

