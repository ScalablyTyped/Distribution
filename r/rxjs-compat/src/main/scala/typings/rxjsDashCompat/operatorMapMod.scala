package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/map", JSImport.Namespace)
@js.native
object operatorMapMod extends js.Object {
  def map[T, R](`this`: Observable[T], project: js.Function2[/* value */ T, /* index */ Double, R]): Observable[R] = js.native
  def map[T, R](
    `this`: Observable[T],
    project: js.Function2[/* value */ T, /* index */ Double, R],
    thisArg: js.Any
  ): Observable[R] = js.native
}

