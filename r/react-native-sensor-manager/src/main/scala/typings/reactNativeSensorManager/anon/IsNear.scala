package typings.reactNativeSensorManager.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsNear extends StObject {
  
  var isNear: Boolean
  
  var maxRange: Double
  
  var value: Double
}
object IsNear {
  
  inline def apply(isNear: Boolean, maxRange: Double, value: Double): IsNear = {
    val __obj = js.Dynamic.literal(isNear = isNear.asInstanceOf[js.Any], maxRange = maxRange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNear]
  }
  
  extension [Self <: IsNear](x: Self) {
    
    inline def setIsNear(value: Boolean): Self = StObject.set(x, "isNear", value.asInstanceOf[js.Any])
    
    inline def setMaxRange(value: Double): Self = StObject.set(x, "maxRange", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
