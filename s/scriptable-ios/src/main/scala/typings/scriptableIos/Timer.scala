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
@js.native
trait Timer extends js.Object {
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
  @scala.inline
  implicit class TimerOps[Self <: Timer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInvalidate(value: () => Unit): Self = this.set("invalidate", js.Any.fromFunction0(value))
    @scala.inline
    def setRepeats(value: Boolean): Self = this.set("repeats", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchedule(value: js.Function0[Unit] => Unit): Self = this.set("schedule", js.Any.fromFunction1(value))
    @scala.inline
    def setTimeInterval(value: Double): Self = this.set("timeInterval", value.asInstanceOf[js.Any])
  }
  
}

