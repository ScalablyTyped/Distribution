package typings
package atReachTabsLib.atReachTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabContainerProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLElement] {
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
}

object TabContainerProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLElement] = null,
    as: java.lang.String = null,
    children: reactLib.reactMod.ReactNode = null,
    selectedIndex: scala.Int | scala.Double = null
  ): TabContainerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabContainerProps]
  }
}

