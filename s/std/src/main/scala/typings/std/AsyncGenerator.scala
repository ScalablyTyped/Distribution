package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncGenerator[T, TReturn, TNext] extends AsyncIterator[T, TReturn, TNext] {
  @JSName("return")
  def return_MAsyncGenerator(value: TReturn): js.Promise[IteratorResult[T, TReturn]] = js.native
  @JSName("return")
  def return_MAsyncGenerator(value: js.Thenable[TReturn]): js.Promise[IteratorResult[T, TReturn]] = js.native
  @JSName("throw")
  def throw_MAsyncGenerator(e: js.Any): js.Promise[IteratorResult[T, TReturn]] = js.native
}

