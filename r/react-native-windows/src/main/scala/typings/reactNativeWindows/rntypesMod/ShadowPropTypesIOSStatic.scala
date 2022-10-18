package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowPropTypesIOSStatic extends StObject {
  
  /**
    * Sets the drop shadow color
    * @platform ios
    */
  var shadowColor: ColorValue
  
  /**
    * Sets the drop shadow offset
    * @platform ios
    */
  var shadowOffset: Width
  
  /**
    * Sets the drop shadow opacity (multiplied by the color's alpha component)
    * @platform ios
    */
  var shadowOpacity: Double
  
  /**
    * Sets the drop shadow blur radius
    * @platform ios
    */
  var shadowRadius: Double
}
object ShadowPropTypesIOSStatic {
  
  inline def apply(shadowColor: ColorValue, shadowOffset: Width, shadowOpacity: Double, shadowRadius: Double): ShadowPropTypesIOSStatic = {
    val __obj = js.Dynamic.literal(shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], shadowOpacity = shadowOpacity.asInstanceOf[js.Any], shadowRadius = shadowRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowPropTypesIOSStatic]
  }
  
  extension [Self <: ShadowPropTypesIOSStatic](x: Self) {
    
    inline def setShadowColor(value: ColorValue): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowOffset(value: Width): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowOpacity(value: Double): Self = StObject.set(x, "shadowOpacity", value.asInstanceOf[js.Any])
    
    inline def setShadowRadius(value: Double): Self = StObject.set(x, "shadowRadius", value.asInstanceOf[js.Any])
  }
}
