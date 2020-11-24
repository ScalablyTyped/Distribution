package typings.sinonjsFakeTimers.mod

import org.scalablytyped.runtime.Instantiable1
import typings.std.DateConstructor
import typings.std.global.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalTimers[TTimerId /* <: TimerId */] extends js.Object {
  
  /**
    * Implements the Date object but using this clock to provide the correct time.
    */
  def Date(): String = js.native
  /**
    * Implements the Date object but using this clock to provide the correct time.
    */
  @JSName("Date")
  var Date_Original: DateConstructor with (Instantiable1[/* value */ Double, Date]) = js.native
  
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
