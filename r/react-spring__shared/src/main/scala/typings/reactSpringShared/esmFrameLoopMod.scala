package typings.reactSpringShared

import typings.reactSpringShared.esmTypesMod.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFrameLoopMod {
  
  @JSImport("@react-spring/shared/esm/FrameLoop", "FrameLoop")
  @js.native
  class FrameLoop () extends StObject {
    def this(raf: RequestFrameFn) = this()
    
    var _animations: js.Array[OpaqueAnimation] = js.native
    
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
  
  @js.native
  trait OpaqueAnimation extends StObject {
    
    def advance(dt: Double): Unit = js.native
    
    var idle: Boolean = js.native
    
    var priority: Double = js.native
  }
  object OpaqueAnimation {
    
    @scala.inline
    def apply(advance: Double => Unit, idle: Boolean, priority: Double): OpaqueAnimation = {
      val __obj = js.Dynamic.literal(advance = js.Any.fromFunction1(advance), idle = idle.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpaqueAnimation]
    }
    
    @scala.inline
    implicit class OpaqueAnimationMutableBuilder[Self <: OpaqueAnimation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvance(value: Double => Unit): Self = StObject.set(x, "advance", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIdle(value: Boolean): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  type RequestFrameFn = js.Function1[/* cb */ FrameRequestCallback, Double | Unit]
  
  @js.native
  trait Timeout extends StObject {
    
    def cancel(): Unit = js.native
    
    def handler(): Unit = js.native
    
    var time: Double = js.native
  }
  object Timeout {
    
    @scala.inline
    def apply(cancel: () => Unit, handler: () => Unit, time: Double): Timeout = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), handler = js.Any.fromFunction0(handler), time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timeout]
    }
    
    @scala.inline
    implicit class TimeoutMutableBuilder[Self <: Timeout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandler(value: () => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
