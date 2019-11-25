package typings.reduxDashObservable.reduxDashObservableMod

import typings.redux.reduxMod.Action
import typings.rxjs.internalOperatorMod.Operator
import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-observable", "ActionsObservable")
@js.native
class ActionsObservable[T /* <: Action[_] */] protected () extends Observable[T] {
  def this(input$: Observable[T]) = this()
  @JSName("lift")
  def lift_R_ActionWildcard_ActionsObservable[R /* <: Action[_] */](operator: Operator[T, R]): ActionsObservable[R] = js.native
  @JSName("ofType")
  def ofType_type[R /* <: T */](key: (/* import warning: importer.ImportType#apply Failed type conversion: R['type'] */ js.Any)*): ActionsObservable[R] = js.native
}

/* static members */
@JSImport("redux-observable", "ActionsObservable")
@js.native
object ActionsObservable extends js.Object {
  def from[T /* <: Action[_] */](ish: ObservableInput[T]): ActionsObservable[T] = js.native
  def from[T /* <: Action[_] */](ish: ObservableInput[T], scheduler: SchedulerLike): ActionsObservable[T] = js.native
  def from[T /* <: Action[_] */, R /* <: Action[_] */](ish: ArrayLike[T]): ActionsObservable[R] = js.native
  def from[T /* <: Action[_] */, R /* <: Action[_] */](ish: ArrayLike[T], scheduler: SchedulerLike): ActionsObservable[R] = js.native
  def of[T /* <: Action[_] */](array: (T | SchedulerLike)*): ActionsObservable[T] = js.native
  /**
    * Just like RxJS itself, we can't actually make this method always type-safe
    * because we would need non-final position spread params e.g.
    *   `static of<T>(...items: T, scheduler?: Scheduler): ActionsObservable<T>`
    * which isn't possible in either JavaScript or TypeScript. So instead, we
    * provide safe typing for up to 6 items, following by a scheduler.
    */
  def of[T /* <: Action[_] */](item1: T): ActionsObservable[T] = js.native
  def of[T /* <: Action[_] */](item1: T, item2: T): ActionsObservable[T] = js.native
  def of[T /* <: Action[_] */](item1: T, item2: T, item3: T): ActionsObservable[T] = js.native
  def of[T /* <: Action[_] */](item1: T, item2: T, item3: T, item4: T): ActionsObservable[T] = js.native
  def of[T /* <: Action[_] */](item1: T, item2: T, item3: T, item4: T, item5: T): ActionsObservable[T] = js.native
  def of[T /* <: Action[_] */](item1: T, item2: T, item3: T, item4: T, item5: T, item6: T): ActionsObservable[T] = js.native
  def of[T /* <: Action[_] */](item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, scheduler: SchedulerLike): ActionsObservable[T] = js.native
  def of[T /* <: Action[_] */](item1: T, item2: T, item3: T, item4: T, item5: T, scheduler: SchedulerLike): ActionsObservable[T] = js.native
  def of[T /* <: Action[_] */](item1: T, item2: T, item3: T, item4: T, scheduler: SchedulerLike): ActionsObservable[T] = js.native
  def of[T /* <: Action[_] */](item1: T, item2: T, item3: T, scheduler: SchedulerLike): ActionsObservable[T] = js.native
  def of[T /* <: Action[_] */](item1: T, item2: T, scheduler: SchedulerLike): ActionsObservable[T] = js.native
  def of[T /* <: Action[_] */](item1: T, scheduler: SchedulerLike): ActionsObservable[T] = js.native
}

