package typings.prex

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  @JSImport("prex/out/lib/queue", "AsyncQueue")
  @js.native
  /**
    * Initializes a new instance of the AsyncQueue class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  open class AsyncQueue[T] () extends StObject {
    def this(iterable: js.Iterable[T | PromiseLike[T]]) = this()
    
    /* private */ var _available: Any = js.native
    
    /* private */ var _pending: Any = js.native
    
    /**
      * Removes and returns a Promise for the first value in the queue. If the queue is empty,
      * returns a Promise for the next value to be added to the queue.
      */
    def get(): js.Promise[T] = js.native
    
    /**
      * Adds a value to the end of the queue. If the queue is empty but has a pending
      * dequeue request, the value will be dequeued and the request fulfilled.
      *
      * @param value A value or promise to add to the queue.
      */
    def put(value: T): Unit = js.native
    def put(value: PromiseLike[T]): Unit = js.native
    
    /**
      * Gets the number of entries in the queue.
      * When positive, indicates the number of entries available to get.
      * When negative, indicates the number of requests waiting to be fulfilled.
      */
    def size: Double = js.native
  }
}
