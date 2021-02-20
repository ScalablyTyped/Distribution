package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.subjectMod.Subject
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupByMod {
  
  @JSImport("rxjs/internal/operators/groupBy", "GroupedObservable")
  @js.native
  class GroupedObservable[K, T] protected () extends Observable[T] {
    /** @deprecated Do not construct this type. Internal use only */
    def this(key: K, groupSubject: Subject[T]) = this()
    def this(key: K, groupSubject: Subject[T], refCountSubscription: RefCountSubscription) = this()
    
    var groupSubject: js.Any = js.native
    
    var key: K = js.native
    
    var refCountSubscription: js.Any = js.native
  }
  
  @JSImport("rxjs/internal/operators/groupBy", "groupBy")
  @js.native
  def groupBy[T, K](keySelector: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, T]] = js.native
  @JSImport("rxjs/internal/operators/groupBy", "groupBy")
  @js.native
  def groupBy[T, K](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, T], Observable[_]]
  ): OperatorFunction[T, GroupedObservable[K, T]] = js.native
  @JSImport("rxjs/internal/operators/groupBy", "groupBy")
  @js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.UndefOr[scala.Nothing],
    durationSelector: js.UndefOr[scala.Nothing],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  @JSImport("rxjs/internal/operators/groupBy", "groupBy")
  @js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.UndefOr[scala.Nothing],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[_]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  @JSImport("rxjs/internal/operators/groupBy", "groupBy")
  @js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.UndefOr[scala.Nothing],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[_]],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  @JSImport("rxjs/internal/operators/groupBy", "groupBy")
  @js.native
  def groupBy[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  @JSImport("rxjs/internal/operators/groupBy", "groupBy")
  @js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.UndefOr[scala.Nothing],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  @JSImport("rxjs/internal/operators/groupBy", "groupBy")
  @js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[_]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  @JSImport("rxjs/internal/operators/groupBy", "groupBy")
  @js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[_]],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  @JSImport("rxjs/internal/operators/groupBy", "groupBy")
  @js.native
  def groupBy_TKR[T, K, R](keySelector: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  
  @js.native
  trait RefCountSubscription extends StObject {
    
    var attemptedToUnsubscribe: Boolean = js.native
    
    var closed: Boolean = js.native
    
    var count: Double = js.native
    
    def unsubscribe(): Unit = js.native
  }
  object RefCountSubscription {
    
    @scala.inline
    def apply(attemptedToUnsubscribe: Boolean, closed: Boolean, count: Double, unsubscribe: () => Unit): RefCountSubscription = {
      val __obj = js.Dynamic.literal(attemptedToUnsubscribe = attemptedToUnsubscribe.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[RefCountSubscription]
    }
    
    @scala.inline
    implicit class RefCountSubscriptionMutableBuilder[Self <: RefCountSubscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttemptedToUnsubscribe(value: Boolean): Self = StObject.set(x, "attemptedToUnsubscribe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
}
