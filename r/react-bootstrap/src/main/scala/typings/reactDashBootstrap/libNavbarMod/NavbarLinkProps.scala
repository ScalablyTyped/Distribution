package typings.reactDashBootstrap.libNavbarMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the classes below aren't present in lib/
  */
trait NavbarLinkProps extends HTMLProps[NavbarLink] {
  @JSName("href")
  var href_NavbarLinkProps: String
  @JSName("onClick")
  var onClick_NavbarLinkProps: js.UndefOr[MouseEventHandler[_]] = js.undefined
}

object NavbarLinkProps {
  @scala.inline
  def apply(href: String, HTMLProps: HTMLProps[NavbarLink] = null, onClick: MouseEventHandler[_] = null): NavbarLinkProps = {
    val __obj = js.Dynamic.literal(href = href)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[NavbarLinkProps]
  }
}

