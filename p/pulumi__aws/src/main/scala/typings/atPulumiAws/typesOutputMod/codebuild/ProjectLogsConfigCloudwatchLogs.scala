package typings.atPulumiAws.typesOutputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectLogsConfigCloudwatchLogs extends js.Object {
  /**
    * The group name of the logs in CloudWatch Logs.
    */
  var groupName: js.UndefOr[String] = js.undefined
  /**
    * Current status of logs in S3 for a build project. Valid values: `ENABLED`, `DISABLED`. Defaults to `DISABLED`.
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * The stream name of the logs in CloudWatch Logs.
    */
  var streamName: js.UndefOr[String] = js.undefined
}

object ProjectLogsConfigCloudwatchLogs {
  @scala.inline
  def apply(groupName: String = null, status: String = null, streamName: String = null): ProjectLogsConfigCloudwatchLogs = {
    val __obj = js.Dynamic.literal()
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    if (status != null) __obj.updateDynamic("status")(status)
    if (streamName != null) __obj.updateDynamic("streamName")(streamName)
    __obj.asInstanceOf[ProjectLogsConfigCloudwatchLogs]
  }
}

