package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEventAcceleration)
  */
trait DeviceMotionEventAcceleration extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEventAcceleration/x) */
  /* standard dom */
  val x: Double | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEventAcceleration/y) */
  /* standard dom */
  val y: Double | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEventAcceleration/z) */
  /* standard dom */
  val z: Double | Null
}
object DeviceMotionEventAcceleration {
  
  inline def apply(): DeviceMotionEventAcceleration = {
    val __obj = js.Dynamic.literal(x = null, y = null, z = null)
    __obj.asInstanceOf[DeviceMotionEventAcceleration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceMotionEventAcceleration] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZNull: Self = StObject.set(x, "z", null)
  }
}
