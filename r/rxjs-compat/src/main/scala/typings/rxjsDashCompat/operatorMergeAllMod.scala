package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/mergeAll", JSImport.Namespace)
@js.native
object operatorMergeAllMod extends js.Object {
  def mergeAll[T](`this`: Observable[ObservableInput[T]]): Observable[T] = js.native
  def mergeAll[T](`this`: Observable[ObservableInput[T]], concurrent: Double): Observable[T] = js.native
  @JSName("mergeAll")
  def mergeAll_TR[T, R](`this`: Observable[T]): Observable[R] = js.native
  @JSName("mergeAll")
  def mergeAll_TR[T, R](`this`: Observable[T], concurrent: Double): Observable[R] = js.native
}

