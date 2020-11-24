package typings.pulumiAws.outputMod.kinesisanalyticsv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationCloudwatchLoggingOptions extends js.Object {
  
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
  implicit class ApplicationCloudwatchLoggingOptionsOps[Self <: ApplicationCloudwatchLoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloudwatchLoggingOptionId(value: String): Self = this.set("cloudwatchLoggingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamArn(value: String): Self = this.set("logStreamArn", value.asInstanceOf[js.Any])
  }
}
