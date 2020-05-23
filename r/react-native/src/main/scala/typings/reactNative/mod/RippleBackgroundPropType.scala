package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.RippleAndroid
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
  def apply(
    `type`: RippleAndroid,
    borderless: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Double] = js.undefined
  ): RippleBackgroundPropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleBackgroundPropType]
  }
}

