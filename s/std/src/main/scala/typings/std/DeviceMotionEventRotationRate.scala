package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceMotionEventRotationRate extends js.Object {
  
  val alpha: Double | Null = js.native
  
  val beta: Double | Null = js.native
  
  val gamma: Double | Null = js.native
}
object DeviceMotionEventRotationRate {
  
  @scala.inline
  def apply(): DeviceMotionEventRotationRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMotionEventRotationRate]
  }
  
  @scala.inline
  implicit class DeviceMotionEventRotationRateOps[Self <: DeviceMotionEventRotationRate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaNull: Self = this.set("alpha", null)
    
    @scala.inline
    def setBeta(value: Double): Self = this.set("beta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBetaNull: Self = this.set("beta", null)
    
    @scala.inline
    def setGamma(value: Double): Self = this.set("gamma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGammaNull: Self = this.set("gamma", null)
  }
}
