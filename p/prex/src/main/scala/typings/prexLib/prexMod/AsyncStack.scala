package typings
package prexLib.prexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", "AsyncStack")
@js.native
class AsyncStack[T] ()
  extends prexLib.outLibStackMod.AsyncStack[T] {
  /**
       * Initializes a new instance of the AsyncStack class.
       *
       * @param iterable An optional iterable of values or promises.
       */
  def this(iterable: stdLib.Iterable[T | stdLib.PromiseLike[T]]) = this()
}

