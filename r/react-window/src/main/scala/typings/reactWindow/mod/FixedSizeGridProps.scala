package typings.reactWindow.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedSizeGridProps extends GridProps {
  /**
    * Width of an individual column within the grid.
    */
  var columnWidth: Double = js.native
  /**
    * Height of an individual row within the grid.
    */
  var rowHeight: Double = js.native
}

object FixedSizeGridProps {
  @scala.inline
  def apply(
    children: ComponentType[GridChildComponentProps],
    columnCount: Double,
    columnWidth: Double,
    height: Double,
    rowCount: Double,
    rowHeight: Double,
    width: Double
  ): FixedSizeGridProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedSizeGridProps]
  }
  @scala.inline
  implicit class FixedSizeGridPropsOps[Self <: FixedSizeGridProps] (val x: Self) extends AnyVal {
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
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
  }
  
}

