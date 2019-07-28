package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/retryWhen", JSImport.Namespace)
@js.native
object operatorRetryWhenMod extends js.Object {
  def retryWhen[T](`this`: Observable[T], notifier: js.Function1[/* errors */ Observable[_], Observable[_]]): Observable[T] = js.native
}

