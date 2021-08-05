package typings.reactNativeElements.mod

import typings.reactNative.mod.TouchableWithoutFeedbackProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleProps
  extends StObject
     with TouchableWithoutFeedbackProps {
  
  var activeScale: js.UndefOr[Double] = js.undefined
  
  var defaultNumber: js.UndefOr[Double] = js.undefined
  
  var friction: js.UndefOr[Double] = js.undefined
  
  var pressInFriction: js.UndefOr[Double] = js.undefined
  
  var pressInTension: js.UndefOr[Double] = js.undefined
  
  var pressOutFriction: js.UndefOr[Double] = js.undefined
  
  var pressOutTension: js.UndefOr[Double] = js.undefined
  
  var tension: js.UndefOr[Double] = js.undefined
  
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}
object ScaleProps {
  
  inline def apply(): ScaleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleProps]
  }
  
  extension [Self <: ScaleProps](x: Self) {
    
    inline def setActiveScale(value: Double): Self = StObject.set(x, "activeScale", value.asInstanceOf[js.Any])
    
    inline def setActiveScaleUndefined: Self = StObject.set(x, "activeScale", js.undefined)
    
    inline def setDefaultNumber(value: Double): Self = StObject.set(x, "defaultNumber", value.asInstanceOf[js.Any])
    
    inline def setDefaultNumberUndefined: Self = StObject.set(x, "defaultNumber", js.undefined)
    
    inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    inline def setPressInFriction(value: Double): Self = StObject.set(x, "pressInFriction", value.asInstanceOf[js.Any])
    
    inline def setPressInFrictionUndefined: Self = StObject.set(x, "pressInFriction", js.undefined)
    
    inline def setPressInTension(value: Double): Self = StObject.set(x, "pressInTension", value.asInstanceOf[js.Any])
    
    inline def setPressInTensionUndefined: Self = StObject.set(x, "pressInTension", js.undefined)
    
    inline def setPressOutFriction(value: Double): Self = StObject.set(x, "pressOutFriction", value.asInstanceOf[js.Any])
    
    inline def setPressOutFrictionUndefined: Self = StObject.set(x, "pressOutFriction", js.undefined)
    
    inline def setPressOutTension(value: Double): Self = StObject.set(x, "pressOutTension", value.asInstanceOf[js.Any])
    
    inline def setPressOutTensionUndefined: Self = StObject.set(x, "pressOutTension", js.undefined)
    
    inline def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    inline def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    
    inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
    
    inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
  }
}
