package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The CryptoKey dictionary of the Web Crypto API represents a cryptographic key. */
trait CryptoKey extends js.Object {
  val algorithm: KeyAlgorithm
  val extractable: scala.Boolean
  val `type`: KeyType
  val usages: js.Array[KeyUsage]
}

object CryptoKey {
  @scala.inline
  def apply(algorithm: KeyAlgorithm, extractable: scala.Boolean, `type`: KeyType, usages: js.Array[KeyUsage]): CryptoKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], extractable = extractable.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
}

