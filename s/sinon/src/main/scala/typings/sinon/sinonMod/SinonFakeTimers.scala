package typings.sinon.sinonMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonFakeTimers extends js.Object {
  var loopLimit: Double = js.native
  var now: Double = js.native
  def Date(): typings.std.Date = js.native
  def Date(year: Double): typings.std.Date = js.native
  def Date(year: Double, month: Double): typings.std.Date = js.native
  def Date(year: Double, month: Double, day: Double): typings.std.Date = js.native
  def Date(year: Double, month: Double, day: Double, hour: Double): typings.std.Date = js.native
  def Date(year: Double, month: Double, day: Double, hour: Double, minute: Double): typings.std.Date = js.native
  def Date(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double): typings.std.Date = js.native
  def Date(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double, ms: Double): typings.std.Date = js.native
  def cancelAnimationFrame(id: SinonTimerId): Unit = js.native
  def cancelIdleCallback(timerId: SinonTimerId): Unit = js.native
  def clearImmediate(id: SinonTimerId): Unit = js.native
  def clearInterval(id: SinonTimerId): Unit = js.native
  def clearTimeout(id: SinonTimerId): Unit = js.native
  def countTimers(): Double = js.native
  /**
    * Advances the clock to the the moment of the first scheduled timer, firing it.
    */
  def next(): Double = js.native
  def nextTick(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Unit = js.native
  def queueMicrotask(callback: js.Function0[Unit]): Unit = js.native
  def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): SinonTimerId = js.native
  def requestIdleCallback(func: js.Function1[/* repeated */ js.Any, Unit]): SinonTimerId = js.native
  def requestIdleCallback(func: js.Function1[/* repeated */ js.Any, Unit], timeout: Double, args: js.Any*): SinonTimerId = js.native
  def reset(): Unit = js.native
  /**
    * Restore the faked methods.
    * Call in e.g. tearDown.
    */
  def restore(): Unit = js.native
  /**
    * This runs all pending timers until there are none remaining. If new timers are added while it is executing they will be run as well.
    * This makes it easier to run asynchronous tests to completion without worrying about the number of timers they use, or the delays in those timers.
    */
  def runAll(): Double = js.native
  def runMicrotasks(): Unit = js.native
  def runToFrame(): Double = js.native
  def runToLast(): Double = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): SinonTimerId = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], timeout: Double, args: js.Any*): SinonTimerId = js.native
  /**
    * Simulate the user changing the system clock while your program is running. It changes the 'now' timestamp
    * without affecting timers, intervals or immediates.
    * @param now The new 'now' as a JavaScript Date
    */
  def setSystemTime(date: Date): Unit = js.native
  /**
    * Simulate the user changing the system clock while your program is running. It changes the 'now' timestamp
    * without affecting timers, intervals or immediates.
    * @param now The new 'now' in unix milliseconds
    */
  def setSystemTime(now: Double): Unit = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], timeout: Double, args: js.Any*): SinonTimerId = js.native
  def tick(ms: String): Double = js.native
  /**
    * Tick the clock ahead time milliseconds.
    * Causes all timers scheduled within the affected time range to be called.
    * time may be the number of milliseconds to advance the clock by or a human-readable string.
    * Valid string formats are “08” for eight seconds, “01:00” for one minute and “02:34:10” for two hours, 34 minutes and ten seconds.
    * time may be negative, which causes the clock to change but won’t fire any callbacks.
    * @param ms
    */
  def tick(ms: Double): Double = js.native
  def uninstall(): Unit = js.native
}

