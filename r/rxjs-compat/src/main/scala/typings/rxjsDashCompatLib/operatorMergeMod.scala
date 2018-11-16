package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/merge", JSImport.Namespace)
@js.native
object operatorMergeMod extends js.Object {
  def merge[T](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[T] = js.native
  def merge[T](`this`: rxjsLib.rxjsMod.Observable[T], concurrent: scala.Double): rxjsLib.rxjsMod.Observable[T] = js.native
  def merge[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    concurrent: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def merge[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    observables: (rxjsLib.internalTypesMod.ObservableInput[T] | rxjsLib.internalTypesMod.SchedulerLike | scala.Double)*
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def merge[T](`this`: rxjsLib.rxjsMod.Observable[T], scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.rxjsMod.Observable[T] = js.native
  def merge[T, T2](`this`: rxjsLib.rxjsMod.Observable[T], v2: rxjsLib.internalTypesMod.ObservableInput[T2]): rxjsLib.rxjsMod.Observable[T | T2] = js.native
  def merge[T, T2](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    concurrent: scala.Double
  ): rxjsLib.rxjsMod.Observable[T | T2] = js.native
  def merge[T, T2](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    concurrent: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T | T2] = js.native
  def merge[T, T2](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T | T2] = js.native
  def merge[T, T2, T3](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3]
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3] = js.native
  def merge[T, T2, T3](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    concurrent: scala.Double
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3] = js.native
  def merge[T, T2, T3](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    concurrent: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3] = js.native
  def merge[T, T2, T3](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3] = js.native
  def merge[T, T2, T3, T4](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4]
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    concurrent: scala.Double
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    concurrent: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4, T5](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5]
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    concurrent: scala.Double
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    concurrent: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6]
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6],
    concurrent: scala.Double
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6],
    concurrent: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSName("merge")
  def merge_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    observables: (rxjsLib.internalTypesMod.ObservableInput[_] | rxjsLib.internalTypesMod.SchedulerLike | scala.Double)*
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

