package typings.primereact.componentsDialogDialogMod

import typings.react.reactMod._Global_.JSX.Element
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
  var maximizable: js.UndefOr[Boolean] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
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
    baseZIndex: Int | Double = null,
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
    maximizable: js.UndefOr[Boolean] = js.undefined,
    modal: js.UndefOr[Boolean] = js.undefined,
    onShow: () => Unit = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DialogProps = {
    val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (ariaCloseIconLabel != null) __obj.updateDynamic("ariaCloseIconLabel")(ariaCloseIconLabel)
    if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(blockScroll)) __obj.updateDynamic("blockScroll")(blockScroll)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (!js.isUndefined(dismissableMask)) __obj.updateDynamic("dismissableMask")(dismissableMask)
    if (!js.isUndefined(focusOnShow)) __obj.updateDynamic("focusOnShow")(focusOnShow)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (header != null) __obj.updateDynamic("header")(header)
    if (iconsTemplate != null) __obj.updateDynamic("iconsTemplate")(js.Any.fromFunction0(iconsTemplate))
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(maximizable)) __obj.updateDynamic("maximizable")(maximizable)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[DialogProps]
  }
}

