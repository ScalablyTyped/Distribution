package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput extends StObject {
  
  /**
    * The ARN of the destination Lambda function to write to.
    */
  var resourceArn: String
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput {
  
  inline def apply(resourceArn: String): ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
