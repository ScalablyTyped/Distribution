package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionOptionKmsKeyArnInput extends js.Object {
  var encryptionOption: js.UndefOr[Input[String]] = js.undefined
  var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
}

object Anon_EncryptionOptionKmsKeyArnInput {
  @scala.inline
  def apply(encryptionOption: Input[String] = null, kmsKeyArn: Input[String] = null): Anon_EncryptionOptionKmsKeyArnInput = {
    val __obj = js.Dynamic.literal()
    if (encryptionOption != null) __obj.updateDynamic("encryptionOption")(encryptionOption.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncryptionOptionKmsKeyArnInput]
  }
}

