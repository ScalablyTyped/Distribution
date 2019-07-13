package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionOptionKmsKeyArn extends js.Object {
  var encryptionOption: js.UndefOr[java.lang.String] = js.undefined
  var kmsKeyArn: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EncryptionOptionKmsKeyArn {
  @scala.inline
  def apply(encryptionOption: java.lang.String = null, kmsKeyArn: java.lang.String = null): Anon_EncryptionOptionKmsKeyArn = {
    val __obj = js.Dynamic.literal()
    if (encryptionOption != null) __obj.updateDynamic("encryptionOption")(encryptionOption)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    __obj.asInstanceOf[Anon_EncryptionOptionKmsKeyArn]
  }
}

