package typings
package sharedbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    name: java.lang.String = null,
    uri: java.lang.String = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_Key]
  }
}

