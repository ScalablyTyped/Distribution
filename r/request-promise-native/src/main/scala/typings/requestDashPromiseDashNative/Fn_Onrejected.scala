package typings.requestDashPromiseDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Onrejected[T] extends js.Object {
  def apply[TResult](): js.Promise[T | TResult] = js.native
  def apply[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[T | TResult] = js.native
}

