package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsAnimations extends js.Object {
  /**
    * Configure what animates when modal is dismissed
    */
  var dismissModal: js.UndefOr[OptionsAnimationProperties] = js.undefined
  /**
    * Configure what animates when a screen is popped
    */
  var pop: js.UndefOr[OptionsAnimationSeparate] = js.undefined
  /**
    * Configure what animates when a screen is pushed
    */
  var push: js.UndefOr[OptionsAnimationSeparate] = js.undefined
  /**
    * Configure the setRoot animation
    */
  var setRoot: js.UndefOr[OptionsAnimationProperties] = js.undefined
  /**
    * Configure what animates when modal is shown
    */
  var showModal: js.UndefOr[OptionsAnimationProperties] = js.undefined
}

object OptionsAnimations {
  @scala.inline
  def apply(
    dismissModal: OptionsAnimationProperties = null,
    pop: OptionsAnimationSeparate = null,
    push: OptionsAnimationSeparate = null,
    setRoot: OptionsAnimationProperties = null,
    showModal: OptionsAnimationProperties = null
  ): OptionsAnimations = {
    val __obj = js.Dynamic.literal()
    if (dismissModal != null) __obj.updateDynamic("dismissModal")(dismissModal)
    if (pop != null) __obj.updateDynamic("pop")(pop)
    if (push != null) __obj.updateDynamic("push")(push)
    if (setRoot != null) __obj.updateDynamic("setRoot")(setRoot)
    if (showModal != null) __obj.updateDynamic("showModal")(showModal)
    __obj.asInstanceOf[OptionsAnimations]
  }
}

