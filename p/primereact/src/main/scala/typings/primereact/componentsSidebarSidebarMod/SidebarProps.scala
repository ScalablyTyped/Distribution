package typings.primereact.componentsSidebarSidebarMod

import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarProps extends js.Object {
  var baseZIndex: js.UndefOr[Double] = js.undefined
  var blockScroll: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dismissable: js.UndefOr[Boolean] = js.undefined
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  var iconsTemplate: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var showCloseIcon: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  def onHide(): Unit
}

object SidebarProps {
  @scala.inline
  def apply(
    onHide: () => Unit,
    baseZIndex: Int | Double = null,
    blockScroll: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    dismissable: js.UndefOr[Boolean] = js.undefined,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    iconsTemplate: () => js.UndefOr[Element] = null,
    id: String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    onShow: () => Unit = null,
    position: String = null,
    showCloseIcon: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    visible: js.UndefOr[Boolean] = js.undefined
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

