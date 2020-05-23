package typings.ractive.mod

import typings.ractive.ractiveStrings.fast
import typings.ractive.ractiveStrings.slow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionOpts extends js.Object {
  /** The delay in milliseconds to wait before triggering the transition. */
  var delay: js.UndefOr[Double] = js.undefined
  /** The duration for the transition in milliseconds, slow for 600ms, fast for 200ms, and any other string for 400ms. */
  var duration: js.UndefOr[Double | slow | fast | String] = js.undefined
  /** The easing to use for the transition. */
  var easing: js.UndefOr[String] = js.undefined
}

object TransitionOpts {
  @scala.inline
  def apply(
    delay: js.UndefOr[Double] = js.undefined,
    duration: Double | slow | fast | String = null,
    easing: String = null
  ): TransitionOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionOpts]
  }
}

