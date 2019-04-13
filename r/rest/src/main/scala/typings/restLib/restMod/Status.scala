package typings
package restLib.restMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var code: scala.Double
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Status {
  @scala.inline
  def apply(code: scala.Double, text: java.lang.String = null): Status = {
    val __obj = js.Dynamic.literal(code = code)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Status]
  }
}

