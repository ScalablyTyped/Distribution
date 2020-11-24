package typings.streamingIterables.mod

import typings.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "filter")
@js.native
object filter extends js.Object {
  
  def apply[T](filterFunc: js.Function1[/* data */ T, Boolean | js.Promise[Boolean]]): js.Function1[/* curriedIterable */ AnyIterable[_], AsyncGenerator[_, _, _]] = js.native
  def apply[T](filterFunc: js.Function1[/* data */ T, Boolean | js.Promise[Boolean]], iterable: AnyIterable[T]): AsyncGenerator[T, _, _] = js.native
}
