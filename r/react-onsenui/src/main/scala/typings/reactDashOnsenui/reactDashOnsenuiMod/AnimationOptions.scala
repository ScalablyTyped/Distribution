package typings.reactDashOnsenui.reactDashOnsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var timing: js.UndefOr[String] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(delay: Int | Double = null, duration: Int | Double = null, timing: String = null): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing)
    __obj.asInstanceOf[AnimationOptions]
  }
}

