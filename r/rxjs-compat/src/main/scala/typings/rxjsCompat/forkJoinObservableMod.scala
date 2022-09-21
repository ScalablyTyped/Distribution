package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forkJoinObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/ForkJoinObservable", "ForkJoinObservable")
  @js.native
  open class ForkJoinObservable[T] () extends StObject
  /* static members */
  object ForkJoinObservable {
    
    @JSImport("rxjs-compat/observable/ForkJoinObservable", "ForkJoinObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](
      sources: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ Any)*
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    inline def create[T](
      sources: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ Any
        ]
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def create[R](
      sources: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ Any
        ],
      project: js.Function1[/* repeated */ Any, R]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T, R](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ Any,
      project: js.Function1[/* v1 */ T, R]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T, T2](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T, T2, R](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ Any,
      project: js.Function2[/* v1 */ T, /* v2 */ T2, R]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T, T2, T3](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T, T2, T3, R](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ Any,
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T, T2, T3, T4](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T4> */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T, T2, T3, T4, R](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T4> */ Any,
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T, T2, T3, T4, T5](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T4> */ Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T5> */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T, T2, T3, T4, T5, R](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T4> */ Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T5> */ Any,
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T, T2, T3, T4, T5, T6](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T4> */ Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T5> */ Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T6> */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T, T2, T3, T4, T5, T6, R](
      v1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ Any,
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T2> */ Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T3> */ Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T4> */ Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T5> */ Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T6> */ Any,
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def create_R[R](
      sources: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ Any)*
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    inline def create_R[R](
      sources: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ Any
        ]
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def create_TR[T, R](
      sources: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ Any
        ],
      project: js.Function1[/* repeated */ T, R]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
