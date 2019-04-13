package typings
package reactDashMdLib.libDrawersDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavItem
  extends // This is really any shape, but give some *hints* about additional formatting behind the scenes
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var divider: js.UndefOr[scala.Boolean] = js.undefined
  var primaryText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var subheader: js.UndefOr[scala.Boolean] = js.undefined
}

object NavItem {
  @scala.inline
  def apply(
    StringDictionary: // This is really any shape, but give some *hints* about additional formatting behind the scenes
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    divider: js.UndefOr[scala.Boolean] = js.undefined,
    primaryText: reactLib.reactMod.ReactNode = null,
    subheader: js.UndefOr[scala.Boolean] = js.undefined
  ): NavItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider)
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText.asInstanceOf[js.Any])
    if (!js.isUndefined(subheader)) __obj.updateDynamic("subheader")(subheader)
    __obj.asInstanceOf[NavItem]
  }
}

