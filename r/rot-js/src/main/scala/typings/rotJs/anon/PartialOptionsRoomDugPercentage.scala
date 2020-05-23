package typings.rotJs.anon

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
    roomDugPercentage: js.UndefOr[Double] = js.undefined,
    roomHeight: js.Tuple2[Double, Double] = null,
    roomWidth: js.Tuple2[Double, Double] = null,
    timeLimit: js.UndefOr[Double] = js.undefined
  ): PartialOptionsRoomDugPercentage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(roomDugPercentage)) __obj.updateDynamic("roomDugPercentage")(roomDugPercentage.get.asInstanceOf[js.Any])
    if (roomHeight != null) __obj.updateDynamic("roomHeight")(roomHeight.asInstanceOf[js.Any])
    if (roomWidth != null) __obj.updateDynamic("roomWidth")(roomWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(timeLimit)) __obj.updateDynamic("timeLimit")(timeLimit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsRoomDugPercentage]
  }
}

