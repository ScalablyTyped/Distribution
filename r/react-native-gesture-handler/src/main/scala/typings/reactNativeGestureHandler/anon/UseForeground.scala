package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseForeground extends StObject {
  
  var delayLongPress: Double
  
  var extraButtonProps: RippleColor
  
  var useForeground: Boolean
}
object UseForeground {
  
  inline def apply(delayLongPress: Double, extraButtonProps: RippleColor, useForeground: Boolean): UseForeground = {
    val __obj = js.Dynamic.literal(delayLongPress = delayLongPress.asInstanceOf[js.Any], extraButtonProps = extraButtonProps.asInstanceOf[js.Any], useForeground = useForeground.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseForeground]
  }
  
  extension [Self <: UseForeground](x: Self) {
    
    inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    inline def setExtraButtonProps(value: RippleColor): Self = StObject.set(x, "extraButtonProps", value.asInstanceOf[js.Any])
    
    inline def setUseForeground(value: Boolean): Self = StObject.set(x, "useForeground", value.asInstanceOf[js.Any])
  }
}
