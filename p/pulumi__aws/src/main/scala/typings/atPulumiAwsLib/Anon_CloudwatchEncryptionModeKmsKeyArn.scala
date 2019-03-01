package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchEncryptionModeKmsKeyArn extends js.Object {
  var cloudwatchEncryptionMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var kmsKeyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_CloudwatchEncryptionModeKmsKeyArn {
  @scala.inline
  def apply(
    cloudwatchEncryptionMode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    kmsKeyArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_CloudwatchEncryptionModeKmsKeyArn = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchEncryptionMode != null) __obj.updateDynamic("cloudwatchEncryptionMode")(cloudwatchEncryptionMode.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloudwatchEncryptionModeKmsKeyArn]
  }
}

