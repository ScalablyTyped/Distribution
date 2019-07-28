package typings.reactDashNativeDashPopupDashDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationDuration extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var toValue: js.UndefOr[Double] = js.undefined
}

object Anon_AnimationDuration {
  @scala.inline
  def apply(animationDuration: Int | Double = null, toValue: Int | Double = null): Anon_AnimationDuration = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (toValue != null) __obj.updateDynamic("toValue")(toValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnimationDuration]
  }
}

