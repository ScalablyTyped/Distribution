package typings.streamingIterables.mod

import typings.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "flatMap")
@js.native
object flatMap extends js.Object {
  
  def apply[T, B](func: js.Function1[/* data */ T, FlatMapValue[B]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[B, _, _]] = js.native
  def apply[T, B](func: js.Function1[/* data */ T, FlatMapValue[B]], iterable: AnyIterable[T]): AsyncGenerator[B, _, _] = js.native
}
