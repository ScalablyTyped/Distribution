package typings.qrcodeGenerator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellSize extends js.Object {
  var cellSize: js.UndefOr[Double] = js.native
  var margin: js.UndefOr[Double] = js.native
  var scalable: js.UndefOr[Boolean] = js.native
}

object CellSize {
  @scala.inline
  def apply(): CellSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellSize]
  }
  @scala.inline
  implicit class CellSizeOps[Self <: CellSize] (val x: Self) extends AnyVal {
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
    def setCellSize(value: Double): Self = this.set("cellSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellSize: Self = this.set("cellSize", js.undefined)
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setScalable(value: Boolean): Self = this.set("scalable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalable: Self = this.set("scalable", js.undefined)
  }
  
}

