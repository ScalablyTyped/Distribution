package typings.puppeteer.puppeteerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONObject
  extends _Serializable
     with /* key */ StringDictionary[Serializable]

object JSONObject {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[Serializable] = null): JSONObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JSONObject]
  }
}

