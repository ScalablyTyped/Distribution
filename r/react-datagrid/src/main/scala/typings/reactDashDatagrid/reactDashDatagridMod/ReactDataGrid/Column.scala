package typings.reactDashDatagrid.reactDashDatagridMod.ReactDataGrid

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /**
    * String - a className to be applied to all cells in this column
    */
  var className: js.UndefOr[String] = js.undefined
  var defaultHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify a column as visible/hidden.
    */
  var defaultVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Columns are flexible via flexbox. Specify a flex property for this.
    * Unless a column specifies a flex or a width property, it is assumed
    * to have flex: 1.
    */
  var flex: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    * String - each column should have a name property.
    */
  var name: String
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
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * String - one of 'left', 'right', 'center'.
    */
  var textAlign: js.UndefOr[String] = js.undefined
  /**
    * String/ReactElement - a title to show in the header. If not
    * specified, a humanized version of name will be used. Can be a string
    * or anything that React can render, so you can customize it as you
    * please.
    */
  var title: js.UndefOr[String | ReactElement] = js.undefined
  /**
    * Boolean - controlled (which means you have to manually set column
    * visibility when it changes, by using onColumnVisibilityChange).
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    name: String,
    className: String = null,
    defaultHidden: js.UndefOr[Boolean] = js.undefined,
    defaultVisible: js.UndefOr[Boolean] = js.undefined,
    flex: Int | Double = null,
    minWidth: Int | Double = null,
    render: (/* value */ js.Any, /* data */ js.Any, /* cellProps */ CellProps) => _ = null,
    style: CSSProperties = null,
    textAlign: String = null,
    title: String | ReactElement = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): Column = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultHidden)) __obj.updateDynamic("defaultHidden")(defaultHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3(render))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

