package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.RippleAndroid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RippleBackgroundPropType
  extends StObject
     with BaseBackgroundPropType
     with BackgroundPropType {
  
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  var color: js.UndefOr[ColorValue] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_RippleBackgroundPropType: RippleAndroid
}
object RippleBackgroundPropType {
  
  inline def apply(): RippleBackgroundPropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RippleAndroid")
    __obj.asInstanceOf[RippleBackgroundPropType]
  }
  
  extension [Self <: RippleBackgroundPropType](x: Self) {
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setType(value: RippleAndroid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
