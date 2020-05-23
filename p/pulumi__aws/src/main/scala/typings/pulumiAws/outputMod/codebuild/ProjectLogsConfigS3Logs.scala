package typings.pulumiAws.outputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectLogsConfigS3Logs extends js.Object {
  /**
    * If set to true, output artifacts will not be encrypted. If `type` is set to `NO_ARTIFACTS` then this value will be ignored. Defaults to `false`.
    */
  var encryptionDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Information about the build output artifact location. If `type` is set to `CODEPIPELINE` or `NO_ARTIFACTS` then this value will be ignored. If `type` is set to `S3`, this is the name of the output bucket.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Current status of logs in CloudWatch Logs for a build project. Valid values: `ENABLED`, `DISABLED`. Defaults to `ENABLED`.
    */
  var status: js.UndefOr[String] = js.native
}

object ProjectLogsConfigS3Logs {
  @scala.inline
  def apply(
    encryptionDisabled: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    status: String = null
  ): ProjectLogsConfigS3Logs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encryptionDisabled)) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectLogsConfigS3Logs]
  }
}

