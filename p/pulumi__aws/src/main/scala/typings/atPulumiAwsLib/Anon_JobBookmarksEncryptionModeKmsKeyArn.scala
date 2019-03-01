package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JobBookmarksEncryptionModeKmsKeyArn extends js.Object {
  var jobBookmarksEncryptionMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var kmsKeyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_JobBookmarksEncryptionModeKmsKeyArn {
  @scala.inline
  def apply(
    jobBookmarksEncryptionMode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    kmsKeyArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_JobBookmarksEncryptionModeKmsKeyArn = {
    val __obj = js.Dynamic.literal()
    if (jobBookmarksEncryptionMode != null) __obj.updateDynamic("jobBookmarksEncryptionMode")(jobBookmarksEncryptionMode.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_JobBookmarksEncryptionModeKmsKeyArn]
  }
}

