package typings.reactNative

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictoptionName
  extends /* optionName */ StringDictionary[js.Any] {
  var headers: StringDictionary[String]
}

object AnonDictoptionName {
  @scala.inline
  def apply(
    headers: StringDictionary[String],
    StringDictionary: /* optionName */ StringDictionary[js.Any] = null
  ): AnonDictoptionName = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictoptionName]
  }
}

