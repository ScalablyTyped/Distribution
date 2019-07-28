package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/min", JSImport.Namespace)
@js.native
object operatorMinMod extends js.Object {
  def min[T](`this`: Observable[T]): Observable[T] = js.native
  def min[T](`this`: Observable[T], comparer: js.Function2[/* x */ T, /* y */ T, Double]): Observable[T] = js.native
}

