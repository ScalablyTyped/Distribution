package typings.streamMock.warningMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Warning extends Error {
  var code: js.UndefOr[String] = js.undefined
}

object Warning {
  @scala.inline
  def apply(message: String, name: String, code: String = null, stack: String = null): Warning = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
}

