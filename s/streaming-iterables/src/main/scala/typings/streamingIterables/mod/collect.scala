package typings.streamingIterables.mod

import typings.std.AsyncIterable
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "collect")
@js.native
object collect extends js.Object {
  
  def apply[T](iterable: AsyncIterable[T]): UnwrapToPromiseOrAsyncIterable[AsyncIterable[T]] = js.native
  def apply[T](iterable: Iterable[T]): UnwrapToPromiseOrAsyncIterable[Iterable[T]] = js.native
}
