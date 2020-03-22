package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementTransition extends js.Object {
  var alpha: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  var id: String
  var rotationX: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  var rotationY: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  var scaleX: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  var scaleY: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  var translationX: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  var translationY: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  var x: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  var y: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
}

object ElementTransition {
  @scala.inline
  def apply(
    id: String,
    alpha: AppearingElementAnimation | DisappearingElementAnimation = null,
    rotationX: AppearingElementAnimation | DisappearingElementAnimation = null,
    rotationY: AppearingElementAnimation | DisappearingElementAnimation = null,
    scaleX: AppearingElementAnimation | DisappearingElementAnimation = null,
    scaleY: AppearingElementAnimation | DisappearingElementAnimation = null,
    translationX: AppearingElementAnimation | DisappearingElementAnimation = null,
    translationY: AppearingElementAnimation | DisappearingElementAnimation = null,
    x: AppearingElementAnimation | DisappearingElementAnimation = null,
    y: AppearingElementAnimation | DisappearingElementAnimation = null
  ): ElementTransition = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (rotationX != null) __obj.updateDynamic("rotationX")(rotationX.asInstanceOf[js.Any])
    if (rotationY != null) __obj.updateDynamic("rotationY")(rotationY.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (translationX != null) __obj.updateDynamic("translationX")(translationX.asInstanceOf[js.Any])
    if (translationY != null) __obj.updateDynamic("translationY")(translationY.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementTransition]
  }
}

