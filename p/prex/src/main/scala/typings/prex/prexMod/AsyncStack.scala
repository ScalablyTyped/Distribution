package typings.prex.prexMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", "AsyncStack")
@js.native
/**
  * Initializes a new instance of the AsyncStack class.
  *
  * @param iterable An optional iterable of values or promises.
  */
class AsyncStack[T] ()
  extends typings.prex.outLibStackMod.AsyncStack[T] {
  def this(iterable: Iterable[T | js.Thenable[T]]) = this()
}

