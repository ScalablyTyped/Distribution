package typings.standardError.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardError
  extends Error
     with /* key */ StringDictionary[js.Any]

object StandardError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    stack: String = null
  ): StandardError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardError]
  }
}

