package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationOutputKinesisFirehose extends js.Object {
  /**
    * The ARN of the Kinesis Firehose delivery stream.
    */
  var resourceArn: String = js.native
  /**
    * The ARN of the IAM Role used to access the stream.
    */
  var roleArn: String = js.native
}

object AnalyticsApplicationOutputKinesisFirehose {
  @scala.inline
  def apply(resourceArn: String, roleArn: String): AnalyticsApplicationOutputKinesisFirehose = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutputKinesisFirehose]
  }
}

