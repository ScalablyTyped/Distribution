package typings
package reactDashOnsenuiLib.reactDashOnsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageTransitionOptions extends js.Object {
  var animation: js.UndefOr[NavigatorAnimationTypes] = js.undefined
  var animationOptions: js.UndefOr[AnimationOptions] = js.undefined
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
}

object PageTransitionOptions {
  @scala.inline
  def apply(
    animation: NavigatorAnimationTypes = null,
    animationOptions: AnimationOptions = null,
    callback: js.Function0[scala.Unit] = null,
    data: js.Any = null
  ): PageTransitionOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[PageTransitionOptions]
  }
}

