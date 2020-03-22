package typings.reachRouter

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictparam extends /* param */ StringDictionary[String] {
  var path: String
  var uri: String
}

object AnonDictparam {
  @scala.inline
  def apply(path: String, uri: String, StringDictionary: /* param */ StringDictionary[String] = null): AnonDictparam = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictparam]
  }
}

