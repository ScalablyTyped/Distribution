package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputsProcessingConfigurationLambda extends StObject {
  
  /**
    * The ARN of the Lambda function.
    */
  var resourceArn: String
  
  /**
    * The ARN of the IAM Role used to access the Lambda function.
    */
  var roleArn: String
}
object AnalyticsApplicationInputsProcessingConfigurationLambda {
  
  @scala.inline
  def apply(resourceArn: String, roleArn: String): AnalyticsApplicationInputsProcessingConfigurationLambda = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsProcessingConfigurationLambda]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsProcessingConfigurationLambdaMutableBuilder[Self <: AnalyticsApplicationInputsProcessingConfigurationLambda] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
