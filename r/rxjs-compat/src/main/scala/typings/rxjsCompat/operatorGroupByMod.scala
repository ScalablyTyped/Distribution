package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import typings.rxjs.mod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorGroupByMod {
  
  @JSImport("rxjs-compat/operator/groupBy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def groupBy[T, K](keySelector: js.Function1[/* value */ T, K]): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any]).asInstanceOf[Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ Any
  ]]
  inline def groupBy[T, K](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ /* grouped */ Any, 
      Observable_[Any]
    ]
  ): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any])).asInstanceOf[Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ Any
  ]]
  inline def groupBy[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any])).asInstanceOf[Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ]]
  inline def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ Any, 
      Observable_[Any]
    ]
  ): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any])).asInstanceOf[Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ]]
  inline def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ Any, 
      Observable_[Any]
    ],
    subjectSelector: js.Function0[Subject[R]]
  ): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ]]
  inline def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: Unit,
    subjectSelector: js.Function0[Subject[R]]
  ): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ]]
  inline def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ Any, 
      Observable_[Any]
    ],
    subjectSelector: js.Function0[Subject[R]]
  ): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ]]
  inline def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: Unit,
    subjectSelector: js.Function0[Subject[R]]
  ): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ]]
  
  inline def groupBy_TKR[T, K, R](keySelector: js.Function1[/* value */ T, K]): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any]).asInstanceOf[Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ]]
  inline def groupBy_TKR[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ Any, 
      Observable_[Any]
    ]
  ): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any])).asInstanceOf[Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ]]
}
