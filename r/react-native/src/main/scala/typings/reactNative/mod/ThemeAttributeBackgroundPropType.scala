package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeAttributeBackgroundPropType
  extends StObject
     with BaseBackgroundPropType {
  
  var attribute: String
  
  @JSName("type")
  var type_ThemeAttributeBackgroundPropType: "ThemeAttrAndroid"
}
object ThemeAttributeBackgroundPropType {
  
  inline def apply(attribute: String): ThemeAttributeBackgroundPropType = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThemeAttrAndroid")
    __obj.asInstanceOf[ThemeAttributeBackgroundPropType]
  }
  
  extension [Self <: ThemeAttributeBackgroundPropType](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setType(value: "ThemeAttrAndroid"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
