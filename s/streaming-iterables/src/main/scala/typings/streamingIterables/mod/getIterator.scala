package typings.streamingIterables.mod

import typings.std.AsyncIterable
import typings.std.AsyncIterator
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "getIterator")
@js.native
object getIterator extends js.Object {
  
  def apply[T](iterable: AsyncIterable[T]): (AsyncIterator[T, _, js.UndefOr[scala.Nothing]]) | (Iterator[T, _, js.UndefOr[scala.Nothing]]) = js.native
  def apply[T](iterable: AsyncIterator[T, _, js.UndefOr[scala.Nothing]]): AsyncIterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  def apply[T](iterable: Iterable[T]): (AsyncIterator[T, _, js.UndefOr[scala.Nothing]]) | (Iterator[T, _, js.UndefOr[scala.Nothing]]) = js.native
  def apply[T](iterable: Iterator[T, _, js.UndefOr[scala.Nothing]]): Iterator[T, _, js.UndefOr[scala.Nothing]] = js.native
}
