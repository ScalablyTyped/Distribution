package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusNavigationOrigin extends js.Object {
  var originHeight: js.UndefOr[Double] = js.undefined
  var originLeft: js.UndefOr[Double] = js.undefined
  var originTop: js.UndefOr[Double] = js.undefined
  var originWidth: js.UndefOr[Double] = js.undefined
}

object FocusNavigationOrigin {
  @scala.inline
  def apply(
    originHeight: js.UndefOr[Double] = js.undefined,
    originLeft: js.UndefOr[Double] = js.undefined,
    originTop: js.UndefOr[Double] = js.undefined,
    originWidth: js.UndefOr[Double] = js.undefined
  ): FocusNavigationOrigin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(originHeight)) __obj.updateDynamic("originHeight")(originHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(originLeft)) __obj.updateDynamic("originLeft")(originLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(originTop)) __obj.updateDynamic("originTop")(originTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(originWidth)) __obj.updateDynamic("originWidth")(originWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusNavigationOrigin]
  }
}

