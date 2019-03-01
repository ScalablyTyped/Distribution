package typings
package reactDashToolboxLib.libRippleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RippleTheme extends js.Object {
  /**
    * Root classname for the ripple.
    */
  var ripple: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Applied when the ripple is active.
    */
  var rippleActive: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Applied when the ripple is restarting.
    */
  var rippleRestarting: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Wrapper class to fit to the parent element.
    */
  var rippleWrapper: js.UndefOr[java.lang.String] = js.undefined
}

object RippleTheme {
  @scala.inline
  def apply(
    ripple: java.lang.String = null,
    rippleActive: java.lang.String = null,
    rippleRestarting: java.lang.String = null,
    rippleWrapper: java.lang.String = null
  ): RippleTheme = {
    val __obj = js.Dynamic.literal()
    if (ripple != null) __obj.updateDynamic("ripple")(ripple)
    if (rippleActive != null) __obj.updateDynamic("rippleActive")(rippleActive)
    if (rippleRestarting != null) __obj.updateDynamic("rippleRestarting")(rippleRestarting)
    if (rippleWrapper != null) __obj.updateDynamic("rippleWrapper")(rippleWrapper)
    __obj.asInstanceOf[RippleTheme]
  }
}

