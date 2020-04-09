package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _A timer that fires after a time interval have elapsed._
  *
  * Constructs a timer that fires after a specified time interval.
  * @see https://docs.scriptable.app/timer/#-new-timer
  */
@JSGlobal("Timer")
@js.native
/**
  * _A timer that fires after a time interval have elapsed._
  *
  * Constructs a timer that fires after a specified time interval.
  * @see https://docs.scriptable.app/timer/#-new-timer
  */
class Timer () extends js.Object {
  /**
    * _Whether the timer should repeat._
    *
    * A repeating timer will keep firing until it is invalidated. In contrast to non-repeating timers, repeating timers are not automatically invalidated. Defaults to false.
    * @see https://docs.scriptable.app/timer/#repeats
    */
  var repeats: Boolean = js.native
  /**
    * _The frequency at which the timer fires, in milliseconds._
    *
    * Be aware that the time interval is specified in setting. Defaults to 0, causing the timer to fire instantly.
    * @see https://docs.scriptable.app/timer/#timeinterval
    */
  var timeInterval: Double = js.native
  /**
    * _Stops the timer from firing._
    *
    * Stops the timer from firing ever again. Non-repeating timers are automatically invalidated after they have fired once. Repeating timers must be manually invalidated.
    * @see https://docs.scriptable.app/timer/#-invalidate
    */
  def invalidate(): Unit = js.native
  /**
    * _Schedules the timer._
    *
    * Schedules the timer using its configuration. The supplied function is called when the timer fires. To stop the timer from firing, call the `invalidate()` function.
    * @param callback - The callback to called when the timer fires.
    * @see https://docs.scriptable.app/timer/#-schedule
    */
  def schedule(callback: js.Function0[Unit]): Unit = js.native
}

/* static members */
@JSGlobal("Timer")
@js.native
object Timer extends js.Object {
  /**
    * _Schedules a timer._
    *
    * This is a convenience function for creating a new timer. The created timer is instantly scheduled and will fire after the specified time interval.
    * @param timeInterval - The time interval to fire the timer at.
    * @param repeats - Whether the timer should repeat or not.
    * @param callback - The callback to called when the timer fires.
    * @see https://docs.scriptable.app/timer/#schedule
    */
  def schedule(timeInterval: Double, repeats: Boolean, callback: js.Function0[Unit]): Timer = js.native
}

