package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/catch", JSImport.Namespace)
@js.native
object operatorCatchMod extends js.Object {
  def _catch[T, R](
    `this`: Observable[T],
    selector: js.Function2[/* err */ js.Any, /* caught */ Observable[T], ObservableInput[R]]
  ): Observable[T | R] = js.native
}

