package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multicastMod {
  
  @JSImport("rxjs-compat/operators/multicast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multicast[T](
    SubjectFactory: js.ThisFunction0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ js.Any
    ]
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(SubjectFactory.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def multicast[T](
    SubjectFactory: js.ThisFunction0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ js.Any
    ],
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(SubjectFactory.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def multicast[T](
    subjectOrSubjectFactory: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FactoryOrValue<Subject<T>> */ js.Any
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subjectOrSubjectFactory.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def multicast_TR[T, R](
    SubjectFactory: js.ThisFunction0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ js.Any
    ]
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(SubjectFactory.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def multicast_TR[T, R](
    SubjectFactory: js.ThisFunction0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ js.Any
    ],
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(SubjectFactory.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
