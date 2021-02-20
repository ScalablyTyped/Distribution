package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.rxjs.actionMod.Action
import typings.rxjs.animationFrameSchedulerMod.AnimationFrameScheduler
import typings.rxjs.anon.FnCall
import typings.rxjs.argumentOutOfRangeErrorMod.ArgumentOutOfRangeErrorCtor
import typings.rxjs.asapSchedulerMod.AsapScheduler
import typings.rxjs.asyncActionMod.AsyncAction
import typings.rxjs.asyncSchedulerMod.AsyncScheduler
import typings.rxjs.emptyErrorMod.EmptyErrorCtor
import typings.rxjs.fromEventMod.EventListenerOptions
import typings.rxjs.fromEventMod.FromEventTarget
import typings.rxjs.fromEventMod.NodeEventHandler
import typings.rxjs.generateMod.ConditionFunc
import typings.rxjs.generateMod.GenerateBaseOptions
import typings.rxjs.generateMod.GenerateOptions
import typings.rxjs.generateMod.IterateFunc
import typings.rxjs.generateMod.ResultFunc
import typings.rxjs.groupByMod.RefCountSubscription
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.objectUnsubscribedErrorMod.ObjectUnsubscribedErrorCtor
import typings.rxjs.queueSchedulerMod.QueueScheduler
import typings.rxjs.rxjsNumbers.`-1`
import typings.rxjs.rxjsNumbers.`0`
import typings.rxjs.rxjsNumbers.`1`
import typings.rxjs.rxjsStrings.C
import typings.rxjs.rxjsStrings.E
import typings.rxjs.rxjsStrings.N
import typings.rxjs.rxjsStrings.forkJoin
import typings.rxjs.timeoutErrorMod.TimeoutErrorCtor
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.ObservedValueOf
import typings.rxjs.typesMod.ObservedValuesFromArray
import typings.rxjs.typesMod.PartialObserver
import typings.rxjs.typesMod.SchedulerAction
import typings.rxjs.typesMod.SchedulerLike
import typings.rxjs.typesMod.SubscribableOrPromise
import typings.rxjs.typesMod.TeardownLogic
import typings.rxjs.typesMod.UnaryFunction
import typings.rxjs.typesMod.Unsubscribable
import typings.rxjs.unsubscriptionErrorMod.UnsubscriptionErrorCtor
import typings.std.Date
import typings.std.Error
import typings.std.PromiseConstructorLike
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rxjs", "ArgumentOutOfRangeError")
  @js.native
  val ArgumentOutOfRangeError: ArgumentOutOfRangeErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs", "ArgumentOutOfRangeError")
  @js.native
  class ArgumentOutOfRangeErrorCls () extends Error
  
  @JSImport("rxjs", "AsyncSubject")
  @js.native
  class AsyncSubject[T] ()
    extends typings.rxjs.asyncSubjectMod.AsyncSubject[T]
  
  @JSImport("rxjs", "BehaviorSubject")
  @js.native
  class BehaviorSubject[T] protected ()
    extends typings.rxjs.behaviorSubjectMod.BehaviorSubject[T] {
    def this(_value: T) = this()
  }
  
  @JSImport("rxjs", "ConnectableObservable")
  @js.native
  class ConnectableObservable[T] protected ()
    extends typings.rxjs.connectableObservableMod.ConnectableObservable[T] {
    def this(source: Observable[T], subjectFactory: js.Function0[typings.rxjs.subjectMod.Subject[T]]) = this()
  }
  
  @JSImport("rxjs", "EMPTY")
  @js.native
  val EMPTY_ : Observable[scala.Nothing] = js.native
  
  @JSImport("rxjs", "EmptyError")
  @js.native
  val EmptyError: EmptyErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs", "EmptyError")
  @js.native
  class EmptyErrorCls () extends Error
  
  @JSImport("rxjs", "GroupedObservable")
  @js.native
  class GroupedObservable[K, T] protected ()
    extends typings.rxjs.groupByMod.GroupedObservable[K, T] {
    /** @deprecated Do not construct this type. Internal use only */
    def this(key: K, groupSubject: typings.rxjs.subjectMod.Subject[T]) = this()
    def this(
      key: K,
      groupSubject: typings.rxjs.subjectMod.Subject[T],
      refCountSubscription: RefCountSubscription
    ) = this()
  }
  
  @JSImport("rxjs", "NEVER")
  @js.native
  val NEVER_ : Observable[scala.Nothing] = js.native
  
  @JSImport("rxjs", "Notification")
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
    
    @JSImport("rxjs", "Notification")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs", "Notification.completeNotification")
    @js.native
    def completeNotification: js.Any = js.native
    @scala.inline
    def completeNotification_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completeNotification")(x.asInstanceOf[js.Any])
    
    /**
      * A shortcut to create a Notification instance of the type `complete`.
      * @return {Notification<any>} The valueless "complete" Notification.
      * @nocollapse
      */
    @JSImport("rxjs", "Notification.createComplete")
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
    @JSImport("rxjs", "Notification.createError")
    @js.native
    def createError[T](): typings.rxjs.notificationMod.Notification[T] = js.native
    @JSImport("rxjs", "Notification.createError")
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
    @JSImport("rxjs", "Notification.createNext")
    @js.native
    def createNext[T](value: T): typings.rxjs.notificationMod.Notification[T] = js.native
    
    @JSImport("rxjs", "Notification.undefinedValueNotification")
    @js.native
    def undefinedValueNotification: js.Any = js.native
    @scala.inline
    def undefinedValueNotification_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedValueNotification")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs", "NotificationKind")
  @js.native
  object NotificationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.rxjs.notificationMod.NotificationKind with String] = js.native
    
    /* "C" */ val COMPLETE: typings.rxjs.notificationMod.NotificationKind.COMPLETE with String = js.native
    
    /* "E" */ val ERROR: typings.rxjs.notificationMod.NotificationKind.ERROR with String = js.native
    
    /* "N" */ val NEXT: typings.rxjs.notificationMod.NotificationKind.NEXT with String = js.native
  }
  
  @JSImport("rxjs", "ObjectUnsubscribedError")
  @js.native
  val ObjectUnsubscribedError: ObjectUnsubscribedErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs", "ObjectUnsubscribedError")
  @js.native
  class ObjectUnsubscribedErrorCls () extends Error
  
  @JSImport("rxjs", "Observable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  class Observable_[T] () extends Observable[T] {
    def this(subscribe: js.ThisFunction1[
            /* this */ Observable[T], 
            /* subscriber */ typings.rxjs.subscriberMod.Subscriber[T], 
            TeardownLogic
          ]) = this()
  }
  /* static members */
  object Observable_ {
    
    @JSImport("rxjs", "Observable")
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
    @JSImport("rxjs", "Observable.create")
    @js.native
    def create: js.Function = js.native
    @scala.inline
    def create_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
    
    /**
      * @nocollapse
      * @deprecated In favor of iif creation function: import { iif } from 'rxjs';
      */
    @JSImport("rxjs", "Observable.if")
    @js.native
    val `if`: FnCall = js.native
    /**
      * @nocollapse
      * @deprecated In favor of iif creation function: import { iif } from 'rxjs';
      */
    @JSImport("rxjs", "Observable.if")
    @js.native
    def `if`[T, F](condition: js.Function0[Boolean]): Observable[T | F] = js.native
    @JSImport("rxjs", "Observable.if")
    @js.native
    def `if`[T, F](
      condition: js.Function0[Boolean],
      trueResult: js.UndefOr[SubscribableOrPromise[T]],
      falseResult: SubscribableOrPromise[F]
    ): Observable[T | F] = js.native
    @JSImport("rxjs", "Observable.if")
    @js.native
    def `if`[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): Observable[T | F] = js.native
    
    /**
      * @nocollapse
      * @deprecated In favor of throwError creation function: import { throwError } from 'rxjs';
      */
    @JSImport("rxjs", "Observable.throw")
    @js.native
    val `throw`: js.Function2[
        /* error */ js.Any, 
        /* scheduler */ js.UndefOr[SchedulerLike], 
        Observable[scala.Nothing]
      ] = js.native
    /**
      * @nocollapse
      * @deprecated In favor of throwError creation function: import { throwError } from 'rxjs';
      */
    @JSImport("rxjs", "Observable.throw")
    @js.native
    def `throw`(error: js.Any): Observable[scala.Nothing] = js.native
    @JSImport("rxjs", "Observable.throw")
    @js.native
    def `throw`(error: js.Any, scheduler: SchedulerLike): Observable[scala.Nothing] = js.native
  }
  
  @JSImport("rxjs", "ReplaySubject")
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
  
  @JSImport("rxjs", "Scheduler")
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
    
    /**
      * Note: the extra arrow function wrapper is to make testing by overriding
      * Date.now easier.
      * @nocollapse
      */
    @JSImport("rxjs", "Scheduler.now")
    @js.native
    def now(): Double = js.native
  }
  
  @JSImport("rxjs", "Subject")
  @js.native
  class Subject[T] ()
    extends typings.rxjs.subjectMod.Subject[T]
  /* static members */
  object Subject {
    
    @JSImport("rxjs", "Subject")
    @js.native
    val ^ : js.Any = js.native
    
    /**@nocollapse
      * @deprecated use new Subject() instead
      */
    @JSImport("rxjs", "Subject.create")
    @js.native
    def create: js.Function = js.native
    @scala.inline
    def create_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs", "Subscriber")
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
    @JSImport("rxjs", "Subscriber.create")
    @js.native
    def create[T](): typings.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs", "Subscriber.create")
    @js.native
    def create[T](next: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): typings.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs", "Subscriber.create")
    @js.native
    def create[T](next: js.UndefOr[scala.Nothing], error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): typings.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs", "Subscriber.create")
    @js.native
    def create[T](
      next: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ): typings.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs", "Subscriber.create")
    @js.native
    def create[T](next: js.Function1[/* x */ js.UndefOr[T], Unit]): typings.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs", "Subscriber.create")
    @js.native
    def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ): typings.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs", "Subscriber.create")
    @js.native
    def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ): typings.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs", "Subscriber.create")
    @js.native
    def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ): typings.rxjs.subscriberMod.Subscriber[T] = js.native
  }
  
  @JSImport("rxjs", "Subscription")
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
    
    @JSImport("rxjs", "Subscription")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("rxjs", "Subscription.EMPTY")
    @js.native
    def EMPTY: typings.rxjs.subscriptionMod.Subscription = js.native
    @scala.inline
    def EMPTY_=(x: typings.rxjs.subscriptionMod.Subscription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs", "TimeoutError")
  @js.native
  val TimeoutError: TimeoutErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs", "TimeoutError")
  @js.native
  class TimeoutErrorCls () extends Error
  
  @JSImport("rxjs", "UnsubscriptionError")
  @js.native
  val UnsubscriptionError: UnsubscriptionErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs", "UnsubscriptionError")
  @js.native
  class UnsubscriptionErrorCls protected ()
    extends typings.rxjs.unsubscriptionErrorMod.UnsubscriptionError {
    def this(errors: js.Array[_]) = this()
  }
  
  @JSImport("rxjs", "VirtualAction")
  @js.native
  class VirtualAction[T] protected ()
    extends typings.rxjs.virtualTimeSchedulerMod.VirtualAction[T] {
    def this(
      scheduler: typings.rxjs.virtualTimeSchedulerMod.VirtualTimeScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    def this(
      scheduler: typings.rxjs.virtualTimeSchedulerMod.VirtualTimeScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
      index: Double
    ) = this()
  }
  /* static members */
  object VirtualAction {
    
    @JSImport("rxjs", "VirtualAction.sortActions")
    @js.native
    def sortActions[T](
      a: typings.rxjs.virtualTimeSchedulerMod.VirtualAction[T],
      b: typings.rxjs.virtualTimeSchedulerMod.VirtualAction[T]
    ): `1` | `0` | `-1` = js.native
  }
  
  @JSImport("rxjs", "VirtualTimeScheduler")
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
    
    @JSImport("rxjs", "VirtualTimeScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs", "VirtualTimeScheduler.frameTimeFactor")
    @js.native
    def frameTimeFactor: Double = js.native
    @scala.inline
    def frameTimeFactor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameTimeFactor")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs", "animationFrame")
  @js.native
  val animationFrame: AnimationFrameScheduler = js.native
  
  @JSImport("rxjs", "animationFrameScheduler")
  @js.native
  val animationFrameScheduler: AnimationFrameScheduler = js.native
  
  @JSImport("rxjs", "asap")
  @js.native
  val asap: AsapScheduler = js.native
  
  @JSImport("rxjs", "asapScheduler")
  @js.native
  val asapScheduler: AsapScheduler = js.native
  
  @JSImport("rxjs", "async")
  @js.native
  val async: AsyncScheduler = js.native
  
  @JSImport("rxjs", "asyncScheduler")
  @js.native
  val asyncScheduler: AsyncScheduler = js.native
  
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback(callbackFunc: js.Function): js.Function1[/* repeated */ js.Any, Observable[_]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback(callbackFunc: js.Function1[/* callback */ js.Function0[_], _]): js.Function0[Observable[Unit]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback(callbackFunc: js.Function1[/* callback */ js.Function0[_], _], scheduler: SchedulerLike): js.Function0[Observable[Unit]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback(callbackFunc: js.Function, resultSelector: js.Function): js.Function1[/* repeated */ js.Any, Observable[_]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback(callbackFunc: js.Function, resultSelector: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, Observable[_]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback(callbackFunc: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, Observable[_]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback[A1](callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function0[_], _]): js.Function1[/* arg1 */ A1, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback[A1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function0[_], _],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback[A1, A2](callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function0[_], _]): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function0[_], _],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback[A1, A2, A3](
    callbackFunc: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* callback */ js.Function0[_], _]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback[A1, A2, A3](
    callbackFunc: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* callback */ js.Function0[_], _],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function0[_], 
      _
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function0[_], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function0[_], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function0[_], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ]
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4A5R1R2R3R4[A1, A2, A3, A4, A5, R1, R2, R3, R4](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Array[_]]
  ] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4A5R1R2R3R4[A1, A2, A3, A4, A5, R1, R2, R3, R4](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Array[_]]
  ] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4R1R2R3R4[A1, A2, A3, A4, R1, R2, R3, R4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3A4R1R2R3R4[A1, A2, A3, A4, R1, R2, R3, R4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3R1R2R3R4[A1, A2, A3, R1, R2, R3, R4](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2A3R1R2R3R4[A1, A2, A3, R1, R2, R3, R4](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* res1 */ R1, _], _]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* res1 */ R1, _], _],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1R1[A1, R1](callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* res1 */ R1, _], _]): js.Function1[/* arg1 */ A1, Observable[R1]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* res1 */ R1, _], _],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[R1]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _]
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function1[/* arg1 */ A1, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_AR_Function1[A, R](callbackFunc: js.Function1[A | (js.Function1[/* repeated */ R, _]), _]): js.Function1[/* repeated */ A, Observable[js.Array[R]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_AR_Function1[A, R](callbackFunc: js.Function1[A | (js.Function1[/* repeated */ R, _]), _], scheduler: SchedulerLike): js.Function1[/* repeated */ A, Observable[js.Array[R]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_R1[R1](callbackFunc: js.Function1[/* callback */ js.Function1[/* res1 */ R1, _], _]): js.Function0[Observable[R1]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_R1[R1](
    callbackFunc: js.Function1[/* callback */ js.Function1[/* res1 */ R1, _], _],
    scheduler: SchedulerLike
  ): js.Function0[Observable[R1]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_R1R2[R1, R2](callbackFunc: js.Function1[/* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _]): js.Function0[Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[/* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _],
    scheduler: SchedulerLike
  ): js.Function0[Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[/* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], _]
  ): js.Function0[Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[/* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], _],
    scheduler: SchedulerLike
  ): js.Function0[Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_R1R2R3R4[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function0[Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindCallback")
  @js.native
  def bindCallback_R1R2R3R4[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function0[Observable[js.Array[_]]] = js.native
  
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback(callbackFunc: js.Function): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback(callbackFunc: js.Function1[/* callback */ js.Function1[/* err */ js.Any, _], _]): js.Function0[Observable[Unit]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback(
    callbackFunc: js.Function1[/* callback */ js.Function1[/* err */ js.Any, _], _],
    scheduler: SchedulerLike
  ): js.Function0[Observable[Unit]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback(callbackFunc: js.Function, resultSelector: js.Function): js.Function1[/* repeated */ js.Any, Observable[_]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback(callbackFunc: js.Function, resultSelector: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, Observable[_]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback(callbackFunc: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback[A1](callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* err */ js.Any, _], _]): js.Function1[/* arg1 */ A1, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback[A1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* err */ js.Any, _], _],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* err */ js.Any, _], _]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* err */ js.Any, _], _],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback[A1, A2, A3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback[A1, A2, A3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ]
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4A5R1R2R3R4_Function1[A1, A2, A3, A4, A5, R1, R2, R3, R4](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4A5R1R2R3R4_Function1[A1, A2, A3, A4, A5, R1, R2, R3, R4](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4R1R2R3R4_Function1[A1, A2, A3, A4, R1, R2, R3, R4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3A4R1R2R3R4_Function1[A1, A2, A3, A4, R1, R2, R3, R4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3R1R2R3R4_Function1[A1, A2, A3, R1, R2, R3, R4](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2A3R1R2R3R4_Function1[A1, A2, A3, R1, R2, R3, R4](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2R1R2R3R4_Function1[A1, A2, R1, R2, R3, R4](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1A2R1R2R3R4_Function1[A1, A2, R1, R2, R3, R4](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], _]
  ): js.Function1[/* arg1 */ A1, Observable[R1]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], _],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[R1]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_R1[R1](callbackFunc: js.Function1[/* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], _]): js.Function0[Observable[R1]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_R1[R1](
    callbackFunc: js.Function1[/* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], _],
    scheduler: SchedulerLike
  ): js.Function0[Observable[R1]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[/* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], _]
  ): js.Function0[Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[/* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], _],
    scheduler: SchedulerLike
  ): js.Function0[Observable[js.Tuple2[R1, R2]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function0[Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function0[Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_R1R2R3R4_Function1[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  @JSImport("rxjs", "bindNodeCallback")
  @js.native
  def bindNodeCallback_R1R2R3R4_Function1[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O /* <: ObservableInput[_] */](observables: (O | SchedulerLike)*): Observable[js.Array[_]] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O /* <: ObservableInput[_] */](sources: js.Array[O]): Observable[js.Array[ObservedValueOf[O]]] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O /* <: ObservableInput[_] */](sources: js.Array[O], scheduler: SchedulerLike): Observable[js.Array[ObservedValueOf[O]]] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */](v1: O1): Observable[js.Array[ObservedValueOf[O1]]] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */](v1: O1, scheduler: SchedulerLike): Observable[js.Array[ObservedValueOf[O1]]] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O /* <: ObservableInput[_] */, R](sources: js.Array[O], resultSelector: js.Function1[/* repeated */ ObservedValueOf[O], R]): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O /* <: ObservableInput[_] */, R](
    sources: js.Array[O],
    resultSelector: js.Function1[/* repeated */ ObservedValueOf[O], R],
    scheduler: SchedulerLike
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](sources: js.Tuple2[O1, O2]): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](sources: js.Tuple2[O1, O2], scheduler: SchedulerLike): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R]): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R], scheduler: SchedulerLike): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2, scheduler: SchedulerLike): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    sources: js.Tuple2[O1, O2],
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    sources: js.Tuple2[O1, O2],
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R],
    scheduler: SchedulerLike
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](sources: js.Tuple3[O1, O2, O3]): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](sources: js.Tuple3[O1, O2, O3], scheduler: SchedulerLike): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R],
    scheduler: SchedulerLike
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, scheduler: SchedulerLike): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    sources: js.Tuple3[O1, O2, O3],
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    sources: js.Tuple3[O1, O2, O3],
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](sources: js.Tuple4[O1, O2, O3, O4]): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](sources: js.Tuple4[O1, O2, O3, O4], scheduler: SchedulerLike): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, scheduler: SchedulerLike): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
    sources: js.Tuple4[O1, O2, O3, O4],
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ]
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
    sources: js.Tuple4[O1, O2, O3, O4],
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](sources: js.Tuple5[O1, O2, O3, O4, O5]): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](sources: js.Tuple5[O1, O2, O3, O4, O5], scheduler: SchedulerLike): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ]
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, scheduler: SchedulerLike): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
    sources: js.Tuple5[O1, O2, O3, O4, O5],
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ]
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
    sources: js.Tuple5[O1, O2, O3, O4, O5],
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](sources: js.Tuple6[O1, O2, O3, O4, O5, O6]): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](sources: js.Tuple6[O1, O2, O3, O4, O5, O6], scheduler: SchedulerLike): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ]
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6, scheduler: SchedulerLike): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
    sources: js.Tuple6[O1, O2, O3, O4, O5, O6],
    resultSelector: js.Function6[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ]
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
    sources: js.Tuple6[O1, O2, O3, O4, O5, O6],
    resultSelector: js.Function6[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    v6: O6,
    resultSelector: js.Function6[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ]
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    v6: O6,
    resultSelector: js.Function6[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest_O1_ObservableInputWildcard[O1 /* <: ObservableInput[_] */](sources: js.Array[O1]): Observable[js.Array[ObservedValueOf[O1]]] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest_O1_ObservableInputWildcard[O1 /* <: ObservableInput[_] */](sources: js.Array[O1], scheduler: SchedulerLike): Observable[js.Array[ObservedValueOf[O1]]] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest_O1_ObservableInputWildcardR[O1 /* <: ObservableInput[_] */, R](sources: js.Array[O1], resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R]): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest_O1_ObservableInputWildcardR[O1 /* <: ObservableInput[_] */, R](
    sources: js.Array[O1],
    resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R],
    scheduler: SchedulerLike
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest_O_ObservableInputWildcardR[O /* <: ObservableInput[_] */, R](
    observables: ((js.Function1[(/* repeated */ js.Any) | (/* repeated */ ObservedValueOf[O]), R]) | O | ObservableInput[_] | SchedulerLike)*
  ): Observable[R] = js.native
  @JSImport("rxjs", "combineLatest")
  @js.native
  def combineLatest_R[R](observables: (ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]) | SchedulerLike)*): Observable[R] = js.native
  
  @JSImport("rxjs", "concat")
  @js.native
  def concat[O /* <: ObservableInput[_] */](observables: (O | SchedulerLike)*): Observable[ObservedValueOf[O]] = js.native
  @JSImport("rxjs", "concat")
  @js.native
  def concat[O1 /* <: ObservableInput[_] */](v1: O1): Observable[ObservedValueOf[O1]] = js.native
  @JSImport("rxjs", "concat")
  @js.native
  def concat[O1 /* <: ObservableInput[_] */](v1: O1, scheduler: SchedulerLike): Observable[ObservedValueOf[O1]] = js.native
  @JSImport("rxjs", "concat")
  @js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2): Observable[ObservedValueOf[O1 | O2]] = js.native
  @JSImport("rxjs", "concat")
  @js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2, scheduler: SchedulerLike): Observable[ObservedValueOf[O1 | O2]] = js.native
  @JSImport("rxjs", "concat")
  @js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3): Observable[ObservedValueOf[O1 | O2 | O3]] = js.native
  @JSImport("rxjs", "concat")
  @js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, scheduler: SchedulerLike): Observable[ObservedValueOf[O1 | O2 | O3]] = js.native
  @JSImport("rxjs", "concat")
  @js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4): Observable[ObservedValueOf[O1 | O2 | O3 | O4]] = js.native
  @JSImport("rxjs", "concat")
  @js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, scheduler: SchedulerLike): Observable[ObservedValueOf[O1 | O2 | O3 | O4]] = js.native
  @JSImport("rxjs", "concat")
  @js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5]] = js.native
  @JSImport("rxjs", "concat")
  @js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, scheduler: SchedulerLike): Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5]] = js.native
  @JSImport("rxjs", "concat")
  @js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5 | O6]] = js.native
  @JSImport("rxjs", "concat")
  @js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6, scheduler: SchedulerLike): Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5 | O6]] = js.native
  @JSImport("rxjs", "concat")
  @js.native
  def concat_R[R](observables: (ObservableInput[_] | SchedulerLike)*): Observable[R] = js.native
  
  object config {
    
    @JSImport("rxjs", "config")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The promise constructor used by default for methods such as
      * {@link toPromise} and {@link forEach}
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rxjs", "config.Promise")
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
    @JSImport("rxjs", "config.Promise")
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
    @JSImport("rxjs", "config.useDeprecatedSynchronousErrorHandling")
    @js.native
    def useDeprecatedSynchronousErrorHandling: Boolean = js.native
    @scala.inline
    def useDeprecatedSynchronousErrorHandling_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useDeprecatedSynchronousErrorHandling")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs", "defer")
  @js.native
  def defer[R /* <: ObservableInput[_] | Unit */](observableFactory: js.Function0[R]): Observable[ObservedValueOf[R]] = js.native
  
  @JSImport("rxjs", "empty")
  @js.native
  def empty(): Observable[scala.Nothing] = js.native
  @JSImport("rxjs", "empty")
  @js.native
  def empty(scheduler: SchedulerLike): Observable[scala.Nothing] = js.native
  
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin(args: (ObservableInput[_] | js.Function)*): Observable[_] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin(sourcesObject: js.Object): Observable[scala.Nothing] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin[A /* <: js.Array[ObservableInput[_]] */](sources: A): Observable[js.Array[ObservedValuesFromArray[A]]] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin[A](sources: js.Array[ObservableInput[A]]): Observable[js.Array[A]] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin[T](v1: SubscribableOrPromise[T]): Observable[js.Array[T]] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin[A, B](sources: js.Tuple2[ObservableInput[A], ObservableInput[B]]): Observable[js.Tuple2[A, B]] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2]): Observable[js.Tuple2[T, T2]] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin[A, B, C](sources: js.Tuple3[ObservableInput[A], ObservableInput[B], ObservableInput[C]]): Observable[js.Tuple3[A, B, C]] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin[A, B, C, D](sources: js.Tuple4[ObservableInput[A], ObservableInput[B], ObservableInput[C], ObservableInput[D]]): Observable[js.Tuple4[A, B, C, D]] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin[T, T2, T3, T4](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin[A, B, C, D, E](
    sources: js.Tuple5[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E]
    ]
  ): Observable[js.Tuple5[A, B, C, D, E]] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin[A, B, C, D, E, F](
    sources: js.Tuple6[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E], 
      ObservableInput[F]
    ]
  ): Observable[js.Tuple6[A, B, C, D, E, F]] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable[js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin_T[T](sources: ObservableInput[T]*): Observable[js.Array[T]] = js.native
  @JSImport("rxjs", "forkJoin")
  @js.native
  def forkJoin_TK_String[T, K /* <: /* keyof T */ String */](sourcesObject: T): Observable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: rxjs.rxjs/internal/types.ObservedValueOf<T[K]>}
    */ forkJoin with TopLevel[T]
  ] = js.native
  
  @JSImport("rxjs", "from")
  @js.native
  def from[O /* <: ObservableInput[_] */](input: O): Observable[ObservedValueOf[O]] = js.native
  @JSImport("rxjs", "from")
  @js.native
  def from[O /* <: ObservableInput[_] */](input: O, scheduler: SchedulerLike): Observable[ObservedValueOf[O]] = js.native
  
  @JSImport("rxjs", "fromEvent")
  @js.native
  def fromEvent[T](target: FromEventTarget[T], eventName: String): Observable[T] = js.native
  @JSImport("rxjs", "fromEvent")
  @js.native
  def fromEvent[T](target: FromEventTarget[T], eventName: String, options: EventListenerOptions): Observable[T] = js.native
  @JSImport("rxjs", "fromEvent")
  @js.native
  def fromEvent[T](
    target: FromEventTarget[T],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
  @JSImport("rxjs", "fromEvent")
  @js.native
  def fromEvent[T](
    target: FromEventTarget[T],
    eventName: String,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
  
  @JSImport("rxjs", "fromEventPattern")
  @js.native
  def fromEventPattern[T](addHandler: js.Function1[/* handler */ NodeEventHandler, _]): Observable[T] = js.native
  @JSImport("rxjs", "fromEventPattern")
  @js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, _],
    removeHandler: js.UndefOr[scala.Nothing],
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
  @JSImport("rxjs", "fromEventPattern")
  @js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, _],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, js.UndefOr[js.Any], Unit]
  ): Observable[T] = js.native
  @JSImport("rxjs", "fromEventPattern")
  @js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, _],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, /* signal */ js.UndefOr[js.Any], Unit],
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
  
  @JSImport("rxjs", "generate")
  @js.native
  def generate[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S]): Observable[S] = js.native
  @JSImport("rxjs", "generate")
  @js.native
  def generate[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S], scheduler: SchedulerLike): Observable[S] = js.native
  @JSImport("rxjs", "generate")
  @js.native
  def generate[S](options: GenerateBaseOptions[S]): Observable[S] = js.native
  @JSImport("rxjs", "generate")
  @js.native
  def generate[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T]
  ): Observable[T] = js.native
  @JSImport("rxjs", "generate")
  @js.native
  def generate[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T],
    scheduler: SchedulerLike
  ): Observable[T] = js.native
  @JSImport("rxjs", "generate")
  @js.native
  def generate[T, S](options: GenerateOptions[T, S]): Observable[T] = js.native
  
  @JSImport("rxjs", "identity")
  @js.native
  def identity[T](x: T): T = js.native
  
  @JSImport("rxjs", "iif")
  @js.native
  def iif[T, F](condition: js.Function0[Boolean]): Observable[T | F] = js.native
  @JSImport("rxjs", "iif")
  @js.native
  def iif[T, F](
    condition: js.Function0[Boolean],
    trueResult: js.UndefOr[SubscribableOrPromise[T]],
    falseResult: SubscribableOrPromise[F]
  ): Observable[T | F] = js.native
  @JSImport("rxjs", "iif")
  @js.native
  def iif[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): Observable[T | F] = js.native
  
  @JSImport("rxjs", "interval")
  @js.native
  def interval(): Observable[Double] = js.native
  @JSImport("rxjs", "interval")
  @js.native
  def interval(period: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs", "interval")
  @js.native
  def interval(period: Double): Observable[Double] = js.native
  @JSImport("rxjs", "interval")
  @js.native
  def interval(period: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  
  @JSImport("rxjs", "isObservable")
  @js.native
  def isObservable[T](obj: js.Any): /* is rxjs.rxjs/internal/Observable.Observable<T> */ Boolean = js.native
  
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T](observables: (Double | ObservableInput[T] | SchedulerLike)*): Observable[T] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T](v1: ObservableInput[T]): Observable[T] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T](v1: ObservableInput[T], concurrent: Double): Observable[T] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T](v1: ObservableInput[T], concurrent: Double, scheduler: SchedulerLike): Observable[T] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T](v1: ObservableInput[T], scheduler: SchedulerLike): Observable[T] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2]): Observable[T | T2] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2], concurrent: Double): Observable[T | T2] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2], concurrent: Double, scheduler: SchedulerLike): Observable[T | T2] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2], scheduler: SchedulerLike): Observable[T | T2] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable[T | T2 | T3] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double): Observable[T | T2 | T3] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): Observable[T | T2 | T3] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3, T4](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable[T | T2 | T3 | T4] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3, T4](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Double
  ): Observable[T | T2 | T3 | T4] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3, T4](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3 | T4] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3, T4](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3 | T4] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5]
  ): Observable[T | T2 | T3 | T4 | T5] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double
  ): Observable[T | T2 | T3 | T4 | T5] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3 | T4 | T5] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3 | T4 | T5] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double
  ): Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("rxjs", "merge")
  @js.native
  def merge_TR[T, R](observables: (Double | ObservableInput[_] | SchedulerLike)*): Observable[R] = js.native
  
  @JSImport("rxjs", "never")
  @js.native
  def never(): Observable[scala.Nothing] = js.native
  
  @JSImport("rxjs", "noop")
  @js.native
  def noop(): Unit = js.native
  
  @JSImport("rxjs", "observable")
  @js.native
  val observable: String | js.Symbol = js.native
  
  @JSImport("rxjs", "of")
  @js.native
  def of[T](a: T): Observable[T] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T](a: T, scheduler: SchedulerLike): Observable[T] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T](args: (SchedulerLike | T)*): Observable[T] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2](a: T, b: T2): Observable[T | T2] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2](a: T, b: T2, scheduler: SchedulerLike): Observable[T | T2] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2, T3](a: T, b: T2, c: T3): Observable[T | T2 | T3] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2, T3](a: T, b: T2, c: T3, scheduler: SchedulerLike): Observable[T | T2 | T3] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2, T3, T4](a: T, b: T2, c: T3, d: T4): Observable[T | T2 | T3 | T4] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2, T3, T4](a: T, b: T2, c: T3, d: T4, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2, T3, T4, T5](a: T, b: T2, c: T3, d: T4, e: T5): Observable[T | T2 | T3 | T4 | T5] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2, T3, T4, T5](a: T, b: T2, c: T3, d: T4, e: T5, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4 | T5] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2, T3, T4, T5, T6](a: T, b: T2, c: T3, d: T4, e: T5, f: T6): Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2, T3, T4, T5, T6](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2, T3, T4, T5, T6, T7](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7): Observable[T | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2, T3, T4, T5, T6, T7](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2, T3, T4, T5, T6, T7, T8](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8): Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2, T3, T4, T5, T6, T7, T8](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2, T3, T4, T5, T6, T7, T8, T9](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8, i: T9): Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  @JSImport("rxjs", "of")
  @js.native
  def of[T, T2, T3, T4, T5, T6, T7, T8, T9](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8, i: T9, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  
  @JSImport("rxjs", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[R](array: js.Array[ObservableInput[_]]): Observable[R] = js.native
  @JSImport("rxjs", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[R](observables: (ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]))*): Observable[R] = js.native
  @JSImport("rxjs", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[R](v: ObservableInput[R]): Observable[R] = js.native
  @JSImport("rxjs", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T2, T3, R](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable[R] = js.native
  @JSImport("rxjs", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T2, T3, T4, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable[R] = js.native
  @JSImport("rxjs", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T2, T3, T4, T5, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable[R] = js.native
  @JSImport("rxjs", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T2, T3, T4, T5, T6, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable[R] = js.native
  
  @JSImport("rxjs", "pairs")
  @js.native
  def pairs[T](obj: js.Object): Observable[js.Tuple2[String, T]] = js.native
  @JSImport("rxjs", "pairs")
  @js.native
  def pairs[T](obj: js.Object, scheduler: SchedulerLike): Observable[js.Tuple2[String, T]] = js.native
  
  @JSImport("rxjs", "partition")
  @js.native
  def partition[T](source: ObservableInput[T], predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Tuple2[Observable[T], Observable[T]] = js.native
  @JSImport("rxjs", "partition")
  @js.native
  def partition[T](
    source: ObservableInput[T],
    predicate: js.Function2[/* value */ T, /* index */ Double, Boolean],
    thisArg: js.Any
  ): js.Tuple2[Observable[T], Observable[T]] = js.native
  
  @JSImport("rxjs", "pipe")
  @js.native
  def pipe[T](): UnaryFunction[T, T] = js.native
  @JSImport("rxjs", "pipe")
  @js.native
  def pipe[T, A](fn1: UnaryFunction[T, A]): UnaryFunction[T, A] = js.native
  @JSImport("rxjs", "pipe")
  @js.native
  def pipe[T, A, B](fn1: UnaryFunction[T, A], fn2: UnaryFunction[A, B]): UnaryFunction[T, B] = js.native
  @JSImport("rxjs", "pipe")
  @js.native
  def pipe[T, A, B, C](fn1: UnaryFunction[T, A], fn2: UnaryFunction[A, B], fn3: UnaryFunction[B, C]): UnaryFunction[T, C] = js.native
  @JSImport("rxjs", "pipe")
  @js.native
  def pipe[T, A, B, C, D](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D]
  ): UnaryFunction[T, D] = js.native
  @JSImport("rxjs", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E]
  ): UnaryFunction[T, E] = js.native
  @JSImport("rxjs", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E, F](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F]
  ): UnaryFunction[T, F] = js.native
  @JSImport("rxjs", "pipe")
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
  @JSImport("rxjs", "pipe")
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
  @JSImport("rxjs", "pipe")
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
  @JSImport("rxjs", "pipe")
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
  
  @JSImport("rxjs", "queue")
  @js.native
  val queue: QueueScheduler = js.native
  
  @JSImport("rxjs", "queueScheduler")
  @js.native
  val queueScheduler: QueueScheduler = js.native
  
  @JSImport("rxjs", "race")
  @js.native
  def race(arg: js.Array[ObservableInput[_]]): Observable[js.Object] = js.native
  @JSImport("rxjs", "race")
  @js.native
  def race(observables: ObservableInput[_]*): Observable[js.Object] = js.native
  @JSImport("rxjs", "race")
  @js.native
  def race[A](a: ObservableInput[A]): Observable[A] = js.native
  @JSImport("rxjs", "race")
  @js.native
  def race[A, B](arg: js.Tuple2[ObservableInput[A], ObservableInput[B]]): Observable[A | B] = js.native
  @JSImport("rxjs", "race")
  @js.native
  def race[A, B](a: ObservableInput[A], b: ObservableInput[B]): Observable[A | B] = js.native
  @JSImport("rxjs", "race")
  @js.native
  def race[A, B, C](arg: js.Tuple3[ObservableInput[A], ObservableInput[B], ObservableInput[C]]): Observable[A | B | C] = js.native
  @JSImport("rxjs", "race")
  @js.native
  def race[A, B, C](a: ObservableInput[A], b: ObservableInput[B], c: ObservableInput[C]): Observable[A | B | C] = js.native
  @JSImport("rxjs", "race")
  @js.native
  def race[A, B, C, D](arg: js.Tuple4[ObservableInput[A], ObservableInput[B], ObservableInput[C], ObservableInput[D]]): Observable[A | B | C | D] = js.native
  @JSImport("rxjs", "race")
  @js.native
  def race[A, B, C, D](a: ObservableInput[A], b: ObservableInput[B], c: ObservableInput[C], d: ObservableInput[D]): Observable[A | B | C | D] = js.native
  @JSImport("rxjs", "race")
  @js.native
  def race[A, B, C, D, E](
    arg: js.Tuple5[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E]
    ]
  ): Observable[A | B | C | D | E] = js.native
  @JSImport("rxjs", "race")
  @js.native
  def race[A, B, C, D, E](
    a: ObservableInput[A],
    b: ObservableInput[B],
    c: ObservableInput[C],
    d: ObservableInput[D],
    e: ObservableInput[E]
  ): Observable[A | B | C | D | E] = js.native
  @JSImport("rxjs", "race")
  @js.native
  def race_A[A](arg: js.Array[ObservableInput[A]]): Observable[A] = js.native
  @JSImport("rxjs", "race")
  @js.native
  def race_T[T](arg: js.Array[ObservableInput[T]]): Observable[T] = js.native
  @JSImport("rxjs", "race")
  @js.native
  def race_T[T](observables: ObservableInput[T]*): Observable[T] = js.native
  
  @JSImport("rxjs", "range")
  @js.native
  def range(): Observable[Double] = js.native
  @JSImport("rxjs", "range")
  @js.native
  def range(start: js.UndefOr[scala.Nothing], count: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs", "range")
  @js.native
  def range(start: js.UndefOr[scala.Nothing], count: Double): Observable[Double] = js.native
  @JSImport("rxjs", "range")
  @js.native
  def range(start: js.UndefOr[scala.Nothing], count: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs", "range")
  @js.native
  def range(start: Double): Observable[Double] = js.native
  @JSImport("rxjs", "range")
  @js.native
  def range(start: Double, count: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs", "range")
  @js.native
  def range(start: Double, count: Double): Observable[Double] = js.native
  @JSImport("rxjs", "range")
  @js.native
  def range(start: Double, count: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  
  @JSImport("rxjs", "scheduled")
  @js.native
  def scheduled[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable_[T] = js.native
  
  @JSImport("rxjs", "throwError")
  @js.native
  def throwError(error: js.Any): Observable[scala.Nothing] = js.native
  @JSImport("rxjs", "throwError")
  @js.native
  def throwError(error: js.Any, scheduler: SchedulerLike): Observable[scala.Nothing] = js.native
  
  @JSImport("rxjs", "timer")
  @js.native
  def timer(): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(
    dueTime: js.UndefOr[scala.Nothing],
    periodOrScheduler: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: Double): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: Double): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: Double, periodOrScheduler: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: Double, periodOrScheduler: Double): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: Double, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: Double, periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: Double, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: Date): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: Date, periodOrScheduler: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: Date, periodOrScheduler: Double): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: Date, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: Date, periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs", "timer")
  @js.native
  def timer(dueTime: Date, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
  
  @JSImport("rxjs", "using")
  @js.native
  def using[T](
    resourceFactory: js.Function0[Unsubscribable | Unit],
    observableFactory: js.Function1[/* resource */ Unsubscribable | Unit, ObservableInput[T] | Unit]
  ): Observable[T] = js.native
  
  @JSImport("rxjs", "zip")
  @js.native
  def zip[O /* <: ObservableInput[_] */](array: js.Array[O]): Observable[js.Array[ObservedValueOf[O]]] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip[R](array: js.Array[ObservableInput[_]], resultSelector: js.Function1[/* repeated */ js.Any, R]): Observable[R] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip[O /* <: ObservableInput[_] */](observables: O*): Observable[js.Array[ObservedValueOf[O]]] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip[O1 /* <: ObservableInput[_] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R]): Observable[R] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): Observable[R] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): Observable[R] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ]
  ): Observable[R] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ]
  ): Observable[R] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    v6: O6,
    resultSelector: js.Function6[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ]
  ): Observable[R] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip_O_ObservableInputWildcardR[O /* <: ObservableInput[_] */, R](array: js.Array[O], resultSelector: js.Function1[/* repeated */ ObservedValueOf[O], R]): Observable[R] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip_O_ObservableInputWildcardR[O /* <: ObservableInput[_] */, R](observables: (O | (js.Function1[/* repeated */ ObservedValueOf[O], R]))*): Observable[R] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip_R[R](array: js.Array[ObservableInput[_]]): Observable[R] = js.native
  @JSImport("rxjs", "zip")
  @js.native
  def zip_R[R](observables: (ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]))*): Observable[R] = js.native
}
