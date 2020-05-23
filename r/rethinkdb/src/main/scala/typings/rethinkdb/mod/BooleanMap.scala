package typings.rethinkdb.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanMap extends /* key */ StringDictionary[Boolean | BooleanMap]

object BooleanMap {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[Boolean | BooleanMap] = null): BooleanMap = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[BooleanMap]
  }
}

