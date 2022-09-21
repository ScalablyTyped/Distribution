package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/GenerateObservable", "GenerateObservable")
  @js.native
  open class GenerateObservable[T] () extends StObject
  /* static members */
  object GenerateObservable {
    
    @JSImport("rxjs-compat/observable/GenerateObservable", "GenerateObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[S](
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GenerateBaseOptions<S> */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def create[T, S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ Any,
      resultSelector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResultFunc<S, T> */ Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def create_TS[T, S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ Any,
      resultSelector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResultFunc<S, T> */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create_TS[T, S](
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GenerateOptions<T, S> */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}
