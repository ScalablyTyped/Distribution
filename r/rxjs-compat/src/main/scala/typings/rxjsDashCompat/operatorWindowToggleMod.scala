package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/windowToggle", JSImport.Namespace)
@js.native
object operatorWindowToggleMod extends js.Object {
  def windowToggle[T, O](
    `this`: Observable[T],
    openings: Observable[O],
    closingSelector: js.Function1[/* openValue */ O, Observable[_]]
  ): Observable[Observable[T]] = js.native
}

