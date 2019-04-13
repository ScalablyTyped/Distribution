package typings
package reactDashBootstrapLib.libNavbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarFormProps
  extends reactLib.reactMod.HTMLProps[NavbarForm] {
  var componentClass: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var pullLeft: js.UndefOr[scala.Boolean] = js.undefined
  var pullRight: js.UndefOr[scala.Boolean] = js.undefined
}

object NavbarFormProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[NavbarForm] = null,
    componentClass: reactLib.reactMod.ReactType[_] = null,
    pullLeft: js.UndefOr[scala.Boolean] = js.undefined,
    pullRight: js.UndefOr[scala.Boolean] = js.undefined
  ): NavbarFormProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(pullLeft)) __obj.updateDynamic("pullLeft")(pullLeft)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    __obj.asInstanceOf[NavbarFormProps]
  }
}

