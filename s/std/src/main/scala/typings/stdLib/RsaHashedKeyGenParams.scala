package typings
package stdLib

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
    modulusLength: scala.Double,
    name: java.lang.String,
    publicExponent: BigInteger
  ): RsaHashedKeyGenParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    __obj.updateDynamic("modulusLength")(modulusLength)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("publicExponent")(publicExponent)
    __obj.asInstanceOf[RsaHashedKeyGenParams]
  }
}

