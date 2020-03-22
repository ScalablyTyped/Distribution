package typings.rotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rot-js.rot-js/lib/map/digger.Options> */
trait PartialOptionsCorridorLength extends js.Object {
  var corridorLength: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var dugPercentage: js.UndefOr[Double] = js.undefined
  var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var timeLimit: js.UndefOr[Double] = js.undefined
}

object PartialOptionsCorridorLength {
  @scala.inline
  def apply(
    corridorLength: js.Tuple2[Double, Double] = null,
    dugPercentage: Int | Double = null,
    roomHeight: js.Tuple2[Double, Double] = null,
    roomWidth: js.Tuple2[Double, Double] = null,
    timeLimit: Int | Double = null
  ): PartialOptionsCorridorLength = {
    val __obj = js.Dynamic.literal()
    if (corridorLength != null) __obj.updateDynamic("corridorLength")(corridorLength.asInstanceOf[js.Any])
    if (dugPercentage != null) __obj.updateDynamic("dugPercentage")(dugPercentage.asInstanceOf[js.Any])
    if (roomHeight != null) __obj.updateDynamic("roomHeight")(roomHeight.asInstanceOf[js.Any])
    if (roomWidth != null) __obj.updateDynamic("roomWidth")(roomWidth.asInstanceOf[js.Any])
    if (timeLimit != null) __obj.updateDynamic("timeLimit")(timeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsCorridorLength]
  }
}

