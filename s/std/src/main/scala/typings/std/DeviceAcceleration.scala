package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the amount of acceleration the device is experiencing along all three axes. */
trait DeviceAcceleration extends StObject {
  
  val x: Double | Null
  
  val y: Double | Null
  
  val z: Double | Null
}
object DeviceAcceleration {
  
  inline def apply(): DeviceAcceleration = {
    val __obj = js.Dynamic.literal(x = null, y = null, z = null)
    __obj.asInstanceOf[DeviceAcceleration]
  }
  
  extension [Self <: DeviceAcceleration](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZNull: Self = StObject.set(x, "z", null)
  }
}
