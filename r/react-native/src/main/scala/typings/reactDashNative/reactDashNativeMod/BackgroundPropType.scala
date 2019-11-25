package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.RippleAndroid
import typings.reactDashNative.reactDashNativeStrings.ThemeAttrAndroid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNative.reactDashNativeMod.RippleBackgroundPropType
  - typings.reactDashNative.reactDashNativeMod.ThemeAttributeBackgroundPropType
*/
trait BackgroundPropType extends js.Object

object BackgroundPropType {
  @scala.inline
  def RippleBackgroundPropType(`type`: RippleAndroid, borderless: js.UndefOr[Boolean] = js.undefined, color: Int | Double = null): BackgroundPropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundPropType]
  }
  @scala.inline
  def ThemeAttributeBackgroundPropType(attribute: String, `type`: ThemeAttrAndroid): BackgroundPropType = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundPropType]
  }
}

