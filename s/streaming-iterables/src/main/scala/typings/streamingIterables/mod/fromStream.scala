package typings.streamingIterables.mod

import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "fromStream")
@js.native
object fromStream extends js.Object {
  
  def apply[T](stream: ReadableStreamish): AsyncIterable[T] = js.native
}
