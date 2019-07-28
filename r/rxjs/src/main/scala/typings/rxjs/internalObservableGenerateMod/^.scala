package typings.rxjs.internalObservableGenerateMod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/generate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generate[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S]): Observable[S] = js.native
  def generate[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S], scheduler: SchedulerLike): Observable[S] = js.native
  def generate[S](options: GenerateBaseOptions[S]): Observable[S] = js.native
  def generate[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T]
  ): Observable[T] = js.native
  def generate[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T],
    scheduler: SchedulerLike
  ): Observable[T] = js.native
  def generate[T, S](options: GenerateOptions[T, S]): Observable[T] = js.native
}

