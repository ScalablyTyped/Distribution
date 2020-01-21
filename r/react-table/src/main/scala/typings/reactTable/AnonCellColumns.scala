package typings.reactTable

import typings.reactTable.mod.CellProps
import typings.reactTable.mod.Column
import typings.reactTable.mod.HeaderProps
import typings.reactTable.mod.Renderer
import typings.reactTable.mod.TableInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellColumns[D /* <: js.Object */] extends js.Object {
  var Cell: Renderer[CellProps[D]]
  var Header: Renderer[HeaderProps[D]]
  var columns: js.Array[Column[D]]
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var show: Boolean | (js.Function1[/* instance */ TableInstance[D], Boolean])
  var width: js.UndefOr[Double | String] = js.undefined
}

object AnonCellColumns {
  @scala.inline
  def apply[D /* <: js.Object */](
    Cell: Renderer[CellProps[D]],
    Header: Renderer[HeaderProps[D]],
    columns: js.Array[Column[D]],
    show: Boolean | (js.Function1[/* instance */ TableInstance[D], Boolean]),
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    width: Double | String = null
  ): AnonCellColumns[D] = {
    val __obj = js.Dynamic.literal(Cell = Cell.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCellColumns[D]]
  }
}

