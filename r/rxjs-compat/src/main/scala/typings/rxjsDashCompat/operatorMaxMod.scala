package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/max", JSImport.Namespace)
@js.native
object operatorMaxMod extends js.Object {
  def max[T](`this`: Observable[T]): Observable[T] = js.native
  def max[T](`this`: Observable[T], comparer: js.Function2[/* x */ T, /* y */ T, Double]): Observable[T] = js.native
}

