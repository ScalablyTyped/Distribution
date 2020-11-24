package typings.streamingIterables.mod

import typings.std.AsyncGenerator
import typings.streamingIterables.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "flatTransform")
@js.native
object flatTransform extends js.Object {
  
  def apply[T, R](concurrency: Double): FnCall[T, R] = js.native
  def apply[T, R](concurrency: Double, func: js.Function1[/* data */ T, FlatMapValue[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[R, _, _]] = js.native
  def apply[T, R](concurrency: Double, func: js.Function1[/* data */ T, FlatMapValue[R]], iterable: AnyIterable[T]): AsyncGenerator[R, _, _] = js.native
}
