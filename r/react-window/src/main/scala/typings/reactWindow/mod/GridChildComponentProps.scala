package typings.reactWindow.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridChildComponentProps extends js.Object {
  var columnIndex: Double = js.native
  var data: js.Any = js.native
  var isScrolling: js.UndefOr[Boolean] = js.native
  var rowIndex: Double = js.native
  var style: CSSProperties = js.native
}

object GridChildComponentProps {
  @scala.inline
  def apply(columnIndex: Double, data: js.Any, rowIndex: Double, style: CSSProperties): GridChildComponentProps = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridChildComponentProps]
  }
  @scala.inline
  implicit class GridChildComponentPropsOps[Self <: GridChildComponentProps] (val x: Self) extends AnyVal {
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsScrolling: Self = this.set("isScrolling", js.undefined)
  }
  
}

