package typings
package reactDashBigDashCalendarLib.libAddonsDragAndDropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait withDragAndDropProps[TEvent] extends js.Object {
  var onEventDrop: js.UndefOr[
    js.Function1[/* args */ reactDashBigDashCalendarLib.Anon_AllDay[TEvent], scala.Unit]
  ] = js.undefined
  var onEventResize: js.UndefOr[
    js.Function1[/* args */ reactDashBigDashCalendarLib.Anon_AllDay[TEvent], scala.Unit]
  ] = js.undefined
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
}

object withDragAndDropProps {
  @scala.inline
  def apply[TEvent](
    onEventDrop: /* args */ reactDashBigDashCalendarLib.Anon_AllDay[TEvent] => scala.Unit = null,
    onEventResize: /* args */ reactDashBigDashCalendarLib.Anon_AllDay[TEvent] => scala.Unit = null,
    resizable: js.UndefOr[scala.Boolean] = js.undefined
  ): withDragAndDropProps[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (onEventDrop != null) __obj.updateDynamic("onEventDrop")(js.Any.fromFunction1(onEventDrop))
    if (onEventResize != null) __obj.updateDynamic("onEventResize")(js.Any.fromFunction1(onEventResize))
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    __obj.asInstanceOf[withDragAndDropProps[TEvent]]
  }
}

