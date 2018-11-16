package typings
package reactDashNativeDashBackgroundDashTimerLib.reactDashNativeDashBackgroundDashTimerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ You can declare properties of the module using const, let, or var */
@js.native
trait BackgroundTimer extends js.Object {
  def backgroundClockMethod(callback: js.Function0[scala.Unit], delay: scala.Double): scala.Unit = js.native
  def clearInterval(intervalId: IntervalId): scala.Unit = js.native
  def clearTimeout(timeoutId: TimeoutId): scala.Unit = js.native
  def runBackgroundTimer(callback: js.Function0[scala.Unit], delay: scala.Double): scala.Unit = js.native
  def setInterval(callback: js.Function0[scala.Unit], timeout: scala.Double): IntervalId = js.native
  def setTimeout(callback: js.Function0[scala.Unit], timeout: scala.Double): TimeoutId = js.native
  def start(): js.Any = js.native
  def start(delay: scala.Double): js.Any = js.native
  def stop(): scala.Unit = js.native
  def stopBackgroundTimer(): scala.Unit = js.native
}

