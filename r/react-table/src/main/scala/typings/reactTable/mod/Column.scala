package typings.reactTable.mod

import typings.reactTable.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-table.react-table.Accessor<D> */
/* Inlined parent std.Partial<{  columns  :std.Array<react-table.react-table.Column<D>>,   show  :boolean | (instance : react-table.react-table.TableInstance<D>): boolean,   Header  :react-table.react-table.Renderer<react-table.react-table.HeaderProps<D>>,   Cell  :react-table.react-table.Renderer<react-table.react-table.CellProps<D>>,   width ? :number | string,   minWidth ? :number,   maxWidth ? :number}> */
trait Column[D /* <: js.Object */] extends js.Object {
  var Cell: js.UndefOr[Renderer[CellProps[D]]] = js.undefined
  var Header: js.UndefOr[Renderer[HeaderProps[D]]] = js.undefined
  var accessor: js.UndefOr[
    IdType[D] | (js.Function3[/* originalRow */ D, /* index */ Double, /* sub */ AnonData[D], CellValue])
  ] = js.undefined
  var columns: js.UndefOr[js.Array[Column[D]]] = js.undefined
  var id: js.UndefOr[IdType[D]] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean | (js.Function1[/* instance */ TableInstance[D], Boolean])] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object Column {
  @scala.inline
  def apply[D /* <: js.Object */](
    Cell: Renderer[CellProps[D]] = null,
    Header: Renderer[HeaderProps[D]] = null,
    accessor: IdType[D] | (js.Function3[/* originalRow */ D, /* index */ Double, /* sub */ AnonData[D], CellValue]) = null,
    columns: js.Array[Column[D]] = null,
    id: IdType[D] = null,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    show: Boolean | (js.Function1[/* instance */ TableInstance[D], Boolean]) = null,
    width: Double | String = null
  ): Column[D] = {
    val __obj = js.Dynamic.literal()
    if (Cell != null) __obj.updateDynamic("Cell")(Cell.asInstanceOf[js.Any])
    if (Header != null) __obj.updateDynamic("Header")(Header.asInstanceOf[js.Any])
    if (accessor != null) __obj.updateDynamic("accessor")(accessor.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[D]]
  }
}

