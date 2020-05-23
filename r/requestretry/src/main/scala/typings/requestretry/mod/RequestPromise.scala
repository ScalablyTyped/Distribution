package typings.requestretry.mod

import typings.request.mod.Request
import typings.requestretry.anon.FnCall
import typings.requestretry.anon.FnCallOnrejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPromise extends Request {
  @JSName("catch")
  var catch_Original: FnCallOnrejected = js.native
  @JSName("then")
  var then_Original: FnCall = js.native
  def `catch`[TResult](): js.Promise[_ | TResult] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[_ | TResult] = js.native
  def promise(): js.Promise[_] = js.native
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ js.Any, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ js.Any, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
}

