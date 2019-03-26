package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
object CryptoKeyPair
  extends org.scalablytyped.runtime.Instantiable0[CryptoKeyPair]

