package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/observable/GenerateObservable", JSImport.Namespace)
@js.native
object generateObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class GenerateObservable[T] () extends js.Object
  
  /* static members */
  @js.native
  object GenerateObservable extends js.Object {
    def create[S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ js.Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ js.Any
    ): js.Any = js.native
    def create[S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ js.Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def create[S](
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GenerateBaseOptions<S> */ js.Any
    ): js.Any = js.native
    def create[T, S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ js.Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ js.Any,
      resultSelector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResultFunc<S, T> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    @JSName("create")
    def create_TS[T, S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ js.Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ js.Any,
      resultSelector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResultFunc<S, T> */ js.Any
    ): js.Any = js.native
    @JSName("create")
    def create_TS[T, S](
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GenerateOptions<T, S> */ js.Any
    ): js.Any = js.native
  }
  
}

