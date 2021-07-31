package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputsProcessingConfiguration extends StObject {
  
  /**
    * The Lambda function configuration. See Lambda below for more details.
    */
  var lambda: AnalyticsApplicationInputsProcessingConfigurationLambda
}
object AnalyticsApplicationInputsProcessingConfiguration {
  
  @scala.inline
  def apply(lambda: AnalyticsApplicationInputsProcessingConfigurationLambda): AnalyticsApplicationInputsProcessingConfiguration = {
    val __obj = js.Dynamic.literal(lambda = lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsProcessingConfiguration]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsProcessingConfigurationMutableBuilder[Self <: AnalyticsApplicationInputsProcessingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLambda(value: AnalyticsApplicationInputsProcessingConfigurationLambda): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
  }
}
