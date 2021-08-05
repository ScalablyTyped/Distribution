package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.mod.RippleBackgroundPropType
  - typings.reactNative.mod.ThemeAttributeBackgroundPropType
*/
trait BackgroundPropType extends StObject
object BackgroundPropType {
  
  inline def RippleBackgroundPropType(): typings.reactNative.mod.RippleBackgroundPropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RippleAndroid")
    __obj.asInstanceOf[typings.reactNative.mod.RippleBackgroundPropType]
  }
  
  inline def ThemeAttributeBackgroundPropType(attribute: String): typings.reactNative.mod.ThemeAttributeBackgroundPropType = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThemeAttrAndroid")
    __obj.asInstanceOf[typings.reactNative.mod.ThemeAttributeBackgroundPropType]
  }
}
