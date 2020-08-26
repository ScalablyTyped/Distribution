package typings.ssh2.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptedPrivateKey extends js.Object {
  /** A Buffer or string that contains a private key. */
  var key: Buffer | String = js.native
  /** The passphrase to decrypt a private key. */
  var passphrase: js.UndefOr[String] = js.native
}

object EncryptedPrivateKey {
  @scala.inline
  def apply(key: Buffer | String): EncryptedPrivateKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedPrivateKey]
  }
  @scala.inline
  implicit class EncryptedPrivateKeyOps[Self <: EncryptedPrivateKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: Buffer | String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
  }
  
}

