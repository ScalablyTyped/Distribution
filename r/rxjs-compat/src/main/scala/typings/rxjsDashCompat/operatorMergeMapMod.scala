package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/mergeMap", JSImport.Namespace)
@js.native
object operatorMergeMapMod extends js.Object {
  def mergeMap[T, R](
    `this`: Observable[T],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]
  ): Observable[R] = js.native
  def mergeMap[T, R](
    `this`: Observable[T],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double
  ): Observable[R] = js.native
}

