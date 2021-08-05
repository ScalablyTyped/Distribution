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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rc-gesture/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calcMoveStatus(startTouches: js.Any, touches: js.Any, time: js.Any): Time = (^.asInstanceOf[js.Dynamic].applyDynamic("calcMoveStatus")(startTouches.asInstanceOf[js.Any], touches.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Time]
  
  inline def calcMutliFingerStatus(touches: js.Any): js.UndefOr[Angle] = ^.asInstanceOf[js.Dynamic].applyDynamic("calcMutliFingerStatus")(touches.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Angle]]
  
  inline def calcRotation(startMutliFingerStatus: js.Any, mutliFingerStatus: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcRotation")(startMutliFingerStatus.asInstanceOf[js.Any], mutliFingerStatus.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDirection(x: js.Any, y: js.Any): `1` | `2` | `4` | `8` | `16` = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirection")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[`1` | `2` | `4` | `8` | `16`]
  
  inline def getDirectionEventName(direction: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectionEventName")(direction.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getEventName(prefix: js.Any, status: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventName")(prefix.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getMovingDirection(point1: js.Any, point2: js.Any): `1` | `2` | `4` | `8` | `16` = (^.asInstanceOf[js.Dynamic].applyDynamic("getMovingDirection")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[`1` | `2` | `4` | `8` | `16`]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def shouldTriggerDirection(direction: js.Any, directionSetting: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldTriggerDirection")(direction.asInstanceOf[js.Any], directionSetting.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shouldTriggerSwipe(delta: js.Any, velocity: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldTriggerSwipe")(delta.asInstanceOf[js.Any], velocity.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
