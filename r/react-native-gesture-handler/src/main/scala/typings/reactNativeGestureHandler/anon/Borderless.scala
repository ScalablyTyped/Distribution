package typings.reactNativeGestureHandler.anon

import typings.reactNative.mod.ColorValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Borderless extends StObject {
  
  var borderless: Boolean
  
  var color: ColorValue
  
  var rippleRadius: js.UndefOr[Double] = js.undefined
  
  var `type`: String
}
object Borderless {
  
  inline def apply(borderless: Boolean, color: ColorValue, `type`: String): Borderless = {
    val __obj = js.Dynamic.literal(borderless = borderless.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borderless]
  }
  
  extension [Self <: Borderless](x: Self) {
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setRippleRadius(value: Double): Self = StObject.set(x, "rippleRadius", value.asInstanceOf[js.Any])
    
    inline def setRippleRadiusUndefined: Self = StObject.set(x, "rippleRadius", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
