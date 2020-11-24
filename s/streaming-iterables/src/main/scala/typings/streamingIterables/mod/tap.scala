package typings.streamingIterables.mod

import typings.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "tap")
@js.native
object tap extends js.Object {
  
  def apply[T](func: js.Function1[/* data */ T, _]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[T, _, _]] = js.native
  def apply[T](func: js.Function1[/* data */ T, _], iterable: AnyIterable[T]): AsyncGenerator[T, _, _] = js.native
}
