package typings.rxjs

import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.subscriptionMod.Subscription
import typings.rxjs.typesMod.PartialObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object innerSubscribeMod {
  
  @JSImport("rxjs/internal/innerSubscribe", "ComplexInnerSubscriber")
  @js.native
  class ComplexInnerSubscriber[T, R] protected () extends Subscriber[R] {
    def this(parent: ComplexOuterSubscriber[T, R], outerValue: T, outerIndex: Double) = this()
    
    var outerIndex: Double = js.native
    
    var outerValue: T = js.native
    
    var parent: js.Any = js.native
  }
  
  @JSImport("rxjs/internal/innerSubscribe", "ComplexOuterSubscriber")
  @js.native
  /**
    * @param {Observer|function(value: T): void} [destinationOrNext] A partially
    * defined Observer or a `next` callback function.
    * @param {function(e: ?any): void} [error] The `error` callback of an
    * Observer.
    * @param {function(): void} [complete] The `complete` callback of an
    * Observer.
    */
  class ComplexOuterSubscriber[T, R] () extends Subscriber[T] {
    def this(destinationOrNext: js.Function1[/* value */ T, Unit]) = this()
    def this(destinationOrNext: PartialObserver[_]) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(destinationOrNext: PartialObserver[_], error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: PartialObserver[_],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: PartialObserver[_],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    
    /**
      * @param _innerSub Used by: race, bufferToggle, delayWhen, windowToggle, windowWhen
      */
    def notifyComplete(_innerSub: ComplexInnerSubscriber[T, R]): Unit = js.native
    
    def notifyError(error: js.Any): Unit = js.native
    
    /**
      * @param _outerValue Used by: bufferToggle, delayWhen, windowToggle
      * @param innerValue Used by: subclass default, combineLatest, race, bufferToggle, windowToggle, withLatestFrom
      * @param _outerIndex Used by: combineLatest, race, withLatestFrom
      * @param _innerSub Used by: delayWhen
      */
    def notifyNext(_outerValue: T, innerValue: R, _outerIndex: Double, _innerSub: ComplexInnerSubscriber[T, R]): Unit = js.native
  }
  
  @JSImport("rxjs/internal/innerSubscribe", "SimpleInnerSubscriber")
  @js.native
  class SimpleInnerSubscriber[T] protected () extends Subscriber[T] {
    def this(parent: SimpleOuterSubscriberLike[_]) = this()
    
    var parent: js.Any = js.native
  }
  
  @JSImport("rxjs/internal/innerSubscribe", "SimpleOuterSubscriber")
  @js.native
  /**
    * @param {Observer|function(value: T): void} [destinationOrNext] A partially
    * defined Observer or a `next` callback function.
    * @param {function(e: ?any): void} [error] The `error` callback of an
    * Observer.
    * @param {function(): void} [complete] The `complete` callback of an
    * Observer.
    */
  class SimpleOuterSubscriber[T, R] ()
    extends Subscriber[T]
       with SimpleOuterSubscriberLike[R] {
    def this(destinationOrNext: js.Function1[/* value */ T, Unit]) = this()
    def this(destinationOrNext: PartialObserver[_]) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(destinationOrNext: PartialObserver[_], error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: PartialObserver[_],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: PartialObserver[_],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
  }
  
  @JSImport("rxjs/internal/innerSubscribe", "innerSubscribe")
  @js.native
  def innerSubscribe(result: js.Any, innerSubscriber: Subscriber[_]): js.UndefOr[Subscription] = js.native
  
  @js.native
  trait SimpleOuterSubscriberLike[T] extends StObject {
    
    /**
      * A handler for inner complete notifications from the inner subscription.
      */
    def notifyComplete(): Unit = js.native
    
    /**
      * A handler for inner error notifications from the inner subscription
      * @param err the error from the inner producer
      */
    def notifyError(err: js.Any): Unit = js.native
    
    /**
      * A handler for inner next notifications from the inner subscription
      * @param innerValue the value nexted by the inner producer
      */
    def notifyNext(innerValue: T): Unit = js.native
  }
  object SimpleOuterSubscriberLike {
    
    @scala.inline
    def apply[T](notifyComplete: () => Unit, notifyError: js.Any => Unit, notifyNext: T => Unit): SimpleOuterSubscriberLike[T] = {
      val __obj = js.Dynamic.literal(notifyComplete = js.Any.fromFunction0(notifyComplete), notifyError = js.Any.fromFunction1(notifyError), notifyNext = js.Any.fromFunction1(notifyNext))
      __obj.asInstanceOf[SimpleOuterSubscriberLike[T]]
    }
    
    @scala.inline
    implicit class SimpleOuterSubscriberLikeMutableBuilder[Self <: SimpleOuterSubscriberLike[_], T] (val x: Self with SimpleOuterSubscriberLike[T]) extends AnyVal {
      
      @scala.inline
      def setNotifyComplete(value: () => Unit): Self = StObject.set(x, "notifyComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyError(value: js.Any => Unit): Self = StObject.set(x, "notifyError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyNext(value: T => Unit): Self = StObject.set(x, "notifyNext", js.Any.fromFunction1(value))
    }
  }
}
