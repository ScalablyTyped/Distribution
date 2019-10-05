package typings.atPulumiAws.typesOutputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectLogsConfigS3Logs extends js.Object {
  /**
    * If set to true, output artifacts will not be encrypted. If `type` is set to `NO_ARTIFACTS` then this value will be ignored. Defaults to `false`.
    */
  var encryptionDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The location of the source code from git or s3.
    */
  var location: js.UndefOr[String] = js.undefined
  /**
    * Current status of logs in S3 for a build project. Valid values: `ENABLED`, `DISABLED`. Defaults to `DISABLED`.
    */
  var status: js.UndefOr[String] = js.undefined
}

object ProjectLogsConfigS3Logs {
  @scala.inline
  def apply(
    encryptionDisabled: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    status: String = null
  ): ProjectLogsConfigS3Logs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encryptionDisabled)) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled)
    if (location != null) __obj.updateDynamic("location")(location)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ProjectLogsConfigS3Logs]
  }
}

