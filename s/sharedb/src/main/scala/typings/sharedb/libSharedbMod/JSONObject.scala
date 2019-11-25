package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONObject
  extends /* name */ StringDictionary[JSONValue]
     with _JSONValue

object JSONObject {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[JSONValue] = null): JSONObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JSONObject]
  }
}

