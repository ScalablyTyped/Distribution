package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsKinesisStream extends js.Object {
  /**
    * The ARN of the Kinesis Stream.
    */
  var resourceArn: Input[String] = js.native
  /**
    * The ARN of the IAM Role used to access the stream.
    */
  var roleArn: Input[String] = js.native
}

object AnalyticsApplicationInputsKinesisStream {
  @scala.inline
  def apply(resourceArn: Input[String], roleArn: Input[String]): AnalyticsApplicationInputsKinesisStream = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsApplicationInputsKinesisStream]
  }
}

