package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionOption extends js.Object {
  var encryptionOption: String
  var kmsKey: js.UndefOr[String] = js.undefined
}

object Anon_EncryptionOption {
  @scala.inline
  def apply(encryptionOption: String, kmsKey: String = null): Anon_EncryptionOption = {
    val __obj = js.Dynamic.literal(encryptionOption = encryptionOption)
    if (kmsKey != null) __obj.updateDynamic("kmsKey")(kmsKey)
    __obj.asInstanceOf[Anon_EncryptionOption]
  }
}

