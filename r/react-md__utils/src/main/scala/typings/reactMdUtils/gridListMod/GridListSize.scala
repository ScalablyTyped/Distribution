package typings.reactMdUtils.gridListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridListSize extends js.Object {
  /**
    * The current width of each cell within the grid.
    */
  var cellWidth: Double = js.native
  /**
    * The current number of columns in the `GridList`.
    */
  var columns: Double = js.native
}

object GridListSize {
  @scala.inline
  def apply(cellWidth: Double, columns: Double): GridListSize = {
    val __obj = js.Dynamic.literal(cellWidth = cellWidth.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridListSize]
  }
  @scala.inline
  implicit class GridListSizeOps[Self <: GridListSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCellWidth(value: Double): Self = this.set("cellWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
  }
  
}

