package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/switchMapTo", JSImport.Namespace)
@js.native
object operatorSwitchMapToMod extends js.Object {
  def switchMapTo[T, R](`this`: Observable[T], observable: ObservableInput[R]): Observable[R] = js.native
  def switchMapTo[T, I, R](
    `this`: Observable[T],
    observable: ObservableInput[I],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ I, 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): Observable[R] = js.native
}

