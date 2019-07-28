package typings.ssh2.ssh2Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedPrivateKey extends js.Object {
  /** A Buffer or string that contains a private key. */
  var key: Buffer | String
  /** The passphrase to decrypt a private key. */
  var passphrase: js.UndefOr[String] = js.undefined
}

object EncryptedPrivateKey {
  @scala.inline
  def apply(key: Buffer | String, passphrase: String = null): EncryptedPrivateKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    __obj.asInstanceOf[EncryptedPrivateKey]
  }
}

