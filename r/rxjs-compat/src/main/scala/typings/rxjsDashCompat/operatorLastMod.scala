package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/last", JSImport.Namespace)
@js.native
object operatorLastMod extends js.Object {
  def last[T, D](`this`: Observable[T]): Observable[T | D] = js.native
  def last[T, S /* <: T */](
    `this`: Observable[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): Observable[S] = js.native
  def last[T, S /* <: T */](
    `this`: Observable[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean],
    defaultValue: S
  ): Observable[S] = js.native
  def last[T, D](`this`: Observable[T], predicate: Null, defaultValue: D): Observable[T | D] = js.native
  @JSName("last")
  def last_TD[T, D](
    `this`: Observable[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]
  ): Observable[T | D] = js.native
  @JSName("last")
  def last_TD[T, D](
    `this`: Observable[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    defaultValue: D
  ): Observable[T | D] = js.native
}

