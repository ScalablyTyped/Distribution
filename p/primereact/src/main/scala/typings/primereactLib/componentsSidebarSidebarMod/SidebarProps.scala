package typings
package primereactLib.componentsSidebarSidebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarProps extends js.Object {
  var baseZIndex: js.UndefOr[scala.Double] = js.undefined
  var blockScroll: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dismissable: js.UndefOr[scala.Boolean] = js.undefined
  var fullScreen: js.UndefOr[scala.Boolean] = js.undefined
  var iconsTemplate: js.UndefOr[js.Function0[js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var onShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var showCloseIcon: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  def onHide(): scala.Unit
}

object SidebarProps {
  @scala.inline
  def apply(
    onHide: () => scala.Unit,
    baseZIndex: scala.Int | scala.Double = null,
    blockScroll: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    dismissable: js.UndefOr[scala.Boolean] = js.undefined,
    fullScreen: js.UndefOr[scala.Boolean] = js.undefined,
    iconsTemplate: () => js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = null,
    id: java.lang.String = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    onShow: () => scala.Unit = null,
    position: java.lang.String = null,
    showCloseIcon: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Object = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): SidebarProps = {
    val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
    if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(blockScroll)) __obj.updateDynamic("blockScroll")(blockScroll)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(dismissable)) __obj.updateDynamic("dismissable")(dismissable)
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen)
    if (iconsTemplate != null) __obj.updateDynamic("iconsTemplate")(js.Any.fromFunction0(iconsTemplate))
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(showCloseIcon)) __obj.updateDynamic("showCloseIcon")(showCloseIcon)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SidebarProps]
  }
}

