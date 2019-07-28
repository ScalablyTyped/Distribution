package typings.atStorybookApi.distModulesLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UI extends js.Object {
  var enableShortcuts: Boolean
  var name: js.UndefOr[String] = js.undefined
  var sidebarAnimations: Boolean
  var url: js.UndefOr[String] = js.undefined
}

object UI {
  @scala.inline
  def apply(enableShortcuts: Boolean, sidebarAnimations: Boolean, name: String = null, url: String = null): UI = {
    val __obj = js.Dynamic.literal(enableShortcuts = enableShortcuts, sidebarAnimations = sidebarAnimations)
    if (name != null) __obj.updateDynamic("name")(name)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[UI]
  }
}

