package typings.reactNative

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaderName
  extends /* optionName */ StringDictionary[js.Any] {
  var headers: StringDictionary[String]
}

object AnonHeaderName {
  @scala.inline
  def apply(
    headers: StringDictionary[String],
    StringDictionary: /* optionName */ StringDictionary[js.Any] = null
  ): AnonHeaderName = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonHeaderName]
  }
}

