package typings.seleniumWebdriver.mod.error

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorData extends /* key */ StringDictionary[String | Double] {
  var error: String | Double
  var message: String
}

object ErrorData {
  @scala.inline
  def apply(
    error: String | Double,
    message: String,
    StringDictionary: /* key */ StringDictionary[String | Double] = null
  ): ErrorData = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ErrorData]
  }
}

