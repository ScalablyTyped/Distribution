package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationCloudwatchLoggingOptions extends StObject {
  
  var cloudwatchLoggingOptionId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the CloudWatch log stream to receive application messages.
    */
  var logStreamArn: Input[String] = js.native
}
object ApplicationCloudwatchLoggingOptions {
  
  @scala.inline
  def apply(logStreamArn: Input[String]): ApplicationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal(logStreamArn = logStreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCloudwatchLoggingOptions]
  }
  
  @scala.inline
  implicit class ApplicationCloudwatchLoggingOptionsMutableBuilder[Self <: ApplicationCloudwatchLoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudwatchLoggingOptionId(value: Input[String]): Self = StObject.set(x, "cloudwatchLoggingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchLoggingOptionIdUndefined: Self = StObject.set(x, "cloudwatchLoggingOptionId", js.undefined)
    
    @scala.inline
    def setLogStreamArn(value: Input[String]): Self = StObject.set(x, "logStreamArn", value.asInstanceOf[js.Any])
  }
}
