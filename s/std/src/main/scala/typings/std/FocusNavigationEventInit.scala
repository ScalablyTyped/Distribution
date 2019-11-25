package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusNavigationEventInit extends EventInit {
  var navigationReason: js.UndefOr[java.lang.String | Null] = js.undefined
  var originHeight: js.UndefOr[Double] = js.undefined
  var originLeft: js.UndefOr[Double] = js.undefined
  var originTop: js.UndefOr[Double] = js.undefined
  var originWidth: js.UndefOr[Double] = js.undefined
}

object FocusNavigationEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    navigationReason: java.lang.String = null,
    originHeight: Int | Double = null,
    originLeft: Int | Double = null,
    originTop: Int | Double = null,
    originWidth: Int | Double = null
  ): FocusNavigationEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (navigationReason != null) __obj.updateDynamic("navigationReason")(navigationReason.asInstanceOf[js.Any])
    if (originHeight != null) __obj.updateDynamic("originHeight")(originHeight.asInstanceOf[js.Any])
    if (originLeft != null) __obj.updateDynamic("originLeft")(originLeft.asInstanceOf[js.Any])
    if (originTop != null) __obj.updateDynamic("originTop")(originTop.asInstanceOf[js.Any])
    if (originWidth != null) __obj.updateDynamic("originWidth")(originWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusNavigationEventInit]
  }
}

