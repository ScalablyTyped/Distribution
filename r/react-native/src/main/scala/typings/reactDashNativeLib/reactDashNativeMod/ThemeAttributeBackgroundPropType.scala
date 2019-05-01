package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeAttributeBackgroundPropType
  extends BaseBackgroundPropType
     with BackgroundPropType {
  var attribute: java.lang.String
  @JSName("type")
  var type_ThemeAttributeBackgroundPropType: reactDashNativeLib.reactDashNativeLibStrings.ThemeAttrAndroid
}

object ThemeAttributeBackgroundPropType {
  @scala.inline
  def apply(attribute: java.lang.String, `type`: reactDashNativeLib.reactDashNativeLibStrings.ThemeAttrAndroid): ThemeAttributeBackgroundPropType = {
    val __obj = js.Dynamic.literal(attribute = attribute)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ThemeAttributeBackgroundPropType]
  }
}

