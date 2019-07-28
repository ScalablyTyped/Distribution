package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/zipAll", JSImport.Namespace)
@js.native
object operatorZipAllMod extends js.Object {
  def zipAll[T](`this`: Observable[ObservableInput[T]]): Observable[js.Array[T]] = js.native
  def zipAll[R](`this`: Observable[_], project: js.Function1[/* repeated */ js.Any, R]): Observable[R] = js.native
  @JSName("zipAll")
  def zipAll_TR[T, R](`this`: Observable[T]): Observable[js.Array[R]] = js.native
  @JSName("zipAll")
  def zipAll_TR[T, R](`this`: Observable[ObservableInput[T] | T], project: js.Function1[/* repeated */ T, R]): Observable[R] = js.native
}

