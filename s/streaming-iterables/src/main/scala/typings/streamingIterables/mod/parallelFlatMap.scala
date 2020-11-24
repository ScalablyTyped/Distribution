package typings.streamingIterables.mod

import typings.std.AsyncGenerator
import typings.streamingIterables.anon.FnCallFuncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "parallelFlatMap")
@js.native
object parallelFlatMap extends js.Object {
  
  def apply[T, R](concurrency: Double): FnCallFuncIterable[T, R] = js.native
  def apply[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[R, _, _]] = js.native
  def apply[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]], iterable: AnyIterable[T]): AsyncGenerator[R, _, _] = js.native
}
