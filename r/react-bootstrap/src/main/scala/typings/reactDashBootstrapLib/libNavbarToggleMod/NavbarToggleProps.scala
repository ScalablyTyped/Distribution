package typings
package reactDashBootstrapLib.libNavbarToggleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarToggleProps
  extends reactLib.reactMod.HTMLProps[NavbarToggle] {
  @JSName("onClick")
  var onClick_NavbarToggleProps: js.UndefOr[reactLib.reactMod.MouseEventHandler[_]] = js.undefined
}

object NavbarToggleProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[NavbarToggle] = null,
    onClick: reactLib.reactMod.MouseEventHandler[_] = null
  ): NavbarToggleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[NavbarToggleProps]
  }
}

