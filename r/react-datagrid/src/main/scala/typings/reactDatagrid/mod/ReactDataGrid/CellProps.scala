package typings.reactDatagrid.mod.ReactDataGrid

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellProps extends js.Object {
  /**
    * a class name for the cell
    */
  var className: String = js.native
  /**
    * the index of the column
    */
  var index: Double = js.native
  /**
    * the index of the row
    */
  var rowIndex: Double = js.native
  /**
    * a style for the cell
    */
  var style: CSSProperties = js.native
}

object CellProps {
  @scala.inline
  def apply(className: String, index: Double, rowIndex: Double, style: CSSProperties): CellProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps]
  }
  @scala.inline
  implicit class CellPropsOps[Self <: CellProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

