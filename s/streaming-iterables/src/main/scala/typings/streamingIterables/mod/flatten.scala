package typings.streamingIterables.mod

import typings.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "flatten")
@js.native
object flatten extends js.Object {
  
  def apply[B](iterable: AnyIterable[B | AnyIterable[B]]): AsyncIterableIterator[B] = js.native
}
