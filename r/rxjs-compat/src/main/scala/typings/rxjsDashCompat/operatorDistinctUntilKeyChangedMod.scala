package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/distinctUntilKeyChanged", JSImport.Namespace)
@js.native
object operatorDistinctUntilKeyChangedMod extends js.Object {
  def distinctUntilKeyChanged[T](`this`: Observable[T], key: String): Observable[T] = js.native
  def distinctUntilKeyChanged[T, K /* <: String */](
    `this`: Observable[T],
    key: K,
    compare: js.Function2[
      /* import warning: ImportType.apply Failed type conversion: T[K] */ /* x */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[K] */ /* y */ js.Any, 
      Boolean
    ]
  ): Observable[T] = js.native
}

