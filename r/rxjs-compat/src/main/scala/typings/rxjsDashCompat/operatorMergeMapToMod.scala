package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/mergeMapTo", JSImport.Namespace)
@js.native
object operatorMergeMapToMod extends js.Object {
  def mergeMapTo[T, R](`this`: Observable[T], innerObservable: ObservableInput[R]): Observable[R] = js.native
  def mergeMapTo[T, R](`this`: Observable[T], innerObservable: ObservableInput[R], concurrent: Double): Observable[R] = js.native
}

