package typings.protractor

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  var reporter: js.UndefOr[String] = js.undefined
  var ui: js.UndefOr[String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    reporter: String = null,
    ui: String = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[Anon_Key]
  }
}

