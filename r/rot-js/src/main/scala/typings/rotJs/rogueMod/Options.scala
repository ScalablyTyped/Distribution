package typings.rotJs.rogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Number of cells to create on the vertical (number of rooms vertically) */
  var cellHeight: Double = js.native
  /** Number of cells to create on the horizontal (number of rooms horizontally) */
  var cellWidth: Double = js.native
  /** Room min and max height - normally set auto-magically via the constructor. */
  var roomHeight: js.Tuple2[Double, Double] = js.native
  /** Room min and max width - normally set auto-magically via the constructor. */
  var roomWidth: js.Tuple2[Double, Double] = js.native
}

object Options {
  @scala.inline
  def apply(
    cellHeight: Double,
    cellWidth: Double,
    roomHeight: js.Tuple2[Double, Double],
    roomWidth: js.Tuple2[Double, Double]
  ): Options = {
    val __obj = js.Dynamic.literal(cellHeight = cellHeight.asInstanceOf[js.Any], cellWidth = cellWidth.asInstanceOf[js.Any], roomHeight = roomHeight.asInstanceOf[js.Any], roomWidth = roomWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCellWidth(value: Double): Self = this.set("cellWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoomHeight(value: js.Tuple2[Double, Double]): Self = this.set("roomHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoomWidth(value: js.Tuple2[Double, Double]): Self = this.set("roomWidth", value.asInstanceOf[js.Any])
  }
  
}

