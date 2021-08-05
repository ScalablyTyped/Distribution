package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationCloudwatchLoggingOptions extends StObject {
  
  var cloudwatchLoggingOptionId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The ARN of the CloudWatch log stream to receive application messages.
    */
  var logStreamArn: Input[String]
}
object ApplicationCloudwatchLoggingOptions {
  
  inline def apply(logStreamArn: Input[String]): ApplicationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal(logStreamArn = logStreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCloudwatchLoggingOptions]
  }
  
  extension [Self <: ApplicationCloudwatchLoggingOptions](x: Self) {
    
    inline def setCloudwatchLoggingOptionId(value: Input[String]): Self = StObject.set(x, "cloudwatchLoggingOptionId", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchLoggingOptionIdUndefined: Self = StObject.set(x, "cloudwatchLoggingOptionId", js.undefined)
    
    inline def setLogStreamArn(value: Input[String]): Self = StObject.set(x, "logStreamArn", value.asInstanceOf[js.Any])
  }
}
