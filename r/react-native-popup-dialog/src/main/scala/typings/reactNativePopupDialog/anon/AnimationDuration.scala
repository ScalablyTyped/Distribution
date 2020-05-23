package typings.reactNativePopupDialog.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationDuration extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var toValue: js.UndefOr[Double] = js.undefined
}

object AnimationDuration {
  @scala.inline
  def apply(animationDuration: js.UndefOr[Double] = js.undefined, toValue: js.UndefOr[Double] = js.undefined): AnimationDuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toValue)) __obj.updateDynamic("toValue")(toValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationDuration]
  }
}

