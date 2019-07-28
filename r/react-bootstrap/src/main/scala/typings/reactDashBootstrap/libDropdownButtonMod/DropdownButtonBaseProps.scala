package typings.reactDashBootstrap.libDropdownButtonMod

import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.reactDashBootstrap.libDropdownMod.DropdownBaseProps
import typings.reactDashBootstrap.reactDashBootstrapMod.SelectCallback
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownButtonBaseProps extends DropdownBaseProps {
  var block: js.UndefOr[Boolean] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String | Null] = js.undefined
  var navItem: js.UndefOr[Boolean] = js.undefined
  var noCaret: js.UndefOr[Boolean] = js.undefined
  var title: ReactNode
}

object DropdownButtonBaseProps {
  @scala.inline
  def apply(
    id: String,
    title: ReactNode,
    block: js.UndefOr[Boolean] = js.undefined,
    bsClass: String = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    componentClass: ReactType[_] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropup: js.UndefOr[Boolean] = js.undefined,
    navItem: js.UndefOr[Boolean] = js.undefined,
    noCaret: js.UndefOr[Boolean] = js.undefined,
    onClose: js.Function = null,
    onSelect: SelectCallback = null,
    onToggle: /* isOpen */ Boolean => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    pullRight: js.UndefOr[Boolean] = js.undefined,
    role: String = null
  ): DropdownButtonBaseProps = {
    val __obj = js.Dynamic.literal(id = id, title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup)
    if (!js.isUndefined(navItem)) __obj.updateDynamic("navItem")(navItem)
    if (!js.isUndefined(noCaret)) __obj.updateDynamic("noCaret")(noCaret)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[DropdownButtonBaseProps]
  }
}

