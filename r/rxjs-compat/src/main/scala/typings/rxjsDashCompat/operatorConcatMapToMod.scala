package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/concatMapTo", JSImport.Namespace)
@js.native
object operatorConcatMapToMod extends js.Object {
  def concatMapTo[T, R](`this`: Observable[T], innerObservable: Observable[R]): Observable[R] = js.native
}

