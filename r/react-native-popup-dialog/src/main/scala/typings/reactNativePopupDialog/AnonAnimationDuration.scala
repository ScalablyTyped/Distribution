package typings.reactNativePopupDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationDuration extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var toValue: js.UndefOr[Double] = js.undefined
}

object AnonAnimationDuration {
  @scala.inline
  def apply(animationDuration: Int | Double = null, toValue: Int | Double = null): AnonAnimationDuration = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (toValue != null) __obj.updateDynamic("toValue")(toValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationDuration]
  }
}

