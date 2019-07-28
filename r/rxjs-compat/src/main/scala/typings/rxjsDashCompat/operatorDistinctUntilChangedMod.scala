package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/distinctUntilChanged", JSImport.Namespace)
@js.native
object operatorDistinctUntilChangedMod extends js.Object {
  def distinctUntilChanged[T](`this`: Observable[T]): Observable[T] = js.native
  def distinctUntilChanged[T](`this`: Observable[T], compare: js.Function2[/* x */ T, /* y */ T, Boolean]): Observable[T] = js.native
  def distinctUntilChanged[T, K](
    `this`: Observable[T],
    compare: js.Function2[/* x */ K, /* y */ K, Boolean],
    keySelector: js.Function1[/* x */ T, K]
  ): Observable[T] = js.native
}

