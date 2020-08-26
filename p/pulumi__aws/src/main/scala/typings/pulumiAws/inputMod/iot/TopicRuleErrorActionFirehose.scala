package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleErrorActionFirehose extends js.Object {
  /**
    * The delivery stream name.
    */
  var deliveryStreamName: Input[String] = js.native
  /**
    * The IAM role ARN that grants access to the Amazon Kinesis Firehose stream.
    */
  var roleArn: Input[String] = js.native
  /**
    * A character separator that is used to separate records written to the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
    */
  var separator: js.UndefOr[Input[String]] = js.native
}

object TopicRuleErrorActionFirehose {
  @scala.inline
  def apply(deliveryStreamName: Input[String], roleArn: Input[String]): TopicRuleErrorActionFirehose = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionFirehose]
  }
  @scala.inline
  implicit class TopicRuleErrorActionFirehoseOps[Self <: TopicRuleErrorActionFirehose] (val x: Self) extends AnyVal {
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
    def setDeliveryStreamName(value: Input[String]): Self = this.set("deliveryStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparator(value: Input[String]): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
  
}

