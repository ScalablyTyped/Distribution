package typings
package reactDashBootstrapLib.libNavDropdownMod.NavDropdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavDropdownBaseProps
  extends reactDashBootstrapLib.libDropdownMod.DropdownNs.DropdownBaseProps {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var noCaret: js.UndefOr[scala.Boolean] = js.undefined
  var title: reactLib.reactMod.ReactNs.ReactNode
}

object NavDropdownBaseProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    title: reactLib.reactMod.ReactNs.ReactNode,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    bsClass: java.lang.String = null,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropup: js.UndefOr[scala.Boolean] = js.undefined,
    eventKey: js.Any = null,
    noCaret: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: js.Function = null,
    onSelect: reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback = null,
    onToggle: js.Function1[/* isOpen */ scala.Boolean, scala.Unit] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    pullRight: js.UndefOr[scala.Boolean] = js.undefined,
    role: java.lang.String = null
  ): NavDropdownBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (!js.isUndefined(noCaret)) __obj.updateDynamic("noCaret")(noCaret)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onToggle != null) __obj.updateDynamic("onToggle")(onToggle)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[NavDropdownBaseProps]
  }
}

