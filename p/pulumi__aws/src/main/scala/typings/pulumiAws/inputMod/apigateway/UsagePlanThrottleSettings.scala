package typings.pulumiAws.inputMod.apigateway

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsagePlanThrottleSettings extends js.Object {
  
  /**
    * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
    */
  var burstLimit: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The API request steady-state rate limit.
    */
  var rateLimit: js.UndefOr[Input[Double]] = js.native
}
object UsagePlanThrottleSettings {
  
  @scala.inline
  def apply(): UsagePlanThrottleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlanThrottleSettings]
  }
  
  @scala.inline
  implicit class UsagePlanThrottleSettingsOps[Self <: UsagePlanThrottleSettings] (val x: Self) extends AnyVal {
    
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
    def setBurstLimit(value: Input[Double]): Self = this.set("burstLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBurstLimit: Self = this.set("burstLimit", js.undefined)
    
    @scala.inline
    def setRateLimit(value: Input[Double]): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateLimit: Self = this.set("rateLimit", js.undefined)
  }
}
