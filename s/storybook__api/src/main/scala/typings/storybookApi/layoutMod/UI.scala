package typings.storybookApi.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UI extends js.Object {
  var docsMode: Boolean
  var enableShortcuts: Boolean
  var name: js.UndefOr[String] = js.undefined
  var sidebarAnimations: Boolean
  var url: js.UndefOr[String] = js.undefined
}

object UI {
  @scala.inline
  def apply(
    docsMode: Boolean,
    enableShortcuts: Boolean,
    sidebarAnimations: Boolean,
    name: String = null,
    url: String = null
  ): UI = {
    val __obj = js.Dynamic.literal(docsMode = docsMode.asInstanceOf[js.Any], enableShortcuts = enableShortcuts.asInstanceOf[js.Any], sidebarAnimations = sidebarAnimations.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UI]
  }
}

