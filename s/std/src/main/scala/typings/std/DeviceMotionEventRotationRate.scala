package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait DeviceMotionEventRotationRate extends StObject {
  
  /* standard dom */
  val alpha: Double | Null
  
  /* standard dom */
  val beta: Double | Null
  
  /* standard dom */
  val gamma: Double | Null
}
object DeviceMotionEventRotationRate {
  
  inline def apply(): DeviceMotionEventRotationRate = {
    val __obj = js.Dynamic.literal(alpha = null, beta = null, gamma = null)
    __obj.asInstanceOf[DeviceMotionEventRotationRate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceMotionEventRotationRate] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaNull: Self = StObject.set(x, "alpha", null)
    
    inline def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
    
    inline def setBetaNull: Self = StObject.set(x, "beta", null)
    
    inline def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    inline def setGammaNull: Self = StObject.set(x, "gamma", null)
  }
}
