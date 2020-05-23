package typings.rotJs.anon

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
    cellHeight: js.UndefOr[Double] = js.undefined,
    cellWidth: js.UndefOr[Double] = js.undefined,
    roomHeight: js.Tuple2[Double, Double] = null,
    roomWidth: js.Tuple2[Double, Double] = null
  ): PartialOptionsCellHeight = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cellHeight)) __obj.updateDynamic("cellHeight")(cellHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellWidth)) __obj.updateDynamic("cellWidth")(cellWidth.get.asInstanceOf[js.Any])
    if (roomHeight != null) __obj.updateDynamic("roomHeight")(roomHeight.asInstanceOf[js.Any])
    if (roomWidth != null) __obj.updateDynamic("roomWidth")(roomWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsCellHeight]
  }
}

