package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationPlaybackEventInit extends EventInit {
  var currentTime: js.UndefOr[Double | Null] = js.undefined
  var timelineTime: js.UndefOr[Double | Null] = js.undefined
}

object AnimationPlaybackEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    currentTime: Int | Double = null,
    timelineTime: Int | Double = null
  ): AnimationPlaybackEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (timelineTime != null) __obj.updateDynamic("timelineTime")(timelineTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPlaybackEventInit]
  }
}

