package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/single", JSImport.Namespace)
@js.native
object operatorSingleMod extends js.Object {
  def single[T](`this`: Observable[T]): Observable[T] = js.native
  def single[T](
    `this`: Observable[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]
  ): Observable[T] = js.native
}

