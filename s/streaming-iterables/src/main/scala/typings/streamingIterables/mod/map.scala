package typings.streamingIterables.mod

import typings.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "map")
@js.native
object map extends js.Object {
  
  def apply[T, B](func: js.Function1[/* data */ T, B | js.Promise[B]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[B, _, _]] = js.native
  def apply[T, B](func: js.Function1[/* data */ T, B | js.Promise[B]], iterable: AnyIterable[T]): AsyncGenerator[B, _, _] = js.native
}
