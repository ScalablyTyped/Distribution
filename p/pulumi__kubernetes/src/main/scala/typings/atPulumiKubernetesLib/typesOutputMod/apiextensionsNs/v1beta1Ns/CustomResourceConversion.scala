package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceConversion describes how to convert different versions of a CR.
  */
trait CustomResourceConversion extends js.Object {
  /**
    * `strategy` specifies the conversion strategy. Allowed values are: - `None`: The converter
    * only change the apiVersion and would not touch any other field in the CR. - `Webhook`: API
    * Server will call to an external webhook to do the conversion. Additional information is
    * needed for this option.
    */
  val strategy: java.lang.String
  /**
    * `webhookClientConfig` is the instructions for how to call the webhook if strategy is
    * `Webhook`. This field is alpha-level and is only honored by servers that enable the
    * CustomResourceWebhookConversion feature.
    */
  val webhookClientConfig: WebhookClientConfig
}

object CustomResourceConversion {
  @scala.inline
  def apply(strategy: java.lang.String, webhookClientConfig: WebhookClientConfig): CustomResourceConversion = {
    val __obj = js.Dynamic.literal(strategy = strategy, webhookClientConfig = webhookClientConfig)
  
    __obj.asInstanceOf[CustomResourceConversion]
  }
}

