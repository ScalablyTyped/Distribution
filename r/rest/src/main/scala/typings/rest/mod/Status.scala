package typings.rest.mod

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
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
}

