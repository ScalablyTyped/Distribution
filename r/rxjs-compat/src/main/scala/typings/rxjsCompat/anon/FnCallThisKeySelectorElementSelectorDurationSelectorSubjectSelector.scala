package typings.rxjsCompat.anon

import typings.rxjs.mod.Observable_
import typings.rxjs.mod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisKeySelectorElementSelectorDurationSelectorSubjectSelector extends StObject {
  
  def apply[T, K](keySelector: js.Function1[/* value */ T, K]): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ Any
  ] = js.native
  def apply[T, K](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ /* grouped */ Any, 
      Observable_[Any]
    ]
  ): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ Any
  ] = js.native
  def apply[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ] = js.native
  def apply[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ Any, 
      Observable_[Any]
    ]
  ): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ] = js.native
  def apply[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ Any, 
      Observable_[Any]
    ],
    subjectSelector: js.Function0[Subject[R]]
  ): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ] = js.native
  def apply[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: Unit,
    subjectSelector: js.Function0[Subject[R]]
  ): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ] = js.native
  def apply[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ Any, 
      Observable_[Any]
    ],
    subjectSelector: js.Function0[Subject[R]]
  ): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ] = js.native
  def apply[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: Unit,
    subjectSelector: js.Function0[Subject[R]]
  ): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
  ] = js.native
}
