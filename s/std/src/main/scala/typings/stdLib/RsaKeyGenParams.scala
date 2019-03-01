package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaKeyGenParams extends Algorithm {
  var modulusLength: scala.Double
  var publicExponent: BigInteger
}

object RsaKeyGenParams {
  @scala.inline
  def apply(modulusLength: scala.Double, name: java.lang.String, publicExponent: BigInteger): RsaKeyGenParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("modulusLength")(modulusLength)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("publicExponent")(publicExponent)
    __obj.asInstanceOf[RsaKeyGenParams]
  }
}

