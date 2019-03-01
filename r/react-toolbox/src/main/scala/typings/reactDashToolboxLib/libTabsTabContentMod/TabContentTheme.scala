package typings
package reactDashToolboxLib.libTabsTabContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabContentTheme extends js.Object {
  /**
    * Added when tab is active.
    */
  var active: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the tab content element.
    */
  var tab: js.UndefOr[java.lang.String] = js.undefined
}

object TabContentTheme {
  @scala.inline
  def apply(active: java.lang.String = null, tab: java.lang.String = null): TabContentTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (tab != null) __obj.updateDynamic("tab")(tab)
    __obj.asInstanceOf[TabContentTheme]
  }
}

