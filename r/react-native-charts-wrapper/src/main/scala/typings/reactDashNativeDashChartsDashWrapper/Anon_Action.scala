package typings.reactDashNativeDashChartsDashWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: String
  var bottom: js.UndefOr[Double] = js.undefined
  var centerX: js.UndefOr[Double] = js.undefined
  var centerY: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var right: js.UndefOr[Double] = js.undefined
  var scaleX: js.UndefOr[Double] = js.undefined
  var scaleY: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object Anon_Action {
  @scala.inline
  def apply(
    action: String,
    bottom: Int | Double = null,
    centerX: Int | Double = null,
    centerY: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    top: Int | Double = null
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (centerX != null) __obj.updateDynamic("centerX")(centerX.asInstanceOf[js.Any])
    if (centerY != null) __obj.updateDynamic("centerY")(centerY.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Action]
  }
}

