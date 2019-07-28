package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.ThemeAttrAndroid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeAttributeBackgroundPropType
  extends BaseBackgroundPropType
     with BackgroundPropType {
  var attribute: String
  @JSName("type")
  var type_ThemeAttributeBackgroundPropType: ThemeAttrAndroid
}

object ThemeAttributeBackgroundPropType {
  @scala.inline
  def apply(attribute: String, `type`: ThemeAttrAndroid): ThemeAttributeBackgroundPropType = {
    val __obj = js.Dynamic.literal(attribute = attribute)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ThemeAttributeBackgroundPropType]
  }
}

