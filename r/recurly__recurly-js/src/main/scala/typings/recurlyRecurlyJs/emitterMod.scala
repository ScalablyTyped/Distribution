package typings.recurlyRecurlyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emitterMod {
  
  @js.native
  trait Emitter[Event] extends StObject {
    
    def emit(event: Event, args: js.Any*): Emitter[Event] = js.native
    
    def hasListeners(event: Event): Boolean = js.native
    
    def listeners(event: Event): js.Array[Listener] = js.native
    
    def off(): Emitter[Event] = js.native
    def off(event: Event): Emitter[Event] = js.native
    def off(event: Event, listener: Listener): Emitter[Event] = js.native
    def off(event: js.UndefOr[scala.Nothing], listener: Listener): Emitter[Event] = js.native
    
    def on(event: Event, listener: Listener): Emitter[Event] = js.native
    
    def once(event: Event, listener: Listener): Emitter[Event] = js.native
  }
  
  type Listener = js.Function1[/* repeated */ js.Any, Unit]
}
