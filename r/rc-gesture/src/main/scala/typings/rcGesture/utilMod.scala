package typings.rcGesture

import typings.rcGesture.rcGestureNumbers.`16`
import typings.rcGesture.rcGestureNumbers.`1`
import typings.rcGesture.rcGestureNumbers.`2`
import typings.rcGesture.rcGestureNumbers.`4`
import typings.rcGesture.rcGestureNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-gesture/lib/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def calcMoveStatus(startTouches: js.Any, touches: js.Any, time: js.Any): AnonAngleTime = js.native
  def calcMutliFingerStatus(touches: js.Any): js.UndefOr[AnonAngle] = js.native
  def calcRotation(startMutliFingerStatus: js.Any, mutliFingerStatus: js.Any): Double = js.native
  def getDirection(x: js.Any, y: js.Any): `1` | `2` | `4` | `8` | `16` = js.native
  def getDirectionEventName(direction: js.Any): js.Any = js.native
  def getEventName(prefix: js.Any, status: js.Any): js.Any = js.native
  def getMovingDirection(point1: js.Any, point2: js.Any): `1` | `2` | `4` | `8` | `16` = js.native
  def now(): Double = js.native
  def shouldTriggerDirection(direction: js.Any, directionSetting: js.Any): Boolean = js.native
  def shouldTriggerSwipe(delta: js.Any, velocity: js.Any): Boolean = js.native
}

