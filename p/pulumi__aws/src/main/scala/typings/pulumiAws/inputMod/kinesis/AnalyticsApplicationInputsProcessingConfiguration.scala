package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputsProcessingConfiguration extends StObject {
  
  /**
    * The Lambda function configuration. See Lambda below for more details.
    */
  var lambda: Input[AnalyticsApplicationInputsProcessingConfigurationLambda]
}
object AnalyticsApplicationInputsProcessingConfiguration {
  
  inline def apply(lambda: Input[AnalyticsApplicationInputsProcessingConfigurationLambda]): AnalyticsApplicationInputsProcessingConfiguration = {
    val __obj = js.Dynamic.literal(lambda = lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsProcessingConfiguration]
  }
  
  extension [Self <: AnalyticsApplicationInputsProcessingConfiguration](x: Self) {
    
    inline def setLambda(value: Input[AnalyticsApplicationInputsProcessingConfigurationLambda]): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
  }
}
