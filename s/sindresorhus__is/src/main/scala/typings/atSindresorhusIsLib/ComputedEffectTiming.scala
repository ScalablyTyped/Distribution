package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedEffectTiming extends EffectTiming {
  var activeDuration: js.UndefOr[scala.Double] = js.undefined
  var currentIteration: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var endTime: js.UndefOr[scala.Double] = js.undefined
  var localTime: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var progress: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object ComputedEffectTiming {
  @scala.inline
  def apply(
    activeDuration: scala.Int | scala.Double = null,
    currentIteration: scala.Int | scala.Double = null,
    delay: scala.Int | scala.Double = null,
    direction: PlaybackDirection = null,
    duration: scala.Double | java.lang.String = null,
    easing: java.lang.String = null,
    endDelay: scala.Int | scala.Double = null,
    endTime: scala.Int | scala.Double = null,
    fill: FillMode = null,
    iterationStart: scala.Int | scala.Double = null,
    iterations: scala.Int | scala.Double = null,
    localTime: scala.Int | scala.Double = null,
    progress: scala.Int | scala.Double = null
  ): ComputedEffectTiming = {
    val __obj = js.Dynamic.literal()
    if (activeDuration != null) __obj.updateDynamic("activeDuration")(activeDuration.asInstanceOf[js.Any])
    if (currentIteration != null) __obj.updateDynamic("currentIteration")(currentIteration.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (endDelay != null) __obj.updateDynamic("endDelay")(endDelay.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (iterationStart != null) __obj.updateDynamic("iterationStart")(iterationStart.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (localTime != null) __obj.updateDynamic("localTime")(localTime.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedEffectTiming]
  }
}

