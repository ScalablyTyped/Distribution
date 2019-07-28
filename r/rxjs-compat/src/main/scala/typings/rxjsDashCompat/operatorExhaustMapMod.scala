package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/exhaustMap", JSImport.Namespace)
@js.native
object operatorExhaustMapMod extends js.Object {
  def exhaustMap[T, R](
    `this`: Observable[T],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]
  ): Observable[R] = js.native
}

