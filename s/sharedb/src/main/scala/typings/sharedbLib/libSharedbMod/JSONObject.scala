package typings
package sharedbLib.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONObject
  extends _JSONValue
     with /* name */ org.scalablytyped.runtime.StringDictionary[JSONValue]

object JSONObject {
  @scala.inline
  def apply(StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[JSONValue] = null): JSONObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JSONObject]
  }
}

