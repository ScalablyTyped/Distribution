package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EcdsaParams extends Algorithm {
  var hash: HashAlgorithmIdentifier
}

object EcdsaParams {
  @scala.inline
  def apply(hash: HashAlgorithmIdentifier, name: java.lang.String): EcdsaParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[EcdsaParams]
  }
}

