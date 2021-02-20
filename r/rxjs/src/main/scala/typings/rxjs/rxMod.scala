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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rxMod {
  
  @JSImport("rxjs/internal/Rx", "AjaxError")
  @js.native
  val AjaxError: AjaxErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/Rx", "AjaxError")
  @js.native
  class AjaxErrorCls protected ()
    extends typings.rxjs.ajaxObservableMod.AjaxError {
    def this(message: String, xhr: XMLHttpRequest, request: AjaxRequest) = this()
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
    extends typings.rxjs.ajaxObservableMod.AjaxError {
    def this(xhr: XMLHttpRequest, request: AjaxRequest) = this()
  }
  
  @JSImport("rxjs/internal/Rx", "AnonymousSubject")
  @js.native
  class AnonymousSubject[T] ()
    extends typings.rxjs.subjectMod.AnonymousSubject[T] {
    def this(destination: Observer[T]) = this()
    def this(destination: js.UndefOr[scala.Nothing], source: typings.rxjs.internalObservableMod.Observable[T]) = this()
    def this(destination: Observer[T], source: typings.rxjs.internalObservableMod.Observable[T]) = this()
  }
  
  @JSImport("rxjs/internal/Rx", "ArgumentOutOfRangeError")
  @js.native
  val ArgumentOutOfRangeError: ArgumentOutOfRangeErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/Rx", "ArgumentOutOfRangeError")
  @js.native
  class ArgumentOutOfRangeErrorCls () extends Error
  
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
  class EmptyErrorCls () extends Error
  
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
    def this(kind: C, value: js.UndefOr[scala.Nothing], error: js.Any) = this()
    def this(kind: E, value: T, error: js.Any) = this()
    def this(kind: E, value: js.UndefOr[scala.Nothing], error: js.Any) = this()
    def this(kind: N, value: T, error: js.Any) = this()
    def this(kind: N, value: js.UndefOr[scala.Nothing], error: js.Any) = this()
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
    @JSImport("rxjs/internal/Rx", "Notification.createComplete")
    @js.native
    def createComplete(): typings.rxjs.notificationMod.Notification[_] = js.native
    
    /**
      * A shortcut to create a Notification instance of the type `error` from a
      * given error.
      * @param {any} [err] The `error` error.
      * @return {Notification<T>} The "error" Notification representing the
      * argument.
      * @nocollapse
      */
    @JSImport("rxjs/internal/Rx", "Notification.createError")
    @js.native
    def createError[T](): typings.rxjs.notificationMod.Notification[T] = js.native
    @JSImport("rxjs/internal/Rx", "Notification.createError")
    @js.native
    def createError[T](err: js.Any): typings.rxjs.notificationMod.Notification[T] = js.native
    
    /**
      * A shortcut to create a Notification instance of the type `next` from a
      * given value.
      * @param {T} value The `next` value.
      * @return {Notification<T>} The "next" Notification representing the
      * argument.
      * @nocollapse
      */
    @JSImport("rxjs/internal/Rx", "Notification.createNext")
    @js.native
    def createNext[T](value: T): typings.rxjs.notificationMod.Notification[T] = js.native
    
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
    def apply(value: String): js.UndefOr[typings.rxjs.notificationMod.NotificationKind with String] = js.native
    
    /* "C" */ val COMPLETE: typings.rxjs.notificationMod.NotificationKind.COMPLETE with String = js.native
    
    /* "E" */ val ERROR: typings.rxjs.notificationMod.NotificationKind.ERROR with String = js.native
    
    /* "N" */ val NEXT: typings.rxjs.notificationMod.NotificationKind.NEXT with String = js.native
  }
  
  @JSImport("rxjs/internal/Rx", "ObjectUnsubscribedError")
  @js.native
  val ObjectUnsubscribedError: ObjectUnsubscribedErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/Rx", "ObjectUnsubscribedError")
  @js.native
  class ObjectUnsubscribedErrorCls () extends Error
  
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
    @JSImport("rxjs/internal/Rx", "Observable.if")
    @js.native
    def `if`[T, F](condition: js.Function0[Boolean]): typings.rxjs.internalObservableMod.Observable[T | F] = js.native
    @JSImport("rxjs/internal/Rx", "Observable.if")
    @js.native
    def `if`[T, F](
      condition: js.Function0[Boolean],
      trueResult: js.UndefOr[SubscribableOrPromise[T]],
      falseResult: SubscribableOrPromise[F]
    ): typings.rxjs.internalObservableMod.Observable[T | F] = js.native
    @JSImport("rxjs/internal/Rx", "Observable.if")
    @js.native
    def `if`[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): typings.rxjs.internalObservableMod.Observable[T | F] = js.native
    
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
    @JSImport("rxjs/internal/Rx", "Observable.throw")
    @js.native
    def `throw`(error: js.Any): typings.rxjs.internalObservableMod.Observable[scala.Nothing] = js.native
    @JSImport("rxjs/internal/Rx", "Observable.throw")
    @js.native
    def `throw`(error: js.Any, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[scala.Nothing] = js.native
  }
  
  @JSImport("rxjs/internal/Rx", "ReplaySubject")
  @js.native
  class ReplaySubject[T] ()
    extends typings.rxjs.replaySubjectMod.ReplaySubject[T] {
    def this(bufferSize: Double) = this()
    def this(bufferSize: js.UndefOr[scala.Nothing], windowTime: Double) = this()
    def this(bufferSize: Double, windowTime: Double) = this()
    def this(
      bufferSize: js.UndefOr[scala.Nothing],
      windowTime: js.UndefOr[scala.Nothing],
      scheduler: SchedulerLike
    ) = this()
    def this(bufferSize: js.UndefOr[scala.Nothing], windowTime: Double, scheduler: SchedulerLike) = this()
    def this(bufferSize: Double, windowTime: js.UndefOr[scala.Nothing], scheduler: SchedulerLike) = this()
    def this(bufferSize: Double, windowTime: Double, scheduler: SchedulerLike) = this()
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
  /* static members */
  object Subscriber {
    
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
    @JSImport("rxjs/internal/Rx", "Subscriber.create")
    @js.native
    def create[T](): typings.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs/internal/Rx", "Subscriber.create")
    @js.native
    def create[T](next: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): typings.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs/internal/Rx", "Subscriber.create")
    @js.native
    def create[T](next: js.UndefOr[scala.Nothing], error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): typings.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs/internal/Rx", "Subscriber.create")
    @js.native
    def create[T](
      next: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ): typings.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs/internal/Rx", "Subscriber.create")
    @js.native
    def create[T](next: js.Function1[/* x */ js.UndefOr[T], Unit]): typings.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs/internal/Rx", "Subscriber.create")
    @js.native
    def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ): typings.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs/internal/Rx", "Subscriber.create")
    @js.native
    def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ): typings.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs/internal/Rx", "Subscriber.create")
    @js.native
    def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ): typings.rxjs.subscriberMod.Subscriber[T] = js.native
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
    
    /** @nocollapse */
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(marbles: String): js.Array[TestMessage] = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: js.UndefOr[scala.Nothing],
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(marbles: String, values: js.UndefOr[scala.Nothing], errorValue: js.Any): js.Array[TestMessage] = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.Any,
      materializeInnerObservables: js.UndefOr[scala.Nothing],
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.Any,
      materializeInnerObservables: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.Any,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(marbles: String, values: js.Any): js.Array[TestMessage] = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: js.UndefOr[scala.Nothing],
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(marbles: String, values: js.Any, errorValue: js.Any): js.Array[TestMessage] = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.Any,
      materializeInnerObservables: js.UndefOr[scala.Nothing],
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(marbles: String, values: js.Any, errorValue: js.Any, materializeInnerObservables: Boolean): js.Array[TestMessage] = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.Any,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    
    /** @nocollapse */
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarblesAsSubscriptions")
    @js.native
    def parseMarblesAsSubscriptions(marbles: String): SubscriptionLog = js.native
    @JSImport("rxjs/internal/Rx", "TestScheduler.parseMarblesAsSubscriptions")
    @js.native
    def parseMarblesAsSubscriptions(marbles: String, runMode: Boolean): SubscriptionLog = js.native
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
  class TimeoutErrorCls () extends Error
  
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
    extends typings.rxjs.unsubscriptionErrorMod.UnsubscriptionError {
    def this(errors: js.Array[_]) = this()
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
    def this(SchedulerAction: js.UndefOr[scala.Nothing], maxFrames: Double) = this()
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
    class Promise[T] protected () extends PromiseLike[T] {
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
    
    @JSImport("rxjs/internal/Rx", "operators.audit")
    @js.native
    def audit[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]]): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.auditTime")
    @js.native
    def auditTime[T](duration: Double): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.auditTime")
    @js.native
    def auditTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.buffer")
    @js.native
    def buffer[T](closingNotifier: typings.rxjs.internalObservableMod.Observable[_]): OperatorFunction[T, js.Array[T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.bufferCount")
    @js.native
    def bufferCount[T](bufferSize: Double): OperatorFunction[T, js.Array[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.bufferCount")
    @js.native
    def bufferCount[T](bufferSize: Double, startBufferEvery: Double): OperatorFunction[T, js.Array[T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.bufferTime")
    @js.native
    def bufferTime[T](bufferTimeSpan: Double): OperatorFunction[T, js.Array[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.bufferTime")
    @js.native
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: js.UndefOr[scala.Nothing], maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.bufferTime")
    @js.native
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: js.UndefOr[scala.Nothing],
      maxBufferSize: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, js.Array[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.bufferTime")
    @js.native
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: js.UndefOr[scala.Nothing],
      scheduler: SchedulerLike
    ): OperatorFunction[T, js.Array[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.bufferTime")
    @js.native
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double): OperatorFunction[T, js.Array[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.bufferTime")
    @js.native
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.bufferTime")
    @js.native
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Double,
      maxBufferSize: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, js.Array[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.bufferTime")
    @js.native
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.bufferTime")
    @js.native
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.bufferTime")
    @js.native
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Null,
      maxBufferSize: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, js.Array[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.bufferTime")
    @js.native
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.bufferTime")
    @js.native
    def bufferTime[T](bufferTimeSpan: Double, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.bufferToggle")
    @js.native
    def bufferToggle[T, O](
      openings: SubscribableOrPromise[O],
      closingSelector: js.Function1[/* value */ O, SubscribableOrPromise[_]]
    ): OperatorFunction[T, js.Array[T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.bufferWhen")
    @js.native
    def bufferWhen[T](closingSelector: js.Function0[typings.rxjs.internalObservableMod.Observable[_]]): OperatorFunction[T, js.Array[T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.catchError")
    @js.native
    def catchError[T, O /* <: ObservableInput[_] */](
      selector: js.Function2[/* err */ js.Any, /* caught */ typings.rxjs.internalObservableMod.Observable[T], O]
    ): OperatorFunction[T, T | ObservedValueOf[O]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.combineAll")
    @js.native
    def combineAll[T](): OperatorFunction[_, js.Array[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.combineAll")
    @js.native
    def combineAll[R](project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[_, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.combineAll")
    @js.native
    def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.combineLatest")
    @js.native
    def combineLatest[T, R](array: js.Array[ObservableInput[T]]): OperatorFunction[T, js.Array[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.combineLatest")
    @js.native
    def combineLatest[T, R](observables: (ObservableInput[T] | (js.Function1[/* repeated */ T, R]))*): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.combineLatest")
    @js.native
    def combineLatest[T, R](project: js.Function1[/* v1 */ T, R]): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.combineLatest")
    @js.native
    def combineLatest[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, js.Tuple2[T, T2]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.combineLatest")
    @js.native
    def combineLatest[T, TOther, R](
      array: js.Array[ObservableInput[TOther]],
      project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.combineLatest")
    @js.native
    def combineLatest[T, T2, R](v2: ObservableInput[T2], project: js.Function2[/* v1 */ T, /* v2 */ T2, R]): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.combineLatest")
    @js.native
    def combineLatest[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, js.Tuple3[T, T2, T3]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.combineLatest")
    @js.native
    def combineLatest[T, T2, T3, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.combineLatest")
    @js.native
    def combineLatest[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, js.Tuple4[T, T2, T3, T4]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.combineLatest")
    @js.native
    def combineLatest[T, T2, T3, T4, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.combineLatest")
    @js.native
    def combineLatest[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, js.Tuple5[T, T2, T3, T4, T5]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.combineLatest")
    @js.native
    def combineLatest[T, T2, T3, T4, T5, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.combineLatest")
    @js.native
    def combineLatest[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6]
    ): OperatorFunction[T, js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.combineLatest")
    @js.native
    def combineLatest[T, T2, T3, T4, T5, T6, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.concat")
    @js.native
    def concat[T](): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concat")
    @js.native
    def concat[T](observables: (ObservableInput[T] | SchedulerLike)*): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concat")
    @js.native
    def concat[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concat")
    @js.native
    def concat[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, T | T2] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concat")
    @js.native
    def concat[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): OperatorFunction[T, T | T2] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concat")
    @js.native
    def concat[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concat")
    @js.native
    def concat[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concat")
    @js.native
    def concat[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concat")
    @js.native
    def concat[T, T2, T3, T4](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concat")
    @js.native
    def concat[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concat")
    @js.native
    def concat[T, T2, T3, T4, T5](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concat")
    @js.native
    def concat[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6]
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concat")
    @js.native
    def concat[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.concatAll")
    @js.native
    def concatAll[T](): OperatorFunction[ObservableInput[T], T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concatAll")
    @js.native
    def concatAll_R[R](): OperatorFunction[_, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.concatMap")
    @js.native
    def concatMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concatMap")
    @js.native
    def concatMap[T, O /* <: ObservableInput[_] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.UndefOr[scala.Nothing]
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concatMap")
    @js.native
    def concatMap[T, R, O /* <: ObservableInput[_] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.concatMapTo")
    @js.native
    def concatMapTo[T, O /* <: ObservableInput[_] */](observable: O): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concatMapTo")
    @js.native
    def concatMapTo[T, O /* <: ObservableInput[_] */](observable: O, resultSelector: js.UndefOr[scala.Nothing]): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.concatMapTo")
    @js.native
    def concatMapTo[T, R, O /* <: ObservableInput[_] */](
      observable: O,
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.concat")
    @js.native
    def concat_TR_OperatorFunction[T, R](observables: (ObservableInput[_] | SchedulerLike)*): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.count")
    @js.native
    def count[T](): OperatorFunction[T, Double] = js.native
    @JSImport("rxjs/internal/Rx", "operators.count")
    @js.native
    def count[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ]
    ): OperatorFunction[T, Double] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.debounce")
    @js.native
    def debounce[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]]): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.debounceTime")
    @js.native
    def debounceTime[T](dueTime: Double): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.debounceTime")
    @js.native
    def debounceTime[T](dueTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.defaultIfEmpty")
    @js.native
    def defaultIfEmpty[T](): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.defaultIfEmpty")
    @js.native
    def defaultIfEmpty[T](defaultValue: T): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.defaultIfEmpty")
    @js.native
    def defaultIfEmpty_TR_OperatorFunction[T, R](): OperatorFunction[T, T | R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.defaultIfEmpty")
    @js.native
    def defaultIfEmpty_TR_OperatorFunction[T, R](defaultValue: R): OperatorFunction[T, T | R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.delay")
    @js.native
    def delay[T](delay: Double): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.delay")
    @js.native
    def delay[T](delay: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.delay")
    @js.native
    def delay[T](delay: Date): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.delay")
    @js.native
    def delay[T](delay: Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.delayWhen")
    @js.native
    def delayWhen[T](
      delayDurationSelector: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          typings.rxjs.internalObservableMod.Observable[_ | scala.Nothing]
        ]
    ): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.delayWhen")
    @js.native
    def delayWhen[T](
      delayDurationSelector: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          typings.rxjs.internalObservableMod.Observable[_ | scala.Nothing]
        ],
      subscriptionDelay: typings.rxjs.internalObservableMod.Observable[_]
    ): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.dematerialize")
    @js.native
    def dematerialize[T](): OperatorFunction[typings.rxjs.notificationMod.Notification[T], T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.distinct")
    @js.native
    def distinct[T, K](): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.distinct")
    @js.native
    def distinct[T, K](keySelector: js.UndefOr[scala.Nothing], flushes: typings.rxjs.internalObservableMod.Observable[_]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.distinct")
    @js.native
    def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.distinct")
    @js.native
    def distinct[T, K](
      keySelector: js.Function1[/* value */ T, K],
      flushes: typings.rxjs.internalObservableMod.Observable[_]
    ): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.distinctUntilChanged")
    @js.native
    def distinctUntilChanged[T](): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.distinctUntilChanged")
    @js.native
    def distinctUntilChanged[T](compare: js.Function2[/* x */ T, /* y */ T, Boolean]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.distinctUntilChanged")
    @js.native
    def distinctUntilChanged[T, K](compare: js.Function2[/* x */ K, /* y */ K, Boolean], keySelector: js.Function1[/* x */ T, K]): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.distinctUntilKeyChanged")
    @js.native
    def distinctUntilKeyChanged[T](key: /* keyof T */ String): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.distinctUntilKeyChanged")
    @js.native
    def distinctUntilKeyChanged[T, K /* <: /* keyof T */ String */](
      key: K,
      compare: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* x */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* y */ js.Any, 
          Boolean
        ]
    ): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.elementAt")
    @js.native
    def elementAt[T](index: Double): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.elementAt")
    @js.native
    def elementAt[T](index: Double, defaultValue: T): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.every")
    @js.native
    def every[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ]
    ): OperatorFunction[T, Boolean] = js.native
    @JSImport("rxjs/internal/Rx", "operators.every")
    @js.native
    def every[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ],
      thisArg: js.Any
    ): OperatorFunction[T, Boolean] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.exhaust")
    @js.native
    def exhaust[T](): OperatorFunction[ObservableInput[T], T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.exhaustMap")
    @js.native
    def exhaustMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.exhaustMap")
    @js.native
    def exhaustMap[T, O /* <: ObservableInput[_] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.UndefOr[scala.Nothing]
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.exhaustMap")
    @js.native
    def exhaustMap[T, I, R](
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[I]],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ I, 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.exhaust")
    @js.native
    def exhaust_R[R](): OperatorFunction[_, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.expand")
    @js.native
    def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.expand")
    @js.native
    def expand[T](
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
      concurrent: js.UndefOr[scala.Nothing],
      scheduler: SchedulerLike
    ): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.expand")
    @js.native
    def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]], concurrent: Double): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.expand")
    @js.native
    def expand[T](
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
      concurrent: Double,
      scheduler: SchedulerLike
    ): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.expand")
    @js.native
    def expand_TR_OperatorFunction[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.expand")
    @js.native
    def expand_TR_OperatorFunction[T, R](
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
      concurrent: js.UndefOr[scala.Nothing],
      scheduler: SchedulerLike
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.expand")
    @js.native
    def expand_TR_OperatorFunction[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]], concurrent: Double): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.expand")
    @js.native
    def expand_TR_OperatorFunction[T, R](
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
      concurrent: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.filter")
    @js.native
    def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.filter")
    @js.native
    def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.filter")
    @js.native
    def filter_TS_T_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): OperatorFunction[T, S] = js.native
    @JSImport("rxjs/internal/Rx", "operators.filter")
    @js.native
    def filter_TS_T_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: js.Any): OperatorFunction[T, S] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.finalize")
    @js.native
    def finalize_[T](callback: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.find")
    @js.native
    def find[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ]
    ): OperatorFunction[T, js.UndefOr[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.find")
    @js.native
    def find[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ],
      thisArg: js.Any
    ): OperatorFunction[T, js.UndefOr[T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.findIndex")
    @js.native
    def findIndex[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ]
    ): OperatorFunction[T, Double] = js.native
    @JSImport("rxjs/internal/Rx", "operators.findIndex")
    @js.native
    def findIndex[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ],
      thisArg: js.Any
    ): OperatorFunction[T, Double] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.find")
    @js.native
    def find_TS_T[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          /* is S */ Boolean
        ]
    ): OperatorFunction[T, js.UndefOr[S]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.find")
    @js.native
    def find_TS_T[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): OperatorFunction[T, js.UndefOr[S]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.first")
    @js.native
    def first[T, D](): OperatorFunction[T, T | D] = js.native
    @JSImport("rxjs/internal/Rx", "operators.first")
    @js.native
    def first[T, D](predicate: js.UndefOr[scala.Nothing], defaultValue: D): OperatorFunction[T, T | D] = js.native
    @JSImport("rxjs/internal/Rx", "operators.first")
    @js.native
    def first[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ]
    ): OperatorFunction[T, T | D] = js.native
    @JSImport("rxjs/internal/Rx", "operators.first")
    @js.native
    def first[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ],
      defaultValue: D
    ): OperatorFunction[T, T | D] = js.native
    @JSImport("rxjs/internal/Rx", "operators.first")
    @js.native
    def first[T, D](predicate: Null, defaultValue: D): OperatorFunction[T, T | D] = js.native
    @JSImport("rxjs/internal/Rx", "operators.first")
    @js.native
    def first_TS_T[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          /* is S */ Boolean
        ]
    ): OperatorFunction[T, S] = js.native
    @JSImport("rxjs/internal/Rx", "operators.first")
    @js.native
    def first_TS_T[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          /* is S */ Boolean
        ],
      defaultValue: S
    ): OperatorFunction[T, S] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.flatMap")
    @js.native
    def flatMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.flatMap")
    @js.native
    def flatMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O], concurrent: Double): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.flatMap")
    @js.native
    def flatMap[T, O /* <: ObservableInput[_] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.UndefOr[scala.Nothing],
      concurrent: Double
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.flatMap")
    @js.native
    def flatMap[T, R, O /* <: ObservableInput[_] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.flatMap")
    @js.native
    def flatMap[T, R, O /* <: ObservableInput[_] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ],
      concurrent: Double
    ): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.groupBy")
    @js.native
    def groupBy[T, K](keySelector: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.groupBy")
    @js.native
    def groupBy[T, K](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: Unit,
      durationSelector: js.Function1[
          /* grouped */ GroupedObservable[K, T], 
          typings.rxjs.internalObservableMod.Observable[_]
        ]
    ): OperatorFunction[T, GroupedObservable[K, T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.groupBy")
    @js.native
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.UndefOr[scala.Nothing],
      durationSelector: js.UndefOr[scala.Nothing],
      subjectSelector: js.Function0[typings.rxjs.subjectMod.Subject[R]]
    ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.groupBy")
    @js.native
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.UndefOr[scala.Nothing],
      durationSelector: js.Function1[
          /* grouped */ GroupedObservable[K, R], 
          typings.rxjs.internalObservableMod.Observable[_]
        ]
    ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.groupBy")
    @js.native
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.UndefOr[scala.Nothing],
      durationSelector: js.Function1[
          /* grouped */ GroupedObservable[K, R], 
          typings.rxjs.internalObservableMod.Observable[_]
        ],
      subjectSelector: js.Function0[typings.rxjs.subjectMod.Subject[R]]
    ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.groupBy")
    @js.native
    def groupBy[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): OperatorFunction[T, GroupedObservable[K, R]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.groupBy")
    @js.native
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.Function1[/* value */ T, R],
      durationSelector: js.UndefOr[scala.Nothing],
      subjectSelector: js.Function0[typings.rxjs.subjectMod.Subject[R]]
    ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.groupBy")
    @js.native
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.Function1[/* value */ T, R],
      durationSelector: js.Function1[
          /* grouped */ GroupedObservable[K, R], 
          typings.rxjs.internalObservableMod.Observable[_]
        ]
    ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.groupBy")
    @js.native
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.Function1[/* value */ T, R],
      durationSelector: js.Function1[
          /* grouped */ GroupedObservable[K, R], 
          typings.rxjs.internalObservableMod.Observable[_]
        ],
      subjectSelector: js.Function0[typings.rxjs.subjectMod.Subject[R]]
    ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.groupBy")
    @js.native
    def groupBy_TKR[T, K, R](keySelector: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, R]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.ignoreElements")
    @js.native
    def ignoreElements(): OperatorFunction[_, scala.Nothing] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.isEmpty")
    @js.native
    def isEmpty[T](): OperatorFunction[T, Boolean] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.last")
    @js.native
    def last[T, D](): OperatorFunction[T, T | D] = js.native
    @JSImport("rxjs/internal/Rx", "operators.last")
    @js.native
    def last[T, D](predicate: js.UndefOr[scala.Nothing], defaultValue: D): OperatorFunction[T, T | D] = js.native
    @JSImport("rxjs/internal/Rx", "operators.last")
    @js.native
    def last[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ]
    ): OperatorFunction[T, T | D] = js.native
    @JSImport("rxjs/internal/Rx", "operators.last")
    @js.native
    def last[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ],
      defaultValue: D
    ): OperatorFunction[T, T | D] = js.native
    @JSImport("rxjs/internal/Rx", "operators.last")
    @js.native
    def last[T, D](predicate: Null, defaultValue: D): OperatorFunction[T, T | D] = js.native
    @JSImport("rxjs/internal/Rx", "operators.last")
    @js.native
    def last_TS_T[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          /* is S */ Boolean
        ]
    ): OperatorFunction[T, S] = js.native
    @JSImport("rxjs/internal/Rx", "operators.last")
    @js.native
    def last_TS_T[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          /* is S */ Boolean
        ],
      defaultValue: S
    ): OperatorFunction[T, S] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.map")
    @js.native
    def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.map")
    @js.native
    def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: js.Any): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.mapTo")
    @js.native
    def mapTo[T, R](value: R): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.materialize")
    @js.native
    def materialize[T](): OperatorFunction[T, typings.rxjs.notificationMod.Notification[T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.max")
    @js.native
    def max[T](): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.max")
    @js.native
    def max[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T](): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T](concurrent: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T](concurrent: Double): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T](concurrent: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T](observables: (ObservableInput[T] | SchedulerLike | Double)*): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, T | T2] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2](v2: ObservableInput[T2], concurrent: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): OperatorFunction[T, T | T2] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2](v2: ObservableInput[T2], concurrent: Double): OperatorFunction[T, T | T2] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2](v2: ObservableInput[T2], concurrent: Double, scheduler: SchedulerLike): OperatorFunction[T, T | T2] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      concurrent: js.UndefOr[scala.Nothing],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double): OperatorFunction[T, T | T2 | T3] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double, scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3, T4](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      concurrent: js.UndefOr[scala.Nothing],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], concurrent: Double): OperatorFunction[T, T | T2 | T3 | T4] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3, T4](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      concurrent: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3, T4, T5](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      concurrent: js.UndefOr[scala.Nothing],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3, T4, T5](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      concurrent: Double
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3, T4, T5](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      concurrent: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6]
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      concurrent: js.UndefOr[scala.Nothing],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      concurrent: Double
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      concurrent: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.mergeAll")
    @js.native
    def mergeAll[T](): OperatorFunction[ObservableInput[T], T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.mergeAll")
    @js.native
    def mergeAll[T](concurrent: Double): OperatorFunction[ObservableInput[T], T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.mergeMap")
    @js.native
    def mergeMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.mergeMap")
    @js.native
    def mergeMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O], concurrent: Double): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.mergeMap")
    @js.native
    def mergeMap[T, O /* <: ObservableInput[_] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.UndefOr[scala.Nothing],
      concurrent: Double
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.mergeMap")
    @js.native
    def mergeMap[T, R, O /* <: ObservableInput[_] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.mergeMap")
    @js.native
    def mergeMap[T, R, O /* <: ObservableInput[_] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ],
      concurrent: Double
    ): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.mergeMapTo")
    @js.native
    def mergeMapTo[T, O /* <: ObservableInput[_] */](innerObservable: O): OperatorFunction[_, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.mergeMapTo")
    @js.native
    def mergeMapTo[T, O /* <: ObservableInput[_] */](innerObservable: O, concurrent: Double): OperatorFunction[_, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.mergeMapTo")
    @js.native
    def mergeMapTo[T, R, O /* <: ObservableInput[_] */](
      innerObservable: O,
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.mergeMapTo")
    @js.native
    def mergeMapTo[T, R, O /* <: ObservableInput[_] */](
      innerObservable: O,
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ],
      concurrent: Double
    ): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.mergeScan")
    @js.native
    def mergeScan[T, R](
      accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
      seed: R
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.mergeScan")
    @js.native
    def mergeScan[T, R](
      accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
      seed: R,
      concurrent: Double
    ): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge_TR_OperatorFunction[T, R](observables: (ObservableInput[_] | SchedulerLike | Double)*): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge_TT2T3[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge_TT2T3T4[T, T2, T3, T4](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge_TT2T3T4T5[T, T2, T3, T4, T5](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge_TT2T3T4T5T6[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      scheduler: SchedulerLike
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
    @JSImport("rxjs/internal/Rx", "operators.merge")
    @js.native
    def merge_TT2_OperatorFunction[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): OperatorFunction[T, T | T2] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.min")
    @js.native
    def min[T](): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.min")
    @js.native
    def min[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.multicast")
    @js.native
    def multicast[T](
      subjectFactory: js.ThisFunction0[
          /* this */ typings.rxjs.internalObservableMod.Observable[T], 
          typings.rxjs.subjectMod.Subject[T]
        ]
    ): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[T]
      ] = js.native
    @JSImport("rxjs/internal/Rx", "operators.multicast")
    @js.native
    def multicast[T](subject: typings.rxjs.subjectMod.Subject[T]): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[T]
      ] = js.native
    @JSImport("rxjs/internal/Rx", "operators.multicast")
    @js.native
    def multicast[T, O /* <: ObservableInput[_] */](
      SubjectFactory: js.ThisFunction0[
          /* this */ typings.rxjs.internalObservableMod.Observable[T], 
          typings.rxjs.subjectMod.Subject[T]
        ],
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O]
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.multicast")
    @js.native
    def multicast[T, O /* <: ObservableInput[_] */](
      subject: typings.rxjs.subjectMod.Subject[T],
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O]
    ): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[ObservedValueOf[O]]
      ] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.observeOn")
    @js.native
    def observeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.observeOn")
    @js.native
    def observeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.onErrorResumeNext")
    @js.native
    def onErrorResumeNext[T](): OperatorFunction[T, T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.onErrorResumeNext")
    @js.native
    def onErrorResumeNext[T, R](array: js.Array[ObservableInput[_]]): OperatorFunction[T, T | R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.onErrorResumeNext")
    @js.native
    def onErrorResumeNext[T, R](observables: ObservableInput[_]*): OperatorFunction[T, T | R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.onErrorResumeNext")
    @js.native
    def onErrorResumeNext[T, T2](v: ObservableInput[T2]): OperatorFunction[T, T | T2] = js.native
    @JSImport("rxjs/internal/Rx", "operators.onErrorResumeNext")
    @js.native
    def onErrorResumeNext[T, T2, T3](v: ObservableInput[T2], v2: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = js.native
    @JSImport("rxjs/internal/Rx", "operators.onErrorResumeNext")
    @js.native
    def onErrorResumeNext[T, T2, T3, T4](v: ObservableInput[T2], v2: ObservableInput[T3], v3: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = js.native
    @JSImport("rxjs/internal/Rx", "operators.onErrorResumeNext")
    @js.native
    def onErrorResumeNext[T, T2, T3, T4, T5](v: ObservableInput[T2], v2: ObservableInput[T3], v3: ObservableInput[T4], v4: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
    @JSImport("rxjs/internal/Rx", "operators.onErrorResumeNext")
    @js.native
    def onErrorResumeNext[T, T2, T3, T4, T5, T6](
      v: ObservableInput[T2],
      v2: ObservableInput[T3],
      v3: ObservableInput[T4],
      v4: ObservableInput[T5],
      v5: ObservableInput[T6]
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
    @JSImport("rxjs/internal/Rx", "operators.onErrorResumeNext")
    @js.native
    def onErrorResumeNext[T, T2, T3, T4, T5, T6, T7](
      v: ObservableInput[T2],
      v2: ObservableInput[T3],
      v3: ObservableInput[T4],
      v4: ObservableInput[T5],
      v5: ObservableInput[T6],
      v6: ObservableInput[T7]
    ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.pairwise")
    @js.native
    def pairwise[T](): OperatorFunction[T, js.Tuple2[T, T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.partition")
    @js.native
    def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        js.Tuple2[
          typings.rxjs.internalObservableMod.Observable[T], 
          typings.rxjs.internalObservableMod.Observable[T]
        ]
      ] = js.native
    @JSImport("rxjs/internal/Rx", "operators.partition")
    @js.native
    def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        js.Tuple2[
          typings.rxjs.internalObservableMod.Observable[T], 
          typings.rxjs.internalObservableMod.Observable[T]
        ]
      ] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.pluck")
    @js.native
    def pluck[T, K1 /* <: /* keyof T */ String */](k1: K1): OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1] */ js.Any
      ] = js.native
    @JSImport("rxjs/internal/Rx", "operators.pluck")
    @js.native
    def pluck[T, R](properties: String*): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.pluck")
    @js.native
    def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */](k1: K1, k2: K2): OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2] */ js.Any
      ] = js.native
    @JSImport("rxjs/internal/Rx", "operators.pluck")
    @js.native
    def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */](k1: K1, k2: K2, k3: K3): OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3] */ js.Any
      ] = js.native
    @JSImport("rxjs/internal/Rx", "operators.pluck")
    @js.native
    def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4): OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4] */ js.Any
      ] = js.native
    @JSImport("rxjs/internal/Rx", "operators.pluck")
    @js.native
    def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */, K5 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4, k5: K5): OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5] */ js.Any
      ] = js.native
    @JSImport("rxjs/internal/Rx", "operators.pluck")
    @js.native
    def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */, K5 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4] */ js.Any */, K6 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4][K5] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4, k5: K5, k6: K6): OperatorFunction[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5][K6] */ js.Any
      ] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.publish")
    @js.native
    def publish[T](): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[T]
      ] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publish")
    @js.native
    def publish[T](selector: MonoTypeOperatorFunction[T]): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.publishBehavior")
    @js.native
    def publishBehavior[T](value: T): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[T]
      ] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.publishLast")
    @js.native
    def publishLast[T](): UnaryFunction[
        typings.rxjs.internalObservableMod.Observable[T], 
        typings.rxjs.connectableObservableMod.ConnectableObservable[T]
      ] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T](): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T](
      bufferSize: js.UndefOr[scala.Nothing],
      windowTime: js.UndefOr[scala.Nothing],
      scheduler: SchedulerLike
    ): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T](bufferSize: js.UndefOr[scala.Nothing], windowTime: Double): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T](bufferSize: js.UndefOr[scala.Nothing], windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T](bufferSize: Double): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T](bufferSize: Double, windowTime: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T, O /* <: ObservableInput[_] */](
      bufferSize: js.UndefOr[scala.Nothing],
      windowTime: js.UndefOr[scala.Nothing],
      selector: js.UndefOr[scala.Nothing],
      scheduler: SchedulerLike
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T, O /* <: ObservableInput[_] */](
      bufferSize: js.UndefOr[scala.Nothing],
      windowTime: js.UndefOr[scala.Nothing],
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O]
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T, O /* <: ObservableInput[_] */](
      bufferSize: js.UndefOr[scala.Nothing],
      windowTime: js.UndefOr[scala.Nothing],
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O],
      scheduler: SchedulerLike
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T, O /* <: ObservableInput[_] */](
      bufferSize: js.UndefOr[scala.Nothing],
      windowTime: Double,
      selector: js.UndefOr[scala.Nothing],
      scheduler: SchedulerLike
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T, O /* <: ObservableInput[_] */](
      bufferSize: js.UndefOr[scala.Nothing],
      windowTime: Double,
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O]
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T, O /* <: ObservableInput[_] */](
      bufferSize: js.UndefOr[scala.Nothing],
      windowTime: Double,
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O],
      scheduler: SchedulerLike
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T, O /* <: ObservableInput[_] */](
      bufferSize: Double,
      windowTime: js.UndefOr[scala.Nothing],
      selector: js.UndefOr[scala.Nothing],
      scheduler: SchedulerLike
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T, O /* <: ObservableInput[_] */](
      bufferSize: Double,
      windowTime: js.UndefOr[scala.Nothing],
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O]
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T, O /* <: ObservableInput[_] */](
      bufferSize: Double,
      windowTime: js.UndefOr[scala.Nothing],
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O],
      scheduler: SchedulerLike
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T, O /* <: ObservableInput[_] */](
      bufferSize: Double,
      windowTime: Double,
      selector: js.UndefOr[scala.Nothing],
      scheduler: SchedulerLike
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T, O /* <: ObservableInput[_] */](
      bufferSize: Double,
      windowTime: Double,
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O]
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay[T, O /* <: ObservableInput[_] */](
      bufferSize: Double,
      windowTime: Double,
      selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O],
      scheduler: SchedulerLike
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](bufferSize: js.UndefOr[scala.Nothing], windowTime: Double): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](bufferSize: Double): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.publishReplay")
    @js.native
    def publishReplay_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](bufferSize: Double, windowTime: Double): OperatorFunction[T, ObservedValueOf[O]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.publish")
    @js.native
    def publish_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](selector: js.Function1[/* shared */ typings.rxjs.internalObservableMod.Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.race")
    @js.native
    def race[T](
      observables: (typings.rxjs.internalObservableMod.Observable[T] | js.Array[typings.rxjs.internalObservableMod.Observable[T]])*
    ): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.race")
    @js.native
    def race[T](observables: js.Array[typings.rxjs.internalObservableMod.Observable[T]]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.race")
    @js.native
    def race_TR_OperatorFunction[T, R](
      observables: (typings.rxjs.internalObservableMod.Observable[_] | js.Array[typings.rxjs.internalObservableMod.Observable[_]])*
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.race")
    @js.native
    def race_TR_OperatorFunction[T, R](observables: js.Array[typings.rxjs.internalObservableMod.Observable[T]]): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.reduce")
    @js.native
    def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.reduce")
    @js.native
    def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.reduce")
    @js.native
    def reduce_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.reduce")
    @js.native
    def reduce_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.refCount")
    @js.native
    def refCount[T](): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.repeat")
    @js.native
    def repeat[T](): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.repeat")
    @js.native
    def repeat[T](count: Double): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.repeatWhen")
    @js.native
    def repeatWhen[T](
      notifier: js.Function1[
          /* notifications */ typings.rxjs.internalObservableMod.Observable[_], 
          typings.rxjs.internalObservableMod.Observable[_]
        ]
    ): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.retry")
    @js.native
    def retry[T](): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.retry")
    @js.native
    def retry[T](count: Double): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.retryWhen")
    @js.native
    def retryWhen[T](
      notifier: js.Function1[
          /* errors */ typings.rxjs.internalObservableMod.Observable[_], 
          typings.rxjs.internalObservableMod.Observable[_]
        ]
    ): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.sample")
    @js.native
    def sample[T](notifier: typings.rxjs.internalObservableMod.Observable[_]): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.sampleTime")
    @js.native
    def sampleTime[T](period: Double): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.sampleTime")
    @js.native
    def sampleTime[T](period: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.scan")
    @js.native
    def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.scan")
    @js.native
    def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.scan")
    @js.native
    def scan_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.scan")
    @js.native
    def scan_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.sequenceEqual")
    @js.native
    def sequenceEqual[T](compareTo: typings.rxjs.internalObservableMod.Observable[T]): OperatorFunction[T, Boolean] = js.native
    @JSImport("rxjs/internal/Rx", "operators.sequenceEqual")
    @js.native
    def sequenceEqual[T](
      compareTo: typings.rxjs.internalObservableMod.Observable[T],
      comparator: js.Function2[/* a */ T, /* b */ T, Boolean]
    ): OperatorFunction[T, Boolean] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.share")
    @js.native
    def share[T](): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.shareReplay")
    @js.native
    def shareReplay[T](): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.shareReplay")
    @js.native
    def shareReplay[T](
      bufferSize: js.UndefOr[scala.Nothing],
      windowTime: js.UndefOr[scala.Nothing],
      scheduler: SchedulerLike
    ): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.shareReplay")
    @js.native
    def shareReplay[T](bufferSize: js.UndefOr[scala.Nothing], windowTime: Double): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.shareReplay")
    @js.native
    def shareReplay[T](bufferSize: js.UndefOr[scala.Nothing], windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.shareReplay")
    @js.native
    def shareReplay[T](bufferSize: Double): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.shareReplay")
    @js.native
    def shareReplay[T](bufferSize: Double, windowTime: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.shareReplay")
    @js.native
    def shareReplay[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.shareReplay")
    @js.native
    def shareReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.shareReplay")
    @js.native
    def shareReplay[T](config: ShareReplayConfig): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.single")
    @js.native
    def single[T](): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.single")
    @js.native
    def single[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* source */ typings.rxjs.internalObservableMod.Observable[T], 
          Boolean
        ]
    ): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.skip")
    @js.native
    def skip[T](count: Double): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.skipLast")
    @js.native
    def skipLast[T](count: Double): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.skipUntil")
    @js.native
    def skipUntil[T](notifier: typings.rxjs.internalObservableMod.Observable[_]): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.skipWhile")
    @js.native
    def skipWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.startWith")
    @js.native
    def startWith[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.startWith")
    @js.native
    def startWith[T, D](array: (D | SchedulerLike)*): OperatorFunction[T, T | D] = js.native
    @JSImport("rxjs/internal/Rx", "operators.startWith")
    @js.native
    def startWith[T, D](v1: D): OperatorFunction[T, T | D] = js.native
    @JSImport("rxjs/internal/Rx", "operators.startWith")
    @js.native
    def startWith[T, D](v1: D, scheduler: SchedulerLike): OperatorFunction[T, T | D] = js.native
    @JSImport("rxjs/internal/Rx", "operators.startWith")
    @js.native
    def startWith[T, D, E](v1: D, v2: E): OperatorFunction[T, T | D | E] = js.native
    @JSImport("rxjs/internal/Rx", "operators.startWith")
    @js.native
    def startWith[T, D, E](v1: D, v2: E, scheduler: SchedulerLike): OperatorFunction[T, T | D | E] = js.native
    @JSImport("rxjs/internal/Rx", "operators.startWith")
    @js.native
    def startWith[T, D, E, F](v1: D, v2: E, v3: F): OperatorFunction[T, T | D | E | F] = js.native
    @JSImport("rxjs/internal/Rx", "operators.startWith")
    @js.native
    def startWith[T, D, E, F](v1: D, v2: E, v3: F, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F] = js.native
    @JSImport("rxjs/internal/Rx", "operators.startWith")
    @js.native
    def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G): OperatorFunction[T, T | D | E | F | G] = js.native
    @JSImport("rxjs/internal/Rx", "operators.startWith")
    @js.native
    def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G] = js.native
    @JSImport("rxjs/internal/Rx", "operators.startWith")
    @js.native
    def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H): OperatorFunction[T, T | D | E | F | G | H] = js.native
    @JSImport("rxjs/internal/Rx", "operators.startWith")
    @js.native
    def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G | H] = js.native
    @JSImport("rxjs/internal/Rx", "operators.startWith")
    @js.native
    def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I): OperatorFunction[T, T | D | E | F | G | H | I] = js.native
    @JSImport("rxjs/internal/Rx", "operators.startWith")
    @js.native
    def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G | H | I] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.subscribeOn")
    @js.native
    def subscribeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.subscribeOn")
    @js.native
    def subscribeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.switchAll")
    @js.native
    def switchAll[T](): OperatorFunction[ObservableInput[T], T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.switchAll")
    @js.native
    def switchAll_R[R](): OperatorFunction[_, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.switchMap")
    @js.native
    def switchMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.switchMap")
    @js.native
    def switchMap[T, O /* <: ObservableInput[_] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.UndefOr[scala.Nothing]
    ): OperatorFunction[T, ObservedValueOf[O]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.switchMap")
    @js.native
    def switchMap[T, R, O /* <: ObservableInput[_] */](
      project: js.Function2[/* value */ T, /* index */ Double, O],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ ObservedValueOf[O], 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.switchMapTo")
    @js.native
    def switchMapTo[R](observable: ObservableInput[R]): OperatorFunction[_, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.switchMapTo")
    @js.native
    def switchMapTo[T, R](observable: ObservableInput[R], resultSelector: js.UndefOr[scala.Nothing]): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.switchMapTo")
    @js.native
    def switchMapTo[T, I, R](
      observable: ObservableInput[I],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ I, 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.take")
    @js.native
    def take[T](count: Double): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.takeLast")
    @js.native
    def takeLast[T](count: Double): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.takeUntil")
    @js.native
    def takeUntil[T](notifier: typings.rxjs.internalObservableMod.Observable[_]): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.takeWhile")
    @js.native
    def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.takeWhile")
    @js.native
    def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], inclusive: Boolean): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.takeWhile")
    @js.native
    def takeWhile_TS_T_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): OperatorFunction[T, S] = js.native
    @JSImport("rxjs/internal/Rx", "operators.takeWhile")
    @js.native
    def takeWhile_false[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], inclusive: `false`): OperatorFunction[T, S] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.tap")
    @js.native
    def tap[T](): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.tap")
    @js.native
    def tap[T](next: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.tap")
    @js.native
    def tap[T](next: js.UndefOr[scala.Nothing], error: js.Function1[/* e */ /* error */ js.Any, Unit]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.tap")
    @js.native
    def tap[T](
      next: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ /* error */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.tap")
    @js.native
    def tap[T](next: js.UndefOr[scala.Nothing], error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.tap")
    @js.native
    def tap[T](next: js.Function1[/* x */ T, Unit]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.tap")
    @js.native
    def tap[T](
      next: js.Function1[/* x */ /* value */ T, Unit],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.tap")
    @js.native
    def tap[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ js.Any, Unit]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.tap")
    @js.native
    def tap[T](
      next: js.Function1[/* x */ T, Unit],
      error: js.Function1[/* e */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.tap")
    @js.native
    def tap[T](next: js.Function1[/* value */ T, Unit], error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.tap")
    @js.native
    def tap[T](next: Null, error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.tap")
    @js.native
    def tap[T](next: Null, error: js.Function1[/* error */ js.Any, Unit]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.tap")
    @js.native
    def tap[T](next: Null, error: js.Function1[/* error */ js.Any, Unit], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.tap")
    @js.native
    def tap[T](next: Null, error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.tap")
    @js.native
    def tap[T](observer: PartialObserver[T]): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.throttle")
    @js.native
    def throttle[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]]): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.throttle")
    @js.native
    def throttle[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]], config: ThrottleConfig): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.throttleTime")
    @js.native
    def throttleTime[T](duration: Double): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.throttleTime")
    @js.native
    def throttleTime[T](duration: Double, scheduler: js.UndefOr[scala.Nothing], config: ThrottleConfig): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.throttleTime")
    @js.native
    def throttleTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.throttleTime")
    @js.native
    def throttleTime[T](duration: Double, scheduler: SchedulerLike, config: ThrottleConfig): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.timeInterval")
    @js.native
    def timeInterval[T](): OperatorFunction[T, TimeInterval_[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.timeInterval")
    @js.native
    def timeInterval[T](scheduler: SchedulerLike): OperatorFunction[T, TimeInterval_[T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.timeout")
    @js.native
    def timeout[T](due: Double): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.timeout")
    @js.native
    def timeout[T](due: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.timeout")
    @js.native
    def timeout[T](due: Date): MonoTypeOperatorFunction[T] = js.native
    @JSImport("rxjs/internal/Rx", "operators.timeout")
    @js.native
    def timeout[T](due: Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.timeoutWith")
    @js.native
    def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.timeoutWith")
    @js.native
    def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.timeoutWith")
    @js.native
    def timeoutWith[T, R](due: Date, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.timeoutWith")
    @js.native
    def timeoutWith[T, R](due: Date, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.timestamp")
    @js.native
    def timestamp[T](): OperatorFunction[T, Timestamp_[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.timestamp")
    @js.native
    def timestamp[T](scheduler: SchedulerLike): OperatorFunction[T, Timestamp_[T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.toArray")
    @js.native
    def toArray[T](): OperatorFunction[T, js.Array[T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.window")
    @js.native
    def window[T](windowBoundaries: typings.rxjs.internalObservableMod.Observable[_]): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.windowCount")
    @js.native
    def windowCount[T](windowSize: Double): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.windowCount")
    @js.native
    def windowCount[T](windowSize: Double, startWindowEvery: Double): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.windowTime")
    @js.native
    def windowTime[T](windowTimeSpan: Double): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.windowTime")
    @js.native
    def windowTime[T](windowTimeSpan: Double, scheduler: SchedulerLike): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.windowTime")
    @js.native
    def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.windowTime")
    @js.native
    def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.windowTime")
    @js.native
    def windowTime[T](
      windowTimeSpan: Double,
      windowCreationInterval: Double,
      maxWindowSize: Double,
      scheduler: SchedulerLike
    ): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.windowTime")
    @js.native
    def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, scheduler: SchedulerLike): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.windowToggle")
    @js.native
    def windowToggle[T, O](
      openings: typings.rxjs.internalObservableMod.Observable[O],
      closingSelector: js.Function1[/* openValue */ O, typings.rxjs.internalObservableMod.Observable[_]]
    ): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.windowWhen")
    @js.native
    def windowWhen[T](closingSelector: js.Function0[typings.rxjs.internalObservableMod.Observable[_]]): OperatorFunction[T, typings.rxjs.internalObservableMod.Observable[T]] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.withLatestFrom")
    @js.native
    def withLatestFrom[T, R](array: js.Array[ObservableInput[_]]): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.withLatestFrom")
    @js.native
    def withLatestFrom[T, R](array: js.Array[ObservableInput[_]], project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.withLatestFrom")
    @js.native
    def withLatestFrom[T, R](observables: (ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]))*): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.withLatestFrom")
    @js.native
    def withLatestFrom[T, R](project: js.Function1[/* v1 */ T, R]): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.withLatestFrom")
    @js.native
    def withLatestFrom[T, O2 /* <: ObservableInput[_] */](source2: O2): OperatorFunction[T, js.Tuple2[T, ObservedValueOf[O2]]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.withLatestFrom")
    @js.native
    def withLatestFrom[T, O2 /* <: ObservableInput[_] */, R](source2: O2, project: js.Function2[/* v1 */ T, /* v2 */ ObservedValueOf[O2], R]): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.withLatestFrom")
    @js.native
    def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v2: O2, v3: O3): OperatorFunction[T, js.Tuple3[T, ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.withLatestFrom")
    @js.native
    def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
      v2: O2,
      v3: O3,
      project: js.Function3[/* v1 */ T, /* v2 */ ObservedValueOf[O2], /* v3 */ ObservedValueOf[O3], R]
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.withLatestFrom")
    @js.native
    def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v2: O2, v3: O3, v4: O4): OperatorFunction[T, js.Tuple4[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.withLatestFrom")
    @js.native
    def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
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
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.withLatestFrom")
    @js.native
    def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v2: O2, v3: O3, v4: O4, v5: O5): OperatorFunction[
        T, 
        js.Tuple5[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4], ObservedValueOf[O5]]
      ] = js.native
    @JSImport("rxjs/internal/Rx", "operators.withLatestFrom")
    @js.native
    def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
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
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.withLatestFrom")
    @js.native
    def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): OperatorFunction[
        T, 
        js.Tuple6[
          T, 
          ObservedValueOf[O2], 
          ObservedValueOf[O3], 
          ObservedValueOf[O4], 
          ObservedValueOf[O5], 
          ObservedValueOf[O6]
        ]
      ] = js.native
    @JSImport("rxjs/internal/Rx", "operators.withLatestFrom")
    @js.native
    def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
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
    ): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.zip")
    @js.native
    def zip[T, R](array: js.Array[ObservableInput[T]]): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.zip")
    @js.native
    def zip[T, R](observables: (ObservableInput[T] | (js.Function1[/* repeated */ T, R]))*): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.zip")
    @js.native
    def zip[T, R](project: js.Function1[/* v1 */ T, R]): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.zip")
    @js.native
    def zip[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, js.Tuple2[T, T2]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.zip")
    @js.native
    def zip[T, TOther, R](
      array: js.Array[ObservableInput[TOther]],
      project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.zip")
    @js.native
    def zip[T, T2, R](v2: ObservableInput[T2], project: js.Function2[/* v1 */ T, /* v2 */ T2, R]): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.zip")
    @js.native
    def zip[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, js.Tuple3[T, T2, T3]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.zip")
    @js.native
    def zip[T, T2, T3, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.zip")
    @js.native
    def zip[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, js.Tuple4[T, T2, T3, T4]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.zip")
    @js.native
    def zip[T, T2, T3, T4, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.zip")
    @js.native
    def zip[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, js.Tuple5[T, T2, T3, T4, T5]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.zip")
    @js.native
    def zip[T, T2, T3, T4, T5, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): OperatorFunction[T, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.zip")
    @js.native
    def zip[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6]
    ): OperatorFunction[T, js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.zip")
    @js.native
    def zip[T, T2, T3, T4, T5, T6, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): OperatorFunction[T, R] = js.native
    
    @JSImport("rxjs/internal/Rx", "operators.zipAll")
    @js.native
    def zipAll[T](): OperatorFunction[_, js.Array[T]] = js.native
    @JSImport("rxjs/internal/Rx", "operators.zipAll")
    @js.native
    def zipAll[R](project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[_, R] = js.native
    @JSImport("rxjs/internal/Rx", "operators.zipAll")
    @js.native
    def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = js.native
  }
  
  @JSImport("rxjs/internal/Rx", "pipe")
  @js.native
  def pipe[T](): UnaryFunction[T, T] = js.native
  @JSImport("rxjs/internal/Rx", "pipe")
  @js.native
  def pipe[T, A](fn1: UnaryFunction[T, A]): UnaryFunction[T, A] = js.native
  @JSImport("rxjs/internal/Rx", "pipe")
  @js.native
  def pipe[T, A, B](fn1: UnaryFunction[T, A], fn2: UnaryFunction[A, B]): UnaryFunction[T, B] = js.native
  @JSImport("rxjs/internal/Rx", "pipe")
  @js.native
  def pipe[T, A, B, C](fn1: UnaryFunction[T, A], fn2: UnaryFunction[A, B], fn3: UnaryFunction[B, C]): UnaryFunction[T, C] = js.native
  @JSImport("rxjs/internal/Rx", "pipe")
  @js.native
  def pipe[T, A, B, C, D](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D]
  ): UnaryFunction[T, D] = js.native
  @JSImport("rxjs/internal/Rx", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E]
  ): UnaryFunction[T, E] = js.native
  @JSImport("rxjs/internal/Rx", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E, F](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F]
  ): UnaryFunction[T, F] = js.native
  @JSImport("rxjs/internal/Rx", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E, F, G](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G]
  ): UnaryFunction[T, G] = js.native
  @JSImport("rxjs/internal/Rx", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E, F, G, H](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G],
    fn8: UnaryFunction[G, H]
  ): UnaryFunction[T, H] = js.native
  @JSImport("rxjs/internal/Rx", "pipe")
  @js.native
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
  ): UnaryFunction[T, I] = js.native
  @JSImport("rxjs/internal/Rx", "pipe")
  @js.native
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
    fns: (UnaryFunction[_, _])*
  ): UnaryFunction[T, js.Object] = js.native
}
