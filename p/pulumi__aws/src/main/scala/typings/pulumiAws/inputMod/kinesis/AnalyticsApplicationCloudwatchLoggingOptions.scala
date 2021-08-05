package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationCloudwatchLoggingOptions extends StObject {
  
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The ARN of the CloudWatch Log Stream.
    */
  var logStreamArn: Input[String]
  
  /**
    * The ARN of the IAM Role used to send application messages.
    */
  var roleArn: Input[String]
}
object AnalyticsApplicationCloudwatchLoggingOptions {
  
  inline def apply(logStreamArn: Input[String], roleArn: Input[String]): AnalyticsApplicationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal(logStreamArn = logStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationCloudwatchLoggingOptions]
  }
  
  extension [Self <: AnalyticsApplicationCloudwatchLoggingOptions](x: Self) {
    
    inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLogStreamArn(value: Input[String]): Self = StObject.set(x, "logStreamArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
