package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.actionMod.Action
import typings.rxjs.ajaxObservableMod.AjaxCreationMethod
import typings.rxjs.ajaxObservableMod.AjaxErrorCtor
import typings.rxjs.ajaxObservableMod.AjaxRequest
import typings.rxjs.ajaxObservableMod.AjaxTimeoutErrorCtor
import typings.rxjs.argumentOutOfRangeErrorMod.ArgumentOutOfRangeErrorCtor
import typings.rxjs.emptyErrorMod.EmptyErrorCtor
import typings.rxjs.groupByMod.RefCountSubscription
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.objectUnsubscribedErrorMod.ObjectUnsubscribedErrorCtor
import typings.rxjs.subjectMod.Subject
import typings.rxjs.subscribeOnObservableMod.DispatchArg
import typings.rxjs.subscriptionMod.Subscription
import typings.rxjs.throttleMod.ThrottleConfig
import typings.rxjs.timeIntervalMod.TimeInterval_
import typings.rxjs.timeoutErrorMod.TimeoutErrorCtor
import typings.rxjs.timestampMod.Timestamp_
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.Observer
import typings.rxjs.typesMod.PartialObserver
import typings.rxjs.typesMod.SchedulerLike
import typings.rxjs.typesMod.UnaryFunction
import typings.rxjs.unsubscriptionErrorMod.UnsubscriptionErrorCtor
import typings.rxjs.webSocketSubjectMod.WebSocketSubjectConfig
import typings.std.ArrayLike
import typings.std.Error
import typings.std.Event
import typings.std.Iterable
import typings.std.PromiseConstructorLike
import typings.std.PromiseLike
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalCompatibilityMod {
  
  @JSImport("rxjs/internal-compatibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal-compatibility", "AjaxError")
  @js.native
  val AjaxError: AjaxErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal-compatibility", "AjaxError")
  @js.native
  class AjaxErrorCls protected ()
    extends StObject
       with typings.rxjs.ajaxObservableMod.AjaxError {
    def this(message: String, xhr: XMLHttpRequest, request: AjaxRequest) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /** @type {AjaxRequest} The AjaxRequest associated with the error */
    /* CompleteClass */
    var request: AjaxRequest = js.native
    
    /** @type {string|ArrayBuffer|Document|object|any} The response data */
    /* CompleteClass */
    var response: js.Any = js.native
    
    /** @type {string} The responseType (e.g. 'json', 'arraybuffer', or 'xml') */
    /* CompleteClass */
    var responseType: String = js.native
    
    /** @type {number} The HTTP status code */
    /* CompleteClass */
    var status: Double = js.native
    
    /** @type {XMLHttpRequest} The XHR instance associated with the error */
    /* CompleteClass */
    var xhr: XMLHttpRequest = js.native
  }
  
  @JSImport("rxjs/internal-compatibility", "AjaxObservable")
  @js.native
  class AjaxObservable[T] protected ()
    extends typings.rxjs.ajaxObservableMod.AjaxObservable[T] {
    def this(urlOrRequest: String) = this()
    def this(urlOrRequest: AjaxRequest) = this()
  }
  /* static members */
  object AjaxObservable {
    
    @JSImport("rxjs/internal-compatibility", "AjaxObservable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an observable for an Ajax request with either a request object with
      * url, headers, etc or a string for a URL.
      *
      * ## Example
      * ```ts
      * import { ajax } from 'rxjs/ajax';
      *
      * const source1 = ajax('/products');
      * const source2 = ajax({ url: 'products', method: 'GET' });
      * ```
      *
      * @param {string|Object} request Can be one of the following:
      *   A string of the URL to make the Ajax call.
      *   An object with the following properties
      *   - url: URL of the request
      *   - body: The body of the request
      *   - method: Method of the request, such as GET, POST, PUT, PATCH, DELETE
      *   - async: Whether the request is async
      *   - headers: Optional headers
      *   - crossDomain: true if a cross domain request, else false
      *   - createXHR: a function to override if you need to use an alternate
      *   XMLHttpRequest implementation.
      *   - resultSelector: a function to use to alter the output value type of
      *   the Observable. Gets {@link AjaxResponse} as an argument.
      * @return {Observable} An observable sequence containing the XMLHttpRequest.
      * @static true
      * @name ajax
      * @owner Observable
      * @nocollapse
      */
    @JSImport("rxjs/internal-compatibility", "AjaxObservable.create")
    @js.native
    def create: AjaxCreationMethod = js.native
    /**
      * Creates an observable for an Ajax request with either a request object with
      * url, headers, etc or a string for a URL.
      *
      * ## Example
      * ```ts
      * import { ajax } from 'rxjs/ajax';
      *
      * const source1 = ajax('/products');
      * const source2 = ajax({ url: 'products', method: 'GET' });
      * ```
      *
      * @param {string|Object} request Can be one of the following:
      *   A string of the URL to make the Ajax call.
      *   An object with the following properties
      *   - url: URL of the request
      *   - body: The body of the request
      *   - method: Method of the request, such as GET, POST, PUT, PATCH, DELETE
      *   - async: Whether the request is async
      *   - headers: Optional headers
      *   - crossDomain: true if a cross domain request, else false
      *   - createXHR: a function to override if you need to use an alternate
      *   XMLHttpRequest implementation.
      *   - resultSelector: a function to use to alter the output value type of
      *   the Observable. Gets {@link AjaxResponse} as an argument.
      * @return {Observable} An observable sequence containing the XMLHttpRequest.
      * @static true
      * @name ajax
      * @owner Observable
      * @nocollapse
      */
    inline def create(urlOrRequest: String): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(urlOrRequest.asInstanceOf[js.Any]).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
    inline def create(urlOrRequest: AjaxRequest): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(urlOrRequest.asInstanceOf[js.Any]).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
    inline def create_=(x: AjaxCreationMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs/internal-compatibility", "AjaxResponse")
  @js.native
  class AjaxResponse protected ()
    extends typings.rxjs.ajaxObservableMod.AjaxResponse {
    def this(originalEvent: Event, xhr: XMLHttpRequest, request: AjaxRequest) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "AjaxSubscriber")
  @js.native
  class AjaxSubscriber[T] protected ()
    extends typings.rxjs.ajaxObservableMod.AjaxSubscriber[T] {
    def this(destination: typings.rxjs.subscriberMod.Subscriber[T], request: AjaxRequest) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "AjaxTimeoutError")
  @js.native
  val AjaxTimeoutError: AjaxTimeoutErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal-compatibility", "AjaxTimeoutError")
  @js.native
  class AjaxTimeoutErrorCls protected ()
    extends StObject
       with typings.rxjs.ajaxObservableMod.AjaxError {
    def this(xhr: XMLHttpRequest, request: AjaxRequest) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /** @type {AjaxRequest} The AjaxRequest associated with the error */
    /* CompleteClass */
    var request: AjaxRequest = js.native
    
    /** @type {string|ArrayBuffer|Document|object|any} The response data */
    /* CompleteClass */
    var response: js.Any = js.native
    
    /** @type {string} The responseType (e.g. 'json', 'arraybuffer', or 'xml') */
    /* CompleteClass */
    var responseType: String = js.native
    
    /** @type {number} The HTTP status code */
    /* CompleteClass */
    var status: Double = js.native
    
    /** @type {XMLHttpRequest} The XHR instance associated with the error */
    /* CompleteClass */
    var xhr: XMLHttpRequest = js.native
  }
  
  @JSImport("rxjs/internal-compatibility", "AnonymousSubject")
  @js.native
  class AnonymousSubject[T] ()
    extends typings.rxjs.subjectMod.AnonymousSubject[T] {
    def this(destination: Observer[T]) = this()
    def this(destination: Unit, source: Observable[T]) = this()
    def this(destination: Observer[T], source: Observable[T]) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "ArgumentOutOfRangeError")
  @js.native
  val ArgumentOutOfRangeError: ArgumentOutOfRangeErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal-compatibility", "ArgumentOutOfRangeError")
  @js.native
  class ArgumentOutOfRangeErrorCls ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs/internal-compatibility", "CombineLatestOperator")
  @js.native
  class CombineLatestOperator[T, R] ()
    extends typings.rxjs.combineLatestMod.CombineLatestOperator[T, R] {
    def this(resultSelector: js.Function1[/* repeated */ js.Any, R]) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "EmptyError")
  @js.native
  val EmptyError: EmptyErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal-compatibility", "EmptyError")
  @js.native
  class EmptyErrorCls ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs/internal-compatibility", "GroupedObservable")
  @js.native
  class GroupedObservable[K, T] protected ()
    extends typings.rxjs.groupByMod.GroupedObservable[K, T] {
    /** @deprecated Do not construct this type. Internal use only */
    def this(key: K, groupSubject: Subject[T]) = this()
    def this(key: K, groupSubject: Subject[T], refCountSubscription: RefCountSubscription) = this()
  }
  
  object Immediate {
    
    @JSImport("rxjs/internal-compatibility", "Immediate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clearImmediate(handle: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearImmediate")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setImmediate(cb: js.Function0[Unit]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(cb.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSImport("rxjs/internal-compatibility", "InnerSubscriber")
  @js.native
  class InnerSubscriber[T, R] protected ()
    extends typings.rxjs.innerSubscriberMod.InnerSubscriber[T, R] {
    def this(parent: typings.rxjs.outerSubscriberMod.OuterSubscriber[T, R], outerValue: T, outerIndex: Double) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "ObjectUnsubscribedError")
  @js.native
  val ObjectUnsubscribedError: ObjectUnsubscribedErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal-compatibility", "ObjectUnsubscribedError")
  @js.native
  class ObjectUnsubscribedErrorCls ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs/internal-compatibility", "OuterSubscriber")
  @js.native
  /**
    * @param {Observer|function(value: T): void} [destinationOrNext] A partially
    * defined Observer or a `next` callback function.
    * @param {function(e: ?any): void} [error] The `error` callback of an
    * Observer.
    * @param {function(): void} [complete] The `complete` callback of an
    * Observer.
    */
  class OuterSubscriber[T, R] ()
    extends typings.rxjs.outerSubscriberMod.OuterSubscriber[T, R] {
    def this(destinationOrNext: js.Function1[/* value */ T, Unit]) = this()
    def this(destinationOrNext: PartialObserver[js.Any]) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(destinationOrNext: Unit, error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]) = this()
    def this(destinationOrNext: PartialObserver[js.Any], error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(destinationOrNext: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]) = this()
    def this(
      destinationOrNext: Unit,
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(destinationOrNext: Unit, error: Unit, complete: js.Function0[Unit]) = this()
    def this(
      destinationOrNext: PartialObserver[js.Any],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(destinationOrNext: PartialObserver[js.Any], error: Unit, complete: js.Function0[Unit]) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "Scheduler")
  @js.native
  class Scheduler protected ()
    extends typings.rxjs.schedulerMod.Scheduler {
    def this(SchedulerAction: Instantiable2[
            /* scheduler */ typings.rxjs.schedulerMod.Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typings.rxjs.typesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              Unit
            ], 
            Action[js.Object]
          ]) = this()
    def this(
      SchedulerAction: Instantiable2[
            /* scheduler */ typings.rxjs.schedulerMod.Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typings.rxjs.typesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              Unit
            ], 
            Action[js.Object]
          ],
      now: js.Function0[Double]
    ) = this()
  }
  /* static members */
  object Scheduler {
    
    @JSImport("rxjs/internal-compatibility", "Scheduler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Note: the extra arrow function wrapper is to make testing by overriding
      * Date.now easier.
      * @nocollapse
      */
    inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  }
  
  @JSImport("rxjs/internal-compatibility", "SubjectSubscription")
  @js.native
  class SubjectSubscription[T] protected ()
    extends typings.rxjs.subjectSubscriptionMod.SubjectSubscription[T] {
    def this(subject: Subject[T], subscriber: Observer[T]) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "SubscribeOnObservable")
  @js.native
  class SubscribeOnObservable[T] protected ()
    extends typings.rxjs.subscribeOnObservableMod.SubscribeOnObservable[T] {
    def this(source: Observable[T]) = this()
    def this(source: Observable[T], delayTime: Double) = this()
    def this(source: Observable[T], delayTime: Double, scheduler: SchedulerLike) = this()
    def this(source: Observable[T], delayTime: Unit, scheduler: SchedulerLike) = this()
  }
  /* static members */
  object SubscribeOnObservable {
    
    @JSImport("rxjs/internal-compatibility", "SubscribeOnObservable")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    inline def create[T](source: Observable[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
    inline def create[T](source: Observable[T], delay: Double): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
    inline def create[T](source: Observable[T], delay: Double, scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
    inline def create[T](source: Observable[T], delay: Unit, scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
    
    /** @nocollapse */
    inline def dispatch[T](arg: DispatchArg[T]): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(arg.asInstanceOf[js.Any]).asInstanceOf[Subscription]
  }
  
  @JSImport("rxjs/internal-compatibility", "Subscriber")
  @js.native
  /**
    * @param {Observer|function(value: T): void} [destinationOrNext] A partially
    * defined Observer or a `next` callback function.
    * @param {function(e: ?any): void} [error] The `error` callback of an
    * Observer.
    * @param {function(): void} [complete] The `complete` callback of an
    * Observer.
    */
  class Subscriber[T] ()
    extends typings.rxjs.subscriberMod.Subscriber[T] {
    def this(destinationOrNext: js.Function1[/* value */ T, Unit]) = this()
    def this(destinationOrNext: PartialObserver[js.Any]) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(destinationOrNext: Unit, error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]) = this()
    def this(destinationOrNext: PartialObserver[js.Any], error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(destinationOrNext: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]) = this()
    def this(
      destinationOrNext: Unit,
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(destinationOrNext: Unit, error: Unit, complete: js.Function0[Unit]) = this()
    def this(
      destinationOrNext: PartialObserver[js.Any],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(destinationOrNext: PartialObserver[js.Any], error: Unit, complete: js.Function0[Unit]) = this()
  }
  /* static members */
  object Subscriber {
    
    @JSImport("rxjs/internal-compatibility", "Subscriber")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A static factory for a Subscriber, given a (potentially partial) definition
      * of an Observer.
      * @param {function(x: ?T): void} [next] The `next` callback of an Observer.
      * @param {function(e: ?any): void} [error] The `error` callback of an
      * Observer.
      * @param {function(): void} [complete] The `complete` callback of an
      * Observer.
      * @return {Subscriber<T>} A Subscriber wrapping the (partially defined)
      * Observer represented by the given arguments.
      * @nocollapse
      */
    inline def create[T](): typings.rxjs.subscriberMod.Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
    inline def create[T](next: js.Function1[/* x */ js.UndefOr[T], Unit]): typings.rxjs.subscriberMod.Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
    inline def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
    inline def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
    inline def create[T](next: js.Function1[/* x */ js.UndefOr[T], Unit], error: Unit, complete: js.Function0[Unit]): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
    inline def create[T](next: Unit, error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
    inline def create[T](next: Unit, error: js.Function1[/* e */ js.UndefOr[js.Any], Unit], complete: js.Function0[Unit]): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
    inline def create[T](next: Unit, error: Unit, complete: js.Function0[Unit]): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
  }
  
  @JSImport("rxjs/internal-compatibility", "TimeInterval")
  @js.native
  class TimeInterval[T] protected () extends TimeInterval_[T] {
    def this(value: T, interval: Double) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "TimeoutError")
  @js.native
  val TimeoutError: TimeoutErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal-compatibility", "TimeoutError")
  @js.native
  class TimeoutErrorCls ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs/internal-compatibility", "Timestamp")
  @js.native
  class Timestamp[T] protected () extends Timestamp_[T] {
    def this(value: T, timestamp: Double) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "UnsubscriptionError")
  @js.native
  val UnsubscriptionError: UnsubscriptionErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal-compatibility", "UnsubscriptionError")
  @js.native
  class UnsubscriptionErrorCls protected ()
    extends StObject
       with typings.rxjs.unsubscriptionErrorMod.UnsubscriptionError {
    def this(errors: js.Array[js.Any]) = this()
    
    /* CompleteClass */
    override val errors: js.Array[js.Any] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs/internal-compatibility", "WebSocketSubject")
  @js.native
  class WebSocketSubject[T] protected ()
    extends typings.rxjs.webSocketSubjectMod.WebSocketSubject[T] {
    def this(urlConfigOrSource: String) = this()
    def this(urlConfigOrSource: Observable[T]) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T]) = this()
    def this(urlConfigOrSource: String, destination: Observer[T]) = this()
    def this(urlConfigOrSource: Observable[T], destination: Observer[T]) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T], destination: Observer[T]) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "ajax")
  @js.native
  val ajax: AjaxCreationMethod = js.native
  
  inline def ajaxDelete(url: String): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajaxDelete")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  inline def ajaxDelete(url: String, headers: js.Object): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxDelete")(url.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  
  inline def ajaxGet(url: String): typings.rxjs.ajaxObservableMod.AjaxObservable[typings.rxjs.ajaxObservableMod.AjaxResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajaxGet")(url.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.ajaxObservableMod.AjaxObservable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  inline def ajaxGet(url: String, headers: js.Object): typings.rxjs.ajaxObservableMod.AjaxObservable[typings.rxjs.ajaxObservableMod.AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxGet")(url.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.ajaxObservableMod.AjaxObservable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  
  inline def ajaxGetJSON[T](url: String): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajaxGetJSON")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def ajaxGetJSON[T](url: String, headers: js.Object): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxGetJSON")(url.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  inline def ajaxPatch(url: String): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPatch")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  inline def ajaxPatch(url: String, body: js.Any): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPatch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  inline def ajaxPatch(url: String, body: js.Any, headers: js.Object): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPatch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  inline def ajaxPatch(url: String, body: Unit, headers: js.Object): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPatch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  
  inline def ajaxPost(url: String): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPost")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  inline def ajaxPost(url: String, body: js.Any): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPost")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  inline def ajaxPost(url: String, body: js.Any, headers: js.Object): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPost")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  inline def ajaxPost(url: String, body: Unit, headers: js.Object): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPost")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  
  inline def ajaxPut(url: String): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPut")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  inline def ajaxPut(url: String, body: js.Any): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPut")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  inline def ajaxPut(url: String, body: js.Any, headers: js.Object): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPut")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  inline def ajaxPut(url: String, body: Unit, headers: js.Object): Observable[typings.rxjs.ajaxObservableMod.AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPut")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[typings.rxjs.ajaxObservableMod.AjaxResponse]]
  
  inline def applyMixins(derivedCtor: js.Any, baseCtors: js.Array[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyMixins")(derivedCtor.asInstanceOf[js.Any], baseCtors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object config {
    
    @JSImport("rxjs/internal-compatibility", "config")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The promise constructor used by default for methods such as
      * {@link toPromise} and {@link forEach}
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rxjs/internal-compatibility", "config.Promise")
    @js.native
    class Promise[T] protected ()
      extends StObject
         with PromiseLike[T] {
      def this(executor: js.Function2[
                /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
                Unit
              ]) = this()
    }
    /**
      * The promise constructor used by default for methods such as
      * {@link toPromise} and {@link forEach}
      */
    @JSImport("rxjs/internal-compatibility", "config.Promise")
    @js.native
    def Promise: PromiseConstructorLike = js.native
    inline def Promise_=(x: PromiseConstructorLike): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
    
    /**
      * If true, turns on synchronous error rethrowing, which is a deprecated behavior
      * in v6 and higher. This behavior enables bad patterns like wrapping a subscribe
      * call in a try/catch block. It also enables producer interference, a nasty bug
      * where a multicast can be broken for all observers by a downstream consumer with
      * an unhandled error. DO NOT USE THIS FLAG UNLESS IT'S NEEDED TO BY TIME
      * FOR MIGRATION REASONS.
      */
    @JSImport("rxjs/internal-compatibility", "config.useDeprecatedSynchronousErrorHandling")
    @js.native
    def useDeprecatedSynchronousErrorHandling: Boolean = js.native
    inline def useDeprecatedSynchronousErrorHandling_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useDeprecatedSynchronousErrorHandling")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs/internal-compatibility", "defaultThrottleConfig")
  @js.native
  val defaultThrottleConfig: ThrottleConfig = js.native
  
  inline def dispatch(state: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("rxjs/internal-compatibility", "errorObject")
  @js.native
  val errorObject: js.Any = js.native
  
  inline def fromIterable[T](input: Iterable[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(input.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def fromIterable[T](input: Iterable[T], scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  inline def fromPromise[T](input: js.Thenable[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(input.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def fromPromise[T](input: js.Thenable[T], scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  inline def hostReportError(err: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hostReportError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def identity[T](x: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def isArray(arg: js.Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isArrayLike[T](x: js.Any): /* is std.ArrayLike<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayLike")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.ArrayLike<T> */ Boolean]
  
  inline def isDate(value: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isFunction(x: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isIterable(input: js.Any): /* is std.Iterable<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(input.asInstanceOf[js.Any]).asInstanceOf[/* is std.Iterable<any> */ Boolean]
  
  inline def isNumeric(`val`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(x: js.Any): /* is std.Object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Object */ Boolean]
  
  inline def isObservable(input: js.Any): /* is rxjs.rxjs/internal/types.InteropObservable<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(input.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.rxjs/internal/types.InteropObservable<any> */ Boolean]
  
  inline def isPromise(value: js.Any): /* is std.PromiseLike<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<any> */ Boolean]
  
  inline def isScheduler(value: js.Any): /* is rxjs.rxjs/internal/types.SchedulerLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScheduler")(value.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.rxjs/internal/types.SchedulerLike */ Boolean]
  
  @JSImport("rxjs/internal-compatibility", "iterator")
  @js.native
  val iterator: js.Symbol = js.native
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def not(pred: js.Function, thisArg: js.Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("not")(pred.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @JSImport("rxjs/internal-compatibility", "observable")
  @js.native
  val observable: String | js.Symbol = js.native
  
  inline def pipe[T](): UnaryFunction[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")().asInstanceOf[UnaryFunction[T, T]]
  inline def pipe[T, A](fn1: UnaryFunction[T, A]): UnaryFunction[T, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[T, A]]
  inline def pipe[T, A, B](fn1: UnaryFunction[T, A], fn2: UnaryFunction[A, B]): UnaryFunction[T, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, B]]
  inline def pipe[T, A, B, C](fn1: UnaryFunction[T, A], fn2: UnaryFunction[A, B], fn3: UnaryFunction[B, C]): UnaryFunction[T, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, C]]
  inline def pipe[T, A, B, C, D](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D]
  ): UnaryFunction[T, D] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, D]]
  inline def pipe[T, A, B, C, D, E](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E]
  ): UnaryFunction[T, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, E]]
  inline def pipe[T, A, B, C, D, E, F](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F]
  ): UnaryFunction[T, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any], fn6.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, F]]
  inline def pipe[T, A, B, C, D, E, F, G](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G]
  ): UnaryFunction[T, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any], fn6.asInstanceOf[js.Any], fn7.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, G]]
  inline def pipe[T, A, B, C, D, E, F, G, H](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G],
    fn8: UnaryFunction[G, H]
  ): UnaryFunction[T, H] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any], fn6.asInstanceOf[js.Any], fn7.asInstanceOf[js.Any], fn8.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, H]]
  inline def pipe[T, A, B, C, D, E, F, G, H, I](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G],
    fn8: UnaryFunction[G, H],
    fn9: UnaryFunction[H, I]
  ): UnaryFunction[T, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any], fn6.asInstanceOf[js.Any], fn7.asInstanceOf[js.Any], fn8.asInstanceOf[js.Any], fn9.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, I]]
  inline def pipe[T, A, B, C, D, E, F, G, H, I](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G],
    fn8: UnaryFunction[G, H],
    fn9: UnaryFunction[H, I],
    fns: (UnaryFunction[js.Any, js.Any])*
  ): UnaryFunction[T, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any], fn6.asInstanceOf[js.Any], fn7.asInstanceOf[js.Any], fn8.asInstanceOf[js.Any], fn9.asInstanceOf[js.Any], fns.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, js.Object]]
  
  @JSImport("rxjs/internal-compatibility", "rxSubscriber")
  @js.native
  val rxSubscriber: String | js.Symbol = js.native
  
  inline def subscribeTo[T](result: ObservableInput[T]): js.Function1[/* subscriber */ typings.rxjs.subscriberMod.Subscriber[T], Unit | Subscription] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribeTo")(result.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* subscriber */ typings.rxjs.subscriberMod.Subscriber[T], Unit | Subscription]]
  
  inline def subscribeToArray[T](array: ArrayLike[T]): js.Function1[/* subscriber */ typings.rxjs.subscriberMod.Subscriber[T], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* subscriber */ typings.rxjs.subscriberMod.Subscriber[T], Unit]]
  
  inline def subscribeToIterable[T](iterable: Iterable[T]): js.Function1[
    /* subscriber */ typings.rxjs.subscriberMod.Subscriber[T], 
    typings.rxjs.subscriberMod.Subscriber[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* subscriber */ typings.rxjs.subscriberMod.Subscriber[T], 
    typings.rxjs.subscriberMod.Subscriber[T]
  ]]
  
  inline def subscribeToObservable[T](obj: js.Any): js.Function1[/* subscriber */ typings.rxjs.subscriberMod.Subscriber[T], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToObservable")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* subscriber */ typings.rxjs.subscriberMod.Subscriber[T], js.Any]]
  
  inline def subscribeToPromise[T](promise: js.Thenable[T]): js.Function1[
    /* subscriber */ typings.rxjs.subscriberMod.Subscriber[T], 
    typings.rxjs.subscriberMod.Subscriber[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* subscriber */ typings.rxjs.subscriberMod.Subscriber[T], 
    typings.rxjs.subscriberMod.Subscriber[T]
  ]]
  
  inline def subscribeToResult[T, R](outerSubscriber: typings.rxjs.outerSubscriberMod.OuterSubscriber[T, R], result: js.Any): js.UndefOr[Subscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToResult")(outerSubscriber.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Subscription]]
  inline def subscribeToResult[T, R](
    outerSubscriber: typings.rxjs.outerSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: T
  ): js.UndefOr[Subscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToResult")(outerSubscriber.asInstanceOf[js.Any], result.asInstanceOf[js.Any], outerValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Subscription]]
  inline def subscribeToResult[T, R](
    outerSubscriber: typings.rxjs.outerSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: T,
    outerIndex: Double
  ): js.UndefOr[Subscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToResult")(outerSubscriber.asInstanceOf[js.Any], result.asInstanceOf[js.Any], outerValue.asInstanceOf[js.Any], outerIndex.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Subscription]]
  inline def subscribeToResult[T, R](
    outerSubscriber: typings.rxjs.outerSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: Unit,
    outerIndex: Double
  ): js.UndefOr[Subscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToResult")(outerSubscriber.asInstanceOf[js.Any], result.asInstanceOf[js.Any], outerValue.asInstanceOf[js.Any], outerIndex.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Subscription]]
  inline def subscribeToResult[T, R](
    outerSubscriber: typings.rxjs.outerSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: Unit,
    outerIndex: Unit,
    innerSubscriber: typings.rxjs.innerSubscriberMod.InnerSubscriber[T, R]
  ): js.UndefOr[Subscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToResult")(outerSubscriber.asInstanceOf[js.Any], result.asInstanceOf[js.Any], outerValue.asInstanceOf[js.Any], outerIndex.asInstanceOf[js.Any], innerSubscriber.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Subscription]]
  
  inline def toSubscriber[T](): typings.rxjs.subscriberMod.Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")().asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
  inline def toSubscriber[T](nextOrObserver: js.Function1[/* value */ T, Unit]): typings.rxjs.subscriberMod.Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
  inline def toSubscriber[T](nextOrObserver: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
  inline def toSubscriber[T](
    nextOrObserver: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
  inline def toSubscriber[T](nextOrObserver: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
  inline def toSubscriber[T](nextOrObserver: Unit, error: js.Function1[/* error */ js.Any, Unit]): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
  inline def toSubscriber[T](nextOrObserver: Unit, error: js.Function1[/* error */ js.Any, Unit], complete: js.Function0[Unit]): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
  inline def toSubscriber[T](nextOrObserver: Unit, error: Unit, complete: js.Function0[Unit]): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
  inline def toSubscriber[T](nextOrObserver: PartialObserver[T]): typings.rxjs.subscriberMod.Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
  inline def toSubscriber[T](nextOrObserver: PartialObserver[T], error: js.Function1[/* error */ js.Any, Unit]): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
  inline def toSubscriber[T](
    nextOrObserver: PartialObserver[T],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
  inline def toSubscriber[T](nextOrObserver: PartialObserver[T], error: Unit, complete: js.Function0[Unit]): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
  
  inline def tryCatch[T /* <: js.Function */](fn: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCatch")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def webSocket[T](urlConfigOrSource: String): typings.rxjs.webSocketSubjectMod.WebSocketSubject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSocket")(urlConfigOrSource.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.webSocketSubjectMod.WebSocketSubject[T]]
  inline def webSocket[T](urlConfigOrSource: WebSocketSubjectConfig[T]): typings.rxjs.webSocketSubjectMod.WebSocketSubject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSocket")(urlConfigOrSource.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.webSocketSubjectMod.WebSocketSubject[T]]
}
