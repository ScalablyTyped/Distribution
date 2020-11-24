package typings.streamingIterables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "writeToStream")
@js.native
object writeToStream extends js.Object {
  
  def apply(stream: WritableStreamish): js.Function1[/* iterable */ AnyIterable[_], js.Promise[Unit]] = js.native
  def apply(stream: WritableStreamish, iterable: AnyIterable[_]): js.Promise[Unit] = js.native
}
