package typings.sipDotJs.libApiEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emitter[T] extends js.Object {
  /**
    * Unregisters a listener.
    * @param listener - Callback function.
    */
  def off(listener: js.Function1[/* data */ T, Unit]): Unit
  /**
    * Registers a listener.
    * @param listener - Callback function.
    */
  def on(listener: js.Function1[/* data */ T, Unit]): Unit
  /**
    * Registers a listener then unregisters the listener after one event emission.
    * @param listener - Callback function.
    */
  def once(listener: js.Function1[/* data */ T, Unit]): Unit
}

object Emitter {
  @scala.inline
  def apply[T](
    off: js.Function1[/* data */ T, Unit] => Unit,
    on: js.Function1[/* data */ T, Unit] => Unit,
    once: js.Function1[/* data */ T, Unit] => Unit
  ): Emitter[T] = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction1(off), on = js.Any.fromFunction1(on), once = js.Any.fromFunction1(once))
  
    __obj.asInstanceOf[Emitter[T]]
  }
}

