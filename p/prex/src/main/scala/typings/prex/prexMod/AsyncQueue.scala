package typings.prex.prexMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", "AsyncQueue")
@js.native
/**
  * Initializes a new instance of the AsyncQueue class.
  *
  * @param iterable An optional iterable of values or promises.
  */
class AsyncQueue[T] ()
  extends typings.prex.outLibQueueMod.AsyncQueue[T] {
  def this(iterable: Iterable[T | js.Thenable[T]]) = this()
}

