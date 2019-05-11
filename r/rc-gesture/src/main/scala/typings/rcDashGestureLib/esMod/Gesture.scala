package typings
package rcDashGestureLib.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gesture
  extends reactLib.reactMod.Component[IGesture, js.Any, js.Any] {
  var directionSetting: js.Any = js.native
  var event: js.Any = js.native
  var gesture: IGestureStatus = js.native
  var pressTimer: js.Any = js.native
  def _handleTouchCancel(e: js.Any): scala.Unit = js.native
  def _handleTouchEnd(e: js.Any): scala.Unit = js.native
  def _handleTouchMove(e: js.Any): scala.Unit = js.native
  def _handleTouchStart(e: js.Any): scala.Unit = js.native
  def allowGesture(): scala.Boolean = js.native
  def checkIfMultiTouchEnd(status: js.Any): scala.Unit = js.native
  def checkIfMultiTouchMove(): scala.Unit = js.native
  def checkIfMultiTouchStart(): scala.Unit = js.native
  def checkIfSingleTouchMove(): scala.Unit = js.native
  def cleanGestureState(): scala.Unit = js.native
  def cleanPressTimer(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MGesture(): scala.Unit = js.native
  def doSingleTouchEnd(status: js.Any): scala.Unit = js.native
  def getGestureState(): rcDashGestureLib.Anon_AvailablePan = js.native
  def getTouchAction(): rcDashGestureLib.rcDashGestureLibStrings.auto | (rcDashGestureLib.rcDashGestureLibStrings.`pan-x pan-y`) | rcDashGestureLib.rcDashGestureLibStrings.`pan-x` | rcDashGestureLib.rcDashGestureLibStrings.`pan-y` = js.native
  def getTouches(e: js.Any): js.Any = js.native
  def initGestureStatus(e: js.Any): scala.Unit = js.native
  def initPressTimer(): scala.Unit = js.native
  def setGestureState(params: js.Any): scala.Unit = js.native
  def triggerAllowEvent(`type`: js.Any, status: js.Any): scala.Unit = js.native
  def triggerCombineEvent(mainEventName: js.Any, eventStatus: js.Any, args: js.Any*): scala.Unit = js.native
  def triggerEvent(name: js.Any, args: js.Any*): scala.Unit = js.native
  def triggerPinchEvent(mainEventName: js.Any, eventStatus: js.Any, args: js.Any*): scala.Unit = js.native
  def triggerSubEvent(mainEventName: js.Any, eventStatus: js.Any, args: js.Any*): scala.Unit = js.native
  def triggerUserCb(status: js.Any, e: js.Any): scala.Unit = js.native
  def updateGestureStatus(e: js.Any): scala.Unit = js.native
}

