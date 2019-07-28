package typings.reactDashBootstrap.libNavDropdownMod

import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.reactDashBootstrap.libDropdownMod.DropdownBaseProps
import typings.reactDashBootstrap.reactDashBootstrapMod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavDropdownBaseProps extends DropdownBaseProps {
  var active: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var noCaret: js.UndefOr[Boolean] = js.undefined
  var title: ReactNode
}

object NavDropdownBaseProps {
  @scala.inline
  def apply(
    id: String,
    title: ReactNode,
    active: js.UndefOr[Boolean] = js.undefined,
    bsClass: String = null,
    componentClass: ReactType[_] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropup: js.UndefOr[Boolean] = js.undefined,
    eventKey: js.Any = null,
    noCaret: js.UndefOr[Boolean] = js.undefined,
    onClose: js.Function = null,
    onSelect: SelectCallback = null,
    onToggle: /* isOpen */ Boolean => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    pullRight: js.UndefOr[Boolean] = js.undefined,
    role: String = null
  ): NavDropdownBaseProps = {
    val __obj = js.Dynamic.literal(id = id, title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (!js.isUndefined(noCaret)) __obj.updateDynamic("noCaret")(noCaret)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[NavDropdownBaseProps]
  }
}

