package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the rate at which the device is rotating around all three axes. */
trait DeviceRotationRate extends StObject {
  
  val alpha: Double | Null
  
  val beta: Double | Null
  
  val gamma: Double | Null
}
object DeviceRotationRate {
  
  @scala.inline
  def apply(): DeviceRotationRate = {
    val __obj = js.Dynamic.literal(alpha = null, beta = null, gamma = null)
    __obj.asInstanceOf[DeviceRotationRate]
  }
  
  @scala.inline
  implicit class DeviceRotationRateMutableBuilder[Self <: DeviceRotationRate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaNull: Self = StObject.set(x, "alpha", null)
    
    @scala.inline
    def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBetaNull: Self = StObject.set(x, "beta", null)
    
    @scala.inline
    def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGammaNull: Self = StObject.set(x, "gamma", null)
  }
}
