package typings
package prexLib.outLibQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/queue", "AsyncQueue")
@js.native
class AsyncQueue[T] () extends js.Object {
  /**
       * Initializes a new instance of the AsyncQueue class.
       *
       * @param iterable An optional iterable of values or promises.
       */
  def this(iterable: stdLib.Iterable[T | stdLib.PromiseLike[T]]) = this()
  var _available: js.Any = js.native
  var _pending: js.Any = js.native
  /**
       * Gets the number of entries in the queue.
       * When positive, indicates the number of entries available to get.
       * When negative, indicates the number of requests waiting to be fulfilled.
       */
  val size: scala.Double = js.native
  /**
       * Removes and returns a Promise for the first value in the queue. If the queue is empty,
       * returns a Promise for the next value to be added to the queue.
       */
  def get(): stdLib.Promise[T] = js.native
  /**
       * Adds a value to the end of the queue. If the queue is empty but has a pending
       * dequeue request, the value will be dequeued and the request fulfilled.
       *
       * @param value A value or promise to add to the queue.
       */
  def put(value: T): scala.Unit = js.native
  /**
       * Adds a value to the end of the queue. If the queue is empty but has a pending
       * dequeue request, the value will be dequeued and the request fulfilled.
       *
       * @param value A value or promise to add to the queue.
       */
  def put(value: stdLib.PromiseLike[T]): scala.Unit = js.native
}

