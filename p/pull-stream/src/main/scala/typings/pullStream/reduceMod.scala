package typings.pullStream

import typings.pullStream.mod.Sink
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sinks/reduce", JSImport.Namespace)
@js.native
object reduceMod extends js.Object {
  /**
    * Reduce stream into single value, then callback.
    */
  def apply[T, U](
    reducer: js.Function2[/* acc */ U | Null, /* data */ T, U],
    cb: js.Function2[/* err */ Error | Null, /* result */ U, _]
  ): Sink[T] = js.native
  def apply[T, U](
    reducer: js.Function2[/* acc */ U, /* data */ T, U],
    initial: U,
    cb: js.Function2[/* err */ Error | Null, /* result */ U, _]
  ): Sink[T] = js.native
}

