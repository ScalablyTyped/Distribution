package typings
package reactDashBootstrapLib.libButtonMod.ButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libButtonMod.Button] {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var block: js.UndefOr[scala.Boolean] = js.undefined
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
  var bsStyle: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var componentClass: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libButtonMod.Button] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    bsClass: java.lang.String = null,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null,
    bsStyle: java.lang.String = null,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[ButtonProps]
  }
}

