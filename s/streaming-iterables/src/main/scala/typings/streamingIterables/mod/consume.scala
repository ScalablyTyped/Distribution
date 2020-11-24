package typings.streamingIterables.mod

import typings.std.AsyncIterable
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "consume")
@js.native
object consume extends js.Object {
  
  def apply[T](iterable: AsyncIterable[T]): js.Promise[Unit] = js.native
  def apply[T](iterable: Iterable[T]): Unit = js.native
}
