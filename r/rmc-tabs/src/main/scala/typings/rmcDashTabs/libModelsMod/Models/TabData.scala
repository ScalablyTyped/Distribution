package typings.rmcDashTabs.libModelsMod.Models

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabData
  extends /** for user's custom extends */
/* key */ StringDictionary[js.Any] {
  var key: js.UndefOr[String] = js.undefined
  var title: ReactNode
}

object TabData {
  @scala.inline
  def apply(
    StringDictionary: /** for user's custom extends */
  /* key */ StringDictionary[js.Any] = null,
    key: String = null,
    title: ReactNode = null
  ): TabData = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabData]
  }
}

