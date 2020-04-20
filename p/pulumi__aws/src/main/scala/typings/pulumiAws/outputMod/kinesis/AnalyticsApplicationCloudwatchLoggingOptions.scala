package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationCloudwatchLoggingOptions extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String = js.native
  /**
    * The ARN of the CloudWatch Log Stream.
    */
  var logStreamArn: String = js.native
  /**
    * The ARN of the IAM Role used to send application messages.
    */
  var roleArn: String = js.native
}

object AnalyticsApplicationCloudwatchLoggingOptions {
  @scala.inline
  def apply(id: String, logStreamArn: String, roleArn: String): AnalyticsApplicationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], logStreamArn = logStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationCloudwatchLoggingOptions]
  }
}

