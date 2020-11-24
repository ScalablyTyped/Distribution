package typings.streamingIterables.mod

import typings.streamingIterables.anon.FnCallStartIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "reduce")
@js.native
object reduce extends js.Object {
  
  def apply[T, B](func: js.Function2[/* acc */ B, /* value */ T, B]): FnCallStartIterable[B, T] = js.native
  def apply[T, B](func: js.Function2[/* acc */ B, /* value */ T, B], start: B): js.Function1[/* iterable */ AnyIterable[T], js.Promise[B]] = js.native
  def apply[T, B](func: js.Function2[/* acc */ B, /* value */ T, B], start: B, iterable: AnyIterable[T]): js.Promise[B] = js.native
}
