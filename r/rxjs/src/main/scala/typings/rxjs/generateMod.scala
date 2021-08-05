package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateMod {
  
  @JSImport("rxjs/internal/observable/generate", JSImport.Namespace)
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
  
  type ConditionFunc[S] = js.Function1[/* state */ S, Boolean]
  
  trait GenerateBaseOptions[S] extends StObject {
    
    /**
      * Condition function that accepts state and returns boolean.
      * When it returns false, the generator stops.
      * If not specified, a generator never stops.
      */
    var condition: js.UndefOr[ConditionFunc[S]] = js.undefined
    
    /**
      * Initial state.
      */
    var initialState: S
    
    /**
      * Iterate function that accepts state and returns new state.
      */
    def iterate(state: S): S
    /**
      * Iterate function that accepts state and returns new state.
      */
    @JSName("iterate")
    var iterate_Original: IterateFunc[S]
    
    /**
      * SchedulerLike to use for generation process.
      * By default, a generator starts immediately.
      */
    var scheduler: js.UndefOr[SchedulerLike] = js.undefined
  }
  object GenerateBaseOptions {
    
    inline def apply[S](initialState: S, iterate: S => S): GenerateBaseOptions[S] = {
      val __obj = js.Dynamic.literal(initialState = initialState.asInstanceOf[js.Any], iterate = js.Any.fromFunction1(iterate))
      __obj.asInstanceOf[GenerateBaseOptions[S]]
    }
    
    extension [Self <: GenerateBaseOptions[?], S](x: Self & GenerateBaseOptions[S]) {
      
      inline def setCondition(value: S => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setInitialState(value: S): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setIterate(value: S => S): Self = StObject.set(x, "iterate", js.Any.fromFunction1(value))
      
      inline def setScheduler(value: SchedulerLike): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
    }
  }
  
  trait GenerateOptions[T, S]
    extends StObject
       with GenerateBaseOptions[S] {
    
    /**
      * Result selection function that accepts state and returns a value to emit.
      */
    def resultSelector(state: S): T
    /**
      * Result selection function that accepts state and returns a value to emit.
      */
    @JSName("resultSelector")
    var resultSelector_Original: ResultFunc[S, T]
  }
  object GenerateOptions {
    
    inline def apply[T, S](initialState: S, iterate: S => S, resultSelector: S => T): GenerateOptions[T, S] = {
      val __obj = js.Dynamic.literal(initialState = initialState.asInstanceOf[js.Any], iterate = js.Any.fromFunction1(iterate), resultSelector = js.Any.fromFunction1(resultSelector))
      __obj.asInstanceOf[GenerateOptions[T, S]]
    }
    
    extension [Self <: GenerateOptions[?, ?], T, S](x: Self & (GenerateOptions[T, S])) {
      
      inline def setResultSelector(value: S => T): Self = StObject.set(x, "resultSelector", js.Any.fromFunction1(value))
    }
  }
  
  type IterateFunc[S] = js.Function1[/* state */ S, S]
  
  type ResultFunc[S, T] = js.Function1[/* state */ S, T]
}
