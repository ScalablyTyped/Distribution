package typings.pulumiKubernetes.outputMod.auditregistration.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WebhookThrottleConfig holds the configuration for throttling events
  */
@js.native
trait WebhookThrottleConfig extends js.Object {
  
  /**
    * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
    */
  var burst: Double = js.native
  
  /**
    * ThrottleQPS maximum number of batches per second default 10 QPS
    */
  var qps: Double = js.native
}
object WebhookThrottleConfig {
  
  @scala.inline
  def apply(burst: Double, qps: Double): WebhookThrottleConfig = {
    val __obj = js.Dynamic.literal(burst = burst.asInstanceOf[js.Any], qps = qps.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookThrottleConfig]
  }
  
  @scala.inline
  implicit class WebhookThrottleConfigOps[Self <: WebhookThrottleConfig] (val x: Self) extends AnyVal {
    
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
    def setBurst(value: Double): Self = this.set("burst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQps(value: Double): Self = this.set("qps", value.asInstanceOf[js.Any])
  }
}
