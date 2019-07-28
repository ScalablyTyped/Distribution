package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/findIndex", JSImport.Namespace)
@js.native
object operatorFindIndexMod extends js.Object {
  def findIndex[T](
    `this`: Observable[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]
  ): Observable[Double] = js.native
  def findIndex[T](
    `this`: Observable[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: js.Any
  ): Observable[Double] = js.native
}

