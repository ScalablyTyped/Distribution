package typings.sinonjsFakeTimers.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FakeClock[TTimerId /* <: TimerId */] extends GlobalTimers[TTimerId] {
  
  /**
    * Cancel animation frame request.
    *
    * @param id   The id returned from requestAnimationFrame method.
    */
  def cancelAnimationFrame(id: TTimerId): Unit = js.native
  
  /**
    * Clears a timer, as long as it was created using requestIdleCallback.
    *
    * @param id   Timer ID or object.
    */
  def cancelIdleCallback(id: TTimerId): Unit = js.native
  
  /**
    * Get the number of waiting timers.
    *
    * @returns number of waiting timers.
    */
  def countTimers(): Double = js.native
  
  /**
    * Maximum number of timers that will be run when calling runAll().
    */
  var loopLimit: Double = js.native
  
  /**
    * Advances the clock to the the moment of the first scheduled timer, firing it.
    * @returns Fake milliseconds since the unix epoch.
    */
  def next(): Double = js.native
  
  /**
    * Advances the clock to the the moment of the first scheduled timer, firing it.
    *
    * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
    * @returns Fake milliseconds since the unix epoch.
    */
  def nextAsync(): js.Promise[Double] = js.native
  
  /**
    * Current clock time.
    */
  var now: Double = js.native
  
  /**
    * Schedule callback to run in the next animation frame.
    *
    * @param callback   Callback to be fired.
    * @returns Request id.
    */
  def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): TTimerId = js.native
  
  /**
    * Queues the callback to be fired during idle periods to perform background and low priority work on the main event loop.
    *
    * @param callback   Callback to be fired.
    * @param timeout   The maximum number of ticks before the callback must be fired.
    * @remarks Callbacks which have a timeout option will be fired no later than time in milliseconds.
    */
  def requestIdleCallback(callback: js.Function0[Unit]): TTimerId = js.native
  def requestIdleCallback(callback: js.Function0[Unit], timeout: Double): TTimerId = js.native
  
  /**
    * Removes all timers and tick without firing them and restore now to its original value.
    */
  def reset(): Unit = js.native
  
  /**
    * Runs all pending timers until there are none remaining.
    *
    * @remarks  If new timers are added while it is executing they will be run as well.
    * @returns Fake milliseconds since the unix epoch.
    */
  def runAll(): Double = js.native
  
  /**
    * Runs all pending timers until there are none remaining.
    *
    * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
    *
    * @remarks  If new timers are added while it is executing they will be run as well.
    * @returns Fake milliseconds since the unix epoch.
    */
  def runAllAsync(): js.Promise[Double] = js.native
  
  /**
    * Advanced the clock to the next animation frame while firing all scheduled callbacks.
    * @returns Fake milliseconds since the unix epoch.
    */
  def runToFrame(): Double = js.native
  
  /**
    * Takes note of the last scheduled timer when it is run, and advances the clock to
    * that time firing callbacks as necessary.
    * @returns Fake milliseconds since the unix epoch.
    */
  def runToLast(): Double = js.native
  
  /**
    * Takes note of the last scheduled timer when it is run, and advances the clock to
    * that time firing callbacks as necessary.
    *
    * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
    * @returns Fake milliseconds since the unix epoch.
    */
  def runToLastAsync(): js.Promise[Double] = js.native
  
  /**
    * Simulates a user changing the system clock.
    *
    * @param now   New system time.
    * @remarks This affects the current time but it does not in itself cause timers to fire.
    */
  def setSystemTime(): Unit = js.native
  def setSystemTime(now: Double): Unit = js.native
  def setSystemTime(now: Date): Unit = js.native
  
  def tick(time: String): Double = js.native
  /**
    * Advance the clock, firing callbacks if necessary.
    *
    * @param time   How many ticks to advance by.
    * @returns Fake milliseconds since the unix epoch.
    */
  def tick(time: Double): Double = js.native
  
  def tickAsync(time: String): js.Promise[Double] = js.native
  /**
    * Advance the clock, firing callbacks if necessary.
    *
    * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
    *
    * @param time   How many ticks to advance by.
    * @returns Fake milliseconds since the unix epoch.
    */
  def tickAsync(time: Double): js.Promise[Double] = js.native
}
