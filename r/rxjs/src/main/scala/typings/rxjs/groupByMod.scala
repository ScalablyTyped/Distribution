package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.subjectMod.Subject
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupByMod {
  
  @JSImport("rxjs/internal/operators/groupBy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/operators/groupBy", "GroupedObservable")
  @js.native
  class GroupedObservable[K, T] protected () extends Observable[T] {
    /** @deprecated Do not construct this type. Internal use only */
    def this(key: K, groupSubject: Subject[T]) = this()
    def this(key: K, groupSubject: Subject[T], refCountSubscription: RefCountSubscription) = this()
    
    /* private */ var groupSubject: js.Any = js.native
    
    var key: K = js.native
    
    /* private */ var refCountSubscription: js.Any = js.native
  }
  
  inline def groupBy[T, K](keySelector: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, GroupedObservable[K, T]]]
  inline def groupBy[T, K](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, T], Observable[js.Any]]
  ): OperatorFunction[T, GroupedObservable[K, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, T]]]
  inline def groupBy[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[js.Any]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[js.Any]],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: Unit,
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[js.Any]],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: Unit,
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  
  inline def groupBy_TKR[T, K, R](keySelector: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy_TKR[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[js.Any]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  
  trait RefCountSubscription extends StObject {
    
    var attemptedToUnsubscribe: Boolean
    
    var closed: Boolean
    
    var count: Double
    
    def unsubscribe(): Unit
  }
  object RefCountSubscription {
    
    inline def apply(attemptedToUnsubscribe: Boolean, closed: Boolean, count: Double, unsubscribe: () => Unit): RefCountSubscription = {
      val __obj = js.Dynamic.literal(attemptedToUnsubscribe = attemptedToUnsubscribe.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[RefCountSubscription]
    }
    
    extension [Self <: RefCountSubscription](x: Self) {
      
      inline def setAttemptedToUnsubscribe(value: Boolean): Self = StObject.set(x, "attemptedToUnsubscribe", value.asInstanceOf[js.Any])
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
}
