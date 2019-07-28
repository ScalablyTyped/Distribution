package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/find", JSImport.Namespace)
@js.native
object operatorFindMod extends js.Object {
  def find[T](`this`: Observable[T], predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Observable[js.UndefOr[T]] = js.native
  def find[T](
    `this`: Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ Double, Boolean],
    thisArg: js.Any
  ): Observable[js.UndefOr[T]] = js.native
  @JSName("find")
  def find_TS_T[T, S /* <: T */](
    `this`: Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]
  ): Observable[js.UndefOr[S]] = js.native
  @JSName("find")
  def find_TS_T[T, S /* <: T */](
    `this`: Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean],
    thisArg: js.Any
  ): Observable[js.UndefOr[S]] = js.native
}

