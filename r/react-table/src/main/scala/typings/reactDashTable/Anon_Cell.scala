package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.CellProps
import typings.reactDashTable.reactDashTableMod.Column
import typings.reactDashTable.reactDashTableMod.HeaderProps
import typings.reactDashTable.reactDashTableMod.Renderer
import typings.reactDashTable.reactDashTableMod.TableInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cell[D /* <: js.Object */] extends js.Object {
  var Cell: Renderer[CellProps[D]]
  var Header: Renderer[HeaderProps[D]]
  var columns: js.Array[Column[D]]
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var show: Boolean | (js.Function1[/* instance */ TableInstance[D], Boolean])
  var width: js.UndefOr[Double | String] = js.undefined
}

object Anon_Cell {
  @scala.inline
  def apply[D /* <: js.Object */](
    columns: js.Array[Column[D]],
    show: Boolean | (js.Function1[/* instance */ TableInstance[D], Boolean]),
    Cell: Renderer[CellProps[D]] = null,
    Header: Renderer[HeaderProps[D]] = null,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    width: Double | String = null
  ): Anon_Cell[D] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    if (Cell != null) __obj.updateDynamic("Cell")(Cell.asInstanceOf[js.Any])
    if (Header != null) __obj.updateDynamic("Header")(Header.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cell[D]]
  }
}

