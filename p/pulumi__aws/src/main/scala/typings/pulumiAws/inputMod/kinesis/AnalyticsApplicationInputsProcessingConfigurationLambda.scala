package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsProcessingConfigurationLambda extends js.Object {
  /**
    * The ARN of the Lambda function.
    */
  var resourceArn: Input[String] = js.native
  /**
    * The ARN of the IAM Role used to access the Lambda function.
    */
  var roleArn: Input[String] = js.native
}

object AnalyticsApplicationInputsProcessingConfigurationLambda {
  @scala.inline
  def apply(resourceArn: Input[String], roleArn: Input[String]): AnalyticsApplicationInputsProcessingConfigurationLambda = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsApplicationInputsProcessingConfigurationLambda]
  }
}

