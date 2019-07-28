package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLogsS3Logs extends js.Object {
  var cloudwatchLogs: js.UndefOr[Input[Anon_GroupNameStatus]] = js.undefined
  var s3Logs: js.UndefOr[Input[Anon_EncryptionDisabledLocationStatus]] = js.undefined
}

object Anon_CloudwatchLogsS3Logs {
  @scala.inline
  def apply(
    cloudwatchLogs: Input[Anon_GroupNameStatus] = null,
    s3Logs: Input[Anon_EncryptionDisabledLocationStatus] = null
  ): Anon_CloudwatchLogsS3Logs = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchLogs != null) __obj.updateDynamic("cloudwatchLogs")(cloudwatchLogs.asInstanceOf[js.Any])
    if (s3Logs != null) __obj.updateDynamic("s3Logs")(s3Logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloudwatchLogsS3Logs]
  }
}

