package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The CryptoKeyPair dictionary of the Web Crypto API represents a key pair for an asymmetric cryptography algorithm, also known as a public-key algorithm. */
trait CryptoKeyPair extends js.Object {
  var privateKey: CryptoKey
  var publicKey: CryptoKey
}

object CryptoKeyPair {
  @scala.inline
  def apply(privateKey: CryptoKey, publicKey: CryptoKey): CryptoKeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyPair]
  }
}

