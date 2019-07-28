package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JobBookmarksEncryptionModeKmsKeyArn extends js.Object {
  var jobBookmarksEncryptionMode: js.UndefOr[Input[String]] = js.undefined
  var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
}

object Anon_JobBookmarksEncryptionModeKmsKeyArn {
  @scala.inline
  def apply(jobBookmarksEncryptionMode: Input[String] = null, kmsKeyArn: Input[String] = null): Anon_JobBookmarksEncryptionModeKmsKeyArn = {
    val __obj = js.Dynamic.literal()
    if (jobBookmarksEncryptionMode != null) __obj.updateDynamic("jobBookmarksEncryptionMode")(jobBookmarksEncryptionMode.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_JobBookmarksEncryptionModeKmsKeyArn]
  }
}

