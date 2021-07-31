package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/GenerateObservable", "GenerateObservable")
  @js.native
  class GenerateObservable[T] () extends StObject
  /* static members */
  object GenerateObservable {
    
    @JSImport("rxjs-compat/observable/GenerateObservable", "GenerateObservable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create[S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ js.Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create[S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ js.Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create[S](
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GenerateBaseOptions<S> */ js.Any
    ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def create[T, S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ js.Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ js.Any,
      resultSelector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResultFunc<S, T> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def create_TS[T, S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ js.Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ js.Any,
      resultSelector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResultFunc<S, T> */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create_TS[T, S](
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GenerateOptions<T, S> */ js.Any
    ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
