package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaHashedKeyGenParams extends RsaKeyGenParams {
  var hash: HashAlgorithmIdentifier
}

object RsaHashedKeyGenParams {
  @scala.inline
  def apply(
    hash: HashAlgorithmIdentifier,
    modulusLength: Double,
    name: java.lang.String,
    publicExponent: BigInteger
  ): RsaHashedKeyGenParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], modulusLength = modulusLength, name = name, publicExponent = publicExponent)
  
    __obj.asInstanceOf[RsaHashedKeyGenParams]
  }
}

