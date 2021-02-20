package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.ThemeAttrAndroid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeAttributeBackgroundPropType
  extends BaseBackgroundPropType
     with BackgroundPropType {
  
  var attribute: String = js.native
  
  @JSName("type")
  var type_ThemeAttributeBackgroundPropType: ThemeAttrAndroid = js.native
}
object ThemeAttributeBackgroundPropType {
  
  @scala.inline
  def apply(attribute: String, `type`: ThemeAttrAndroid): ThemeAttributeBackgroundPropType = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeAttributeBackgroundPropType]
  }
  
  @scala.inline
  implicit class ThemeAttributeBackgroundPropTypeMutableBuilder[Self <: ThemeAttributeBackgroundPropType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ThemeAttrAndroid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
