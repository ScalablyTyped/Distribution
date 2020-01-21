package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey
  extends /* name */ StringDictionary[js.Any] {
  var Key: String
}

object AnonKey {
  @scala.inline
  def apply(Key: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): AnonKey = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonKey]
  }
}

