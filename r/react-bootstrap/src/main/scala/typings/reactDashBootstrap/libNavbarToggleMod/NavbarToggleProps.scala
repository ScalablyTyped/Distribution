package typings.reactDashBootstrap.libNavbarToggleMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarToggleProps extends HTMLProps[NavbarToggle] {
  @JSName("onClick")
  var onClick_NavbarToggleProps: js.UndefOr[MouseEventHandler[_]] = js.undefined
}

object NavbarToggleProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[NavbarToggle] = null, onClick: MouseEventHandler[_] = null): NavbarToggleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[NavbarToggleProps]
  }
}

