package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowStyleIOS extends js.Object {
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  var shadowOffset: js.UndefOr[reactDashNativeLib.Anon_Height] = js.undefined
  var shadowOpacity: js.UndefOr[scala.Double] = js.undefined
  var shadowRadius: js.UndefOr[scala.Double] = js.undefined
}

object ShadowStyleIOS {
  @scala.inline
  def apply(
    shadowColor: java.lang.String = null,
    shadowOffset: reactDashNativeLib.Anon_Height = null,
    shadowOpacity: scala.Int | scala.Double = null,
    shadowRadius: scala.Int | scala.Double = null
  ): ShadowStyleIOS = {
    val __obj = js.Dynamic.literal()
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset)
    if (shadowOpacity != null) __obj.updateDynamic("shadowOpacity")(shadowOpacity.asInstanceOf[js.Any])
    if (shadowRadius != null) __obj.updateDynamic("shadowRadius")(shadowRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowStyleIOS]
  }
}

