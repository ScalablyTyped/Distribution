package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeWindows.rntypesMod.RippleBackgroundPropType
  - typings.reactNativeWindows.rntypesMod.ThemeAttributeBackgroundPropType
*/
trait BackgroundPropType extends StObject
object BackgroundPropType {
  
  inline def RippleBackgroundPropType(borderless: Boolean): typings.reactNativeWindows.rntypesMod.RippleBackgroundPropType = {
    val __obj = js.Dynamic.literal(borderless = borderless.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RippleAndroid")
    __obj.asInstanceOf[typings.reactNativeWindows.rntypesMod.RippleBackgroundPropType]
  }
  
  inline def ThemeAttributeBackgroundPropType(attribute: String): typings.reactNativeWindows.rntypesMod.ThemeAttributeBackgroundPropType = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThemeAttrAndroid")
    __obj.asInstanceOf[typings.reactNativeWindows.rntypesMod.ThemeAttributeBackgroundPropType]
  }
}
