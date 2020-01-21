package typings.rotJs.rogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Number of cells to create on the vertical (number of rooms vertically) */
  var cellHeight: Double
  /** Number of cells to create on the horizontal (number of rooms horizontally) */
  var cellWidth: Double
  /** Room min and max height - normally set auto-magically via the constructor. */
  var roomHeight: js.Tuple2[Double, Double]
  /** Room min and max width - normally set auto-magically via the constructor. */
  var roomWidth: js.Tuple2[Double, Double]
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
}

