package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The CryptoKeyPair dictionary of the Web Crypto API represents a key pair for an asymmetric cryptography algorithm, also known as a public-key algorithm. */
trait CryptoKeyPair extends js.Object {
  var privateKey: CryptoKey
  var publicKey: CryptoKey
}

@JSGlobal("CryptoKeyPair")
@js.native
class CryptoKeyPairCls () extends CryptoKeyPair {
  /* CompleteClass */
  override var privateKey: CryptoKey = js.native
  /* CompleteClass */
  override var publicKey: CryptoKey = js.native
}

@JSGlobal("CryptoKeyPair")
@js.native
object CryptoKeyPair extends Instantiable0[CryptoKeyPair]

