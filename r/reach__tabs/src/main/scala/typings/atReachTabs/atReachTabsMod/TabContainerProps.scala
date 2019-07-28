package typings.atReachTabs.atReachTabsMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabContainerProps extends HTMLProps[HTMLElement] {
  var selectedIndex: js.UndefOr[Double] = js.undefined
}

object TabContainerProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLElement] = null,
    as: String = null,
    children: ReactNode = null,
    selectedIndex: Int | Double = null
  ): TabContainerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabContainerProps]
  }
}

