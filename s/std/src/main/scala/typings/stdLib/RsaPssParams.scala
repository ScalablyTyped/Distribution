package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaPssParams extends Algorithm {
  var saltLength: scala.Double
}

object RsaPssParams {
  @scala.inline
  def apply(name: java.lang.String, saltLength: scala.Double): RsaPssParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("saltLength")(saltLength)
    __obj.asInstanceOf[RsaPssParams]
  }
}

