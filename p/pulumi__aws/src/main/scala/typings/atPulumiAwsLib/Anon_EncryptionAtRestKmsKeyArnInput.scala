package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionAtRestKmsKeyArnInput extends js.Object {
  var encryptionAtRestKmsKeyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_EncryptionAtRestKmsKeyArnInput {
  @scala.inline
  def apply(encryptionAtRestKmsKeyArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): Anon_EncryptionAtRestKmsKeyArnInput = {
    val __obj = js.Dynamic.literal()
    if (encryptionAtRestKmsKeyArn != null) __obj.updateDynamic("encryptionAtRestKmsKeyArn")(encryptionAtRestKmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncryptionAtRestKmsKeyArnInput]
  }
}

