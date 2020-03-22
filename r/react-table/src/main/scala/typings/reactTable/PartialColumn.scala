package typings.reactTable

import typings.reactTable.mod.CellProps
import typings.reactTable.mod.CellValue
import typings.reactTable.mod.Column
import typings.reactTable.mod.HeaderProps
import typings.reactTable.mod.IdType
import typings.reactTable.mod.Renderer
import typings.reactTable.mod.TableInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-table.react-table.Column<{}>> */
trait PartialColumn extends js.Object {
  var Cell: js.UndefOr[Renderer[CellProps[js.Object]]] = js.undefined
  var Header: js.UndefOr[Renderer[HeaderProps[js.Object]]] = js.undefined
  var accessor: js.UndefOr[
    IdType[js.Object] | (js.Function3[/* originalRow */ js.Object, /* index */ Double, /* sub */ AnonSubRows, CellValue])
  ] = js.undefined
  var columns: js.UndefOr[js.Array[Column[js.Object]]] = js.undefined
  var id: js.UndefOr[IdType[js.Object]] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean | (js.Function1[/* instance */ TableInstance[js.Object], Boolean])] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object PartialColumn {
  @scala.inline
  def apply(
    Cell: Renderer[CellProps[js.Object]] = null,
    Header: Renderer[HeaderProps[js.Object]] = null,
    accessor: IdType[js.Object] | (js.Function3[/* originalRow */ js.Object, /* index */ Double, /* sub */ AnonSubRows, CellValue]) = null,
    columns: js.Array[Column[js.Object]] = null,
    id: IdType[js.Object] = null,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    show: Boolean | (js.Function1[/* instance */ TableInstance[js.Object], Boolean]) = null,
    width: Double | String = null
  ): PartialColumn = {
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
    __obj.asInstanceOf[PartialColumn]
  }
}

