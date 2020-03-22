package typings.rotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rot-js.rot-js/lib/map/uniform.Options> */
trait PartialOptionsRoomDugPercentage extends js.Object {
  var roomDugPercentage: js.UndefOr[Double] = js.undefined
  var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var timeLimit: js.UndefOr[Double] = js.undefined
}

object PartialOptionsRoomDugPercentage {
  @scala.inline
  def apply(
    roomDugPercentage: Int | Double = null,
    roomHeight: js.Tuple2[Double, Double] = null,
    roomWidth: js.Tuple2[Double, Double] = null,
    timeLimit: Int | Double = null
  ): PartialOptionsRoomDugPercentage = {
    val __obj = js.Dynamic.literal()
    if (roomDugPercentage != null) __obj.updateDynamic("roomDugPercentage")(roomDugPercentage.asInstanceOf[js.Any])
    if (roomHeight != null) __obj.updateDynamic("roomHeight")(roomHeight.asInstanceOf[js.Any])
    if (roomWidth != null) __obj.updateDynamic("roomWidth")(roomWidth.asInstanceOf[js.Any])
    if (timeLimit != null) __obj.updateDynamic("timeLimit")(timeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsRoomDugPercentage]
  }
}

