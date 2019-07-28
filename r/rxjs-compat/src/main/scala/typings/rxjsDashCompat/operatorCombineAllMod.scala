package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/combineAll", JSImport.Namespace)
@js.native
object operatorCombineAllMod extends js.Object {
  def combineAll[T](`this`: Observable[ObservableInput[T]]): Observable[js.Array[T]] = js.native
  def combineAll[R](`this`: Observable[_], project: js.Function1[/* repeated */ js.Any, R]): Observable[R] = js.native
  @JSName("combineAll")
  def combineAll_TR[T, R](`this`: Observable[T]): Observable[js.Array[R]] = js.native
  @JSName("combineAll")
  def combineAll_TR[T, R](`this`: Observable[ObservableInput[T] | T], project: js.Function1[/* repeated */ T, R]): Observable[R] = js.native
}

