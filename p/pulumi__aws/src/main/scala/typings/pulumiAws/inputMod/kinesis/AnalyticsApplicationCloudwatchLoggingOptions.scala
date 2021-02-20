package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationCloudwatchLoggingOptions extends StObject {
  
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the CloudWatch Log Stream.
    */
  var logStreamArn: Input[String] = js.native
  
  /**
    * The ARN of the IAM Role used to send application messages.
    */
  var roleArn: Input[String] = js.native
}
object AnalyticsApplicationCloudwatchLoggingOptions {
  
  @scala.inline
  def apply(logStreamArn: Input[String], roleArn: Input[String]): AnalyticsApplicationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal(logStreamArn = logStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationCloudwatchLoggingOptions]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationCloudwatchLoggingOptionsMutableBuilder[Self <: AnalyticsApplicationCloudwatchLoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLogStreamArn(value: Input[String]): Self = StObject.set(x, "logStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
