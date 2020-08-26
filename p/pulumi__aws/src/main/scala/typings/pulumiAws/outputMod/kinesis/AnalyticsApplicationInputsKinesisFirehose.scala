package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsKinesisFirehose extends js.Object {
  /**
    * The ARN of the Kinesis Firehose delivery stream.
    */
  var resourceArn: String = js.native
  /**
    * The ARN of the IAM Role used to access the stream.
    */
  var roleArn: String = js.native
}

object AnalyticsApplicationInputsKinesisFirehose {
  @scala.inline
  def apply(resourceArn: String, roleArn: String): AnalyticsApplicationInputsKinesisFirehose = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsKinesisFirehose]
  }
  @scala.inline
  implicit class AnalyticsApplicationInputsKinesisFirehoseOps[Self <: AnalyticsApplicationInputsKinesisFirehose] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: String): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
  }
  
}

