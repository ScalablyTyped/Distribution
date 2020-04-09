package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter[Event] extends js.Object {
  def emit(event: Event, args: js.Any*): Emitter[Event] = js.native
  def hasListeners(event: Event): Boolean = js.native
  def listeners(event: Event): js.Function1[/* args */ js.Any, js.Array[_]] = js.native
  def off(): Emitter[Event] = js.native
  def off(event: Event): Emitter[Event] = js.native
  def off(event: Event, listener: js.Function1[/* args */ js.Any, _]): Emitter[Event] = js.native
  def on(event: Event, listener: js.Function1[/* args */ js.Any, _]): Emitter[Event] = js.native
  def once(event: Event, listener: js.Function1[/* args */ js.Any, _]): Emitter[Event] = js.native
}

