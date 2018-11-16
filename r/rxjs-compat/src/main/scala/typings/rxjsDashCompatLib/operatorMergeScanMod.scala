package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/mergeScan", JSImport.Namespace)
@js.native
object operatorMergeScanMod extends js.Object {
  def mergeScan[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    accumulator: js.Function2[/* acc */ R, /* value */ T, rxjsLib.internalTypesMod.ObservableInput[R]],
    seed: R
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  def mergeScan[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    accumulator: js.Function2[/* acc */ R, /* value */ T, rxjsLib.internalTypesMod.ObservableInput[R]],
    seed: R,
    concurrent: scala.Double
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

