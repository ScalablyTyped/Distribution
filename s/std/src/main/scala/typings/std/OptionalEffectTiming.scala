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
    delay: Int | Double = null,
    direction: PlaybackDirection = null,
    duration: Double | java.lang.String = null,
    easing: java.lang.String = null,
    endDelay: Int | Double = null,
    fill: FillMode = null,
    iterationStart: Int | Double = null,
    iterations: Int | Double = null
  ): OptionalEffectTiming = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (endDelay != null) __obj.updateDynamic("endDelay")(endDelay.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (iterationStart != null) __obj.updateDynamic("iterationStart")(iterationStart.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalEffectTiming]
  }
}

