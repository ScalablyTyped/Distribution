package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesDerivedKeyParams extends Algorithm {
  var length: scala.Double
}

object AesDerivedKeyParams {
  @scala.inline
  def apply(length: scala.Double, name: java.lang.String): AesDerivedKeyParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AesDerivedKeyParams]
  }
}

