package typings.reactSpringShared

import typings.reactSpringShared.esmTypesMod.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFrameLoopMod {
  
  @JSImport("@react-spring/shared/esm/FrameLoop", "FrameLoop")
  @js.native
  class FrameLoop () extends StObject {
    def this(raf: RequestFrameFn) = this()
    
    /* protected */ var _animations: js.Array[OpaqueAnimation] = js.native
    
    /* protected */ def _dispose(): Unit = js.native
    
    /**
      * Advance the animations to the current time.
      */
    def advance(): Unit = js.native
    
    /**
      * Execute a function once after all animations have updated.
      */
    def onFrame(cb: FrameRequestCallback): Unit = js.native
    
    /**
      * Execute a function once at the very end of the current frame.
      *
      * Only call this within an `onFrame` callback.
      */
    def onWrite(cb: FrameRequestCallback): Unit = js.native
    
    /**
      * Invoke the given `handler` on the soonest frame after the given
      * `ms` delay is completed. When the delay is `<= 0`, the handler is
      * invoked immediately.
      */
    def setTimeout(handler: js.Function0[Unit], ms: Double): Timeout = js.native
    
    /**
      * Start a new animation, or reorder an active animation in
      * the animations array in response to a priority change.
      */
    def start(animation: OpaqueAnimation): Unit = js.native
  }
  
  trait OpaqueAnimation extends StObject {
    
    def advance(dt: Double): Unit
    
    var idle: Boolean
    
    var priority: Double
  }
  object OpaqueAnimation {
    
    inline def apply(advance: Double => Unit, idle: Boolean, priority: Double): OpaqueAnimation = {
      val __obj = js.Dynamic.literal(advance = js.Any.fromFunction1(advance), idle = idle.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpaqueAnimation]
    }
    
    extension [Self <: OpaqueAnimation](x: Self) {
      
      inline def setAdvance(value: Double => Unit): Self = StObject.set(x, "advance", js.Any.fromFunction1(value))
      
      inline def setIdle(value: Boolean): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  type RequestFrameFn = js.Function1[/* cb */ FrameRequestCallback, Double | Unit]
  
  trait Timeout extends StObject {
    
    def cancel(): Unit
    
    def handler(): Unit
    
    var time: Double
  }
  object Timeout {
    
    inline def apply(cancel: () => Unit, handler: () => Unit, time: Double): Timeout = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), handler = js.Any.fromFunction0(handler), time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timeout]
    }
    
    extension [Self <: Timeout](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setHandler(value: () => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction0(value))
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
