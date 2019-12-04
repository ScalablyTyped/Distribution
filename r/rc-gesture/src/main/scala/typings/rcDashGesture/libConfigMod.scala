package typings.rcDashGesture

import typings.rcDashGesture.rcDashGestureNumbers.`16`
import typings.rcDashGesture.rcDashGestureNumbers.`1`
import typings.rcDashGesture.rcDashGestureNumbers.`2`
import typings.rcDashGesture.rcDashGestureNumbers.`4`
import typings.rcDashGesture.rcDashGestureNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-gesture/lib/config", JSImport.Namespace)
@js.native
object libConfigMod extends js.Object {
  val DIRECTION_ALL: Double = js.native
  val DIRECTION_DOWN: `16` = js.native
  val DIRECTION_HORIZONTAL: Double = js.native
  val DIRECTION_LEFT: `2` = js.native
  val DIRECTION_NONE: `1` = js.native
  val DIRECTION_RIGHT: `4` = js.native
  val DIRECTION_UP: `8` = js.native
  val DIRECTION_VERTICAL: Double = js.native
  @js.native
  object PRESS extends js.Object {
    var time: Double = js.native
  }
  
  @js.native
  object SWIPE extends js.Object {
    var threshold: Double = js.native
    var velocity: Double = js.native
  }
  
}

