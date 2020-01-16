package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.CellProps
import typings.reactDashTable.reactDashTableMod.Column
import typings.reactDashTable.reactDashTableMod.HeaderProps
import typings.reactDashTable.reactDashTableMod.Renderer
import typings.reactDashTable.reactDashTableMod.TableInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellColumns[D /* <: js.Object */] extends js.Object {
  var Cell: Renderer[CellProps[D]]
  var Header: Renderer[HeaderProps[D]]
  var columns: js.Array[Column[D]]
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var show: Boolean | (js.Function1[/* instance */ TableInstance[D], Boolean])
  var width: js.UndefOr[Double | String] = js.undefined
}

object Anon_CellColumns {
  @scala.inline
  def apply[D /* <: js.Object */](
    Cell: Renderer[CellProps[D]],
    Header: Renderer[HeaderProps[D]],
    columns: js.Array[Column[D]],
    show: Boolean | (js.Function1[/* instance */ TableInstance[D], Boolean]),
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    width: Double | String = null
  ): Anon_CellColumns[D] = {
    val __obj = js.Dynamic.literal(Cell = Cell.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CellColumns[D]]
  }
}

