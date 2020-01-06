package typings.atPulumiAws.typesInputMod.codebuild

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectLogsConfigCloudwatchLogs extends js.Object {
  /**
    * The group name of the logs in CloudWatch Logs.
    */
  var groupName: js.UndefOr[Input[String]] = js.native
  /**
    * Current status of logs in S3 for a build project. Valid values: `ENABLED`, `DISABLED`. Defaults to `DISABLED`.
    */
  var status: js.UndefOr[Input[String]] = js.native
  /**
    * The stream name of the logs in CloudWatch Logs.
    */
  var streamName: js.UndefOr[Input[String]] = js.native
}

object ProjectLogsConfigCloudwatchLogs {
  @scala.inline
  def apply(groupName: Input[String] = null, status: Input[String] = null, streamName: Input[String] = null): ProjectLogsConfigCloudwatchLogs = {
    val __obj = js.Dynamic.literal()
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (streamName != null) __obj.updateDynamic("streamName")(streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectLogsConfigCloudwatchLogs]
  }
}

