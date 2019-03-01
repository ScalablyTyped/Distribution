package typings
package reactDashBootstrapLib.libDropdownButtonMod.DropdownButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownButtonBaseProps
  extends reactDashBootstrapLib.libDropdownMod.DropdownNs.DropdownBaseProps {
  var block: js.UndefOr[scala.Boolean] = js.undefined
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
  var bsStyle: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var navItem: js.UndefOr[scala.Boolean] = js.undefined
  var noCaret: js.UndefOr[scala.Boolean] = js.undefined
  var title: reactLib.reactMod.ReactNs.ReactNode
}

object DropdownButtonBaseProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    title: reactLib.reactMod.ReactNs.ReactNode,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    bsClass: java.lang.String = null,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null,
    bsStyle: java.lang.String = null,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropup: js.UndefOr[scala.Boolean] = js.undefined,
    navItem: js.UndefOr[scala.Boolean] = js.undefined,
    noCaret: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: js.Function = null,
    onSelect: reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback = null,
    onToggle: js.Function1[/* isOpen */ scala.Boolean, scala.Unit] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    pullRight: js.UndefOr[scala.Boolean] = js.undefined,
    role: java.lang.String = null
  ): DropdownButtonBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
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
    if (onToggle != null) __obj.updateDynamic("onToggle")(onToggle)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[DropdownButtonBaseProps]
  }
}

