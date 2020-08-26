package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopedCredentialInfo extends js.Object {
  val credential: ScopedCredential = js.native
  val publicKey: CryptoKey = js.native
}

object ScopedCredentialInfo {
  @scala.inline
  def apply(credential: ScopedCredential, publicKey: CryptoKey): ScopedCredentialInfo = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredentialInfo]
  }
  @scala.inline
  implicit class ScopedCredentialInfoOps[Self <: ScopedCredentialInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCredential(value: ScopedCredential): Self = this.set("credential", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: CryptoKey): Self = this.set("publicKey", value.asInstanceOf[js.Any])
  }
  
}

