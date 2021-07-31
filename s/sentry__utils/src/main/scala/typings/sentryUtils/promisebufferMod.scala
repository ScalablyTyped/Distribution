package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promisebufferMod {
  
  @JSImport("@sentry/utils/dist/promisebuffer", "PromiseBuffer")
  @js.native
  class PromiseBuffer[T] () extends StObject {
    def this(_limit: Double) = this()
    
    /** Internal set of queued Promises */
    val _buffer: js.Any = js.native
    
    var _limit: js.UndefOr[Double] = js.native
    
    /**
      * Add a promise to the queue.
      *
      * @param task Can be any PromiseLike<T>
      * @returns The original promise.
      */
    def add(task: js.Thenable[T]): js.Thenable[T] = js.native
    
    /**
      * This will drain the whole queue, returns true if queue is empty or drained.
      * If timeout is provided and the queue takes longer to drain, the promise still resolves but with false.
      *
      * @param timeout Number in ms to wait until it resolves with false.
      */
    def drain(): js.Thenable[Boolean] = js.native
    def drain(timeout: Double): js.Thenable[Boolean] = js.native
    
    /**
      * Says if the buffer is ready to take more requests
      */
    def isReady(): Boolean = js.native
    
    /**
      * This function returns the number of unresolved promises in the queue.
      */
    def length(): Double = js.native
    
    /**
      * Remove a promise to the queue.
      *
      * @param task Can be any PromiseLike<T>
      * @returns Removed promise.
      */
    def remove(task: js.Thenable[T]): js.Thenable[T] = js.native
  }
}
