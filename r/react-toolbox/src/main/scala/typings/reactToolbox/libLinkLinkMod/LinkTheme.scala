package typings.reactToolbox.libLinkLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkTheme extends js.Object {
  /**
    * Added to the root element if the Link is active.
    */
  var active: js.UndefOr[String] = js.undefined
  /**
    * Used for the icon element if it's present.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * Used for the root element.
    */
  var link: js.UndefOr[String] = js.undefined
}

object LinkTheme {
  @scala.inline
  def apply(active: String = null, icon: String = null, link: String = null): LinkTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkTheme]
  }
}

