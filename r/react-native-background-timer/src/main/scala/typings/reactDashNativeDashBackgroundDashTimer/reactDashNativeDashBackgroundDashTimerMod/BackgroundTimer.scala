package typings.reactDashNativeDashBackgroundDashTimer.reactDashNativeDashBackgroundDashTimerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ You can declare properties of the module using const, let, or var */
@js.native
trait BackgroundTimer extends js.Object {
  def backgroundClockMethod(callback: js.Function0[Unit], delay: Double): Unit = js.native
  def clearInterval(intervalId: IntervalId): Unit = js.native
  def clearTimeout(timeoutId: TimeoutId): Unit = js.native
  def runBackgroundTimer(callback: js.Function0[Unit], delay: Double): Unit = js.native
  def setInterval(callback: js.Function0[Unit], timeout: Double): IntervalId = js.native
  def setTimeout(callback: js.Function0[Unit], timeout: Double): TimeoutId = js.native
  def start(): js.Any = js.native
  def start(delay: Double): js.Any = js.native
  def stop(): Unit = js.native
  def stopBackgroundTimer(): Unit = js.native
}

