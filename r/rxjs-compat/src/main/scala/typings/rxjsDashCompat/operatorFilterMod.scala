package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/filter", JSImport.Namespace)
@js.native
object operatorFilterMod extends js.Object {
  def filter[T](`this`: Observable[T], predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Observable[T] = js.native
  def filter[T](
    `this`: Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ Double, Boolean],
    thisArg: js.Any
  ): Observable[T] = js.native
  @JSName("filter")
  def filter_TS_T[T, S /* <: T */](
    `this`: Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]
  ): Observable[S] = js.native
  @JSName("filter")
  def filter_TS_T[T, S /* <: T */](
    `this`: Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean],
    thisArg: js.Any
  ): Observable[S] = js.native
}

