package typings
package reactDashDatagridLib.reactDashDatagridMod.ReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /**
    * String - a className to be applied to all cells in this column
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify a column as visible/hidden.
    */
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Columns are flexible via flexbox. Specify a flex property for this.
    * Unless a column specifies a flex or a width property, it is assumed
    * to have flex: 1.
    */
  var flex: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * String - each column should have a name property.
    */
  var name: java.lang.String
  /**
    * Function - if you want custom rendering, specify this property.
    *
    * The column.render function is called with 3 args:
    *   value - the default value to be rendered (equals to data[column.name])
    *   data - the corresponding data object for the current row
    cellProps - an object with props for the current cell
    */
  var render: js.UndefOr[
    js.Function3[/* value */ js.Any, /* data */ js.Any, /* cellProps */ CellProps, _]
  ] = js.undefined
  /**
    * Object - if you want cells in this column to be have a custom
    * style.
    */
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  /**
    * String - one of 'left', 'right', 'center'.
    */
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * String/ReactElement - a title to show in the header. If not
    * specified, a humanized version of name will be used. Can be a string
    * or anything that React can render, so you can customize it as you
    * please.
    */
  var title: js.UndefOr[java.lang.String | reactLib.reactMod.ReactElement] = js.undefined
  /**
    * Boolean - controlled (which means you have to manually set column
    * visibility when it changes, by using onColumnVisibilityChange).
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    name: java.lang.String,
    className: java.lang.String = null,
    defaultHidden: js.UndefOr[scala.Boolean] = js.undefined,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    flex: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    render: (/* value */ js.Any, /* data */ js.Any, /* cellProps */ CellProps) => _ = null,
    style: reactLib.reactMod.CSSProperties = null,
    textAlign: java.lang.String = null,
    title: java.lang.String | reactLib.reactMod.ReactElement = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Column = {
    val __obj = js.Dynamic.literal(name = name)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultHidden)) __obj.updateDynamic("defaultHidden")(defaultHidden)
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3(render))
    if (style != null) __obj.updateDynamic("style")(style)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

