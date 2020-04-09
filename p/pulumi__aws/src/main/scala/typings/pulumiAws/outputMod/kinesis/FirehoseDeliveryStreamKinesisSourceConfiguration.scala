package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamKinesisSourceConfiguration extends js.Object {
  /**
    * The kinesis stream used as the source of the firehose delivery stream.
    */
  var kinesisStreamArn: String = js.native
  /**
    * The ARN of the role that provides access to the source Kinesis stream.
    */
  var roleArn: String = js.native
}

object FirehoseDeliveryStreamKinesisSourceConfiguration {
  @scala.inline
  def apply(kinesisStreamArn: String, roleArn: String): FirehoseDeliveryStreamKinesisSourceConfiguration = {
    val __obj = js.Dynamic.literal(kinesisStreamArn = kinesisStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirehoseDeliveryStreamKinesisSourceConfiguration]
  }
}

