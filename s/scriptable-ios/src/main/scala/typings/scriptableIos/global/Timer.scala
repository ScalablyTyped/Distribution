package typings.scriptableIos.global

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
class Timer ()
  extends typings.scriptableIos.Timer

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
  def schedule(timeInterval: Double, repeats: Boolean, callback: js.Function0[Unit]): typings.scriptableIos.Timer = js.native
}

