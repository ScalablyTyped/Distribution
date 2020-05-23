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
trait Timer extends js.Object {
  /**
    * _Whether the timer should repeat._
    *
    * A repeating timer will keep firing until it is invalidated. In contrast to non-repeating timers, repeating timers are not automatically invalidated. Defaults to false.
    * @see https://docs.scriptable.app/timer/#repeats
    */
  var repeats: Boolean
  /**
    * _The frequency at which the timer fires, in milliseconds._
    *
    * Be aware that the time interval is specified in setting. Defaults to 0, causing the timer to fire instantly.
    * @see https://docs.scriptable.app/timer/#timeinterval
    */
  var timeInterval: Double
  /**
    * _Stops the timer from firing._
    *
    * Stops the timer from firing ever again. Non-repeating timers are automatically invalidated after they have fired once. Repeating timers must be manually invalidated.
    * @see https://docs.scriptable.app/timer/#-invalidate
    */
  def invalidate(): Unit
  /**
    * _Schedules the timer._
    *
    * Schedules the timer using its configuration. The supplied function is called when the timer fires. To stop the timer from firing, call the `invalidate()` function.
    * @param callback - The callback to called when the timer fires.
    * @see https://docs.scriptable.app/timer/#-schedule
    */
  def schedule(callback: js.Function0[Unit]): Unit
}

object Timer {
  @scala.inline
  def apply(
    invalidate: () => Unit,
    repeats: Boolean,
    schedule: js.Function0[Unit] => Unit,
    timeInterval: Double
  ): Timer = {
    val __obj = js.Dynamic.literal(invalidate = js.Any.fromFunction0(invalidate), repeats = repeats.asInstanceOf[js.Any], schedule = js.Any.fromFunction1(schedule), timeInterval = timeInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timer]
  }
}

