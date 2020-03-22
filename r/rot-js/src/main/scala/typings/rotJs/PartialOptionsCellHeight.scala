package typings.rotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rot-js.rot-js/lib/map/rogue.Options> */
trait PartialOptionsCellHeight extends js.Object {
  var cellHeight: js.UndefOr[Double] = js.undefined
  var cellWidth: js.UndefOr[Double] = js.undefined
  var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object PartialOptionsCellHeight {
  @scala.inline
  def apply(
    cellHeight: Int | Double = null,
    cellWidth: Int | Double = null,
    roomHeight: js.Tuple2[Double, Double] = null,
    roomWidth: js.Tuple2[Double, Double] = null
  ): PartialOptionsCellHeight = {
    val __obj = js.Dynamic.literal()
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (cellWidth != null) __obj.updateDynamic("cellWidth")(cellWidth.asInstanceOf[js.Any])
    if (roomHeight != null) __obj.updateDynamic("roomHeight")(roomHeight.asInstanceOf[js.Any])
    if (roomWidth != null) __obj.updateDynamic("roomWidth")(roomWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsCellHeight]
  }
}

