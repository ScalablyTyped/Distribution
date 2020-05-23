package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalEffectTiming extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[PlaybackDirection] = js.undefined
  var duration: js.UndefOr[Double | java.lang.String] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var endDelay: js.UndefOr[Double] = js.undefined
  var fill: js.UndefOr[FillMode] = js.undefined
  var iterationStart: js.UndefOr[Double] = js.undefined
  var iterations: js.UndefOr[Double] = js.undefined
}

object OptionalEffectTiming {
  @scala.inline
  def apply(
    delay: js.UndefOr[Double] = js.undefined,
    direction: PlaybackDirection = null,
    duration: Double | java.lang.String = null,
    easing: java.lang.String = null,
    endDelay: js.UndefOr[Double] = js.undefined,
    fill: FillMode = null,
    iterationStart: js.UndefOr[Double] = js.undefined,
    iterations: js.UndefOr[Double] = js.undefined
  ): OptionalEffectTiming = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(endDelay)) __obj.updateDynamic("endDelay")(endDelay.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(iterationStart)) __obj.updateDynamic("iterationStart")(iterationStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalEffectTiming]
  }
}

