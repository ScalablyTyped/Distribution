package typings
package prexLib.prexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", "AsyncBoundedQueue")
@js.native
class AsyncBoundedQueue[T] ()
  extends prexLib.outLibBoundedQueueMod.AsyncBoundedQueue[T] {
  /**
       * Initializes a new instance of the AsyncProducerConsumerQueue class.
       *
       * @param iterable An optional iterable of values or promises.
       */
  def this(iterable: stdLib.Iterable[T | js.Thenable[T]]) = this()
}

