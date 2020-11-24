package typings.streamingIterables.mod

import typings.std.AsyncIterable
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "batch")
@js.native
object batch extends js.Object {
  
  def apply(size: Double): CurriedBatchResult = js.native
  def apply[T](size: Double, iterable: AsyncIterable[T]): UnwrapAnyIterableArray[AsyncIterable[T]] = js.native
  def apply[T](size: Double, iterable: Iterable[T]): UnwrapAnyIterableArray[Iterable[T]] = js.native
}
