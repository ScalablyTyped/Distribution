package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamKinesisSourceConfiguration extends js.Object {
  /**
    * The kinesis stream used as the source of the firehose delivery stream.
    */
  var kinesisStreamArn: String
  /**
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
    */
  var roleArn: String
}

object FirehoseDeliveryStreamKinesisSourceConfiguration {
  @scala.inline
  def apply(kinesisStreamArn: String, roleArn: String): FirehoseDeliveryStreamKinesisSourceConfiguration = {
    val __obj = js.Dynamic.literal(kinesisStreamArn = kinesisStreamArn, roleArn = roleArn)
  
    __obj.asInstanceOf[FirehoseDeliveryStreamKinesisSourceConfiguration]
  }
}

