package typings.sinonjsFakeTimers

import org.scalablytyped.runtime.Shortcut
import typings.sinonjsFakeTimers.anon.Now
import typings.std.Date
import typings.std.DateConstructor
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sinonjs/fake-timers", "createClock")
  @js.native
  def createClock(): Clock = js.native
  @JSImport("@sinonjs/fake-timers", "createClock")
  @js.native
  def createClock(now: js.UndefOr[scala.Nothing], loopLimit: Double): Clock = js.native
  @JSImport("@sinonjs/fake-timers", "createClock")
  @js.native
  def createClock(now: Double): Clock = js.native
  @JSImport("@sinonjs/fake-timers", "createClock")
  @js.native
  def createClock(now: Double, loopLimit: Double): Clock = js.native
  @JSImport("@sinonjs/fake-timers", "createClock")
  @js.native
  def createClock(now: Date): Clock = js.native
  @JSImport("@sinonjs/fake-timers", "createClock")
  @js.native
  def createClock(now: Date, loopLimit: Double): Clock = js.native
  
  @JSImport("@sinonjs/fake-timers", "install")
  @js.native
  def install(): InstalledClock = js.native
  @JSImport("@sinonjs/fake-timers", "install")
  @js.native
  def install(opts: FakeTimerInstallOpts): InstalledClock = js.native
  
  object timers extends Shortcut {
    
    @JSImport("@sinonjs/fake-timers", "timers")
    @js.native
    val ^ : GlobalTimers[TimerId] = js.native
    
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sinonjs/fake-timers", "timers.Date")
    @js.native
    class Date ()
      extends typings.std.Date {
      def this(value: String) = this()
      def this(value: Double) = this()
      def this(value: typings.std.Date) = this()
      def this(vd: VarDate) = this()
      def this(year: Double, month: Double) = this()
      def this(year: Double, month: Double, date: Double) = this()
      def this(year: Double, month: Double, date: js.UndefOr[scala.Nothing], hours: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double
      ) = this()
      def this(year: Double, month: Double, date: js.UndefOr[scala.Nothing], hours: Double, minutes: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: js.UndefOr[scala.Nothing], minutes: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: Double,
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
    }
    
    type _To = GlobalTimers[TimerId]
    
    /* This means you don't have to write `^`, but can instead just say `timers.foo` */
    override def _to: GlobalTimers[TimerId] = ^
  }
  
  @JSImport("@sinonjs/fake-timers", "withGlobal")
  @js.native
  def withGlobal(global: js.Object): FakeTimerWithContext = js.native
  
  /* Inlined @sinonjs/fake-timers.@sinonjs/fake-timers.FakeClock<number> & {  performance :{now (): number}} */
  @js.native
  trait BrowserClock extends Clock {
    
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    def Date(): String = js.native
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    @JSName("Date")
    var Date_Original: DateConstructor = js.native
    
    /**
      * Cancel animation frame request.
      *
      * @param id   The id returned from requestAnimationFrame method.
      */
    def cancelAnimationFrame(id: Double): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using requestIdleCallback.
      *
      * @param id   Timer ID or object.
      */
    def cancelIdleCallback(id: Double): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using setImmediate.
      *
      * @param id   Timer ID or object.
      */
    def clearImmediate(id: Double): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using setInterval.
      *
      * @param id   Timer ID or object.
      */
    def clearInterval(id: Double): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using setTimeout.
      *
      * @param id   Timer ID or object.
      */
    def clearTimeout(id: Double): Unit = js.native
    
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
      * Mimics performance.now().
      */
    var performance: Now = js.native
    
    /**
      * Schedule callback to run in the next animation frame.
      *
      * @param callback   Callback to be fired.
      * @returns Request id.
      */
    def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): Double = js.native
    
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
      * Schedules the callback to be fired once 0 milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param args   Any extra arguments to pass to the callback.
      * @remarks You'll still have to call clock.tick() for the callback to fire.
      * @remarks If called during a tick the callback won't fire until 1 millisecond has ticked by.
      */
    def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Double = js.native
    
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.sinonjsFakeTimers.mod.BrowserClock
    - typings.sinonjsFakeTimers.mod.NodeClock
  */
  trait Clock extends StObject
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.setTimeout
    - typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearTimeout
    - typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.setImmediate
    - typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearImmediate
    - typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.setInterval
    - typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearInterval
    - typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.Date
    - typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.nextTick
    - typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.hrtime
    - typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.requestAnimationFrame
    - typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.cancelAnimationFrame
    - typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.requestIdleCallback
    - typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.cancelIdleCallback
  */
  trait FakeMethod extends StObject
  object FakeMethod {
    
    @scala.inline
    def Date: typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.Date = "Date".asInstanceOf[typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.Date]
    
    @scala.inline
    def cancelAnimationFrame: typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.cancelAnimationFrame = "cancelAnimationFrame".asInstanceOf[typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.cancelAnimationFrame]
    
    @scala.inline
    def cancelIdleCallback: typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.cancelIdleCallback = "cancelIdleCallback".asInstanceOf[typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.cancelIdleCallback]
    
    @scala.inline
    def clearImmediate: typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearImmediate = "clearImmediate".asInstanceOf[typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearImmediate]
    
    @scala.inline
    def clearInterval: typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearInterval = "clearInterval".asInstanceOf[typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearInterval]
    
    @scala.inline
    def clearTimeout: typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearTimeout = "clearTimeout".asInstanceOf[typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearTimeout]
    
    @scala.inline
    def hrtime: typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.hrtime = "hrtime".asInstanceOf[typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.hrtime]
    
    @scala.inline
    def nextTick: typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.nextTick = "nextTick".asInstanceOf[typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.nextTick]
    
    @scala.inline
    def requestAnimationFrame: typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.requestAnimationFrame = "requestAnimationFrame".asInstanceOf[typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.requestAnimationFrame]
    
    @scala.inline
    def requestIdleCallback: typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.requestIdleCallback = "requestIdleCallback".asInstanceOf[typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.requestIdleCallback]
    
    @scala.inline
    def setImmediate: typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.setImmediate = "setImmediate".asInstanceOf[typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.setImmediate]
    
    @scala.inline
    def setInterval: typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.setInterval = "setInterval".asInstanceOf[typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.setInterval]
    
    @scala.inline
    def setTimeout: typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.setTimeout = "setTimeout".asInstanceOf[typings.sinonjsFakeTimers.sinonjsFakeTimersStrings.setTimeout]
  }
  
  @js.native
  trait FakeTimerInstallOpts extends StObject {
    
    /**
      * Relevant only when using with shouldAdvanceTime: true. increment mocked time by advanceTimeDelta ms every advanceTimeDelta ms change
      * in the real system time (default: 20)
      */
    var advanceTimeDelta: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of timers that will be run when calling runAll() (default: 1000)
      */
    var loopLimit: js.UndefOr[Double] = js.native
    
    /**
      * Installs fake timers with the specified unix epoch (default: 0)
      */
    var now: js.UndefOr[Double | Date] = js.native
    
    /**
      * Tells @sinonjs/fake-timers to increment mocked time automatically based on the real system time shift (e.g. the mocked time will be incremented by
      * 20ms for every 20ms change in the real system time) (default: false)
      */
    var shouldAdvanceTime: js.UndefOr[Boolean] = js.native
    
    /**
      * Installs fake timers onto the specified target context (default: global)
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /**
      * An array with explicit function names to hijack. When not set, @sinonjs/fake-timers will automatically fake all methods except nextTick
      * e.g., FakeTimers.install({ toFake: ["setTimeout", "nextTick"]}) will fake only setTimeout and nextTick
      */
    var toFake: js.UndefOr[js.Array[FakeMethod]] = js.native
  }
  object FakeTimerInstallOpts {
    
    @scala.inline
    def apply(): FakeTimerInstallOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FakeTimerInstallOpts]
    }
    
    @scala.inline
    implicit class FakeTimerInstallOptsMutableBuilder[Self <: FakeTimerInstallOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvanceTimeDelta(value: Double): Self = StObject.set(x, "advanceTimeDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvanceTimeDeltaUndefined: Self = StObject.set(x, "advanceTimeDelta", js.undefined)
      
      @scala.inline
      def setLoopLimit(value: Double): Self = StObject.set(x, "loopLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopLimitUndefined: Self = StObject.set(x, "loopLimit", js.undefined)
      
      @scala.inline
      def setNow(value: Double | Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      @scala.inline
      def setShouldAdvanceTime(value: Boolean): Self = StObject.set(x, "shouldAdvanceTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldAdvanceTimeUndefined: Self = StObject.set(x, "shouldAdvanceTime", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setToFake(value: js.Array[FakeMethod]): Self = StObject.set(x, "toFake", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToFakeUndefined: Self = StObject.set(x, "toFake", js.undefined)
      
      @scala.inline
      def setToFakeVarargs(value: FakeMethod*): Self = StObject.set(x, "toFake", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FakeTimerWithContext extends StObject {
    
    def createClock(): Clock = js.native
    def createClock(now: js.UndefOr[scala.Nothing], loopLimit: Double): Clock = js.native
    def createClock(now: Double): Clock = js.native
    def createClock(now: Double, loopLimit: Double): Clock = js.native
    def createClock(now: Date): Clock = js.native
    def createClock(now: Date, loopLimit: Double): Clock = js.native
    
    def install(): InstalledClock = js.native
    def install(opts: FakeTimerInstallOpts): InstalledClock = js.native
    
    var timers: GlobalTimers[TimerId] = js.native
    
    def withGlobal(global: js.Object): FakeTimerWithContext = js.native
  }
  
  @js.native
  trait GlobalTimers[TTimerId /* <: TimerId */] extends StObject {
    
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    def Date(): String = js.native
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    @JSName("Date")
    var Date_Original: DateConstructor = js.native
    
    /**
      * Clears a timer, as long as it was created using setImmediate.
      *
      * @param id   Timer ID or object.
      */
    def clearImmediate(id: TTimerId): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using setInterval.
      *
      * @param id   Timer ID or object.
      */
    def clearInterval(id: TTimerId): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using setTimeout.
      *
      * @param id   Timer ID or object.
      */
    def clearTimeout(id: TTimerId): Unit = js.native
    
    /**
      * Schedules the callback to be fired once 0 milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param args   Any extra arguments to pass to the callback.
      * @remarks You'll still have to call clock.tick() for the callback to fire.
      * @remarks If called during a tick the callback won't fire until 1 millisecond has ticked by.
      */
    def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): TTimerId = js.native
    
    /**
      * Schedules a callback to be fired every time timeout milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param timeout   How many ticks to wait between callbacks.
      * @param args   Any extra arguments to pass to the callback.
      * @returns Time identifier for cancellation.
      */
    def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], timeout: Double, args: js.Any*): TTimerId = js.native
    
    /**
      * Schedules a callback to be fired once timeout milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param timeout   How many ticks to wait to run the callback.
      * @param args   Any extra arguments to pass to the callback.
      * @returns Time identifier for cancellation.
      */
    def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], timeout: Double, args: js.Any*): TTimerId = js.native
  }
  
  type InstalledClock = Clock with InstalledMethods
  
  @js.native
  trait InstalledMethods extends StObject {
    
    var methods: js.Array[FakeMethod] = js.native
    
    /**
      * Restores the original methods on the context that was passed to FakeTimers.install,
      * or the native timers if no context was given.
      */
    def uninstall(): Unit = js.native
  }
  object InstalledMethods {
    
    @scala.inline
    def apply(methods: js.Array[FakeMethod], uninstall: () => Unit): InstalledMethods = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], uninstall = js.Any.fromFunction0(uninstall))
      __obj.asInstanceOf[InstalledMethods]
    }
    
    @scala.inline
    implicit class InstalledMethodsMutableBuilder[Self <: InstalledMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethods(value: js.Array[FakeMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsVarargs(value: FakeMethod*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setUninstall(value: () => Unit): Self = StObject.set(x, "uninstall", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined @sinonjs/fake-timers.@sinonjs/fake-timers.FakeClock<@sinonjs/fake-timers.@sinonjs/fake-timers.NodeTimer> & {hrtime (prevTime : [number, number] | undefined): [number, number], queueMicrotask (callback : (): void): void, nextTick (callback : (args : ...any): void, args : ...any): void, runMicrotasks (): void} */
  @js.native
  trait NodeClock extends Clock {
    
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    def Date(): String = js.native
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    @JSName("Date")
    var Date_Original: DateConstructor = js.native
    
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
    def cancelIdleCallback(id: NodeTimer): Unit = js.native
    
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
    def clearInterval(id: NodeTimer): Unit = js.native
    
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
      * Simulates process.nextTick().
      */
    def nextTick(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Unit = js.native
    
    /**
      * Current clock time.
      */
    var now: Double = js.native
    
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
    def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): NodeTimer = js.native
    
    /**
      * Queues the callback to be fired during idle periods to perform background and low priority work on the main event loop.
      *
      * @param callback   Callback to be fired.
      * @param timeout   The maximum number of ticks before the callback must be fired.
      * @remarks Callbacks which have a timeout option will be fired no later than time in milliseconds.
      */
    def requestIdleCallback(callback: js.Function0[Unit]): NodeTimer = js.native
    def requestIdleCallback(callback: js.Function0[Unit], timeout: Double): NodeTimer = js.native
    
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
    def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): NodeTimer = js.native
    
    /**
      * Schedules a callback to be fired every time timeout milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param timeout   How many ticks to wait between callbacks.
      * @param args   Any extra arguments to pass to the callback.
      * @returns Time identifier for cancellation.
      */
    def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], timeout: Double, args: js.Any*): NodeTimer = js.native
    
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
    def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], timeout: Double, args: js.Any*): NodeTimer = js.native
    
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
  
  @js.native
  trait NodeTimer extends StObject {
    
    /**
      * Stub method call. Does nothing.
      */
    def ref(): Unit = js.native
    
    /**
      * Stub method call. Does nothing.
      */
    def unref(): Unit = js.native
  }
  object NodeTimer {
    
    @scala.inline
    def apply(ref: () => Unit, unref: () => Unit): NodeTimer = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[NodeTimer]
    }
    
    @scala.inline
    implicit class NodeTimerMutableBuilder[Self <: NodeTimer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: () => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnref(value: () => Unit): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
  
  type TimerId = Double | NodeTimer
}
