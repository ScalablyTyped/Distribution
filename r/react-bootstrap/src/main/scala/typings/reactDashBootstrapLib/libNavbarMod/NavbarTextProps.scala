package typings
package reactDashBootstrapLib.libNavbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarTextProps
  extends reactLib.reactMod.HTMLProps[NavbarText] {
  var pullRight: js.UndefOr[scala.Boolean] = js.undefined
}

object NavbarTextProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[NavbarText] = null,
    pullRight: js.UndefOr[scala.Boolean] = js.undefined
  ): NavbarTextProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    __obj.asInstanceOf[NavbarTextProps]
  }
}

