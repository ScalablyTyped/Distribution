package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps
  extends reactLib.reactMod.AnchorHTMLAttributes[stdLib.HTMLAnchorElement] {
  val activeColor: js.UndefOr[java.lang.String] = js.undefined
  val ref: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  val type_LinkProps: js.UndefOr[LinkType] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    AnchorHTMLAttributes: reactLib.reactMod.AnchorHTMLAttributes[stdLib.HTMLAnchorElement] = null,
    activeColor: java.lang.String = null,
    children: reactLib.reactMod.ReactNode = null,
    ref: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    `type`: LinkType = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AnchorHTMLAttributes)
    if (activeColor != null) __obj.updateDynamic("activeColor")(activeColor)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LinkProps]
  }
}

