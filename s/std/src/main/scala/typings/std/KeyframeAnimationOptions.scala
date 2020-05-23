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
    delay: js.UndefOr[Double] = js.undefined,
    direction: PlaybackDirection = null,
    duration: Double | java.lang.String = null,
    easing: java.lang.String = null,
    endDelay: js.UndefOr[Double] = js.undefined,
    fill: FillMode = null,
    id: java.lang.String = null,
    iterationComposite: IterationCompositeOperation = null,
    iterationStart: js.UndefOr[Double] = js.undefined,
    iterations: js.UndefOr[Double] = js.undefined
  ): KeyframeAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (composite != null) __obj.updateDynamic("composite")(composite.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(endDelay)) __obj.updateDynamic("endDelay")(endDelay.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (iterationComposite != null) __obj.updateDynamic("iterationComposite")(iterationComposite.asInstanceOf[js.Any])
    if (!js.isUndefined(iterationStart)) __obj.updateDynamic("iterationStart")(iterationStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframeAnimationOptions]
  }
}

