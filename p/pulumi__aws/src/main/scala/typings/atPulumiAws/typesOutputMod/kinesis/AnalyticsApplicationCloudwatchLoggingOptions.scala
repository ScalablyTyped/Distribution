package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationCloudwatchLoggingOptions extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String
  var logStreamArn: String
  var roleArn: String
}

object AnalyticsApplicationCloudwatchLoggingOptions {
  @scala.inline
  def apply(id: String, logStreamArn: String, roleArn: String): AnalyticsApplicationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal(id = id, logStreamArn = logStreamArn, roleArn = roleArn)
  
    __obj.asInstanceOf[AnalyticsApplicationCloudwatchLoggingOptions]
  }
}

