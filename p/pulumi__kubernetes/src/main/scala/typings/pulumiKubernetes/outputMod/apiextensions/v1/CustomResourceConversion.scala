package typings.pulumiKubernetes.outputMod.apiextensions.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceConversion describes how to convert different versions of a CR.
  */
trait CustomResourceConversion extends StObject {
  
  /**
    * strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
    *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.
    */
  var strategy: String
  
  /**
    * webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`.
    */
  var webhook: WebhookConversion
}
object CustomResourceConversion {
  
  inline def apply(strategy: String, webhook: WebhookConversion): CustomResourceConversion = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any], webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceConversion]
  }
  
  extension [Self <: CustomResourceConversion](x: Self) {
    
    inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setWebhook(value: WebhookConversion): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
  }
}
