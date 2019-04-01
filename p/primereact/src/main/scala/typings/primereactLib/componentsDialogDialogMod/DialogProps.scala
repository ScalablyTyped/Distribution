package typings
package primereactLib.componentsDialogDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogProps extends js.Object {
  var appendTo: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var baseZIndex: js.UndefOr[scala.Double] = js.undefined
  var blockScroll: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined
  var contentStyle: js.UndefOr[js.Object] = js.undefined
  var dismissableMask: js.UndefOr[scala.Boolean] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var maximizable: js.UndefOr[scala.Boolean] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var onShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  var showHeader: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  def onHide(): scala.Unit
}

object DialogProps {
  @scala.inline
  def apply(
    onHide: () => scala.Unit,
    appendTo: stdLib.HTMLElement = null,
    baseZIndex: scala.Int | scala.Double = null,
    blockScroll: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined,
    contentStyle: js.Object = null,
    dismissableMask: js.UndefOr[scala.Boolean] = js.undefined,
    footer: js.Any = null,
    header: js.Any = null,
    id: java.lang.String = null,
    maximizable: js.UndefOr[scala.Boolean] = js.undefined,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    onShow: () => scala.Unit = null,
    rtl: js.UndefOr[scala.Boolean] = js.undefined,
    showHeader: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Object = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): DialogProps = {
    val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(blockScroll)) __obj.updateDynamic("blockScroll")(blockScroll)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (!js.isUndefined(dismissableMask)) __obj.updateDynamic("dismissableMask")(dismissableMask)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (header != null) __obj.updateDynamic("header")(header)
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

