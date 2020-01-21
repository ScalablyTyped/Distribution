package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectLogsConfig extends js.Object {
  /**
    * Configuration for the builds to store logs to CloudWatch
    */
  var cloudwatchLogs: js.UndefOr[Input[ProjectLogsConfigCloudwatchLogs]] = js.native
  /**
    * Configuration for the builds to store logs to S3.
    */
  var s3Logs: js.UndefOr[Input[ProjectLogsConfigS3Logs]] = js.native
}

object ProjectLogsConfig {
  @scala.inline
  def apply(
    cloudwatchLogs: Input[ProjectLogsConfigCloudwatchLogs] = null,
    s3Logs: Input[ProjectLogsConfigS3Logs] = null
  ): ProjectLogsConfig = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchLogs != null) __obj.updateDynamic("cloudwatchLogs")(cloudwatchLogs.asInstanceOf[js.Any])
    if (s3Logs != null) __obj.updateDynamic("s3Logs")(s3Logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectLogsConfig]
  }
}

