package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaHashedKeyAlgorithm extends RsaKeyAlgorithm {
  var hash: KeyAlgorithm
}

object RsaHashedKeyAlgorithm {
  @scala.inline
  def apply(hash: KeyAlgorithm, modulusLength: Double, name: java.lang.String, publicExponent: BigInteger): RsaHashedKeyAlgorithm = {
    val __obj = js.Dynamic.literal(hash = hash, modulusLength = modulusLength, name = name, publicExponent = publicExponent)
  
    __obj.asInstanceOf[RsaHashedKeyAlgorithm]
  }
}

