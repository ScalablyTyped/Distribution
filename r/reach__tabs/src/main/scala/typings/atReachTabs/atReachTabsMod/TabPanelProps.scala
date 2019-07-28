package typings.atReachTabs.atReachTabsMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabPanelProps extends HTMLProps[HTMLElement] {
  var isSelected: js.UndefOr[Boolean] = js.undefined
}

object TabPanelProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLElement] = null,
    as: String = null,
    children: ReactNode = null,
    isSelected: js.UndefOr[Boolean] = js.undefined
  ): TabPanelProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    __obj.asInstanceOf[TabPanelProps]
  }
}

