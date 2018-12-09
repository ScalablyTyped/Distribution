package typings
package prexLib.prexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", "AsyncQueue")
@js.native
class AsyncQueue[T] ()
  extends prexLib.outLibQueueMod.AsyncQueue[T] {
  /**
       * Initializes a new instance of the AsyncQueue class.
       *
       * @param iterable An optional iterable of values or promises.
       */
  def this(iterable: stdLib.Iterable[T | js.Thenable[T]]) = this()
}

