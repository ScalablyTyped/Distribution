package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventWrapperProps[T /* <: Event */] extends js.Object {
  var accessors: reactDashBigDashCalendarLib.Anon_End[T]
  var className: java.lang.String
  var continuesEarlier: scala.Boolean
  var continuesLater: scala.Boolean
  var event: T
  var getters: reactDashBigDashCalendarLib.Anon_DayProp[T]
  var isRtl: scala.Boolean
  var label: java.lang.String
  var selected: scala.Boolean
  // https://github.com/intljusticemission/react-big-calendar/blob/27a2656b40ac8729634d24376dff8ea781a66d50/src/TimeGridEvent.js#L28
  var style: js.UndefOr[
    reactLib.reactMod.ReactNs.CSSProperties with reactDashBigDashCalendarLib.Anon_XOffset
  ] = js.undefined
  def onClick(e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]): scala.Unit
  def onDoubleClick(e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]): scala.Unit
}

