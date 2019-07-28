package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/switchMap", JSImport.Namespace)
@js.native
object operatorSwitchMapMod extends js.Object {
  def switchMap[T, R](
    `this`: Observable[T],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]
  ): Observable[R] = js.native
}

