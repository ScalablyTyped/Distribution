package typings.rcDashGesture.rcDashGestureMod

import typings.rcDashGesture.Anon_AvailablePan
import typings.rcDashGesture.rcDashGestureStrings.`pan-x pan-y`
import typings.rcDashGesture.rcDashGestureStrings.`pan-x`
import typings.rcDashGesture.rcDashGestureStrings.`pan-y`
import typings.rcDashGesture.rcDashGestureStrings.auto
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gesture
  extends Component[IGesture, js.Any, js.Any] {
  var directionSetting: js.Any = js.native
  var event: js.Any = js.native
  var gesture: IGestureStatus = js.native
  var pressTimer: js.Any = js.native
  def _handleTouchCancel(e: js.Any): Unit = js.native
  def _handleTouchEnd(e: js.Any): Unit = js.native
  def _handleTouchMove(e: js.Any): Unit = js.native
  def _handleTouchStart(e: js.Any): Unit = js.native
  def allowGesture(): Boolean = js.native
  def checkIfMultiTouchEnd(status: js.Any): Unit = js.native
  def checkIfMultiTouchMove(): Unit = js.native
  def checkIfMultiTouchStart(): Unit = js.native
  def checkIfSingleTouchMove(): Unit = js.native
  def cleanGestureState(): Unit = js.native
  def cleanPressTimer(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MGesture(): Unit = js.native
  def doSingleTouchEnd(status: js.Any): Unit = js.native
  def getGestureState(): Anon_AvailablePan = js.native
  def getTouchAction(): auto | (`pan-x pan-y`) | `pan-x` | `pan-y` = js.native
  def getTouches(e: js.Any): js.Any = js.native
  def initGestureStatus(e: js.Any): Unit = js.native
  def initPressTimer(): Unit = js.native
  def setGestureState(params: js.Any): Unit = js.native
  def triggerAllowEvent(`type`: js.Any, status: js.Any): Unit = js.native
  def triggerCombineEvent(mainEventName: js.Any, eventStatus: js.Any, args: js.Any*): Unit = js.native
  def triggerEvent(name: js.Any, args: js.Any*): Unit = js.native
  def triggerPinchEvent(mainEventName: js.Any, eventStatus: js.Any, args: js.Any*): Unit = js.native
  def triggerSubEvent(mainEventName: js.Any, eventStatus: js.Any, args: js.Any*): Unit = js.native
  def triggerUserCb(status: js.Any, e: js.Any): Unit = js.native
  def updateGestureStatus(e: js.Any): Unit = js.native
}

