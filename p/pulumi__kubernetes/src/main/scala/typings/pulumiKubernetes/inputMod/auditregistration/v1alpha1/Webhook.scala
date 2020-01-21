package typings.pulumiKubernetes.inputMod.auditregistration.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Webhook holds the configuration of the webhook
  */
trait Webhook extends js.Object {
  /**
    * ClientConfig holds the connection parameters for the webhook required
    */
  var clientConfig: Input[WebhookClientConfig]
  /**
    * Throttle holds the options for throttling the webhook
    */
  var throttle: js.UndefOr[Input[WebhookThrottleConfig]] = js.undefined
}

object Webhook {
  @scala.inline
  def apply(clientConfig: Input[WebhookClientConfig], throttle: Input[WebhookThrottleConfig] = null): Webhook = {
    val __obj = js.Dynamic.literal(clientConfig = clientConfig.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
}

