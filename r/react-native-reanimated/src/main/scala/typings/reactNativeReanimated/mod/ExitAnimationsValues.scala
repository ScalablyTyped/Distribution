package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExitAnimationsValues extends StObject {
  
  var currentGlobalOriginX: Double
  
  var currentGlobalOriginY: Double
  
  var currentHeight: Double
  
  var currentOriginX: Double
  
  var currentOriginY: Double
  
  var currentWidth: Double
}
object ExitAnimationsValues {
  
  inline def apply(
    currentGlobalOriginX: Double,
    currentGlobalOriginY: Double,
    currentHeight: Double,
    currentOriginX: Double,
    currentOriginY: Double,
    currentWidth: Double
  ): ExitAnimationsValues = {
    val __obj = js.Dynamic.literal(currentGlobalOriginX = currentGlobalOriginX.asInstanceOf[js.Any], currentGlobalOriginY = currentGlobalOriginY.asInstanceOf[js.Any], currentHeight = currentHeight.asInstanceOf[js.Any], currentOriginX = currentOriginX.asInstanceOf[js.Any], currentOriginY = currentOriginY.asInstanceOf[js.Any], currentWidth = currentWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitAnimationsValues]
  }
  
  extension [Self <: ExitAnimationsValues](x: Self) {
    
    inline def setCurrentGlobalOriginX(value: Double): Self = StObject.set(x, "currentGlobalOriginX", value.asInstanceOf[js.Any])
    
    inline def setCurrentGlobalOriginY(value: Double): Self = StObject.set(x, "currentGlobalOriginY", value.asInstanceOf[js.Any])
    
    inline def setCurrentHeight(value: Double): Self = StObject.set(x, "currentHeight", value.asInstanceOf[js.Any])
    
    inline def setCurrentOriginX(value: Double): Self = StObject.set(x, "currentOriginX", value.asInstanceOf[js.Any])
    
    inline def setCurrentOriginY(value: Double): Self = StObject.set(x, "currentOriginY", value.asInstanceOf[js.Any])
    
    inline def setCurrentWidth(value: Double): Self = StObject.set(x, "currentWidth", value.asInstanceOf[js.Any])
  }
}
