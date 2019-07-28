package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/concatAll", JSImport.Namespace)
@js.native
object operatorConcatAllMod extends js.Object {
  def concatAll[T](`this`: Observable[ObservableInput[T]]): Observable[T] = js.native
  @JSName("concatAll")
  def concatAll_TR[T, R](`this`: Observable[T]): Observable[R] = js.native
}

