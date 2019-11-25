package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedEffectTiming extends EffectTiming {
  var activeDuration: js.UndefOr[Double] = js.undefined
  var currentIteration: js.UndefOr[Double | Null] = js.undefined
  var endTime: js.UndefOr[Double] = js.undefined
  var localTime: js.UndefOr[Double | Null] = js.undefined
  var progress: js.UndefOr[Double | Null] = js.undefined
}

object ComputedEffectTiming {
  @scala.inline
  def apply(
    activeDuration: Int | Double = null,
    currentIteration: Int | Double = null,
    delay: Int | Double = null,
    direction: PlaybackDirection = null,
    duration: Double | java.lang.String = null,
    easing: java.lang.String = null,
    endDelay: Int | Double = null,
    endTime: Int | Double = null,
    fill: FillMode = null,
    iterationStart: Int | Double = null,
    iterations: Int | Double = null,
    localTime: Int | Double = null,
    progress: Int | Double = null
  ): ComputedEffectTiming = {
    val __obj = js.Dynamic.literal()
    if (activeDuration != null) __obj.updateDynamic("activeDuration")(activeDuration.asInstanceOf[js.Any])
    if (currentIteration != null) __obj.updateDynamic("currentIteration")(currentIteration.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (endDelay != null) __obj.updateDynamic("endDelay")(endDelay.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (iterationStart != null) __obj.updateDynamic("iterationStart")(iterationStart.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (localTime != null) __obj.updateDynamic("localTime")(localTime.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedEffectTiming]
  }
}

