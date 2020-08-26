package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationOutputKinesisStream extends js.Object {
  /**
    * The ARN of the Kinesis Stream.
    */
  var resourceArn: Input[String] = js.native
  /**
    * The ARN of the IAM Role used to access the stream.
    */
  var roleArn: Input[String] = js.native
}

object AnalyticsApplicationOutputKinesisStream {
  @scala.inline
  def apply(resourceArn: Input[String], roleArn: Input[String]): AnalyticsApplicationOutputKinesisStream = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutputKinesisStream]
  }
  @scala.inline
  implicit class AnalyticsApplicationOutputKinesisStreamOps[Self <: AnalyticsApplicationOutputKinesisStream] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: Input[String]): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
  }
  
}

