package typings.rxjs.mod

import typings.rxjs.generateMod.ConditionFunc
import typings.rxjs.generateMod.GenerateBaseOptions
import typings.rxjs.generateMod.GenerateOptions
import typings.rxjs.generateMod.IterateFunc
import typings.rxjs.generateMod.ResultFunc
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "generate")
@js.native
object generate extends js.Object {
  def apply[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S]): Observable[S] = js.native
  def apply[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S], scheduler: SchedulerLike): Observable[S] = js.native
  def apply[S](options: GenerateBaseOptions[S]): Observable[S] = js.native
  def apply[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T]
  ): Observable[T] = js.native
  def apply[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T],
    scheduler: SchedulerLike
  ): Observable[T] = js.native
  def apply[T, S](options: GenerateOptions[T, S]): Observable[T] = js.native
}

