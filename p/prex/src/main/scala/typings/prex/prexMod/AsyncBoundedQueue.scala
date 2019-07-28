package typings.prex.prexMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", "AsyncBoundedQueue")
@js.native
/**
  * Initializes a new instance of the AsyncProducerConsumerQueue class.
  *
  * @param iterable An optional iterable of values or promises.
  */
class AsyncBoundedQueue[T] ()
  extends typings.prex.outLibBoundedQueueMod.AsyncBoundedQueue[T] {
  def this(iterable: Iterable[T | js.Thenable[T]]) = this()
}

