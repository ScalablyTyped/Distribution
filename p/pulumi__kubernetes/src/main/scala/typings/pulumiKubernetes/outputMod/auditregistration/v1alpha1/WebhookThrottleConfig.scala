package typings.pulumiKubernetes.outputMod.auditregistration.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebhookThrottleConfig holds the configuration for throttling events
  */
trait WebhookThrottleConfig extends js.Object {
  /**
    * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
    */
  val burst: Double
  /**
    * ThrottleQPS maximum number of batches per second default 10 QPS
    */
  val qps: Double
}

object WebhookThrottleConfig {
  @scala.inline
  def apply(burst: Double, qps: Double): WebhookThrottleConfig = {
    val __obj = js.Dynamic.literal(burst = burst.asInstanceOf[js.Any], qps = qps.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookThrottleConfig]
  }
}

