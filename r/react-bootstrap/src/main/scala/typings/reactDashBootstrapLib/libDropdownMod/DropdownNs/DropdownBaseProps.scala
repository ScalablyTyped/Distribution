package typings
package reactDashBootstrapLib.libDropdownMod.DropdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownBaseProps extends js.Object {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var componentClass: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dropup: js.UndefOr[scala.Boolean] = js.undefined
  var id: java.lang.String
  var onClose: js.UndefOr[js.Function] = js.undefined
  var onSelect: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback] = js.undefined
  var onToggle: js.UndefOr[js.Function1[/* isOpen */ scala.Boolean, scala.Unit]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var pullRight: js.UndefOr[scala.Boolean] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
}

object DropdownBaseProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    bsClass: java.lang.String = null,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropup: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: js.Function = null,
    onSelect: reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback = null,
    onToggle: /* isOpen */ scala.Boolean => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    pullRight: js.UndefOr[scala.Boolean] = js.undefined,
    role: java.lang.String = null
  ): DropdownBaseProps = {
    val __obj = js.Dynamic.literal(id = id)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[DropdownBaseProps]
  }
}

