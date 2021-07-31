package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput extends StObject {
  
  /**
    * The ARN of the destination Lambda function to write to.
    */
  var resourceArn: Input[String]
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput {
  
  @scala.inline
  def apply(resourceArn: Input[String]): ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
