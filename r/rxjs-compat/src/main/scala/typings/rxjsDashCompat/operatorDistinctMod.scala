package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/distinct", JSImport.Namespace)
@js.native
object operatorDistinctMod extends js.Object {
  def distinct[T, K](`this`: Observable[T]): Observable[T] = js.native
  def distinct[T, K](`this`: Observable[T], keySelector: js.Function1[/* value */ T, K]): Observable[T] = js.native
  def distinct[T, K](`this`: Observable[T], keySelector: js.Function1[/* value */ T, K], flushes: Observable[_]): Observable[T] = js.native
}

