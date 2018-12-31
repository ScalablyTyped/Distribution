package typings
package reduxDashObservableLib.reduxDashObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-observable", "ActionsObservable")
@js.native
class ActionsObservable[T /* <: reduxLib.reduxMod.Action[_] */] protected ()
  extends rxjsLib.rxjsMod.Observable[T] {
  def this(input$: rxjsLib.rxjsMod.Observable[T]) = this()
  @JSName("lift")
  def lift_RObservable[R](operator: rxjsLib.internalOperatorMod.Operator[T, R]): rxjsLib.rxjsMod.Observable[R] = js.native
  @JSName("ofType")
  def ofType_type[R /* <: T */](key: (/* import warning: ImportType.apply Failed type conversion: R['type'] */ js.Any)*): ActionsObservable[R] = js.native
}

@JSImport("redux-observable", "ActionsObservable")
@js.native
object ActionsObservable extends js.Object {
  def from[T /* <: reduxLib.reduxMod.Action[_] */](ish: rxjsLib.internalTypesMod.ObservableInput[T]): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[T] = js.native
  def from[T /* <: reduxLib.reduxMod.Action[_] */](
    ish: rxjsLib.internalTypesMod.ObservableInput[T],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[T] = js.native
  def from[T /* <: reduxLib.reduxMod.Action[_] */, R /* <: reduxLib.reduxMod.Action[_] */](ish: stdLib.ArrayLike[T]): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[R] = js.native
  def from[T /* <: reduxLib.reduxMod.Action[_] */, R /* <: reduxLib.reduxMod.Action[_] */](ish: stdLib.ArrayLike[T], scheduler: rxjsLib.internalTypesMod.SchedulerLike): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[R] = js.native
  def of[T /* <: reduxLib.reduxMod.Action[_] */](array: (T | rxjsLib.internalTypesMod.SchedulerLike)*): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[T] = js.native
  /**
    * Just like RxJS itself, we can't actually make this method always type-safe
    * because we would need non-final position spread params e.g.
    *   `static of<T>(...items: T, scheduler?: Scheduler): ActionsObservable<T>`
    * which isn't possible in either JavaScript or TypeScript. So instead, we
    * provide safe typing for up to 6 items, following by a scheduler.
    */
  def of[T /* <: reduxLib.reduxMod.Action[_] */](item1: T): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[T] = js.native
  def of[T /* <: reduxLib.reduxMod.Action[_] */](item1: T, item2: T): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[T] = js.native
  def of[T /* <: reduxLib.reduxMod.Action[_] */](item1: T, item2: T, item3: T): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[T] = js.native
  def of[T /* <: reduxLib.reduxMod.Action[_] */](item1: T, item2: T, item3: T, item4: T): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[T] = js.native
  def of[T /* <: reduxLib.reduxMod.Action[_] */](item1: T, item2: T, item3: T, item4: T, item5: T): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[T] = js.native
  def of[T /* <: reduxLib.reduxMod.Action[_] */](item1: T, item2: T, item3: T, item4: T, item5: T, item6: T): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[T] = js.native
  def of[T /* <: reduxLib.reduxMod.Action[_] */](
    item1: T,
    item2: T,
    item3: T,
    item4: T,
    item5: T,
    item6: T,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[T] = js.native
  def of[T /* <: reduxLib.reduxMod.Action[_] */](
    item1: T,
    item2: T,
    item3: T,
    item4: T,
    item5: T,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[T] = js.native
  def of[T /* <: reduxLib.reduxMod.Action[_] */](item1: T, item2: T, item3: T, item4: T, scheduler: rxjsLib.internalTypesMod.SchedulerLike): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[T] = js.native
  def of[T /* <: reduxLib.reduxMod.Action[_] */](item1: T, item2: T, item3: T, scheduler: rxjsLib.internalTypesMod.SchedulerLike): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[T] = js.native
  def of[T /* <: reduxLib.reduxMod.Action[_] */](item1: T, item2: T, scheduler: rxjsLib.internalTypesMod.SchedulerLike): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[T] = js.native
  def of[T /* <: reduxLib.reduxMod.Action[_] */](item1: T, scheduler: rxjsLib.internalTypesMod.SchedulerLike): reduxDashObservableLib.reduxDashObservableMod.ActionsObservable[T] = js.native
}

