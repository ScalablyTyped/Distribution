package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableGenerateMod.ConditionFunc
import typings.rxjs.distTypesInternalObservableGenerateMod.GenerateBaseOptions
import typings.rxjs.distTypesInternalObservableGenerateMod.GenerateOptions
import typings.rxjs.distTypesInternalObservableGenerateMod.IterateFunc
import typings.rxjs.distTypesInternalObservableGenerateMod.ResultFunc
import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableGenerateMod {
  
  @JSImport("rxjs-compat/observable/generate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S]): Observable[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any])).asInstanceOf[Observable[S]]
  inline def generate[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S], scheduler: SchedulerLike): Observable[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[S]]
  inline def generate[S](options: GenerateBaseOptions[S]): Observable[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[Observable[S]]
  inline def generate[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def generate[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T],
    scheduler: SchedulerLike
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def generate[T, S](options: GenerateOptions[T, S]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
}
