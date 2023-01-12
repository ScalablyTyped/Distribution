package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutAnimationsValues extends StObject {
  
  var currentGlobalOriginX: Double
  
  var currentGlobalOriginY: Double
  
  var currentHeight: Double
  
  var currentOriginX: Double
  
  var currentOriginY: Double
  
  var currentWidth: Double
  
  var targetGlobalOriginX: Double
  
  var targetGlobalOriginY: Double
  
  var targetHeight: Double
  
  var targetOriginX: Double
  
  var targetOriginY: Double
  
  var targetWidth: Double
  
  var windowHeight: Double
  
  var windowWidth: Double
}
object LayoutAnimationsValues {
  
  inline def apply(
    currentGlobalOriginX: Double,
    currentGlobalOriginY: Double,
    currentHeight: Double,
    currentOriginX: Double,
    currentOriginY: Double,
    currentWidth: Double,
    targetGlobalOriginX: Double,
    targetGlobalOriginY: Double,
    targetHeight: Double,
    targetOriginX: Double,
    targetOriginY: Double,
    targetWidth: Double,
    windowHeight: Double,
    windowWidth: Double
  ): LayoutAnimationsValues = {
    val __obj = js.Dynamic.literal(currentGlobalOriginX = currentGlobalOriginX.asInstanceOf[js.Any], currentGlobalOriginY = currentGlobalOriginY.asInstanceOf[js.Any], currentHeight = currentHeight.asInstanceOf[js.Any], currentOriginX = currentOriginX.asInstanceOf[js.Any], currentOriginY = currentOriginY.asInstanceOf[js.Any], currentWidth = currentWidth.asInstanceOf[js.Any], targetGlobalOriginX = targetGlobalOriginX.asInstanceOf[js.Any], targetGlobalOriginY = targetGlobalOriginY.asInstanceOf[js.Any], targetHeight = targetHeight.asInstanceOf[js.Any], targetOriginX = targetOriginX.asInstanceOf[js.Any], targetOriginY = targetOriginY.asInstanceOf[js.Any], targetWidth = targetWidth.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAnimationsValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayoutAnimationsValues] (val x: Self) extends AnyVal {
    
    inline def setCurrentGlobalOriginX(value: Double): Self = StObject.set(x, "currentGlobalOriginX", value.asInstanceOf[js.Any])
    
    inline def setCurrentGlobalOriginY(value: Double): Self = StObject.set(x, "currentGlobalOriginY", value.asInstanceOf[js.Any])
    
    inline def setCurrentHeight(value: Double): Self = StObject.set(x, "currentHeight", value.asInstanceOf[js.Any])
    
    inline def setCurrentOriginX(value: Double): Self = StObject.set(x, "currentOriginX", value.asInstanceOf[js.Any])
    
    inline def setCurrentOriginY(value: Double): Self = StObject.set(x, "currentOriginY", value.asInstanceOf[js.Any])
    
    inline def setCurrentWidth(value: Double): Self = StObject.set(x, "currentWidth", value.asInstanceOf[js.Any])
    
    inline def setTargetGlobalOriginX(value: Double): Self = StObject.set(x, "targetGlobalOriginX", value.asInstanceOf[js.Any])
    
    inline def setTargetGlobalOriginY(value: Double): Self = StObject.set(x, "targetGlobalOriginY", value.asInstanceOf[js.Any])
    
    inline def setTargetHeight(value: Double): Self = StObject.set(x, "targetHeight", value.asInstanceOf[js.Any])
    
    inline def setTargetOriginX(value: Double): Self = StObject.set(x, "targetOriginX", value.asInstanceOf[js.Any])
    
    inline def setTargetOriginY(value: Double): Self = StObject.set(x, "targetOriginY", value.asInstanceOf[js.Any])
    
    inline def setTargetWidth(value: Double): Self = StObject.set(x, "targetWidth", value.asInstanceOf[js.Any])
    
    inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
  }
}
