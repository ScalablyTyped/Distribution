package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyframeAnimationOptions extends KeyframeEffectOptions {
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object KeyframeAnimationOptions {
  @scala.inline
  def apply(
    composite: CompositeOperation = null,
    delay: Int | Double = null,
    direction: PlaybackDirection = null,
    duration: Double | java.lang.String = null,
    easing: java.lang.String = null,
    endDelay: Int | Double = null,
    fill: FillMode = null,
    id: java.lang.String = null,
    iterationComposite: IterationCompositeOperation = null,
    iterationStart: Int | Double = null,
    iterations: Int | Double = null
  ): KeyframeAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (composite != null) __obj.updateDynamic("composite")(composite)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (endDelay != null) __obj.updateDynamic("endDelay")(endDelay.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (id != null) __obj.updateDynamic("id")(id)
    if (iterationComposite != null) __obj.updateDynamic("iterationComposite")(iterationComposite)
    if (iterationStart != null) __obj.updateDynamic("iterationStart")(iterationStart.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframeAnimationOptions]
  }
}

