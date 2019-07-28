package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/every", JSImport.Namespace)
@js.native
object operatorEveryMod extends js.Object {
  def every[T](
    `this`: Observable[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]
  ): Observable[Boolean] = js.native
  def every[T](
    `this`: Observable[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: js.Any
  ): Observable[Boolean] = js.native
}

