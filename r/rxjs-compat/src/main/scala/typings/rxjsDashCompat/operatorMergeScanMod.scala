package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/mergeScan", JSImport.Namespace)
@js.native
object operatorMergeScanMod extends js.Object {
  def mergeScan[T, R](
    `this`: Observable[T],
    accumulator: js.Function2[/* acc */ R, /* value */ T, ObservableInput[R]],
    seed: R
  ): Observable[R] = js.native
  def mergeScan[T, R](
    `this`: Observable[T],
    accumulator: js.Function2[/* acc */ R, /* value */ T, ObservableInput[R]],
    seed: R,
    concurrent: Double
  ): Observable[R] = js.native
}

