package typings.atPulumiAws.typesInputMod.codebuild

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectLogsConfigS3Logs extends js.Object {
  /**
    * If set to true, output artifacts will not be encrypted. If `type` is set to `NO_ARTIFACTS` then this value will be ignored. Defaults to `false`.
    */
  var encryptionDisabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The location of the source code from git or s3.
    */
  var location: js.UndefOr[Input[String]] = js.undefined
  /**
    * Current status of logs in S3 for a build project. Valid values: `ENABLED`, `DISABLED`. Defaults to `DISABLED`.
    */
  var status: js.UndefOr[Input[String]] = js.undefined
}

object ProjectLogsConfigS3Logs {
  @scala.inline
  def apply(
    encryptionDisabled: Input[Boolean] = null,
    location: Input[String] = null,
    status: Input[String] = null
  ): ProjectLogsConfigS3Logs = {
    val __obj = js.Dynamic.literal()
    if (encryptionDisabled != null) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectLogsConfigS3Logs]
  }
}

