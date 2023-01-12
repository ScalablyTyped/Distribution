package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.reactNativeWindowsStrings.RippleAndroid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RippleBackgroundPropType
  extends StObject
     with BaseBackgroundPropType
     with BackgroundPropType {
  
  var borderless: Boolean
  
  var color: js.UndefOr[Double | Null] = js.undefined
  
  @JSName("type")
  var type_RippleBackgroundPropType: RippleAndroid
}
object RippleBackgroundPropType {
  
  inline def apply(borderless: Boolean): RippleBackgroundPropType = {
    val __obj = js.Dynamic.literal(borderless = borderless.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RippleAndroid")
    __obj.asInstanceOf[RippleBackgroundPropType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RippleBackgroundPropType] (val x: Self) extends AnyVal {
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setType(value: RippleAndroid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
