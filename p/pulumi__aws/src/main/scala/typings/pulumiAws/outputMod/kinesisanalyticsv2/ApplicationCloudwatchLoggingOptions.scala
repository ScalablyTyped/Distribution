package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationCloudwatchLoggingOptions extends StObject {
  
  var cloudwatchLoggingOptionId: String = js.native
  
  /**
    * The ARN of the CloudWatch log stream to receive application messages.
    */
  var logStreamArn: String = js.native
}
object ApplicationCloudwatchLoggingOptions {
  
  @scala.inline
  def apply(cloudwatchLoggingOptionId: String, logStreamArn: String): ApplicationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal(cloudwatchLoggingOptionId = cloudwatchLoggingOptionId.asInstanceOf[js.Any], logStreamArn = logStreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCloudwatchLoggingOptions]
  }
  
  @scala.inline
  implicit class ApplicationCloudwatchLoggingOptionsMutableBuilder[Self <: ApplicationCloudwatchLoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudwatchLoggingOptionId(value: String): Self = StObject.set(x, "cloudwatchLoggingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamArn(value: String): Self = StObject.set(x, "logStreamArn", value.asInstanceOf[js.Any])
  }
}
