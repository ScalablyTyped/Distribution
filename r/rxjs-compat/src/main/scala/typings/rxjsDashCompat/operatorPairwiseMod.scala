package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/pairwise", JSImport.Namespace)
@js.native
object operatorPairwiseMod extends js.Object {
  def pairwise[T](`this`: Observable[T]): Observable[js.Tuple2[T, T]] = js.native
}

