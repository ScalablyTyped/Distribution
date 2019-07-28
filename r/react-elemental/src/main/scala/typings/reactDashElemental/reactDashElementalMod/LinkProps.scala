package typings.reactDashElemental.reactDashElementalMod

import typings.react.reactMod.AnchorHTMLAttributes
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends AnchorHTMLAttributes[HTMLAnchorElement] {
  val activeColor: js.UndefOr[String] = js.undefined
  val ref: js.UndefOr[String] = js.undefined
  @JSName("type")
  val type_LinkProps: js.UndefOr[LinkType] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    AnchorHTMLAttributes: AnchorHTMLAttributes[HTMLAnchorElement] = null,
    activeColor: String = null,
    children: ReactNode = null,
    ref: String = null,
    style: CSSProperties = null,
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

