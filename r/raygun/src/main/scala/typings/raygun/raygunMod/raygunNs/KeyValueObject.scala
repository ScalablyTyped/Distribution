package typings.raygun.raygunMod.raygunNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValueObject extends /* key */ StringDictionary[String | Double | Boolean | KeyValueObject]

object KeyValueObject {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[String | Double | Boolean | KeyValueObject] = null): KeyValueObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[KeyValueObject]
  }
}

