package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/expand", JSImport.Namespace)
@js.native
object operatorExpandMod extends js.Object {
  def expand[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    project: js.Function2[/* value */ T, /* index */ scala.Double, rxjsLib.internalTypesMod.ObservableInput[T]]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def expand[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    project: js.Function2[/* value */ T, /* index */ scala.Double, rxjsLib.internalTypesMod.ObservableInput[T]],
    concurrent: scala.Double
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def expand[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    project: js.Function2[/* value */ T, /* index */ scala.Double, rxjsLib.internalTypesMod.ObservableInput[T]],
    concurrent: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  @JSName("expand")
  def expand_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    project: js.Function2[/* value */ T, /* index */ scala.Double, rxjsLib.internalTypesMod.ObservableInput[R]]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  @JSName("expand")
  def expand_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    project: js.Function2[/* value */ T, /* index */ scala.Double, rxjsLib.internalTypesMod.ObservableInput[R]],
    concurrent: scala.Double
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  @JSName("expand")
  def expand_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    project: js.Function2[/* value */ T, /* index */ scala.Double, rxjsLib.internalTypesMod.ObservableInput[R]],
    concurrent: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

