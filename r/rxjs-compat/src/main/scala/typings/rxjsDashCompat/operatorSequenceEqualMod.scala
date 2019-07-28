package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/sequenceEqual", JSImport.Namespace)
@js.native
object operatorSequenceEqualMod extends js.Object {
  def sequenceEqual[T](`this`: Observable[T], compareTo: Observable[T]): Observable[Boolean] = js.native
  def sequenceEqual[T](
    `this`: Observable[T],
    compareTo: Observable[T],
    comparor: js.Function2[/* a */ T, /* b */ T, Boolean]
  ): Observable[Boolean] = js.native
}

