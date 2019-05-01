package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RippleBackgroundPropType
  extends BaseBackgroundPropType
     with BackgroundPropType {
  var borderless: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[scala.Double] = js.undefined
  @JSName("type")
  var type_RippleBackgroundPropType: reactDashNativeLib.reactDashNativeLibStrings.RippleAndroid
}

object RippleBackgroundPropType {
  @scala.inline
  def apply(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.RippleAndroid,
    borderless: js.UndefOr[scala.Boolean] = js.undefined,
    color: scala.Int | scala.Double = null
  ): RippleBackgroundPropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleBackgroundPropType]
  }
}

