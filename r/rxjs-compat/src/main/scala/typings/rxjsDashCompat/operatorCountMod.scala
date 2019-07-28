package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/count", JSImport.Namespace)
@js.native
object operatorCountMod extends js.Object {
  def count[T](`this`: Observable[T]): Observable[Double] = js.native
  def count[T](
    `this`: Observable[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]
  ): Observable[Double] = js.native
}

