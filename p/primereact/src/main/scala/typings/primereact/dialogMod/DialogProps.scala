package typings.primereact.dialogMod

import typings.primereact.anon.Maximized
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogProps extends js.Object {
  var appendTo: js.UndefOr[HTMLElement] = js.undefined
  var ariaCloseIconLabel: js.UndefOr[String] = js.undefined
  var baseZIndex: js.UndefOr[Double] = js.undefined
  var blockScroll: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var closeOnEscape: js.UndefOr[Boolean] = js.undefined
  var contentStyle: js.UndefOr[js.Object] = js.undefined
  var dismissableMask: js.UndefOr[Boolean] = js.undefined
  var focusOnShow: js.UndefOr[Boolean] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var iconsTemplate: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var maskClassName: js.UndefOr[String] = js.undefined
  var maximizable: js.UndefOr[Boolean] = js.undefined
  var maximized: js.UndefOr[Boolean] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var onMaximize: js.UndefOr[js.Function1[/* e */ Maximized, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var rtl: js.UndefOr[Boolean] = js.undefined
  var showHeader: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  def onHide(): Unit
}

object DialogProps {
  @scala.inline
  def apply(
    onHide: () => Unit,
    appendTo: HTMLElement = null,
    ariaCloseIconLabel: String = null,
    baseZIndex: js.UndefOr[Double] = js.undefined,
    blockScroll: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    contentStyle: js.Object = null,
    dismissableMask: js.UndefOr[Boolean] = js.undefined,
    focusOnShow: js.UndefOr[Boolean] = js.undefined,
    footer: js.Any = null,
    header: js.Any = null,
    iconsTemplate: () => js.UndefOr[Element] = null,
    id: String = null,
    maskClassName: String = null,
    maximizable: js.UndefOr[Boolean] = js.undefined,
    maximized: js.UndefOr[Boolean] = js.undefined,
    modal: js.UndefOr[Boolean] = js.undefined,
    onMaximize: /* e */ Maximized => Unit = null,
    onShow: () => Unit = null,
    position: String = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DialogProps = {
    val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (ariaCloseIconLabel != null) __obj.updateDynamic("ariaCloseIconLabel")(ariaCloseIconLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(baseZIndex)) __obj.updateDynamic("baseZIndex")(baseZIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blockScroll)) __obj.updateDynamic("blockScroll")(blockScroll.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.get.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissableMask)) __obj.updateDynamic("dismissableMask")(dismissableMask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnShow)) __obj.updateDynamic("focusOnShow")(focusOnShow.get.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (iconsTemplate != null) __obj.updateDynamic("iconsTemplate")(js.Any.fromFunction0(iconsTemplate))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maskClassName != null) __obj.updateDynamic("maskClassName")(maskClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(maximizable)) __obj.updateDynamic("maximizable")(maximizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximized)) __obj.updateDynamic("maximized")(maximized.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (onMaximize != null) __obj.updateDynamic("onMaximize")(js.Any.fromFunction1(onMaximize))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
}

