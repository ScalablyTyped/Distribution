package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.RippleAndroid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RippleBackgroundPropType
  extends BaseBackgroundPropType
     with BackgroundPropType {
  var borderless: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[Double] = js.undefined
  @JSName("type")
  var type_RippleBackgroundPropType: RippleAndroid
}

object RippleBackgroundPropType {
  @scala.inline
  def apply(`type`: RippleAndroid, borderless: js.UndefOr[Boolean] = js.undefined, color: Int | Double = null): RippleBackgroundPropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleBackgroundPropType]
  }
}

