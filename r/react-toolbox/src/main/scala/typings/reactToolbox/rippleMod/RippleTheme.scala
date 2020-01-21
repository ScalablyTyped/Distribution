package typings.reactToolbox.rippleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RippleTheme extends js.Object {
  /**
    * Root classname for the ripple.
    */
  var ripple: js.UndefOr[String] = js.undefined
  /**
    * Applied when the ripple is active.
    */
  var rippleActive: js.UndefOr[String] = js.undefined
  /**
    * Applied when the ripple is restarting.
    */
  var rippleRestarting: js.UndefOr[String] = js.undefined
  /**
    * Wrapper class to fit to the parent element.
    */
  var rippleWrapper: js.UndefOr[String] = js.undefined
}

object RippleTheme {
  @scala.inline
  def apply(
    ripple: String = null,
    rippleActive: String = null,
    rippleRestarting: String = null,
    rippleWrapper: String = null
  ): RippleTheme = {
    val __obj = js.Dynamic.literal()
    if (ripple != null) __obj.updateDynamic("ripple")(ripple.asInstanceOf[js.Any])
    if (rippleActive != null) __obj.updateDynamic("rippleActive")(rippleActive.asInstanceOf[js.Any])
    if (rippleRestarting != null) __obj.updateDynamic("rippleRestarting")(rippleRestarting.asInstanceOf[js.Any])
    if (rippleWrapper != null) __obj.updateDynamic("rippleWrapper")(rippleWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleTheme]
  }
}

