package typings.pulumiAws.inputMod.apigateway

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountThrottleSettings extends js.Object {
  
  /**
    * The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
    */
  var burstLimit: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of times API Gateway allows the API to be called per second on average (RPS).
    */
  var rateLimit: js.UndefOr[Input[Double]] = js.native
}
object AccountThrottleSettings {
  
  @scala.inline
  def apply(): AccountThrottleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountThrottleSettings]
  }
  
  @scala.inline
  implicit class AccountThrottleSettingsOps[Self <: AccountThrottleSettings] (val x: Self) extends AnyVal {
    
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
