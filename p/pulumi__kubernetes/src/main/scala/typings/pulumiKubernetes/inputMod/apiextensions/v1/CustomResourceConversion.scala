package typings.pulumiKubernetes.inputMod.apiextensions.v1

import typings.pulumiPulumi.outputMod.Input
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
  var strategy: Input[String]
  
  /**
    * webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`.
    */
  var webhook: js.UndefOr[Input[WebhookConversion]] = js.undefined
}
object CustomResourceConversion {
  
  @scala.inline
  def apply(strategy: Input[String]): CustomResourceConversion = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceConversion]
  }
  
  @scala.inline
  implicit class CustomResourceConversionMutableBuilder[Self <: CustomResourceConversion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrategy(value: Input[String]): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhook(value: Input[WebhookConversion]): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}
