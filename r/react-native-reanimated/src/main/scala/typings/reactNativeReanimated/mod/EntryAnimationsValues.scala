package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryAnimationsValues extends StObject {
  
  var targetGlobalOriginX: Double
  
  var targetGlobalOriginY: Double
  
  var targetHeight: Double
  
  var targetOriginX: Double
  
  var targetOriginY: Double
  
  var targetWidth: Double
}
object EntryAnimationsValues {
  
  inline def apply(
    targetGlobalOriginX: Double,
    targetGlobalOriginY: Double,
    targetHeight: Double,
    targetOriginX: Double,
    targetOriginY: Double,
    targetWidth: Double
  ): EntryAnimationsValues = {
    val __obj = js.Dynamic.literal(targetGlobalOriginX = targetGlobalOriginX.asInstanceOf[js.Any], targetGlobalOriginY = targetGlobalOriginY.asInstanceOf[js.Any], targetHeight = targetHeight.asInstanceOf[js.Any], targetOriginX = targetOriginX.asInstanceOf[js.Any], targetOriginY = targetOriginY.asInstanceOf[js.Any], targetWidth = targetWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryAnimationsValues]
  }
  
  extension [Self <: EntryAnimationsValues](x: Self) {
    
    inline def setTargetGlobalOriginX(value: Double): Self = StObject.set(x, "targetGlobalOriginX", value.asInstanceOf[js.Any])
    
    inline def setTargetGlobalOriginY(value: Double): Self = StObject.set(x, "targetGlobalOriginY", value.asInstanceOf[js.Any])
    
    inline def setTargetHeight(value: Double): Self = StObject.set(x, "targetHeight", value.asInstanceOf[js.Any])
    
    inline def setTargetOriginX(value: Double): Self = StObject.set(x, "targetOriginX", value.asInstanceOf[js.Any])
    
    inline def setTargetOriginY(value: Double): Self = StObject.set(x, "targetOriginY", value.asInstanceOf[js.Any])
    
    inline def setTargetWidth(value: Double): Self = StObject.set(x, "targetWidth", value.asInstanceOf[js.Any])
  }
}
