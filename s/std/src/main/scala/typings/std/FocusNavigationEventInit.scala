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
    navigationReason: js.UndefOr[Null | java.lang.String] = js.undefined,
    originHeight: js.UndefOr[Double] = js.undefined,
    originLeft: js.UndefOr[Double] = js.undefined,
    originTop: js.UndefOr[Double] = js.undefined,
    originWidth: js.UndefOr[Double] = js.undefined
  ): FocusNavigationEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationReason)) __obj.updateDynamic("navigationReason")(navigationReason.asInstanceOf[js.Any])
    if (!js.isUndefined(originHeight)) __obj.updateDynamic("originHeight")(originHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(originLeft)) __obj.updateDynamic("originLeft")(originLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(originTop)) __obj.updateDynamic("originTop")(originTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(originWidth)) __obj.updateDynamic("originWidth")(originWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusNavigationEventInit]
  }
}

