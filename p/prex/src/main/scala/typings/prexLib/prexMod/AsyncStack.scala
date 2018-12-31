package typings
package prexLib.prexMod

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
  extends prexLib.outLibStackMod.AsyncStack[T] {
  def this(iterable: stdLib.Iterable[T | js.Thenable[T]]) = this()
}

