package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceMotionEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var acceleration: js.UndefOr[DeviceMotionEventAccelerationInit] = js.undefined
  
  /* standard dom */
  var accelerationIncludingGravity: js.UndefOr[DeviceMotionEventAccelerationInit] = js.undefined
  
  /* standard dom */
  var interval: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var rotationRate: js.UndefOr[DeviceMotionEventRotationRateInit] = js.undefined
}
object DeviceMotionEventInit {
  
  inline def apply(): DeviceMotionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMotionEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceMotionEventInit] (val x: Self) extends AnyVal {
    
    inline def setAcceleration(value: DeviceMotionEventAccelerationInit): Self = StObject.set(x, "acceleration", value.asInstanceOf[js.Any])
    
    inline def setAccelerationIncludingGravity(value: DeviceMotionEventAccelerationInit): Self = StObject.set(x, "accelerationIncludingGravity", value.asInstanceOf[js.Any])
    
    inline def setAccelerationIncludingGravityUndefined: Self = StObject.set(x, "accelerationIncludingGravity", js.undefined)
    
    inline def setAccelerationUndefined: Self = StObject.set(x, "acceleration", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setRotationRate(value: DeviceMotionEventRotationRateInit): Self = StObject.set(x, "rotationRate", value.asInstanceOf[js.Any])
    
    inline def setRotationRateUndefined: Self = StObject.set(x, "rotationRate", js.undefined)
  }
}
