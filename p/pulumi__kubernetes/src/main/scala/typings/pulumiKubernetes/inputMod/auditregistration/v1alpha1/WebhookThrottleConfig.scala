package typings.pulumiKubernetes.inputMod.auditregistration.v1alpha1

import typings.pulumiPulumi.outputMod.Input
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
  var burst: js.UndefOr[Input[Double]] = js.undefined
  /**
    * ThrottleQPS maximum number of batches per second default 10 QPS
    */
  var qps: js.UndefOr[Input[Double]] = js.undefined
}

object WebhookThrottleConfig {
  @scala.inline
  def apply(burst: Input[Double] = null, qps: Input[Double] = null): WebhookThrottleConfig = {
    val __obj = js.Dynamic.literal()
    if (burst != null) __obj.updateDynamic("burst")(burst.asInstanceOf[js.Any])
    if (qps != null) __obj.updateDynamic("qps")(qps.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookThrottleConfig]
  }
}

