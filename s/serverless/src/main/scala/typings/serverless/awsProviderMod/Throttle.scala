package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Throttle extends js.Object {
  
  var burstLimit: js.UndefOr[Double | String] = js.native
  
  var rateLimit: js.UndefOr[Double | String] = js.native
}
object Throttle {
  
  @scala.inline
  def apply(): Throttle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Throttle]
  }
  
  @scala.inline
  implicit class ThrottleOps[Self <: Throttle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBurstLimit(value: Double | String): Self = this.set("burstLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBurstLimit: Self = this.set("burstLimit", js.undefined)
    
    @scala.inline
    def setRateLimit(value: Double | String): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateLimit: Self = this.set("rateLimit", js.undefined)
  }
}
