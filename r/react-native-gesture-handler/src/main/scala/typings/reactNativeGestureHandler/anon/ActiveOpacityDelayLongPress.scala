package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveOpacityDelayLongPress extends StObject {
  
  var activeOpacity: Double
  
  var delayLongPress: Double
  
  var extraButtonProps: Exclusive
}
object ActiveOpacityDelayLongPress {
  
  inline def apply(activeOpacity: Double, delayLongPress: Double, extraButtonProps: Exclusive): ActiveOpacityDelayLongPress = {
    val __obj = js.Dynamic.literal(activeOpacity = activeOpacity.asInstanceOf[js.Any], delayLongPress = delayLongPress.asInstanceOf[js.Any], extraButtonProps = extraButtonProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveOpacityDelayLongPress]
  }
  
  extension [Self <: ActiveOpacityDelayLongPress](x: Self) {
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    inline def setExtraButtonProps(value: Exclusive): Self = StObject.set(x, "extraButtonProps", value.asInstanceOf[js.Any])
  }
}
