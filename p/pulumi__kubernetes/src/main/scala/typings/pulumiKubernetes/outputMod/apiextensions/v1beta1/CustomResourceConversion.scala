package typings.pulumiKubernetes.outputMod.apiextensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceConversion describes how to convert different versions of a CR.
  */
trait CustomResourceConversion extends StObject {
  
  /**
    * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `["v1beta1"]`.
    */
  var conversionReviewVersions: js.Array[String]
  
  /**
    * strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
    *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
    */
  var strategy: String
  
  /**
    * webhookClientConfig is the instructions for how to call the webhook if strategy is `Webhook`. Required when `strategy` is set to `Webhook`.
    */
  var webhookClientConfig: WebhookClientConfig
}
object CustomResourceConversion {
  
  inline def apply(
    conversionReviewVersions: js.Array[String],
    strategy: String,
    webhookClientConfig: WebhookClientConfig
  ): CustomResourceConversion = {
    val __obj = js.Dynamic.literal(conversionReviewVersions = conversionReviewVersions.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], webhookClientConfig = webhookClientConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceConversion]
  }
  
  extension [Self <: CustomResourceConversion](x: Self) {
    
    inline def setConversionReviewVersions(value: js.Array[String]): Self = StObject.set(x, "conversionReviewVersions", value.asInstanceOf[js.Any])
    
    inline def setConversionReviewVersionsVarargs(value: String*): Self = StObject.set(x, "conversionReviewVersions", js.Array(value :_*))
    
    inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setWebhookClientConfig(value: WebhookClientConfig): Self = StObject.set(x, "webhookClientConfig", value.asInstanceOf[js.Any])
  }
}
