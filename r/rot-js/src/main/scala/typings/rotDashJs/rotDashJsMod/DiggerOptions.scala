package typings.rotDashJs.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiggerOptions extends js.Object {
  var corridorLength: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var dugPercentage: js.UndefOr[Double] = js.undefined
  var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var timeLimit: js.UndefOr[Double] = js.undefined
}

object DiggerOptions {
  @scala.inline
  def apply(
    corridorLength: js.Tuple2[Double, Double] = null,
    dugPercentage: Int | Double = null,
    roomHeight: js.Tuple2[Double, Double] = null,
    roomWidth: js.Tuple2[Double, Double] = null,
    timeLimit: Int | Double = null
  ): DiggerOptions = {
    val __obj = js.Dynamic.literal()
    if (corridorLength != null) __obj.updateDynamic("corridorLength")(corridorLength)
    if (dugPercentage != null) __obj.updateDynamic("dugPercentage")(dugPercentage.asInstanceOf[js.Any])
    if (roomHeight != null) __obj.updateDynamic("roomHeight")(roomHeight)
    if (roomWidth != null) __obj.updateDynamic("roomWidth")(roomWidth)
    if (timeLimit != null) __obj.updateDynamic("timeLimit")(timeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiggerOptions]
  }
}

