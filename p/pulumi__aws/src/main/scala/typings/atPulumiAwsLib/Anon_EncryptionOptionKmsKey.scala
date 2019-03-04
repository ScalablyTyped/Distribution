package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionOptionKmsKey extends js.Object {
  var encryptionOption: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var kmsKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_EncryptionOptionKmsKey {
  @scala.inline
  def apply(
    encryptionOption: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    kmsKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_EncryptionOptionKmsKey = {
    val __obj = js.Dynamic.literal(encryptionOption = encryptionOption.asInstanceOf[js.Any])
    if (kmsKey != null) __obj.updateDynamic("kmsKey")(kmsKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncryptionOptionKmsKey]
  }
}

