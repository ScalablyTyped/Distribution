package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DhImportKeyParams extends Algorithm {
  var generator: Uint8Array
  var prime: Uint8Array
}

object DhImportKeyParams {
  @scala.inline
  def apply(generator: Uint8Array, name: java.lang.String, prime: Uint8Array): DhImportKeyParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generator")(generator)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("prime")(prime)
    __obj.asInstanceOf[DhImportKeyParams]
  }
}

