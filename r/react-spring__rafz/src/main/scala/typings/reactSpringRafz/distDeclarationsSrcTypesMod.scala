package typings.reactSpringRafz

import typings.reactSpringRafz.anon.Cancel
import typings.reactSpringRafz.reactSpringRafzStrings.always
import typings.reactSpringRafz.reactSpringRafzStrings.demand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcTypesMod {
  
  @js.native
  trait AnyFn extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  type FrameFn = js.Function0[Boolean | Unit]
  
  type FrameUpdateFn = js.Function1[/* dt */ Double, Boolean | Unit]
  
  type NativeRaf = js.Function1[/* cb */ js.Function0[Unit], Unit]
  
  @js.native
  trait Rafz extends StObject {
    
    def apply(update: FrameUpdateFn): Unit = js.native
    
    /**
      * Manual advancement of the frameLoop, calls our update function
      * only if `.frameLoop === 'demand'`
      */
    def advance(): Unit = js.native
    
    /**
      * For update batching in React. Does nothing by default.
      */
    def batchedUpdates(cb: js.Function0[Unit]): Unit = js.native
    
    /**
      * Prevent a queued `raf(...)` or `raf.write(...)` call.
      */
    def cancel(fn: AnyFn): Unit = js.native
    
    /**
      * The error handler used when a queued function throws.
      */
    def `catch`(error: js.Error): Unit = js.native
    
    /**
      * How should the frameLoop run, when we call .advance or naturally?
      */
    var frameLoop: always | demand = js.native
    
    /**
      * This is responsible for providing the current time,
      * which is used when calculating the elapsed time.
      *
      * It defaults to `performance.now` when it exists,
      * otherwise `Date.now` is used.
      */
    def now(): Double = js.native
    
    /**
      * Run a function after writes are flushed.
      */
    def onFinish(fn: FrameFn): Unit = js.native
    
    /**
      * Run a function before writes are flushed.
      */
    def onFrame(fn: FrameFn): Unit = js.native
    
    /**
      * Run a function before updates are flushed.
      */
    def onStart(fn: FrameFn): Unit = js.native
    
    /**
      * Run a function on the soonest frame after the given time has passed,
      * and before any updates on that particular frame.
      */
    def setTimeout(handler: js.Function0[Unit], ms: Double): Timeout = js.native
    
    /**
      * Any function scheduled within the given callback is run immediately.
      * This escape hatch should only be used if you know what you're doing.
      */
    def sync(fn: js.Function0[Unit]): Unit = js.native
    
    /**
      * Wrap a function so its execution is limited to once per frame. If called
      * more than once in a single frame, the last call's arguments are used.
      */
    def throttle[T /* <: VoidFn */](fn: T): Throttled[T] = js.native
    
    /**
      * Override the native `requestAnimationFrame` implementation.
      *
      * You must call this if your environment never defines
      * `window.requestAnimationFrame` for you.
      */
    def use[T /* <: NativeRaf */](impl: T): T = js.native
    
    /**
      * To avoid performance issues, all mutations are batched with this function.
      * If the update loop is dormant, it will be started when you call this.
      */
    def write(fn: FrameFn): Unit = js.native
  }
  
  type Throttled[T /* <: VoidFn */] = T & Cancel[T]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Timeout] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setHandler(value: () => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction0(value))
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VoidFn extends StObject {
    
    def apply(args: Any*): js.UndefOr[Unit] = js.native
  }
}
