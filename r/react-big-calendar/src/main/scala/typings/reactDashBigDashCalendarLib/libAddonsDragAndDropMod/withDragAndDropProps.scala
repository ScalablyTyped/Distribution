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

