package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlyToInterpolatorProps extends js.Object {
  var curve: js.UndefOr[Double] = js.undefined
  var maxDuration: js.UndefOr[Double] = js.undefined
  var screenSpeed: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object FlyToInterpolatorProps {
  @scala.inline
  def apply(
    curve: js.UndefOr[Double] = js.undefined,
    maxDuration: js.UndefOr[Double] = js.undefined,
    screenSpeed: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined
  ): FlyToInterpolatorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(curve)) __obj.updateDynamic("curve")(curve.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDuration)) __obj.updateDynamic("maxDuration")(maxDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenSpeed)) __obj.updateDynamic("screenSpeed")(screenSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlyToInterpolatorProps]
  }
}

