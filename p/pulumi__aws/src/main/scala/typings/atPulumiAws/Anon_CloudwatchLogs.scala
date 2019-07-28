package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLogs extends js.Object {
  var cloudwatchLogs: js.UndefOr[Anon_GroupName] = js.undefined
  var s3Logs: js.UndefOr[Anon_EncryptionDisabledLocation] = js.undefined
}

object Anon_CloudwatchLogs {
  @scala.inline
  def apply(cloudwatchLogs: Anon_GroupName = null, s3Logs: Anon_EncryptionDisabledLocation = null): Anon_CloudwatchLogs = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchLogs != null) __obj.updateDynamic("cloudwatchLogs")(cloudwatchLogs)
    if (s3Logs != null) __obj.updateDynamic("s3Logs")(s3Logs)
    __obj.asInstanceOf[Anon_CloudwatchLogs]
  }
}

