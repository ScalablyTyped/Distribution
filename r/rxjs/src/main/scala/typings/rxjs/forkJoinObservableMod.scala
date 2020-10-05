package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/observable/ForkJoinObservable", JSImport.Namespace)
@js.native
object forkJoinObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class ForkJoinObservable[T] ()
    extends typings.rxjsCompat.forkJoinObservableMod.ForkJoinObservable[T]
  
  /* static members */
  @js.native
  object ForkJoinObservable extends js.Object {
    def create[T](
      sources: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any)*
    ): js.Any = js.native
    def create[T](
      sources: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ _
        ]
    ): js.Any = js.native
    def create[R](
      sources: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ _
        ],
      project: js.Function1[/* repeated */ js.Any, R]
    ): js.Any = js.native
    def create[T, R](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any,
      project: js.Function1[/* v1 */ T, R]
    ): js.Any = js.native
    def create[T, T2](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ js.Any
    ): js.Any = js.native
    def create[T, T2, R](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ js.Any,
      project: js.Function2[/* v1 */ T, /* v2 */ T2, R]
    ): js.Any = js.native
    def create[T, T2, T3](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ js.Any
    ): js.Any = js.native
    def create[T, T2, T3, R](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ js.Any,
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): js.Any = js.native
    def create[T, T2, T3, T4](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T4> */ js.Any
    ): js.Any = js.native
    def create[T, T2, T3, T4, R](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T4> */ js.Any,
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): js.Any = js.native
    def create[T, T2, T3, T4, T5](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T5> */ js.Any
    ): js.Any = js.native
    def create[T, T2, T3, T4, T5, R](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T5> */ js.Any,
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): js.Any = js.native
    def create[T, T2, T3, T4, T5, T6](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T6> */ js.Any
    ): js.Any = js.native
    def create[T, T2, T3, T4, T5, T6, R](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T6> */ js.Any,
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): js.Any = js.native
    @JSName("create")
    def create_R[R](
      sources: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ js.Any)*
    ): js.Any = js.native
    @JSName("create")
    def create_R[R](
      sources: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ _
        ]
    ): js.Any = js.native
    @JSName("create")
    def create_TR[T, R](
      sources: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ _
        ],
      project: js.Function1[/* repeated */ T, R]
    ): js.Any = js.native
  }
  
}

