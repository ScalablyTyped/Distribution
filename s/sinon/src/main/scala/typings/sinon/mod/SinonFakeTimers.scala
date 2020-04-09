package typings.sinon.mod

import typings.sinonjsFakeTimers.AnonNow
import typings.sinonjsFakeTimers.mod.FakeMethod
import typings.sinonjsFakeTimers.mod.NodeTimer
import typings.std.Date
import typings.std.DateConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @sinonjs/fake-timers.@sinonjs/fake-timers.InstalledMethods & @sinonjs/fake-timers.@sinonjs/fake-timers.NodeClock & @sinonjs/fake-timers.@sinonjs/fake-timers.BrowserClock & {restore (): void} */
@js.native
trait SinonFakeTimers extends js.Object {
  /**
    * Implements the Date object but using this clock to provide the correct time.
    */
  @JSName("Date")
  var Date_Original: DateConstructor = js.native
  /**
    * Maximum number of timers that will be run when calling runAll().
    */
  var loopLimit: Double = js.native
  var methods: js.Array[FakeMethod] = js.native
  /**
    * Current clock time.
    */
  var now: Double = js.native
  /**
    * Mimics performance.now().
    */
  var performance: AnonNow = js.native
  /**
    * Implements the Date object but using this clock to provide the correct time.
    */
  def Date(): String = js.native
  /**
    * Cancel animation frame request.
    *
    * @param id   The id returned from requestAnimationFrame method.
    */
  def cancelAnimationFrame(id: Double): Unit = js.native
  /**
    * Cancel animation frame request.
    *
    * @param id   The id returned from requestAnimationFrame method.
    */
  def cancelAnimationFrame(id: NodeTimer): Unit = js.native
  /**
    * Clears a timer, as long as it was created using requestIdleCallback.
    *
    * @param id   Timer ID or object.
    */
  def cancelIdleCallback(id: Double): Unit = js.native
  /**
    * Clears a timer, as long as it was created using requestIdleCallback.
    *
    * @param id   Timer ID or object.
    */
  def cancelIdleCallback(id: NodeTimer): Unit = js.native
  /**
    * Clears a timer, as long as it was created using setImmediate.
    *
    * @param id   Timer ID or object.
    */
  def clearImmediate(id: Double): Unit = js.native
  /**
    * Clears a timer, as long as it was created using setImmediate.
    *
    * @param id   Timer ID or object.
    */
  def clearImmediate(id: NodeTimer): Unit = js.native
  /**
    * Clears a timer, as long as it was created using setInterval.
    *
    * @param id   Timer ID or object.
    */
  def clearInterval(id: Double): Unit = js.native
  /**
    * Clears a timer, as long as it was created using setInterval.
    *
    * @param id   Timer ID or object.
    */
  def clearInterval(id: NodeTimer): Unit = js.native
  /**
    * Clears a timer, as long as it was created using setTimeout.
    *
    * @param id   Timer ID or object.
    */
  def clearTimeout(id: Double): Unit = js.native
  /**
    * Clears a timer, as long as it was created using setTimeout.
    *
    * @param id   Timer ID or object.
    */
  def clearTimeout(id: NodeTimer): Unit = js.native
  /**
    * Get the number of waiting timers.
    *
    * @returns number of waiting timers.
    */
  def countTimers(): Double = js.native
  /**
    * Mimicks process.hrtime().
    *
    * @param prevTime   Previous system time to calculate time elapsed.
    * @returns High resolution real time as [seconds, nanoseconds].
    */
  def hrtime(): js.Tuple2[Double, Double] = js.native
  def hrtime(prevTime: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
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
    * Simulates process.nextTick().
    */
  def nextTick(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Unit = js.native
  /**
    * Mimics process.nextTick() explicitly dropping additional arguments.
    */
  def queueMicrotask(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Schedule callback to run in the next animation frame.
    *
    * @param callback   Callback to be fired.
    * @returns Request id.
    */
  def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): Double = js.native
  /**
    * Schedule callback to run in the next animation frame.
    *
    * @param callback   Callback to be fired.
    * @returns Request id.
    */
  @JSName("requestAnimationFrame")
  def requestAnimationFrame_NodeTimer(callback: js.Function1[/* time */ Double, Unit]): NodeTimer = js.native
  /**
    * Queues the callback to be fired during idle periods to perform background and low priority work on the main event loop.
    *
    * @param callback   Callback to be fired.
    * @param timeout   The maximum number of ticks before the callback must be fired.
    * @remarks Callbacks which have a timeout option will be fired no later than time in milliseconds.
    */
  def requestIdleCallback(callback: js.Function0[Unit]): Double = js.native
  def requestIdleCallback(callback: js.Function0[Unit], timeout: Double): Double = js.native
  /**
    * Queues the callback to be fired during idle periods to perform background and low priority work on the main event loop.
    *
    * @param callback   Callback to be fired.
    * @param timeout   The maximum number of ticks before the callback must be fired.
    * @remarks Callbacks which have a timeout option will be fired no later than time in milliseconds.
    */
  @JSName("requestIdleCallback")
  def requestIdleCallback_NodeTimer(callback: js.Function0[Unit]): NodeTimer = js.native
  @JSName("requestIdleCallback")
  def requestIdleCallback_NodeTimer(callback: js.Function0[Unit], timeout: Double): NodeTimer = js.native
  /**
    * Removes all timers and tick without firing them and restore now to its original value.
    */
  def reset(): Unit = js.native
  /**
    * Restore the faked methods.
    * Call in e.g. tearDown.
    */
  def restore(): Unit = js.native
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
    * Run all pending microtasks scheduled with nextTick.
    */
  def runMicrotasks(): Unit = js.native
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
    * Schedules the callback to be fired once 0 milliseconds have ticked by.
    *
    * @param callback   Callback to be fired.
    * @param args   Any extra arguments to pass to the callback.
    * @remarks You'll still have to call clock.tick() for the callback to fire.
    * @remarks If called during a tick the callback won't fire until 1 millisecond has ticked by.
    */
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Double = js.native
  /**
    * Schedules the callback to be fired once 0 milliseconds have ticked by.
    *
    * @param callback   Callback to be fired.
    * @param args   Any extra arguments to pass to the callback.
    * @remarks You'll still have to call clock.tick() for the callback to fire.
    * @remarks If called during a tick the callback won't fire until 1 millisecond has ticked by.
    */
  @JSName("setImmediate")
  def setImmediate_NodeTimer(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): NodeTimer = js.native
  /**
    * Schedules a callback to be fired every time timeout milliseconds have ticked by.
    *
    * @param callback   Callback to be fired.
    * @param timeout   How many ticks to wait between callbacks.
    * @param args   Any extra arguments to pass to the callback.
    * @returns Time identifier for cancellation.
    */
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], timeout: Double, args: js.Any*): Double = js.native
  /**
    * Schedules a callback to be fired every time timeout milliseconds have ticked by.
    *
    * @param callback   Callback to be fired.
    * @param timeout   How many ticks to wait between callbacks.
    * @param args   Any extra arguments to pass to the callback.
    * @returns Time identifier for cancellation.
    */
  @JSName("setInterval")
  def setInterval_NodeTimer(callback: js.Function1[/* repeated */ js.Any, Unit], timeout: Double, args: js.Any*): NodeTimer = js.native
  /**
    * Simulates a user changing the system clock.
    *
    * @param now   New system time.
    * @remarks This affects the current time but it does not in itself cause timers to fire.
    */
  def setSystemTime(): Unit = js.native
  def setSystemTime(now: Double): Unit = js.native
  def setSystemTime(now: Date): Unit = js.native
  /**
    * Schedules a callback to be fired once timeout milliseconds have ticked by.
    *
    * @param callback   Callback to be fired.
    * @param timeout   How many ticks to wait to run the callback.
    * @param args   Any extra arguments to pass to the callback.
    * @returns Time identifier for cancellation.
    */
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], timeout: Double, args: js.Any*): Double = js.native
  /**
    * Schedules a callback to be fired once timeout milliseconds have ticked by.
    *
    * @param callback   Callback to be fired.
    * @param timeout   How many ticks to wait to run the callback.
    * @param args   Any extra arguments to pass to the callback.
    * @returns Time identifier for cancellation.
    */
  @JSName("setTimeout")
  def setTimeout_NodeTimer(callback: js.Function1[/* repeated */ js.Any, Unit], timeout: Double, args: js.Any*): NodeTimer = js.native
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
  /**
    * Restores the original methods on the context that was passed to FakeTimers.install,
    * or the native timers if no context was given.
    */
  def uninstall(): Unit = js.native
}

