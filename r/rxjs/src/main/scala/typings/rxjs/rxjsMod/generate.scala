package typings.rxjs.rxjsMod

import typings.rxjs.internalObservableGenerateMod.ConditionFunc
import typings.rxjs.internalObservableGenerateMod.GenerateBaseOptions
import typings.rxjs.internalObservableGenerateMod.GenerateOptions
import typings.rxjs.internalObservableGenerateMod.IterateFunc
import typings.rxjs.internalObservableGenerateMod.ResultFunc
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "generate")
@js.native
object generate extends js.Object {
  def apply[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S]): typings.rxjs.internalObservableMod.Observable[S] = js.native
  def apply[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S], scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[S] = js.native
  def apply[S](options: GenerateBaseOptions[S]): typings.rxjs.internalObservableMod.Observable[S] = js.native
  def apply[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T]
  ): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T],
    scheduler: SchedulerLike
  ): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T, S](options: GenerateOptions[T, S]): typings.rxjs.internalObservableMod.Observable[T] = js.native
}

