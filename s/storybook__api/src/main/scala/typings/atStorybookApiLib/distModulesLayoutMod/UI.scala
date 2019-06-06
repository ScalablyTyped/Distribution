package typings
package atStorybookApiLib.distModulesLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UI extends js.Object {
  var enableShortcuts: scala.Boolean
  var name: js.UndefOr[java.lang.String] = js.undefined
  var sidebarAnimations: scala.Boolean
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object UI {
  @scala.inline
  def apply(
    enableShortcuts: scala.Boolean,
    sidebarAnimations: scala.Boolean,
    name: java.lang.String = null,
    url: java.lang.String = null
  ): UI = {
    val __obj = js.Dynamic.literal(enableShortcuts = enableShortcuts, sidebarAnimations = sidebarAnimations)
    if (name != null) __obj.updateDynamic("name")(name)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[UI]
  }
}

