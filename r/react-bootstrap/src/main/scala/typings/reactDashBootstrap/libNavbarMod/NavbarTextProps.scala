package typings.reactDashBootstrap.libNavbarMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarTextProps extends HTMLProps[NavbarText] {
  var pullRight: js.UndefOr[Boolean] = js.undefined
}

object NavbarTextProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[NavbarText] = null, pullRight: js.UndefOr[Boolean] = js.undefined): NavbarTextProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    __obj.asInstanceOf[NavbarTextProps]
  }
}

