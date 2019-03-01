package typings
package atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns

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
  val clientConfig: WebhookClientConfig
  /**
    * Throttle holds the options for throttling the webhook
    */
  val throttle: WebhookThrottleConfig
}

object Webhook {
  @scala.inline
  def apply(clientConfig: WebhookClientConfig, throttle: WebhookThrottleConfig): Webhook = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientConfig")(clientConfig)
    __obj.updateDynamic("throttle")(throttle)
    __obj.asInstanceOf[Webhook]
  }
}

