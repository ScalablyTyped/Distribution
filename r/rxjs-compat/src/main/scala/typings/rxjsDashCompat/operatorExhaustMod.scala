package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/exhaust", JSImport.Namespace)
@js.native
object operatorExhaustMod extends js.Object {
  def exhaust[T](`this`: Observable[ObservableInput[T]]): Observable[T] = js.native
  @JSName("exhaust")
  def exhaust_TR[T, R](`this`: Observable[T]): Observable[R] = js.native
}

