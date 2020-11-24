package typings.prex

import typings.std.AsyncIterableIterator
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prex/out/lib/boundedQueue", JSImport.Namespace)
@js.native
object boundedQueueMod extends js.Object {
  
  @js.native
  /**
    * Initializes a new instance of the AsyncProducerConsumerQueue class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  class AsyncBoundedQueue[T] () extends js.Object {
    def this(iterable: Iterable[T | js.Thenable[T]]) = this()
    
    var _dequeue: js.Any = js.native
    
    var _queue: js.Any = js.native
    
    var _state: js.Any = js.native
    
    /**
      * Consumes all items in the queue until the queue ends.
      */
    def drain(): AsyncIterableIterator[T] = js.native
    
    /**
      * Indicates the queue is done adding and that no more items will be added to the queue.
      */
    def end(): Unit = js.native
    
    /**
      * Removes and returns a Promise for the first value in the queue. If the queue has
      * ended, returns a Promise for `undefined`. If the queue is empty, returns a Promise
      * for the next value to be added to the queue.
      */
    def get(): js.Promise[js.UndefOr[T]] = js.native
    
    /**
      * Adds a value to the end of the queue. If the queue is empty but has a pending
      * dequeue request, the value will be dequeued and the request fulfilled.
      *
      * @param value A value or promise to add to the queue.
      */
    def put(value: T): Unit = js.native
    def put(value: js.Thenable[T]): Unit = js.native
    
    /**
      * Gets the number of entries in the queue.
      * When positive, indicates the number of entries available to get.
      * When negative, indicates the number of requests waiting to be fulfilled.
      */
    def size: Double = js.native
  }
}
