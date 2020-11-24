package typings.pulumiAws.outputMod.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountThrottleSettings extends js.Object {
  
  /**
    * The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
    */
  var burstLimit: Double = js.native
  
  /**
    * The number of times API Gateway allows the API to be called per second on average (RPS).
    */
  var rateLimit: Double = js.native
}
object AccountThrottleSettings {
  
  @scala.inline
  def apply(burstLimit: Double, rateLimit: Double): AccountThrottleSettings = {
    val __obj = js.Dynamic.literal(burstLimit = burstLimit.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any])
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
    def setBurstLimit(value: Double): Self = this.set("burstLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateLimit(value: Double): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
  }
}
