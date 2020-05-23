package typings.reactNative.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictoptionName
  extends //anything else
/* key */ StringDictionary[js.Any] {
  var headers: StringDictionary[String]
}

object DictoptionName {
  @scala.inline
  def apply(headers: StringDictionary[String], StringDictionary: /* name */ StringDictionary[js.Any] = null): DictoptionName = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DictoptionName]
  }
}

