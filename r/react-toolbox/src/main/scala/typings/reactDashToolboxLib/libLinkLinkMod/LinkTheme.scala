package typings
package reactDashToolboxLib.libLinkLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkTheme extends js.Object {
  /**
    * Added to the root element if the Link is active.
    */
  var active: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the icon element if it's present.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the root element.
    */
  var link: js.UndefOr[java.lang.String] = js.undefined
}

object LinkTheme {
  @scala.inline
  def apply(active: java.lang.String = null, icon: java.lang.String = null, link: java.lang.String = null): LinkTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (link != null) __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[LinkTheme]
  }
}

