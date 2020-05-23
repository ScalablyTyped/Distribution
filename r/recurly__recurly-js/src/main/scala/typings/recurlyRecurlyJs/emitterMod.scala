package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@recurly/recurly-js/lib/emitter", JSImport.Namespace)
@js.native
object emitterMod extends js.Object {
  @js.native
  trait Emitter[Event] extends js.Object {
    def emit(event: Event, args: js.Any*): Emitter[Event] = js.native
    def hasListeners(event: Event): Boolean = js.native
    def listeners(event: Event): js.Array[Listener] = js.native
    def off(): Emitter[Event] = js.native
    def off(event: Event): Emitter[Event] = js.native
    def off(event: Event, listener: Listener): Emitter[Event] = js.native
    def on(event: Event, listener: Listener): Emitter[Event] = js.native
    def once(event: Event, listener: Listener): Emitter[Event] = js.native
  }
  
  type Listener = js.Function1[/* repeated */ js.Any, Unit]
}

