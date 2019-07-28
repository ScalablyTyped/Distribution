package typings.reactDashBootstrap.libNavbarMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarFormProps extends HTMLProps[NavbarForm] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  var pullLeft: js.UndefOr[Boolean] = js.undefined
  var pullRight: js.UndefOr[Boolean] = js.undefined
}

object NavbarFormProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[NavbarForm] = null,
    componentClass: ReactType[_] = null,
    pullLeft: js.UndefOr[Boolean] = js.undefined,
    pullRight: js.UndefOr[Boolean] = js.undefined
  ): NavbarFormProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(pullLeft)) __obj.updateDynamic("pullLeft")(pullLeft)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    __obj.asInstanceOf[NavbarFormProps]
  }
}

