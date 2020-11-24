package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationCloudwatchLoggingOptions extends js.Object {
  
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
    def setLogStreamArn(value: Input[String]): Self = this.set("logStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchLoggingOptionId(value: Input[String]): Self = this.set("cloudwatchLoggingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchLoggingOptionId: Self = this.set("cloudwatchLoggingOptionId", js.undefined)
  }
}
