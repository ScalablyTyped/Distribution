package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  /**
    * Configure what animates when modal is dismissed
    */
  var dismissModal: js.UndefOr[ScreenAnimationOptions] = js.undefined
  /**
    * Configure what animates when a screen is popped
    */
  var pop: js.UndefOr[StackAnimationOptions] = js.undefined
  /**
    * Configure what animates when a screen is pushed
    */
  var push: js.UndefOr[StackAnimationOptions] = js.undefined
  /**
    * Configure the setRoot animation
    */
  var setRoot: js.UndefOr[ScreenAnimationOptions] = js.undefined
  /**
    * Configure what animates when modal is shown
    */
  var showModal: js.UndefOr[ScreenAnimationOptions] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    dismissModal: ScreenAnimationOptions = null,
    pop: StackAnimationOptions = null,
    push: StackAnimationOptions = null,
    setRoot: ScreenAnimationOptions = null,
    showModal: ScreenAnimationOptions = null
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (dismissModal != null) __obj.updateDynamic("dismissModal")(dismissModal)
    if (pop != null) __obj.updateDynamic("pop")(pop)
    if (push != null) __obj.updateDynamic("push")(push)
    if (setRoot != null) __obj.updateDynamic("setRoot")(setRoot)
    if (showModal != null) __obj.updateDynamic("showModal")(showModal)
    __obj.asInstanceOf[AnimationOptions]
  }
}

