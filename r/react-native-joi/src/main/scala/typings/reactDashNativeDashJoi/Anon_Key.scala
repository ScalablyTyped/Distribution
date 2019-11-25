package typings.reactDashNativeDashJoi

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNativeDashJoi.reactDashNativeDashJoiMod.LanguageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends /* key */ StringDictionary[LanguageOptions] {
  var key: js.UndefOr[String] = js.undefined
  var messages: js.UndefOr[Anon_WrapArrays] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[LanguageOptions] = null,
    key: String = null,
    messages: Anon_WrapArrays = null,
    root: String = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

