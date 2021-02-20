package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.RippleAndroid
import typings.reactNative.reactNativeStrings.ThemeAttrAndroid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.mod.RippleBackgroundPropType
  - typings.reactNative.mod.ThemeAttributeBackgroundPropType
*/
trait BackgroundPropType extends StObject
object BackgroundPropType {
  
  @scala.inline
  def RippleBackgroundPropType(`type`: RippleAndroid): typings.reactNative.mod.RippleBackgroundPropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNative.mod.RippleBackgroundPropType]
  }
  
  @scala.inline
  def ThemeAttributeBackgroundPropType(attribute: String, `type`: ThemeAttrAndroid): typings.reactNative.mod.ThemeAttributeBackgroundPropType = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNative.mod.ThemeAttributeBackgroundPropType]
  }
}
