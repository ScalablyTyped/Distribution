package typings.rcGesture

import typings.rcGesture.anon.Angle
import typings.rcGesture.anon.Time
import typings.rcGesture.rcGestureNumbers.`16`
import typings.rcGesture.rcGestureNumbers.`1`
import typings.rcGesture.rcGestureNumbers.`2`
import typings.rcGesture.rcGestureNumbers.`4`
import typings.rcGesture.rcGestureNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rc-gesture/lib/util", "calcMoveStatus")
  @js.native
  def calcMoveStatus(startTouches: js.Any, touches: js.Any, time: js.Any): Time = js.native
  
  @JSImport("rc-gesture/lib/util", "calcMutliFingerStatus")
  @js.native
  def calcMutliFingerStatus(touches: js.Any): js.UndefOr[Angle] = js.native
  
  @JSImport("rc-gesture/lib/util", "calcRotation")
  @js.native
  def calcRotation(startMutliFingerStatus: js.Any, mutliFingerStatus: js.Any): Double = js.native
  
  @JSImport("rc-gesture/lib/util", "getDirection")
  @js.native
  def getDirection(x: js.Any, y: js.Any): `1` | `2` | `4` | `8` | `16` = js.native
  
  @JSImport("rc-gesture/lib/util", "getDirectionEventName")
  @js.native
  def getDirectionEventName(direction: js.Any): js.Any = js.native
  
  @JSImport("rc-gesture/lib/util", "getEventName")
  @js.native
  def getEventName(prefix: js.Any, status: js.Any): js.Any = js.native
  
  @JSImport("rc-gesture/lib/util", "getMovingDirection")
  @js.native
  def getMovingDirection(point1: js.Any, point2: js.Any): `1` | `2` | `4` | `8` | `16` = js.native
  
  @JSImport("rc-gesture/lib/util", "now")
  @js.native
  def now(): Double = js.native
  
  @JSImport("rc-gesture/lib/util", "shouldTriggerDirection")
  @js.native
  def shouldTriggerDirection(direction: js.Any, directionSetting: js.Any): Boolean = js.native
  
  @JSImport("rc-gesture/lib/util", "shouldTriggerSwipe")
  @js.native
  def shouldTriggerSwipe(delta: js.Any, velocity: js.Any): Boolean = js.native
}
