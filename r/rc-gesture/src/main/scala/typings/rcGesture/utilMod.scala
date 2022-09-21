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
  
  inline def calcMoveStatus(startTouches: Any, touches: Any, time: Any): Time = (^.asInstanceOf[js.Dynamic].applyDynamic("calcMoveStatus")(startTouches.asInstanceOf[js.Any], touches.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Time]
  
  inline def calcMutliFingerStatus(touches: Any): js.UndefOr[Angle] = ^.asInstanceOf[js.Dynamic].applyDynamic("calcMutliFingerStatus")(touches.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Angle]]
  
  inline def calcRotation(startMutliFingerStatus: Any, mutliFingerStatus: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcRotation")(startMutliFingerStatus.asInstanceOf[js.Any], mutliFingerStatus.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDirection(x: Any, y: Any): `1` | `2` | `4` | `8` | `16` = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirection")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[`1` | `2` | `4` | `8` | `16`]
  
  inline def getDirectionEventName(direction: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectionEventName")(direction.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getEventName(prefix: Any, status: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventName")(prefix.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getMovingDirection(point1: Any, point2: Any): `1` | `2` | `4` | `8` | `16` = (^.asInstanceOf[js.Dynamic].applyDynamic("getMovingDirection")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[`1` | `2` | `4` | `8` | `16`]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def shouldTriggerDirection(direction: Any, directionSetting: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldTriggerDirection")(direction.asInstanceOf[js.Any], directionSetting.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shouldTriggerSwipe(delta: Any, velocity: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldTriggerSwipe")(delta.asInstanceOf[js.Any], velocity.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
