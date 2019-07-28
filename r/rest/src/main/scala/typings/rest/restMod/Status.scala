package typings.rest.restMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var code: Double
  var text: js.UndefOr[String] = js.undefined
}

object Status {
  @scala.inline
  def apply(code: Double, text: String = null): Status = {
    val __obj = js.Dynamic.literal(code = code)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Status]
  }
}

