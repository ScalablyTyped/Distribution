package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/generate", JSImport.Namespace)
@js.native
object internalObservableGenerateMod extends js.Object {
  @js.native
  trait GenerateBaseOptions[S] extends js.Object {
    /**
      * Condition function that accepts state and returns boolean.
      * When it returns false, the generator stops.
      * If not specified, a generator never stops.
      */
    var condition: js.UndefOr[ConditionFunc[S]] = js.native
    /**
      * Initial state.
      */
    var initialState: S = js.native
    /**
      * Iterate function that accepts state and returns new state.
      */
    @JSName("iterate")
    var iterate_Original: IterateFunc[S] = js.native
    /**
      * SchedulerLike to use for generation process.
      * By default, a generator starts immediately.
      */
    var scheduler: js.UndefOr[SchedulerLike] = js.native
    /**
      * Iterate function that accepts state and returns new state.
      */
    def iterate(state: S): S = js.native
  }
  
  @js.native
  trait GenerateOptions[T, S] extends GenerateBaseOptions[S] {
    /**
      * Result selection function that accepts state and returns a value to emit.
      */
    @JSName("resultSelector")
    var resultSelector_Original: ResultFunc[S, T] = js.native
    /**
      * Result selection function that accepts state and returns a value to emit.
      */
    def resultSelector(state: S): T = js.native
  }
  
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
  type ConditionFunc[S] = js.Function1[/* state */ S, Boolean]
  type IterateFunc[S] = js.Function1[/* state */ S, S]
  type ResultFunc[S, T] = js.Function1[/* state */ S, T]
}

