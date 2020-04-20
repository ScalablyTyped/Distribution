package typings.smCrypto.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPairHex extends js.Object {
  var privateKey: String
  var publicKey: String
}

object KeyPairHex {
  @scala.inline
  def apply(privateKey: String, publicKey: String): KeyPairHex = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairHex]
  }
}

