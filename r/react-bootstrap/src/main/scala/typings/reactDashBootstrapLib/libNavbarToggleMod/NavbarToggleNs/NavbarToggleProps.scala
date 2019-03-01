package typings
package reactDashBootstrapLib.libNavbarToggleMod.NavbarToggleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarToggleProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libNavbarToggleMod.NavbarToggle] {
  @JSName("onClick")
  var onClick_NavbarToggleProps: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[_]] = js.undefined
}

object NavbarToggleProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libNavbarToggleMod.NavbarToggle] = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[_] = null
  ): NavbarToggleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[NavbarToggleProps]
  }
}

