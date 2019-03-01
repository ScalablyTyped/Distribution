package typings
package reactDashBootstrapLib.libNavbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the classes below aren't present in lib/
  */
trait NavbarLinkProps
  extends reactLib.reactMod.ReactNs.HTMLProps[NavbarLink] {
  @JSName("href")
  var href_NavbarLinkProps: java.lang.String
  @JSName("onClick")
  var onClick_NavbarLinkProps: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[_]] = js.undefined
}

object NavbarLinkProps {
  @scala.inline
  def apply(
    href: java.lang.String,
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[NavbarLink] = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[_] = null
  ): NavbarLinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("href")(href)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[NavbarLinkProps]
  }
}

