package typings.rotDashJs.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniformOptions extends js.Object {
  var roomDugPercentage: js.UndefOr[Double] = js.undefined
  var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var timeLimit: js.UndefOr[Double] = js.undefined
}

object UniformOptions {
  @scala.inline
  def apply(
    roomDugPercentage: Int | Double = null,
    roomHeight: js.Tuple2[Double, Double] = null,
    roomWidth: js.Tuple2[Double, Double] = null,
    timeLimit: Int | Double = null
  ): UniformOptions = {
    val __obj = js.Dynamic.literal()
    if (roomDugPercentage != null) __obj.updateDynamic("roomDugPercentage")(roomDugPercentage.asInstanceOf[js.Any])
    if (roomHeight != null) __obj.updateDynamic("roomHeight")(roomHeight)
    if (roomWidth != null) __obj.updateDynamic("roomWidth")(roomWidth)
    if (timeLimit != null) __obj.updateDynamic("timeLimit")(timeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniformOptions]
  }
}

