package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlyToInterpolatorProps extends js.Object {
  var curve: js.UndefOr[Double] = js.undefined
  var maxDuraiton: js.UndefOr[Double] = js.undefined
  var screenSpeed: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object FlyToInterpolatorProps {
  @scala.inline
  def apply(
    curve: Int | Double = null,
    maxDuraiton: Int | Double = null,
    screenSpeed: Int | Double = null,
    speed: Int | Double = null
  ): FlyToInterpolatorProps = {
    val __obj = js.Dynamic.literal()
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (maxDuraiton != null) __obj.updateDynamic("maxDuraiton")(maxDuraiton.asInstanceOf[js.Any])
    if (screenSpeed != null) __obj.updateDynamic("screenSpeed")(screenSpeed.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlyToInterpolatorProps]
  }
}

