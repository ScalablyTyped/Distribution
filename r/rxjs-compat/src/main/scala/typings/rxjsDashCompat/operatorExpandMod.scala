package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/expand", JSImport.Namespace)
@js.native
object operatorExpandMod extends js.Object {
  def expand[T](
    `this`: Observable[T],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]]
  ): Observable[T] = js.native
  def expand[T](
    `this`: Observable[T],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
    concurrent: Double
  ): Observable[T] = js.native
  def expand[T](
    `this`: Observable[T],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable[T] = js.native
  @JSName("expand")
  def expand_TR[T, R](
    `this`: Observable[T],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]
  ): Observable[R] = js.native
  @JSName("expand")
  def expand_TR[T, R](
    `this`: Observable[T],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double
  ): Observable[R] = js.native
  @JSName("expand")
  def expand_TR[T, R](
    `this`: Observable[T],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable[R] = js.native
}

