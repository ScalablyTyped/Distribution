package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/concatMap", JSImport.Namespace)
@js.native
object operatorConcatMapMod extends js.Object {
  def concatMap[T, R](
    `this`: Observable[T],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]
  ): Observable[R] = js.native
}

