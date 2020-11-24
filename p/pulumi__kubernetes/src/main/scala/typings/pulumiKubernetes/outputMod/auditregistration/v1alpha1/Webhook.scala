package typings.pulumiKubernetes.outputMod.auditregistration.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Webhook holds the configuration of the webhook
  */
@js.native
trait Webhook extends js.Object {
  
  /**
    * ClientConfig holds the connection parameters for the webhook required
    */
  var clientConfig: WebhookClientConfig = js.native
  
  /**
    * Throttle holds the options for throttling the webhook
    */
  var throttle: WebhookThrottleConfig = js.native
}
object Webhook {
  
  @scala.inline
  def apply(clientConfig: WebhookClientConfig, throttle: WebhookThrottleConfig): Webhook = {
    val __obj = js.Dynamic.literal(clientConfig = clientConfig.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
  
  @scala.inline
  implicit class WebhookOps[Self <: Webhook] (val x: Self) extends AnyVal {
    
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
    def setClientConfig(value: WebhookClientConfig): Self = this.set("clientConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottle(value: WebhookThrottleConfig): Self = this.set("throttle", value.asInstanceOf[js.Any])
  }
}
