package typings
package atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns

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
  val burst: scala.Double
  /**
    * ThrottleQPS maximum number of batches per second default 10 QPS
    */
  val qps: scala.Double
}

object WebhookThrottleConfig {
  @scala.inline
  def apply(burst: scala.Double, qps: scala.Double): WebhookThrottleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("burst")(burst)
    __obj.updateDynamic("qps")(qps)
    __obj.asInstanceOf[WebhookThrottleConfig]
  }
}

