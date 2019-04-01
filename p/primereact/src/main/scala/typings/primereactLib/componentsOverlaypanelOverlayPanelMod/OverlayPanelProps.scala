package typings
package primereactLib.componentsOverlaypanelOverlayPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayPanelProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dismissable: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var onHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var showCloseIcon: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object OverlayPanelProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    className: java.lang.String = null,
    dismissable: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    onHide: () => scala.Unit = null,
    showCloseIcon: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Object = null
  ): OverlayPanelProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(dismissable)) __obj.updateDynamic("dismissable")(dismissable)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (!js.isUndefined(showCloseIcon)) __obj.updateDynamic("showCloseIcon")(showCloseIcon)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[OverlayPanelProps]
  }
}

