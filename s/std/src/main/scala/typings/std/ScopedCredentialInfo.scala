package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopedCredentialInfo extends js.Object {
  val credential: ScopedCredential
  val publicKey: CryptoKey
}

object ScopedCredentialInfo {
  @scala.inline
  def apply(credential: ScopedCredential, publicKey: CryptoKey): ScopedCredentialInfo = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredentialInfo]
  }
}

