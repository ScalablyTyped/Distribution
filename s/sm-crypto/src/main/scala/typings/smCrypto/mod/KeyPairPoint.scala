package typings.smCrypto.mod

import typings.bigi.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPairPoint extends KeyPairHex {
  var k: ^
  var x1: ^
}

object KeyPairPoint {
  @scala.inline
  def apply(k: ^, privateKey: String, publicKey: String, x1: ^): KeyPairPoint = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairPoint]
  }
}

