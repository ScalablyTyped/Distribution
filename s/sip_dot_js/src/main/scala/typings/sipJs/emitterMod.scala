package typings.sipJs

import typings.sipJs.anon.Once
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emitterMod {
  
  @JSImport("sip.js/lib/api/emitter", "EmitterImpl")
  @js.native
  class EmitterImpl[T] ()
    extends StObject
       with Emitter[T] {
    
    /**
      * Emit change.
      * @param data - Data to emit.
      */
    def emit(data: T): Unit = js.native
    
    var listeners: js.Any = js.native
    
    /**
      * Removes all listeners previously registered with addListener.
      */
    def removeAllListeners(): Unit = js.native
  }
  
  @js.native
  trait Emitter[T] extends StObject {
    
    /**
      * Sets up a function that will be called whenever the target changes.
      * @param listener - Callback function.
      * @param options - An options object that specifies characteristics about the listener.
      *                  If once true, indicates that the listener should be invoked at most once after being added.
      *                  If once true, the listener would be automatically removed when invoked.
      */
    def addListener(listener: js.Function1[/* data */ T, Unit]): Unit = js.native
    def addListener(listener: js.Function1[/* data */ T, Unit], options: Once): Unit = js.native
    
    /**
      * Unregisters a listener.
      * @param listener - Callback function.
      * @deprecated Use removeListener.
      */
    def off(listener: js.Function1[/* data */ T, Unit]): Unit = js.native
    
    /**
      * Registers a listener.
      * @param listener - Callback function.
      * @deprecated Use addListener.
      */
    def on(listener: js.Function1[/* data */ T, Unit]): Unit = js.native
    
    /**
      * Registers a listener then unregisters the listener after one event emission.
      * @param listener - Callback function.
      * @deprecated Use addListener.
      */
    def once(listener: js.Function1[/* data */ T, Unit]): Unit = js.native
    
    /**
      * Removes from the listener previously registered with addListener.
      * @param listener - Callback function.
      */
    def removeListener(listener: js.Function1[/* data */ T, Unit]): Unit = js.native
  }
}
