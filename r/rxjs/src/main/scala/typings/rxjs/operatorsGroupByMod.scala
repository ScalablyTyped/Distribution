package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsGroupByMod {
  
  @JSImport("rxjs/operators/groupBy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def groupBy[T, K](keySelector: js.Function1[/* value */ T, K]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def groupBy[T, K](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ /* grouped */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def groupBy[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ],
    subjectSelector: js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ js.Any
    ]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: Unit,
    subjectSelector: js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ js.Any
    ]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ],
    subjectSelector: js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ js.Any
    ]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: Unit,
    subjectSelector: js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ js.Any
    ]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def groupBy_TKR[T, K, R](keySelector: js.Function1[/* value */ T, K]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def groupBy_TKR[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
