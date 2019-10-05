package typings.atPulumiKubernetes.typesOutputMod.apiextensions.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceConversion describes how to convert different versions of a CR.
  */
trait CustomResourceConversion extends js.Object {
  /**
    * strategy specifies how custom resources are converted between versions. Allowed values are:
    * - `None`: The converter only change the apiVersion and would not touch any other field in
    * the custom resource. - `Webhook`: API Server will call to an external webhook to do the
    * conversion. Additional information
    *   is needed for this option. This requires spec.preserveUnknownFields to be false, and
    * spec.conversion.webhook to be set.
    */
  val strategy: String
  /**
    * webhook describes how to call the conversion webhook. Required when `strategy` is set to
    * `Webhook`.
    */
  val webhook: WebhookConversion
}

object CustomResourceConversion {
  @scala.inline
  def apply(strategy: String, webhook: WebhookConversion): CustomResourceConversion = {
    val __obj = js.Dynamic.literal(strategy = strategy, webhook = webhook)
  
    __obj.asInstanceOf[CustomResourceConversion]
  }
}

