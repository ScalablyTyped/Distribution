package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusNavigationEventInit extends EventInit {
  var navigationReason: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var originHeight: js.UndefOr[scala.Double] = js.undefined
  var originLeft: js.UndefOr[scala.Double] = js.undefined
  var originTop: js.UndefOr[scala.Double] = js.undefined
  var originWidth: js.UndefOr[scala.Double] = js.undefined
}

object FocusNavigationEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    navigationReason: java.lang.String = null,
    originHeight: scala.Int | scala.Double = null,
    originLeft: scala.Int | scala.Double = null,
    originTop: scala.Int | scala.Double = null,
    originWidth: scala.Int | scala.Double = null
  ): FocusNavigationEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (navigationReason != null) __obj.updateDynamic("navigationReason")(navigationReason)
    if (originHeight != null) __obj.updateDynamic("originHeight")(originHeight.asInstanceOf[js.Any])
    if (originLeft != null) __obj.updateDynamic("originLeft")(originLeft.asInstanceOf[js.Any])
    if (originTop != null) __obj.updateDynamic("originTop")(originTop.asInstanceOf[js.Any])
    if (originWidth != null) __obj.updateDynamic("originWidth")(originWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusNavigationEventInit]
  }
}

