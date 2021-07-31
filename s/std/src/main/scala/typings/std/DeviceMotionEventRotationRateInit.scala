package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceMotionEventRotationRateInit extends StObject {
  
  var alpha: js.UndefOr[Double | Null] = js.undefined
  
  var beta: js.UndefOr[Double | Null] = js.undefined
  
  var gamma: js.UndefOr[Double | Null] = js.undefined
}
object DeviceMotionEventRotationRateInit {
  
  @scala.inline
  def apply(): DeviceMotionEventRotationRateInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMotionEventRotationRateInit]
  }
  
  @scala.inline
  implicit class DeviceMotionEventRotationRateInitMutableBuilder[Self <: DeviceMotionEventRotationRateInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaNull: Self = StObject.set(x, "alpha", null)
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBetaNull: Self = StObject.set(x, "beta", null)
    
    @scala.inline
    def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
    
    @scala.inline
    def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGammaNull: Self = StObject.set(x, "gamma", null)
    
    @scala.inline
    def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
  }
}
