package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelayPressOut extends StObject {
  
  var activeOpacity: Double
  
  var delayLongPress: Double
  
  var delayPressOut: Double
  
  var extraButtonProps: Exclusive
  
  var underlayColor: String
}
object DelayPressOut {
  
  inline def apply(
    activeOpacity: Double,
    delayLongPress: Double,
    delayPressOut: Double,
    extraButtonProps: Exclusive,
    underlayColor: String
  ): DelayPressOut = {
    val __obj = js.Dynamic.literal(activeOpacity = activeOpacity.asInstanceOf[js.Any], delayLongPress = delayLongPress.asInstanceOf[js.Any], delayPressOut = delayPressOut.asInstanceOf[js.Any], extraButtonProps = extraButtonProps.asInstanceOf[js.Any], underlayColor = underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelayPressOut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelayPressOut] (val x: Self) extends AnyVal {
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    inline def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
    
    inline def setExtraButtonProps(value: Exclusive): Self = StObject.set(x, "extraButtonProps", value.asInstanceOf[js.Any])
    
    inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
  }
}
