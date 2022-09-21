package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _A timer that fires after a time interval has elapsed._
  *
  * Constructs a timer that fires after a specified time interval.
  * @see https://docs.scriptable.app/timer/#-new-timer
  */
@JSGlobal("Timer")
@js.native
/**
  * _A timer that fires after a time interval has elapsed._
  *
  * Constructs a timer that fires after a specified time interval.
  * @see https://docs.scriptable.app/timer/#-new-timer
  */
open class Timer ()
  extends StObject
     with typings.scriptableIos.Timer {
  
  /**
    * _Stops the timer from firing._
    *
    * Stops the timer from firing ever again. Non-repeating timers are automatically invalidated after they have fired once. Repeating timers must be manually invalidated.
    * @see https://docs.scriptable.app/timer/#-invalidate
    */
  /* CompleteClass */
  override def invalidate(): Unit = js.native
  
  /**
    * _Whether the timer should repeat._
    *
    * A repeating timer will keep firing until it is invalidated. In contrast to non-repeating timers, repeating timers are not automatically invalidated. Defaults to false.
    * @see https://docs.scriptable.app/timer/#repeats
    */
  /* CompleteClass */
  var repeats: Boolean = js.native
  
  /**
    * _Schedules the timer._
    *
    * Schedules the timer using its configuration. The supplied function is called when the timer fires. To stop the timer from firing, call the `invalidate()` function.
    * @param callback - The callback to be called when the timer fires.
    * @see https://docs.scriptable.app/timer/#-schedule
    */
  /* CompleteClass */
  override def schedule(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * _The frequency at which the timer fires, in milliseconds._
    *
    * Be aware that the time interval is specified in setting. Defaults to 0, causing the timer to fire instantly.
    * @see https://docs.scriptable.app/timer/#timeinterval
    */
  /* CompleteClass */
  var timeInterval: Double = js.native
}
object Timer {
  
  @JSGlobal("Timer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Schedules a timer._
    *
    * This is a convenience function for creating a new timer. The created timer is instantly scheduled and will fire after the specified time interval.
    * @param timeInterval - The time interval to fire the timer at.
    * @param repeats - Whether the timer should repeat or not.
    * @param callback - The callback to be called when the timer fires.
    * @see https://docs.scriptable.app/timer/#schedule
    */
  /* static member */
  inline def schedule(timeInterval: Double, repeats: Boolean, callback: js.Function0[Unit]): typings.scriptableIos.Timer = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(timeInterval.asInstanceOf[js.Any], repeats.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.scriptableIos.Timer]
}
