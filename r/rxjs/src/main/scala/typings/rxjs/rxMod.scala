package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.ajaxObservableMod.AjaxErrorCtor
import typings.rxjs.ajaxObservableMod.AjaxRequest
import typings.rxjs.ajaxObservableMod.AjaxTimeoutErrorCtor
import typings.rxjs.animationFrameSchedulerMod.AnimationFrameScheduler
import typings.rxjs.anon.FnCall
import typings.rxjs.argumentOutOfRangeErrorMod.ArgumentOutOfRangeErrorCtor
import typings.rxjs.asapSchedulerMod.AsapScheduler
import typings.rxjs.asyncActionMod.AsyncAction
import typings.rxjs.asyncSchedulerMod.AsyncScheduler
import typings.rxjs.emptyErrorMod.EmptyErrorCtor
import typings.rxjs.groupByMod.GroupedObservable
import typings.rxjs.objectUnsubscribedErrorMod.ObjectUnsubscribedErrorCtor
import typings.rxjs.queueSchedulerMod.QueueScheduler
import typings.rxjs.rxjsBooleans.`false`
import typings.rxjs.rxjsStrings.C
import typings.rxjs.rxjsStrings.E
import typings.rxjs.rxjsStrings.N
import typings.rxjs.shareReplayMod.ShareReplayConfig
import typings.rxjs.subscriptionLogMod.SubscriptionLog
import typings.rxjs.testMessageMod.TestMessage
import typings.rxjs.throttleMod.ThrottleConfig
import typings.rxjs.timeIntervalMod.TimeInterval_
import typings.rxjs.timeoutErrorMod.TimeoutErrorCtor
import typings.rxjs.timestampMod.Timestamp_
import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.ObservedValueOf
import typings.rxjs.typesMod.Observer
import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.PartialObserver
import typings.rxjs.typesMod.SchedulerLike
import typings.rxjs.typesMod.SubscribableOrPromise
import typings.rxjs.typesMod.TeardownLogic
import typings.rxjs.typesMod.UnaryFunction
import typings.rxjs.unsubscriptionErrorMod.UnsubscriptionErrorCtor
import typings.std.Date
import typings.std.Error
import typings.std.Event
import typings.std.PromiseConstructorLike
import typings.std.PromiseLike
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rxMod {
  
  @JSImport("rxjs/internal/Rx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/Rx", "AjaxError")
  @js.native
  val AjaxError: AjaxErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/Rx", "AjaxError")
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
  
  @JSImport("rxjs/internal/Rx", "AjaxResponse")
  @js.native
  class AjaxResponse protected ()
    extends typings.rxjs.ajaxObservableMod.AjaxResponse {
    def this(originalEvent: Event, xhr: XMLHttpRequest, request: AjaxRequest) = this()
  }
  
  @JSImport("rxjs/internal/Rx", "AjaxTimeoutError")
  @js.native
  val AjaxTimeoutError: AjaxTimeoutErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/Rx", "AjaxTimeoutError")
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
  
  @JSImport("rxjs/internal/Rx", "AnonymousSubject")
  @js.native
  class AnonymousSubject[T] ()
    extends typings.rxjs.subjectMod.AnonymousSubject[T] {
    def this(destination: Observer[T]) = this()
    def this(destination: Unit, source: typings.rxjs.internalObservableMod.Observable[T]) = this()
    def this(destination: Observer[T], source: typings.rxjs.internalObservableMod.Observable[T]) = this()
  }
  
  @JSImport("rxjs/internal/Rx", "ArgumentOutOfRangeError")
  @js.native
  val ArgumentOutOfRangeError: ArgumentOutOfRangeErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/Rx", "ArgumentOutOfRangeError")
  @js.native
  class ArgumentOutOfRangeErrorCls ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs/internal/Rx", "AsyncSubject")
  @js.native
  class AsyncSubject[T] ()
    extends typings.rxjs.asyncSubjectMod.AsyncSubject[T]
  
  @JSImport("rxjs/internal/Rx", "BehaviorSubject")
  @js.native
  class BehaviorSubject[T] protected ()
    extends typings.rxjs.behaviorSubjectMod.BehaviorSubject[T] {
    def this(_value: T) = this()
  }
  
  @JSImport("rxjs/internal/Rx", "ConnectableObservable")
  @js.native
  class ConnectableObservable[T] protected ()
    extends typings.rxjs.connectableObservableMod.ConnectableObservable[T] {
    def this(
      source: typings.rxjs.internalObservableMod.Observable[T],
      subjectFactory: js.Function0[typings.rxjs.subjectMod.Subject[T]]
    ) = this()
  }
  
  @JSImport("rxjs/internal/Rx", "EmptyError")
  @js.native
  val EmptyError: EmptyErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/Rx", "EmptyError")
  @js.native
  class EmptyErrorCls ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs/internal/Rx", "Notification")
  @js.native
  class Notification[T] protected ()
    extends typings.rxjs.notificationMod.Notification[T] {
    def this(kind: C) = this()
    def this(kind: E) = this()
    def this(kind: N) = this()
    def this(kind: C, value: T) = this()
    def this(kind: E, value: T) = this()
    def this(kind: N, value: T) = this()
    def this(kind: C, value: T, error: js.Any) = this()
    def this(kind: C, value: Unit, error: js.Any) = this()
    def this(kind: E, value: T, error: js.Any) = this()
    def this(kind: E, value: Unit, error: js.Any) = this()
    def this(kind: N, value: T, error: js.Any) = this()
    def this(kind: N, value: Unit, error: js.Any) = this()
  }
  /* static members */
  object Notification {
    
    @JSImport("rxjs/internal/Rx", "Notification")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/internal/Rx", "Notification.completeNotification")
    @js.native
    def completeNotification: js.Any = js.native
    @scala.inline
    def completeNotification_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completeNotification")(x.asInstanceOf[js.Any])
    
    /**
      * A shortcut to create a Notification instance of the type `complete`.
      * @return {Notification<any>} The valueless "complete" Notification.
      * @nocollapse
      */
    @scala.inline
    def createComplete(): typings.rxjs.notificationMod.Notification[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createComplete")().asInstanceOf[typings.rxjs.notificationMod.Notification[js.Any]]
    
    /**
      * A shortcut to create a Notification instance of the type `error` from a
      * given error.
      * @param {any} [err] The `error` error.
      * @return {Notification<T>} The "error" Notification representing the
      * argument.
      * @nocollapse
      */
    @scala.inline
    def createError[T](): typings.rxjs.notificationMod.Notification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createError")().asInstanceOf[typings.rxjs.notificationMod.Notification[T]]
    @scala.inline
    def createError[T](err: js.Any): typings.rxjs.notificationMod.Notification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createError")(err.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.notificationMod.Notification[T]]
    
    /**
      * A shortcut to create a Notification instance of the type `next` from a
      * given value.
      * @param {T} value The `next` value.
      * @return {Notification<T>} The "next" Notification representing the
      * argument.
      * @nocollapse
      */
    @scala.inline
    def createNext[T](value: T): typings.rxjs.notificationMod.Notification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNext")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.notificationMod.Notification[T]]
    
    @JSImport("rxjs/internal/Rx", "Notification.undefinedValueNotification")
    @js.native
    def undefinedValueNotification: js.Any = js.native
    @scala.inline
    def undefinedValueNotification_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedValueNotification")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs/internal/Rx", "NotificationKind")
  @js.native
  object NotificationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.rxjs.notificationMod.NotificationKind & String] = js.native
    
    /* "C" */ val COMPLETE: typings.rxjs.notificationMod.NotificationKind.COMPLETE & String = js.native
    
    /* "E" */ val ERROR: typings.rxjs.notificationMod.NotificationKind.ERROR & String = js.native
    
    /* "N" */ val NEXT: typings.rxjs.notificationMod.NotificationKind.NEXT & String = js.native
  }
  
  @JSImport("rxjs/internal/Rx", "ObjectUnsubscribedError")
  @js.native
  val ObjectUnsubscribedError: ObjectUnsubscribedErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/Rx", "ObjectUnsubscribedError")
  @js.native
  class ObjectUnsubscribedErrorCls ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs/internal/Rx", "Observable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  class Observable[T] ()
    extends typings.rxjs.internalObservableMod.Observable[T] {
    def this(subscribe: js.ThisFunction1[
            /* this */ typings.rxjs.internalObservableMod.Observable[T], 
            /* subscriber */ typings.rxjs.subscriberMod.Subscriber[T], 
            TeardownLogic
          ]) = this()
  }
  /* static members */
  object Observable {
    
    @JSImport("rxjs/internal/Rx", "Observable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new cold Observable by calling the Observable constructor
      * @static true
      * @owner Observable
      * @method create
      * @param {Function} subscribe? the subscriber function to be passed to the Observable constructor
      * @return {Observable} a new cold observable
      * @nocollapse
      * @deprecated use new Observable() instead
      */
    @JSImport("rxjs/internal/Rx", "Observable.create")
    @js.native
    def create: js.Function = js.native
    @scala.inline
    def create_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
    
    /**
      * @nocollapse
      * @deprecated In favor of iif creation function: import { iif } from 'rxjs';
      */
    @JSImport("rxjs/internal/Rx", "Observable.if")
    @js.native
    val `if`: FnCall = js.native
    /**
      * @nocollapse
      * @deprecated In favor of iif creation function: import { iif } from 'rxjs';
      */
    @scala.inline
    def `if`[T, F](condition: js.Function0[Boolean]): typings.rxjs.internalObservableMod.Observable[T | F] = ^.asInstanceOf[js.Dynamic].applyDynamic("if")(condition.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.internalObservableMod.Observable[T | F]]
    @scala.inline
    def `if`[T, F](condition: js.Function0[Boolean], trueResult: Unit, falseResult: SubscribableOrPromise[F]): typings.rxjs.internalObservableMod.Observable[T | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("if")(condition.asInstanceOf[js.Any], trueResult.asInstanceOf[js.Any], falseResult.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.internalObservableMod.Observable[T | F]]
    @scala.inline
    def `if`[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): typings.rxjs.internalObservableMod.Observable[T | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("if")(condition.asInstanceOf[js.Any], trueResult.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.internalObservableMod.Observable[T | F]]
    @scala.inline
    def `if`[T, F](
      condition: js.Function0[Boolean],
      trueResult: SubscribableOrPromise[T],
      falseResult: SubscribableOrPromise[F]
    ): typings.rxjs.internalObservableMod.Observable[T | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("if")(condition.asInstanceOf[js.Any], trueResult.asInstanceOf[js.Any], falseResult.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.internalObservableMod.Observable[T | F]]
    
    /**
      * @nocollapse
      * @deprecated In favor of throwError creation function: import { throwError } from 'rxjs';
      */
    @JSImport("rxjs/internal/Rx", "Observable.throw")
    @js.native
    val `throw`: js.Function2[
        /* error */ js.Any, 
        /* scheduler */ js.UndefOr[SchedulerLike], 
        typings.rxjs.internalObservableMod.Observable[scala.Nothing]
      ] = js.native
    /**
      * @nocollapse
      * @deprecated In favor of throwError creation function: import { throwError } from 'rxjs';
      */
    @scala.inline
    def `throw`(error: js.Any): typings.rxjs.internalObservableMod.Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("throw")(error.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.internalObservableMod.Observable[scala.Nothing]]
    @scala.inline
    def `throw`(error: js.Any, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("throw")(error.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.internalObservableMod.Observable[scala.Nothing]]
  }
  
  @JSImport("rxjs/internal/Rx", "ReplaySubject")
  @js.native
  class ReplaySubject[T] ()
    extends typings.rxjs.replaySubjectMod.ReplaySubject[T] {
    def this(bufferSize: Double) = this()
    def this(bufferSize: Double, windowTime: Double) = this()
    def this(bufferSize: Unit, windowTime: Double) = this()
    def this(bufferSize: Double, windowTime: Double, scheduler: SchedulerLike) = this()
    def this(bufferSize: Double, windowTime: Unit, scheduler: SchedulerLike) = this()
    def this(bufferSize: Unit, windowTime: Double, scheduler: SchedulerLike) = this()
    def this(bufferSize: Unit, windowTime: Unit, scheduler: SchedulerLike) = this()
  }
  
  /**
    * @typedef {Object} Rx.Scheduler
    * @property {SchedulerLike} asap Schedules on the micro task queue, which is the same
    * queue used for promises. Basically after the current job, but before the next job.
    * Use this for asynchronous conversions.
    * @property {SchedulerLike} queue Schedules on a queue in the current event frame
    * (trampoline scheduler). Use this for iteration operations.
    * @property {SchedulerLike} animationFrame Schedules work with `requestAnimationFrame`.
    * Use this for synchronizing with the platform's painting.
    * @property {SchedulerLike} async Schedules work with `setInterval`. Use this for
    * time-based operations.
    */
  object Scheduler {
    
    @JSImport("rxjs/internal/Rx", "Scheduler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/internal/Rx", "Scheduler.animationFrame")
    @js.native
    def animationFrame: AnimationFrameScheduler = js.native
    @scala.inline
    def animationFrame_=(x: AnimationFrameScheduler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Rx", "Scheduler.asap")
    @js.native
    def asap: AsapScheduler = js.native
    @scala.inline
    def asap_=(x: AsapScheduler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asap")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Rx", "Scheduler.async")
    @js.native
    def async: AsyncScheduler = js.native
    @scala.inline
    def async_=(x: AsyncScheduler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("async")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Rx", "Scheduler.queue")
    @js.native
    def queue: QueueScheduler = js.native
    @scala.inline
    def queue_=(x: QueueScheduler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queue")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs/internal/Rx", "Subject")
  @js.native
  class Subject[T] ()
    extends typings.rxjs.subjectMod.Subject[T]
  /* static members */
  object Subject {
    
    @JSImport("rxjs/internal/Rx", "Subject")
    @js.native
    val ^ : js.Any = js.native
    
    /**@nocollapse
      * @deprecated use new Subject() instead
      */
    @JSImport("rxjs/internal/Rx", "Subject.create")
    @js.native
    def create: js.Function = js.native
    @scala.inline
    def create_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs/internal/Rx", "Subscriber")
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
    
    @JSImport("rxjs/internal/Rx", "Subscriber")
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
    @scala.inline
    def create[T](): typings.rxjs.subscriberMod.Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
    @scala.inline
    def create[T](next: js.Function1[/* x */ js.UndefOr[T], Unit]): typings.rxjs.subscriberMod.Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
    @scala.inline
    def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
    @scala.inline
    def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
    @scala.inline
    def create[T](next: js.Function1[/* x */ js.UndefOr[T], Unit], error: Unit, complete: js.Function0[Unit]): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
    @scala.inline
    def create[T](next: Unit, error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
    @scala.inline
    def create[T](next: Unit, error: js.Function1[/* e */ js.UndefOr[js.Any], Unit], complete: js.Function0[Unit]): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
    @scala.inline
    def create[T](next: Unit, error: Unit, complete: js.Function0[Unit]): typings.rxjs.subscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.subscriberMod.Subscriber[T]]
  }
  
  @JSImport("rxjs/internal/Rx", "Subscription")
  @js.native
  /**
    * @param {function(): void} [unsubscribe] A function describing how to
    * perform the disposal of resources when the `unsubscribe` method is called.
    */
  class Subscription ()
    extends typings.rxjs.subscriptionMod.Subscription {
    def this(unsubscribe: js.Function0[Unit]) = this()
  }
  /* static members */
  object Subscription {
    
    @JSImport("rxjs/internal/Rx", "Subscription")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("rxjs/internal/Rx", "Subscription.EMPTY")
    @js.native
    def EMPTY: typings.rxjs.subscriptionMod.Subscription = js.native
    @scala.inline
    def EMPTY_=(x: typings.rxjs.subscriptionMod.Subscription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @typedef {Object} Rx.Symbol
    * @property {Symbol|string} rxSubscriber A symbol to use as a property name to
    * retrieve an "Rx safe" Observer from an object. "Rx safety" can be defined as
    * an object that has all of the traits of an Rx Subscriber, including the
    * ability to add and remove subscriptions to the subscription chain and
    * guarantees involving event triggering (can't "next" after unsubscription,
    * etc).
    * @property {Symbol|string} observable A symbol to use as a property name to
    * retrieve an Observable as defined by the [ECMAScript "Observable" spec](https://github.com/zenparsing/es-observable).
    * @property {Symbol|string} iterator The ES6 symbol to use as a property name
    * to retrieve an iterator from an object.
    */
  object Symbol {
    
    @JSImport("rxjs/internal/Rx", "Symbol")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/internal/Rx", "Symbol.iterator")
    @js.native
    def iterator: js.Symbol = js.native
    @scala.inline
    def iterator_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iterator")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Rx", "Symbol.observable")
    @js.native
    def observable: String | js.Symbol = js.native
    @scala.inline
    def observable_=(x: String | js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observable")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Rx", "Symbol.rxSubscriber")
    @js.native
    def rxSubscriber: String | js.Symbol = js.native
    @scala.inline
    def rxSubscriber_=(x: String | js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rxSubscriber")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs/internal/Rx", "TestScheduler")
  @js.native
  class TestScheduler protected ()
    extends typings.rxjs.testSchedulerMod.TestScheduler {
    def this(assertDeepEqual: js.Function2[/* actual */ js.Any, /* expected */ js.Any, Boolean | Unit]) = this()
  }
  /* static members */
  object TestScheduler {
    
    @JSImport("rxjs/internal/Rx", "TestScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @scala.inline
    def parseMarbles(marbles: String): js.Array[TestMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any]).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(marbles: String, values: js.Any): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(marbles: String, values: js.Any, errorValue: js.Any): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(marbles: String, values: js.Any, errorValue: js.Any, materializeInnerObservables: Boolean): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.Any,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.Any,
      materializeInnerObservables: Unit,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(marbles: String, values: js.Any, errorValue: Unit, materializeInnerObservables: Boolean): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: Unit,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: Unit,
      materializeInnerObservables: Unit,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(marbles: String, values: Unit, errorValue: js.Any): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(marbles: String, values: Unit, errorValue: js.Any, materializeInnerObservables: Boolean): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: Unit,
      errorValue: js.Any,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: Unit,
      errorValue: js.Any,
      materializeInnerObservables: Unit,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(marbles: String, values: Unit, errorValue: Unit, materializeInnerObservables: Boolean): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: Unit,
      errorValue: Unit,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: Unit,
      errorValue: Unit,
      materializeInnerObservables: Unit,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    
    /** @nocollapse */
    @scala.inline
    def parseMarblesAsSubscriptions(marbles: String): SubscriptionLog = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMarblesAsSubscriptions")(marbles.asInstanceOf[js.Any]).asInstanceOf[SubscriptionLog]
    @scala.inline
    def parseMarblesAsSubscriptions(marbles: String, runMode: Boolean): SubscriptionLog = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarblesAsSubscriptions")(marbles.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[SubscriptionLog]
  }
  
  @JSImport("rxjs/internal/Rx", "TimeInterval")
  @js.native
  class TimeInterval[T] protected () extends TimeInterval_[T] {
    def this(value: T, interval: Double) = this()
  }
  
  @JSImport("rxjs/internal/Rx", "TimeoutError")
  @js.native
  val TimeoutError: TimeoutErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/Rx", "TimeoutError")
  @js.native
  class TimeoutErrorCls ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs/internal/Rx", "Timestamp")
  @js.native
  class Timestamp[T] protected () extends Timestamp_[T] {
    def this(value: T, timestamp: Double) = this()
  }
  
  @JSImport("rxjs/internal/Rx", "UnsubscriptionError")
  @js.native
  val UnsubscriptionError: UnsubscriptionErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/Rx", "UnsubscriptionError")
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
  
  @JSImport("rxjs/internal/Rx", "VirtualTimeScheduler")
  @js.native
  class VirtualTimeScheduler ()
    extends typings.rxjs.virtualTimeSchedulerMod.VirtualTimeScheduler {
    def this(SchedulerAction: Instantiable2[
            /* scheduler */ AsyncScheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typings.rxjs.typesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              Unit
            ], 
            AsyncAction[js.Object]
          ]) = this()
    def this(
      SchedulerAction: Instantiable2[
            /* scheduler */ AsyncScheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typings.rxjs.typesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              Unit
            ], 
            AsyncAction[js.Object]
          ],
      maxFrames: Double
    ) = this()
    def this(SchedulerAction: Unit, maxFrames: Double) = this()
  }
  /* static members */
  object VirtualTimeScheduler {
    
    @JSImport("rxjs/internal/Rx", "VirtualTimeScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/internal/Rx", "VirtualTimeScheduler.frameTimeFactor")
    @js.native
    def frameTimeFactor: Double = js.native
    @scala.inline
    def frameTimeFactor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameTimeFactor")(x.asInstanceOf[js.Any])
  }
  
  object config {
    
    @JSImport("rxjs/internal/Rx", "config")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The promise constructor used by default for methods such as
      * {@link toPromise} and {@link forEach}
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rxjs/internal/Rx", "config.Promise")
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
    @JSImport("rxjs/internal/Rx", "config.Promise")
    @js.native
    def Promise: PromiseConstructorLike = js.native
    @scala.inline
    def Promise_=(x: PromiseConstructorLike): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
    
    /**
      * If true, turns on synchronous error rethrowing, which is a deprecated behavior
      * in v6 and higher. This behavior enables bad patterns like wrapping a subscribe
      * call in a try/catch block. It also enables producer interference, a nasty bug
      * where a multicast can be broken for all observers by a downstream consumer with
      * an unhandled error. DO NOT USE THIS FLAG UNLESS IT'S NEEDED TO BY TIME
      * FOR MIGRATION REASONS.
      */
    @JSImport("rxjs/internal/Rx", "config.useDeprecatedSynchronousErrorHandling")
    @js.native
    def useDeprecatedSynchronousErrorHandling: Boolean = js.native
    @scala.inline
    def useDeprecatedSynchronousErrorHandling_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useDeprecatedSynchronousErrorHandling")(x.asInstanceOf[js.Any])
  }
  
  object operators {
    
    @JSImport("rxjs/internal/Rx", "operators")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def audit[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[js.Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("audit")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def auditTime[T](duration: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("auditTime")(duration.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def auditTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("auditTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def buffer[T](closingNotifier: typings.rxjs.internalObservableMod.Observable[js.Any]): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(closingNotifier.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    
    @scala.inline
    def bufferCount[T](bufferSize: Double): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferCount")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    @scala.inline
    def bufferCount[T](bufferSize: Double, startBufferEvery: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferCount")(bufferSize.asInstanceOf[js.Any], startBufferEvery.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    
    @scala.inline
    def bufferTime[T](bufferTimeSpan: Double): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    @scala.inline
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    @scala.inline
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    @scala.inline
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Double,
      maxBufferSize: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    @scala.inline
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    @scala.inline
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    @scala.inline
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Null,
      maxBufferSize: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    @scala.inline
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    @scala.inline
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Unit, maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    @scala.inline
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Unit,
      maxBufferSize: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    @scala.inline
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Unit, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    @scala.inline
    def bufferTime[T](bufferTimeSpan: Double, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    
    @scala.inline
    def bufferToggle[T, O](
      openings: SubscribableOrPromise[O],
      closingSelector: js.Function1[/* value */ O, SubscribableOrPromise[js.Any]]
    ): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToggle")(openings.asInstanceOf[js.Any], closingSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    
    @scala.inline
    def bufferWhen[T](closingSelector: js.Function0[typings.rxjs.internalObservableMod.Observable[js.Any]]): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferWhen")(closingSelector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    
    @scala.inline
    def catchError[T, O /* <: ObservableInput[js.Any] */](
      selector: js.Function2[/* err */ js.Any, /* caught */ typings.rxjs.internalObservableMod.Observable[T], O]
    ): OperatorFunction[T, T | ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("catchError")(selector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | ObservedValueOf[O]]]
    
    @scala.inline
    def combineAll[T](): OperatorFunction[js.Any, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")().asInstanceOf[OperatorFunction[js.Any, js.Array[T]]]
    @scala.inline
    def combineAll[R](project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[js.Any, R]]
    
    @scala.inline
    def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[ObservableInput[T], R]]
    
    @scala.inline
    def combineLatest[T, R](array: js.Array[ObservableInput[T]]): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(array.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
    @scala.inline
    def combineLatest[T, R](observables: (ObservableInput[T] | (js.Function1[/* repeated */ T, R]))*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def combineLatest[T, R](project: js.Function1[/* v1 */ T, R]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def combineLatest[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, js.Tuple2[T, T2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Tuple2[T, T2]]]
    @scala.inline
    def combineLatest[T, TOther, R](
      array: js.Array[ObservableInput[TOther]],
      project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(array.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def combineLatest[T, T2, R](v2: ObservableInput[T2], project: js.Function2[/* v1 */ T, /* v2 */ T2, R]): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def combineLatest[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, js.Tuple3[T, T2, T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple3[T, T2, T3]]]
    @scala.inline
    def combineLatest[T, T2, T3, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def combineLatest[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, js.Tuple4[T, T2, T3, T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple4[T, T2, T3, T4]]]
    @scala.inline
    def combineLatest[T, T2, T3, T4, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def combineLatest[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, js.Tuple5[T, T2, T3, T4, T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple5[T, T2, T3, T4, T5]]]
    @scala.inline
    def combineLatest[T, T2, T3, T4, T5, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def combineLatest[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6]
    ): OperatorFunction[T, js.Tuple6[T, T2, T3, T4, T5, T6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple6[T, T2, T3, T4, T5, T6]]]
    @scala.inline
    def combineLatest[T, T2, T3, T4, T5, T6, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def concat[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")().asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def concat[T](observables: (ObservableInput[T] | SchedulerLike)*): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(observables.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def concat[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def concat[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, T | T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | T2]]
    @scala.inline
    def concat[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): OperatorFunction[T, T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2]]
    @scala.inline
    def concat[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
    @scala.inline
    def concat[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
    @scala.inline
    def concat[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
    @scala.inline
    def concat[T, T2, T3, T4](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
    @scala.inline
    def concat[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
    @scala.inline
    def concat[T, T2, T3, T4, T5](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
    @scala.inline
    def concat[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6]
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
    @scala.inline
    def concat[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
    
    @scala.inline
    def concatAll[T](): OperatorFunction[ObservableInput[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")().asInstanceOf[OperatorFunction[ObservableInput[T], T]]
    
    @scala.inline
    def concatAll_R[R](): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")().asInstanceOf[OperatorFunction[js.Any, R]]
    
    @scala.inline
    def concatMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def concatMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], resultSelector: Unit): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def concatMap[T, R, O /* <: ObservableInput[js.Any] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def concatMapTo[T, O /* <: ObservableInput[js.Any] */](observable: O): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def concatMapTo[T, O /* <: ObservableInput[js.Any] */](observable: O, resultSelector: Unit): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def concatMapTo[T, R, O /* <: ObservableInput[js.Any] */](
      observable: O,
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def concat_TR_OperatorFunction[T, R](observables: (ObservableInput[js.Any] | SchedulerLike)*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def count[T](): OperatorFunction[T, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[OperatorFunction[T, Double]]
    @scala.inline
    def count[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ]
    ): OperatorFunction[T, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Double]]
    
    @scala.inline
    def debounce[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[js.Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def debounceTime[T](dueTime: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounceTime")(dueTime.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def debounceTime[T](dueTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounceTime")(dueTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def defaultIfEmpty[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")().asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def defaultIfEmpty[T](defaultValue: T): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def defaultIfEmpty_TR_OperatorFunction[T, R](): OperatorFunction[T, T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")().asInstanceOf[OperatorFunction[T, T | R]]
    @scala.inline
    def defaultIfEmpty_TR_OperatorFunction[T, R](defaultValue: R): OperatorFunction[T, T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | R]]
    
    @scala.inline
    def delay[T](delay: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delay.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def delay[T](delay: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delay.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def delay[T](delay: Date): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delay.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def delay[T](delay: Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delay.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def delayWhen[T](
      delayDurationSelector: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          typings.rxjs.internalObservableMod.Observable[js.Any | scala.Nothing]
        ]
    ): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delayWhen")(delayDurationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def delayWhen[T](
      delayDurationSelector: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          typings.rxjs.internalObservableMod.Observable[js.Any | scala.Nothing]
        ],
      subscriptionDelay: typings.rxjs.internalObservableMod.Observable[js.Any]
    ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delayWhen")(delayDurationSelector.asInstanceOf[js.Any], subscriptionDelay.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def dematerialize[T](): OperatorFunction[typings.rxjs.notificationMod.Notification[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("dematerialize")().asInstanceOf[OperatorFunction[typings.rxjs.notificationMod.Notification[T], T]]
    
    @scala.inline
    def distinct[T, K](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")().asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def distinct[T, K](
      keySelector: js.Function1[/* value */ T, K],
      flushes: typings.rxjs.internalObservableMod.Observable[js.Any]
    ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any], flushes.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def distinct[T, K](keySelector: Unit, flushes: typings.rxjs.internalObservableMod.Observable[js.Any]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any], flushes.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def distinctUntilChanged[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")().asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def distinctUntilChanged[T](compare: js.Function2[/* x */ T, /* y */ T, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")(compare.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def distinctUntilChanged[T, K](compare: js.Function2[/* x */ K, /* y */ K, Boolean], keySelector: js.Function1[/* x */ T, K]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")(compare.asInstanceOf[js.Any], keySelector.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def distinctUntilKeyChanged[T](key: /* keyof T */ String): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilKeyChanged")(key.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def distinctUntilKeyChanged[T, K /* <: /* keyof T */ String */](
      key: K,
      compare: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* x */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* y */ js.Any, 
          Boolean
        ]
    ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilKeyChanged")(key.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def elementAt[T](index: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementAt")(index.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def elementAt[T](index: Double, defaultValue: T): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("elementAt")(index.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def every[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ]
    ): OperatorFunction[T, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Boolean]]
    @scala.inline
    def every[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ],
      thisArg: js.Any
    ): OperatorFunction[T, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Boolean]]
    
    @scala.inline
    def exhaust[T](): OperatorFunction[ObservableInput[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaust")().asInstanceOf[OperatorFunction[ObservableInput[T], T]]
    
    @scala.inline
    def exhaustMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaustMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def exhaustMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], resultSelector: Unit): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exhaustMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def exhaustMap[T, I, R](
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[I]],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ I, 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("exhaustMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def exhaust_R[R](): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaust")().asInstanceOf[OperatorFunction[js.Any, R]]
    
    @scala.inline
    def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]], concurrent: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def expand[T](
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
      concurrent: Double,
      scheduler: SchedulerLike
    ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def expand[T](
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
      concurrent: Unit,
      scheduler: SchedulerLike
    ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def expand_TR_OperatorFunction[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def expand_TR_OperatorFunction[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]], concurrent: Double): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def expand_TR_OperatorFunction[T, R](
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
      concurrent: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def expand_TR_OperatorFunction[T, R](
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
      concurrent: Unit,
      scheduler: SchedulerLike
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def filter_TS_T_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): OperatorFunction[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, S]]
    @scala.inline
    def filter_TS_T_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: js.Any): OperatorFunction[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S]]
    
    @scala.inline
    def finalize_[T](callback: js.Function0[Unit]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("finalize")(callback.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def find[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ]
    ): OperatorFunction[T, js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.UndefOr[T]]]
    @scala.inline
    def find[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ],
      thisArg: js.Any
    ): OperatorFunction[T, js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.UndefOr[T]]]
    
    @scala.inline
    def findIndex[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ]
    ): OperatorFunction[T, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Double]]
    @scala.inline
    def findIndex[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ],
      thisArg: js.Any
    ): OperatorFunction[T, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Double]]
    
    @scala.inline
    def find_TS_T[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          /* is S */ Boolean
        ]
    ): OperatorFunction[T, js.UndefOr[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.UndefOr[S]]]
    @scala.inline
    def find_TS_T[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): OperatorFunction[T, js.UndefOr[S]] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.UndefOr[S]]]
    
    @scala.inline
    def first[T, D](): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[OperatorFunction[T, T | D]]
    @scala.inline
    def first[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ]
    ): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | D]]
    @scala.inline
    def first[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ],
      defaultValue: D
    ): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
    @scala.inline
    def first[T, D](predicate: Null, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
    @scala.inline
    def first[T, D](predicate: Unit, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
    
    @scala.inline
    def first_TS_T[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          /* is S */ Boolean
        ]
    ): OperatorFunction[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, S]]
    @scala.inline
    def first_TS_T[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          /* is S */ Boolean
        ],
      defaultValue: S
    ): OperatorFunction[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S]]
    
    @scala.inline
    def flatMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def flatMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], concurrent: Double): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def flatMap[T, O /* <: ObservableInput[js.Any] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: Unit,
      concurrent: Double
    ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def flatMap[T, R, O /* <: ObservableInput[js.Any] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def flatMap[T, R, O /* <: ObservableInput[js.Any] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ],
      concurrent: Double
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def groupBy[T, K](keySelector: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, GroupedObservable[K, T]]]
    @scala.inline
    def groupBy[T, K](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: Unit,
      durationSelector: js.Function1[
          /* grouped */ GroupedObservable[K, T], 
          typings.rxjs.internalObservableMod.Observable[js.Any]
        ]
    ): OperatorFunction[T, GroupedObservable[K, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, T]]]
    @scala.inline
    def groupBy[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
    @scala.inline
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.Function1[/* value */ T, R],
      durationSelector: js.Function1[
          /* grouped */ GroupedObservable[K, R], 
          typings.rxjs.internalObservableMod.Observable[js.Any]
        ]
    ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
    @scala.inline
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.Function1[/* value */ T, R],
      durationSelector: js.Function1[
          /* grouped */ GroupedObservable[K, R], 
          typings.rxjs.internalObservableMod.Observable[js.Any]
        ],
      subjectSelector: js.Function0[typings.rxjs.subjectMod.Subject[R]]
    ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
    @scala.inline
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.Function1[/* value */ T, R],
      durationSelector: Unit,
      subjectSelector: js.Function0[typings.rxjs.subjectMod.Subject[R]]
    ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
    @scala.inline
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: Unit,
      durationSelector: js.Function1[
          /* grouped */ GroupedObservable[K, R], 
          typings.rxjs.internalObservableMod.Observable[js.Any]
        ],
      subjectSelector: js.Function0[typings.rxjs.subjectMod.Subject[R]]
    ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
    @scala.inline
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: Unit,
      durationSelector: Unit,
      subjectSelector: js.Function0[typings.rxjs.subjectMod.Subject[R]]
    ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
    
    @scala.inline
    def groupBy_TKR[T, K, R](keySelector: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
    @scala.inline
    def groupBy_TKR[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: Unit,
      durationSelector: js.Function1[
          /* grouped */ GroupedObservable[K, R], 
          typings.rxjs.internalObservableMod.Observable[js.Any]
        ]
    ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
    
    @scala.inline
    def ignoreElements(): OperatorFunction[js.Any, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("ignoreElements")().asInstanceOf[OperatorFunction[js.Any, scala.Nothing]]
    
    @scala.inline
    def isEmpty[T](): OperatorFunction[T, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")().asInstanceOf[OperatorFunction[T, Boolean]]
    
    @scala.inline
    def last[T, D](): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[OperatorFunction[T, T | D]]
    @scala.inline
    def last[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ]
    ): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | D]]
    @scala.inline
    def last[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ],
      defaultValue: D
    ): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
    @scala.inline
    def last[T, D](predicate: Null, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
    @scala.inline
    def last[T, D](predicate: Unit, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
    
    @scala.inline
    def last_TS_T[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          /* is S */ Boolean
        ]
    ): OperatorFunction[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, S]]
    @scala.inline
    def last_TS_T[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          /* is S */ Boolean
        ],
      defaultValue: S
    ): OperatorFunction[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S]]
    
    @scala.inline
    def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: js.Any): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(project.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def mapTo[T, R](value: R): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapTo")(value.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def materialize[T](): OperatorFunction[T, typings.rxjs.notificationMod.Notification[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("materialize")().asInstanceOf[OperatorFunction[T, typings.rxjs.notificationMod.Notification[T]]]
    
    @scala.inline
    def max[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def max[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(comparer.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def merge[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")().asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def merge[T](concurrent: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(concurrent.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def merge[T](concurrent: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def merge[T](concurrent: Unit, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def merge[T](observables: (ObservableInput[T] | SchedulerLike | Double)*): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(observables.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def merge[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def merge[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, T | T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | T2]]
    @scala.inline
    def merge[T, T2](v2: ObservableInput[T2], concurrent: Double): OperatorFunction[T, T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2]]
    @scala.inline
    def merge[T, T2](v2: ObservableInput[T2], concurrent: Double, scheduler: SchedulerLike): OperatorFunction[T, T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2]]
    @scala.inline
    def merge[T, T2](v2: ObservableInput[T2], concurrent: Unit, scheduler: SchedulerLike): OperatorFunction[T, T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2]]
    @scala.inline
    def merge[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): OperatorFunction[T, T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2]]
    @scala.inline
    def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
    @scala.inline
    def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
    @scala.inline
    def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double, scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
    @scala.inline
    def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Unit, scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
    @scala.inline
    def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
    @scala.inline
    def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
    @scala.inline
    def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], concurrent: Double): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
    @scala.inline
    def merge[T, T2, T3, T4](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      concurrent: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
    @scala.inline
    def merge[T, T2, T3, T4](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      concurrent: Unit,
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
    @scala.inline
    def merge[T, T2, T3, T4](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
    @scala.inline
    def merge[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
    @scala.inline
    def merge[T, T2, T3, T4, T5](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      concurrent: Double
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
    @scala.inline
    def merge[T, T2, T3, T4, T5](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      concurrent: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
    @scala.inline
    def merge[T, T2, T3, T4, T5](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      concurrent: Unit,
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
    @scala.inline
    def merge[T, T2, T3, T4, T5](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
    @scala.inline
    def merge[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6]
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
    @scala.inline
    def merge[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      concurrent: Double
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
    @scala.inline
    def merge[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      concurrent: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
    @scala.inline
    def merge[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      concurrent: Unit,
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
    @scala.inline
    def merge[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
    
    @scala.inline
    def mergeAll[T](): OperatorFunction[ObservableInput[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")().asInstanceOf[OperatorFunction[ObservableInput[T], T]]
    @scala.inline
    def mergeAll[T](concurrent: Double): OperatorFunction[ObservableInput[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(concurrent.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[ObservableInput[T], T]]
    
    @scala.inline
    def mergeMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def mergeMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], concurrent: Double): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def mergeMap[T, O /* <: ObservableInput[js.Any] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: Unit,
      concurrent: Double
    ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def mergeMap[T, R, O /* <: ObservableInput[js.Any] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def mergeMap[T, R, O /* <: ObservableInput[js.Any] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ],
      concurrent: Double
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def mergeMapTo[T, O /* <: ObservableInput[js.Any] */](innerObservable: O): OperatorFunction[js.Any, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[js.Any, ObservedValueOf[O]]]
    @scala.inline
    def mergeMapTo[T, O /* <: ObservableInput[js.Any] */](innerObservable: O, concurrent: Double): OperatorFunction[js.Any, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[js.Any, ObservedValueOf[O]]]
    @scala.inline
    def mergeMapTo[T, R, O /* <: ObservableInput[js.Any] */](
      innerObservable: O,
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def mergeMapTo[T, R, O /* <: ObservableInput[js.Any] */](
      innerObservable: O,
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ],
      concurrent: Double
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def mergeScan[T, R](
      accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
      seed: R
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def mergeScan[T, R](
      accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
      seed: R,
      concurrent: Double
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def merge_TR_OperatorFunction[T, R](observables: (ObservableInput[js.Any] | SchedulerLike | Double)*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def min[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def min[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(comparer.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def multicast[T](
      subjectFactory: js.ThisFunction0[
          /* this */ typings.rxjs.internalObservableMod.Observable[T], 
          typings.rxjs.subjectMod.Subject[T]
        ]
    ): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[T]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subjectFactory.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[T]
      ]]
    @scala.inline
    def multicast[T](subject: typings.rxjs.subjectMod.Subject[T]): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[T]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subject.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[T]
      ]]
    @scala.inline
    def multicast[T, O /* <: ObservableInput[js.Any] */](
      SubjectFactory: js.ThisFunction0[
          /* this */ typings.rxjs.internalObservableMod.Observable[T], 
          typings.rxjs.subjectMod.Subject[T]
        ],
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O]
    ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(SubjectFactory.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def multicast[T, O /* <: ObservableInput[js.Any] */](
      subject: typings.rxjs.subjectMod.Subject[T],
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O]
    ): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[ObservedValueOf[O]]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subject.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[ObservedValueOf[O]]
      ]]
    
    @scala.inline
    def observeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observeOn")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def observeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observeOn")(scheduler.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def onErrorResumeNext[T](): OperatorFunction[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")().asInstanceOf[OperatorFunction[T, T]]
    @scala.inline
    def onErrorResumeNext[T, R](array: js.Array[ObservableInput[js.Any]]): OperatorFunction[T, T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(array.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | R]]
    @scala.inline
    def onErrorResumeNext[T, R](observables: ObservableInput[js.Any]*): OperatorFunction[T, T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | R]]
    @scala.inline
    def onErrorResumeNext[T, T2](v: ObservableInput[T2]): OperatorFunction[T, T | T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | T2]]
    @scala.inline
    def onErrorResumeNext[T, T2, T3](v: ObservableInput[T2], v2: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
    @scala.inline
    def onErrorResumeNext[T, T2, T3, T4](v: ObservableInput[T2], v2: ObservableInput[T3], v3: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
    @scala.inline
    def onErrorResumeNext[T, T2, T3, T4, T5](v: ObservableInput[T2], v2: ObservableInput[T3], v3: ObservableInput[T4], v4: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
    @scala.inline
    def onErrorResumeNext[T, T2, T3, T4, T5, T6](
      v: ObservableInput[T2],
      v2: ObservableInput[T3],
      v3: ObservableInput[T4],
      v4: ObservableInput[T5],
      v5: ObservableInput[T6]
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
    @scala.inline
    def onErrorResumeNext[T, T2, T3, T4, T5, T6, T7](
      v: ObservableInput[T2],
      v2: ObservableInput[T3],
      v3: ObservableInput[T4],
      v4: ObservableInput[T5],
      v5: ObservableInput[T6],
      v6: ObservableInput[T7]
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6 | T7] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6 | T7]]
    
    @scala.inline
    def pairwise[T](): OperatorFunction[T, js.Tuple2[T, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairwise")().asInstanceOf[OperatorFunction[T, js.Tuple2[T, T]]]
    
    @scala.inline
    def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        js.Tuple2[
          typings.rxjs.internalObservableMod.Observable[T], 
          typings.rxjs.internalObservableMod.Observable[T]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        js.Tuple2[
          typings.rxjs.internalObservableMod.Observable[T], 
          typings.rxjs.internalObservableMod.Observable[T]
        ]
      ]]
    @scala.inline
    def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        js.Tuple2[
          typings.rxjs.internalObservableMod.Observable[T], 
          typings.rxjs.internalObservableMod.Observable[T]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        js.Tuple2[
          typings.rxjs.internalObservableMod.Observable[T], 
          typings.rxjs.internalObservableMod.Observable[T]
        ]
      ]]
    
    @scala.inline
    def pluck[T, K1 /* <: /* keyof T */ String */](k1: K1): OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1] */ js.Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1] */ js.Any
      ]]
    @scala.inline
    def pluck[T, R](properties: String*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(properties.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */](k1: K1, k2: K2): OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2] */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2] */ js.Any
      ]]
    @scala.inline
    def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */](k1: K1, k2: K2, k3: K3): OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3] */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any], k3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3] */ js.Any
      ]]
    @scala.inline
    def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4): OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4] */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any], k3.asInstanceOf[js.Any], k4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4] */ js.Any
      ]]
    @scala.inline
    def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */, K5 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4, k5: K5): OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5] */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any], k3.asInstanceOf[js.Any], k4.asInstanceOf[js.Any], k5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5] */ js.Any
      ]]
    @scala.inline
    def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */, K5 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4] */ js.Any */, K6 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4][K5] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4, k5: K5, k6: K6): OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5][K6] */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any], k3.asInstanceOf[js.Any], k4.asInstanceOf[js.Any], k5.asInstanceOf[js.Any], k6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5][K6] */ js.Any
      ]]
    
    @scala.inline
    def publish[T](): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[T]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")().asInstanceOf[UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[T]
      ]]
    @scala.inline
    def publish[T](selector: MonoTypeOperatorFunction[T]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")(selector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def publishBehavior[T](value: T): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[T]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishBehavior")(value.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[T]
      ]]
    
    @scala.inline
    def publishLast[T](): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[T]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishLast")().asInstanceOf[UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[T]
      ]]
    
    @scala.inline
    def publishReplay[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")().asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def publishReplay[T](bufferSize: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def publishReplay[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def publishReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def publishReplay[T](bufferSize: Double, windowTime: Unit, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def publishReplay[T](bufferSize: Unit, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def publishReplay[T](bufferSize: Unit, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def publishReplay[T](bufferSize: Unit, windowTime: Unit, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def publishReplay[T, O /* <: ObservableInput[js.Any] */](
      bufferSize: Double,
      windowTime: Double,
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O]
    ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def publishReplay[T, O /* <: ObservableInput[js.Any] */](
      bufferSize: Double,
      windowTime: Double,
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O],
      scheduler: SchedulerLike
    ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def publishReplay[T, O /* <: ObservableInput[js.Any] */](bufferSize: Double, windowTime: Double, selector: Unit, scheduler: SchedulerLike): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def publishReplay[T, O /* <: ObservableInput[js.Any] */](
      bufferSize: Double,
      windowTime: Unit,
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O]
    ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def publishReplay[T, O /* <: ObservableInput[js.Any] */](
      bufferSize: Double,
      windowTime: Unit,
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O],
      scheduler: SchedulerLike
    ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def publishReplay[T, O /* <: ObservableInput[js.Any] */](bufferSize: Double, windowTime: Unit, selector: Unit, scheduler: SchedulerLike): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def publishReplay[T, O /* <: ObservableInput[js.Any] */](
      bufferSize: Unit,
      windowTime: Double,
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O]
    ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def publishReplay[T, O /* <: ObservableInput[js.Any] */](
      bufferSize: Unit,
      windowTime: Double,
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O],
      scheduler: SchedulerLike
    ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def publishReplay[T, O /* <: ObservableInput[js.Any] */](bufferSize: Unit, windowTime: Double, selector: Unit, scheduler: SchedulerLike): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def publishReplay[T, O /* <: ObservableInput[js.Any] */](
      bufferSize: Unit,
      windowTime: Unit,
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O]
    ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def publishReplay[T, O /* <: ObservableInput[js.Any] */](
      bufferSize: Unit,
      windowTime: Unit,
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O],
      scheduler: SchedulerLike
    ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def publishReplay[T, O /* <: ObservableInput[js.Any] */](bufferSize: Unit, windowTime: Unit, selector: Unit, scheduler: SchedulerLike): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    
    @scala.inline
    def publishReplay_TO_ObservableInputAny_OperatorFunction[T, O /* <: ObservableInput[js.Any] */](): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")().asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def publishReplay_TO_ObservableInputAny_OperatorFunction[T, O /* <: ObservableInput[js.Any] */](bufferSize: Double): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def publishReplay_TO_ObservableInputAny_OperatorFunction[T, O /* <: ObservableInput[js.Any] */](bufferSize: Double, windowTime: Double): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def publishReplay_TO_ObservableInputAny_OperatorFunction[T, O /* <: ObservableInput[js.Any] */](bufferSize: Unit, windowTime: Double): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    
    @scala.inline
    def publish_TO_ObservableInputAny_OperatorFunction[T, O /* <: ObservableInput[js.Any] */](selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")(selector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    
    @scala.inline
    def race[T](
      observables: (typings.rxjs.internalObservableMod.Observable[T] | js.Array[typings.rxjs.internalObservableMod.Observable[T]])*
    ): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def race[T](observables: js.Array[typings.rxjs.internalObservableMod.Observable[T]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def race_TR_OperatorFunction[T, R](
      observables: (typings.rxjs.internalObservableMod.Observable[js.Any] | js.Array[typings.rxjs.internalObservableMod.Observable[js.Any]])*
    ): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def race_TR_OperatorFunction[T, R](observables: js.Array[typings.rxjs.internalObservableMod.Observable[T]]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(accumulator.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def reduce_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(accumulator.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def reduce_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def refCount[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("refCount")().asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def repeat[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")().asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def repeat[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def repeatWhen[T](
      notifier: js.Function1[
          /* notifications */ typings.rxjs.internalObservableMod.Observable[js.Any], 
          typings.rxjs.internalObservableMod.Observable[js.Any]
        ]
    ): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeatWhen")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def retry[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")().asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def retry[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def retryWhen[T](
      notifier: js.Function1[
          /* errors */ typings.rxjs.internalObservableMod.Observable[js.Any], 
          typings.rxjs.internalObservableMod.Observable[js.Any]
        ]
    ): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryWhen")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def sample[T](notifier: typings.rxjs.internalObservableMod.Observable[js.Any]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sample")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def sampleTime[T](period: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sampleTime")(period.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def sampleTime[T](period: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sampleTime")(period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def scan_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def scan_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def sequenceEqual[T](compareTo: typings.rxjs.internalObservableMod.Observable[T]): OperatorFunction[T, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Boolean]]
    @scala.inline
    def sequenceEqual[T](
      compareTo: typings.rxjs.internalObservableMod.Observable[T],
      comparator: js.Function2[/* a */ T, /* b */ T, Boolean]
    ): OperatorFunction[T, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Boolean]]
    
    @scala.inline
    def share[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("share")().asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def shareReplay[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")().asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def shareReplay[T](bufferSize: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def shareReplay[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def shareReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def shareReplay[T](bufferSize: Double, windowTime: Unit, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def shareReplay[T](bufferSize: Unit, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def shareReplay[T](bufferSize: Unit, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def shareReplay[T](bufferSize: Unit, windowTime: Unit, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def shareReplay[T](config: ShareReplayConfig): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(config.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def single[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")().asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def single[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ]
    ): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def skip[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def skipLast[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipLast")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def skipUntil[T](notifier: typings.rxjs.internalObservableMod.Observable[js.Any]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def skipWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def startWith[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def startWith[T, D](array: (D | SchedulerLike)*): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(array.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | D]]
    @scala.inline
    def startWith[T, D](v1: D): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | D]]
    @scala.inline
    def startWith[T, D](v1: D, scheduler: SchedulerLike): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
    @scala.inline
    def startWith[T, D, E](v1: D, v2: E): OperatorFunction[T, T | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E]]
    @scala.inline
    def startWith[T, D, E](v1: D, v2: E, scheduler: SchedulerLike): OperatorFunction[T, T | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E]]
    @scala.inline
    def startWith[T, D, E, F](v1: D, v2: E, v3: F): OperatorFunction[T, T | D | E | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F]]
    @scala.inline
    def startWith[T, D, E, F](v1: D, v2: E, v3: F, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F]]
    @scala.inline
    def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G): OperatorFunction[T, T | D | E | F | G] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G]]
    @scala.inline
    def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G]]
    @scala.inline
    def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H): OperatorFunction[T, T | D | E | F | G | H] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G | H]]
    @scala.inline
    def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G | H] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G | H]]
    @scala.inline
    def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I): OperatorFunction[T, T | D | E | F | G | H | I] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G | H | I]]
    @scala.inline
    def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G | H | I] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G | H | I]]
    
    @scala.inline
    def subscribeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribeOn")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def subscribeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeOn")(scheduler.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def switchAll[T](): OperatorFunction[ObservableInput[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchAll")().asInstanceOf[OperatorFunction[ObservableInput[T], T]]
    
    @scala.inline
    def switchAll_R[R](): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchAll")().asInstanceOf[OperatorFunction[js.Any, R]]
    
    @scala.inline
    def switchMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def switchMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], resultSelector: Unit): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
    @scala.inline
    def switchMap[T, R, O /* <: ObservableInput[js.Any] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def switchMapTo[R](observable: ObservableInput[R]): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[js.Any, R]]
    @scala.inline
    def switchMapTo[T, R](observable: ObservableInput[R], resultSelector: Unit): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def switchMapTo[T, I, R](
      observable: ObservableInput[I],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ I, 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def take[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def takeLast[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeLast")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def takeUntil[T](notifier: typings.rxjs.internalObservableMod.Observable[js.Any]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], inclusive: Boolean): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def takeWhile_TS_T_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): OperatorFunction[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, S]]
    
    @scala.inline
    def takeWhile_false[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], inclusive: `false`): OperatorFunction[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S]]
    
    @scala.inline
    def tap[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")().asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def tap[T](next: js.Function1[/* x */ T, Unit]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def tap[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ js.Any, Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def tap[T](
      next: js.Function1[/* x */ T, Unit],
      error: js.Function1[/* e */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def tap[T](next: js.Function1[/* value */ T, Unit], error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def tap[T](next: js.Function1[/* x */ /* value */ T, Unit], error: Unit, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def tap[T](next: Null, error: js.Function1[/* error */ js.Any, Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def tap[T](next: Null, error: js.Function1[/* error */ js.Any, Unit], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def tap[T](next: Null, error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def tap[T](next: Null, error: Unit, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def tap[T](next: Unit, error: js.Function1[/* e */ /* error */ js.Any, Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def tap[T](next: Unit, error: js.Function1[/* e */ /* error */ js.Any, Unit], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def tap[T](next: Unit, error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def tap[T](next: Unit, error: Unit, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def tap[T](observer: PartialObserver[T]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(observer.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def throttle[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[js.Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def throttle[T](
      durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[js.Any]],
      config: ThrottleConfig
    ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def throttleTime[T](duration: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def throttleTime[T](duration: Double, scheduler: Unit, config: ThrottleConfig): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def throttleTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def throttleTime[T](duration: Double, scheduler: SchedulerLike, config: ThrottleConfig): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def timeInterval[T](): OperatorFunction[T, TimeInterval_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")().asInstanceOf[OperatorFunction[T, TimeInterval_[T]]]
    @scala.inline
    def timeInterval[T](scheduler: SchedulerLike): OperatorFunction[T, TimeInterval_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(scheduler.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TimeInterval_[T]]]
    
    @scala.inline
    def timeout[T](due: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def timeout[T](due: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def timeout[T](due: Date): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
    @scala.inline
    def timeout[T](due: Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
    
    @scala.inline
    def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
    @scala.inline
    def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
    @scala.inline
    def timeoutWith[T, R](due: Date, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
    @scala.inline
    def timeoutWith[T, R](due: Date, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
    
    @scala.inline
    def timestamp[T](): OperatorFunction[T, Timestamp_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")().asInstanceOf[OperatorFunction[T, Timestamp_[T]]]
    @scala.inline
    def timestamp[T](scheduler: SchedulerLike): OperatorFunction[T, Timestamp_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(scheduler.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Timestamp_[T]]]
    
    @scala.inline
    def toArray[T](): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[OperatorFunction[T, js.Array[T]]]
    
    @scala.inline
    def window[T](windowBoundaries: typings.rxjs.internalObservableMod.Observable[js.Any]): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("window")(windowBoundaries.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]]]
    
    @scala.inline
    def windowCount[T](windowSize: Double): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowCount")(windowSize.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]]]
    @scala.inline
    def windowCount[T](windowSize: Double, startWindowEvery: Double): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowCount")(windowSize.asInstanceOf[js.Any], startWindowEvery.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]]]
    
    @scala.inline
    def windowTime[T](windowTimeSpan: Double): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]]]
    @scala.inline
    def windowTime[T](windowTimeSpan: Double, scheduler: SchedulerLike): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]]]
    @scala.inline
    def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]]]
    @scala.inline
    def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]]]
    @scala.inline
    def windowTime[T](
      windowTimeSpan: Double,
      windowCreationInterval: Double,
      maxWindowSize: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]]]
    @scala.inline
    def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, scheduler: SchedulerLike): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]]]
    
    @scala.inline
    def windowToggle[T, O](
      openings: typings.rxjs.internalObservableMod.Observable[O],
      closingSelector: js.Function1[/* openValue */ O, typings.rxjs.internalObservableMod.Observable[js.Any]]
    ): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowToggle")(openings.asInstanceOf[js.Any], closingSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]]]
    
    @scala.inline
    def windowWhen[T](closingSelector: js.Function0[typings.rxjs.internalObservableMod.Observable[js.Any]]): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowWhen")(closingSelector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]]]
    
    @scala.inline
    def withLatestFrom[T, R](array: js.Array[ObservableInput[js.Any]]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(array.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def withLatestFrom[T, R](array: js.Array[ObservableInput[js.Any]], project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(array.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def withLatestFrom[T, R](observables: (ObservableInput[js.Any] | (js.Function1[/* repeated */ js.Any, R]))*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def withLatestFrom[T, R](project: js.Function1[/* v1 */ T, R]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */](source2: O2): OperatorFunction[T, js.Tuple2[T, ObservedValueOf[O2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(source2.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Tuple2[T, ObservedValueOf[O2]]]]
    @scala.inline
    def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, R](source2: O2, project: js.Function2[/* v1 */ T, /* v2 */ ObservedValueOf[O2], R]): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(source2.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */](v2: O2, v3: O3): OperatorFunction[T, js.Tuple3[T, ObservedValueOf[O2], ObservedValueOf[O3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple3[T, ObservedValueOf[O2], ObservedValueOf[O3]]]]
    @scala.inline
    def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, R](
      v2: O2,
      v3: O3,
      project: js.Function3[/* v1 */ T, /* v2 */ ObservedValueOf[O2], /* v3 */ ObservedValueOf[O3], R]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */](v2: O2, v3: O3, v4: O4): OperatorFunction[T, js.Tuple4[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple4[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]]]
    @scala.inline
    def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, R](
      v2: O2,
      v3: O3,
      v4: O4,
      project: js.Function4[
          /* v1 */ T, 
          /* v2 */ ObservedValueOf[O2], 
          /* v3 */ ObservedValueOf[O3], 
          /* v4 */ ObservedValueOf[O4], 
          R
        ]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */](v2: O2, v3: O3, v4: O4, v5: O5): OperatorFunction[
        T, 
        js.Tuple5[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4], ObservedValueOf[O5]]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
        T, 
        js.Tuple5[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4], ObservedValueOf[O5]]
      ]]
    @scala.inline
    def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, R](
      v2: O2,
      v3: O3,
      v4: O4,
      v5: O5,
      project: js.Function5[
          /* v1 */ T, 
          /* v2 */ ObservedValueOf[O2], 
          /* v3 */ ObservedValueOf[O3], 
          /* v4 */ ObservedValueOf[O4], 
          /* v5 */ ObservedValueOf[O5], 
          R
        ]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */](v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): OperatorFunction[
        T, 
        js.Tuple6[
          T, 
          ObservedValueOf[O2], 
          ObservedValueOf[O3], 
          ObservedValueOf[O4], 
          ObservedValueOf[O5], 
          ObservedValueOf[O6]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
        T, 
        js.Tuple6[
          T, 
          ObservedValueOf[O2], 
          ObservedValueOf[O3], 
          ObservedValueOf[O4], 
          ObservedValueOf[O5], 
          ObservedValueOf[O6]
        ]
      ]]
    @scala.inline
    def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */, R](
      v2: O2,
      v3: O3,
      v4: O4,
      v5: O5,
      v6: O6,
      project: js.Function6[
          /* v1 */ T, 
          /* v2 */ ObservedValueOf[O2], 
          /* v3 */ ObservedValueOf[O3], 
          /* v4 */ ObservedValueOf[O4], 
          /* v5 */ ObservedValueOf[O5], 
          /* v6 */ ObservedValueOf[O6], 
          R
        ]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def zip[T, R](array: js.Array[ObservableInput[T]]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(array.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def zip[T, R](observables: (ObservableInput[T] | (js.Function1[/* repeated */ T, R]))*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def zip[T, R](project: js.Function1[/* v1 */ T, R]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def zip[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, js.Tuple2[T, T2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Tuple2[T, T2]]]
    @scala.inline
    def zip[T, TOther, R](
      array: js.Array[ObservableInput[TOther]],
      project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(array.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def zip[T, T2, R](v2: ObservableInput[T2], project: js.Function2[/* v1 */ T, /* v2 */ T2, R]): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def zip[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, js.Tuple3[T, T2, T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple3[T, T2, T3]]]
    @scala.inline
    def zip[T, T2, T3, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def zip[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, js.Tuple4[T, T2, T3, T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple4[T, T2, T3, T4]]]
    @scala.inline
    def zip[T, T2, T3, T4, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def zip[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, js.Tuple5[T, T2, T3, T4, T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple5[T, T2, T3, T4, T5]]]
    @scala.inline
    def zip[T, T2, T3, T4, T5, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    @scala.inline
    def zip[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6]
    ): OperatorFunction[T, js.Tuple6[T, T2, T3, T4, T5, T6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple6[T, T2, T3, T4, T5, T6]]]
    @scala.inline
    def zip[T, T2, T3, T4, T5, T6, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
    
    @scala.inline
    def zipAll[T](): OperatorFunction[js.Any, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")().asInstanceOf[OperatorFunction[js.Any, js.Array[T]]]
    @scala.inline
    def zipAll[R](project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[js.Any, R]]
    
    @scala.inline
    def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[ObservableInput[T], R]]
  }
  
  @scala.inline
  def pipe[T](): UnaryFunction[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")().asInstanceOf[UnaryFunction[T, T]]
  @scala.inline
  def pipe[T, A](fn1: UnaryFunction[T, A]): UnaryFunction[T, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[T, A]]
  @scala.inline
  def pipe[T, A, B](fn1: UnaryFunction[T, A], fn2: UnaryFunction[A, B]): UnaryFunction[T, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, B]]
  @scala.inline
  def pipe[T, A, B, C](fn1: UnaryFunction[T, A], fn2: UnaryFunction[A, B], fn3: UnaryFunction[B, C]): UnaryFunction[T, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, C]]
  @scala.inline
  def pipe[T, A, B, C, D](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D]
  ): UnaryFunction[T, D] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, D]]
  @scala.inline
  def pipe[T, A, B, C, D, E](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E]
  ): UnaryFunction[T, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, E]]
  @scala.inline
  def pipe[T, A, B, C, D, E, F](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F]
  ): UnaryFunction[T, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any], fn6.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, F]]
  @scala.inline
  def pipe[T, A, B, C, D, E, F, G](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G]
  ): UnaryFunction[T, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any], fn6.asInstanceOf[js.Any], fn7.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, G]]
  @scala.inline
  def pipe[T, A, B, C, D, E, F, G, H](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G],
    fn8: UnaryFunction[G, H]
  ): UnaryFunction[T, H] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any], fn6.asInstanceOf[js.Any], fn7.asInstanceOf[js.Any], fn8.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, H]]
  @scala.inline
  def pipe[T, A, B, C, D, E, F, G, H, I](
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
  @scala.inline
  def pipe[T, A, B, C, D, E, F, G, H, I](
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
}
