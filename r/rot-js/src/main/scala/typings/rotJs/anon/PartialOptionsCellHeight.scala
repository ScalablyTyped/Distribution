package typings.rotJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rot-js.rot-js/lib/map/rogue.Options> */
@js.native
trait PartialOptionsCellHeight extends js.Object {
  var cellHeight: js.UndefOr[Double] = js.native
  var cellWidth: js.UndefOr[Double] = js.native
  var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object PartialOptionsCellHeight {
  @scala.inline
  def apply(): PartialOptionsCellHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsCellHeight]
  }
  @scala.inline
  implicit class PartialOptionsCellHeightOps[Self <: PartialOptionsCellHeight] (val x: Self) extends AnyVal {
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
    def setCellHeight(value: Double): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellHeight: Self = this.set("cellHeight", js.undefined)
    @scala.inline
    def setCellWidth(value: Double): Self = this.set("cellWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellWidth: Self = this.set("cellWidth", js.undefined)
    @scala.inline
    def setRoomHeight(value: js.Tuple2[Double, Double]): Self = this.set("roomHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoomHeight: Self = this.set("roomHeight", js.undefined)
    @scala.inline
    def setRoomWidth(value: js.Tuple2[Double, Double]): Self = this.set("roomWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoomWidth: Self = this.set("roomWidth", js.undefined)
  }
  
}

