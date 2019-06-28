package typings
package atReachTabsLib.atReachTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabPanelProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLElement] {
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
}

object TabPanelProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLElement] = null,
    as: java.lang.String = null,
    children: reactLib.reactMod.ReactNode = null,
    isSelected: js.UndefOr[scala.Boolean] = js.undefined
  ): TabPanelProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    __obj.asInstanceOf[TabPanelProps]
  }
}

