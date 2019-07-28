package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionOptionKmsKey extends js.Object {
  var encryptionOption: Input[String]
  var kmsKey: js.UndefOr[Input[String]] = js.undefined
}

object Anon_EncryptionOptionKmsKey {
  @scala.inline
  def apply(encryptionOption: Input[String], kmsKey: Input[String] = null): Anon_EncryptionOptionKmsKey = {
    val __obj = js.Dynamic.literal(encryptionOption = encryptionOption.asInstanceOf[js.Any])
    if (kmsKey != null) __obj.updateDynamic("kmsKey")(kmsKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncryptionOptionKmsKey]
  }
}

