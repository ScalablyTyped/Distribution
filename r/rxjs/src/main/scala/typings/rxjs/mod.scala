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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rxjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs", "ArgumentOutOfRangeError")
  @js.native
  val ArgumentOutOfRangeError: ArgumentOutOfRangeErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs", "ArgumentOutOfRangeError")
  @js.native
  class ArgumentOutOfRangeErrorCls ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
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
  class EmptyErrorCls ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
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
    def this(kind: C, value: Unit, error: js.Any) = this()
    def this(kind: E, value: T, error: js.Any) = this()
    def this(kind: E, value: Unit, error: js.Any) = this()
    def this(kind: N, value: T, error: js.Any) = this()
    def this(kind: N, value: Unit, error: js.Any) = this()
  }
  /* static members */
  object Notification {
    
    @JSImport("rxjs", "Notification")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs", "Notification.completeNotification")
    @js.native
    def completeNotification: js.Any = js.native
    inline def completeNotification_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completeNotification")(x.asInstanceOf[js.Any])
    
    /**
      * A shortcut to create a Notification instance of the type `complete`.
      * @return {Notification<any>} The valueless "complete" Notification.
      * @nocollapse
      */
    inline def createComplete(): typings.rxjs.notificationMod.Notification[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createComplete")().asInstanceOf[typings.rxjs.notificationMod.Notification[js.Any]]
    
    /**
      * A shortcut to create a Notification instance of the type `error` from a
      * given error.
      * @param {any} [err] The `error` error.
      * @return {Notification<T>} The "error" Notification representing the
      * argument.
      * @nocollapse
      */
    inline def createError[T](): typings.rxjs.notificationMod.Notification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createError")().asInstanceOf[typings.rxjs.notificationMod.Notification[T]]
    inline def createError[T](err: js.Any): typings.rxjs.notificationMod.Notification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createError")(err.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.notificationMod.Notification[T]]
    
    /**
      * A shortcut to create a Notification instance of the type `next` from a
      * given value.
      * @param {T} value The `next` value.
      * @return {Notification<T>} The "next" Notification representing the
      * argument.
      * @nocollapse
      */
    inline def createNext[T](value: T): typings.rxjs.notificationMod.Notification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNext")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.notificationMod.Notification[T]]
    
    @JSImport("rxjs", "Notification.undefinedValueNotification")
    @js.native
    def undefinedValueNotification: js.Any = js.native
    inline def undefinedValueNotification_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedValueNotification")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs", "NotificationKind")
  @js.native
  object NotificationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.rxjs.notificationMod.NotificationKind & String] = js.native
    
    /* "C" */ val COMPLETE: typings.rxjs.notificationMod.NotificationKind.COMPLETE & String = js.native
    
    /* "E" */ val ERROR: typings.rxjs.notificationMod.NotificationKind.ERROR & String = js.native
    
    /* "N" */ val NEXT: typings.rxjs.notificationMod.NotificationKind.NEXT & String = js.native
  }
  
  @JSImport("rxjs", "ObjectUnsubscribedError")
  @js.native
  val ObjectUnsubscribedError: ObjectUnsubscribedErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs", "ObjectUnsubscribedError")
  @js.native
  class ObjectUnsubscribedErrorCls ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
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
    inline def create_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
    
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
    inline def `if`[T, F](condition: js.Function0[Boolean]): Observable[T | F] = ^.asInstanceOf[js.Dynamic].applyDynamic("if")(condition.asInstanceOf[js.Any]).asInstanceOf[Observable[T | F]]
    inline def `if`[T, F](condition: js.Function0[Boolean], trueResult: Unit, falseResult: SubscribableOrPromise[F]): Observable[T | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("if")(condition.asInstanceOf[js.Any], trueResult.asInstanceOf[js.Any], falseResult.asInstanceOf[js.Any])).asInstanceOf[Observable[T | F]]
    inline def `if`[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): Observable[T | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("if")(condition.asInstanceOf[js.Any], trueResult.asInstanceOf[js.Any])).asInstanceOf[Observable[T | F]]
    inline def `if`[T, F](
      condition: js.Function0[Boolean],
      trueResult: SubscribableOrPromise[T],
      falseResult: SubscribableOrPromise[F]
    ): Observable[T | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("if")(condition.asInstanceOf[js.Any], trueResult.asInstanceOf[js.Any], falseResult.asInstanceOf[js.Any])).asInstanceOf[Observable[T | F]]
    
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
    inline def `throw`(error: js.Any): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("throw")(error.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
    inline def `throw`(error: js.Any, scheduler: SchedulerLike): Observable[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("throw")(error.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[scala.Nothing]]
  }
  
  @JSImport("rxjs", "ReplaySubject")
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
    
    @JSImport("rxjs", "Scheduler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Note: the extra arrow function wrapper is to make testing by overriding
      * Date.now easier.
      * @nocollapse
      */
    inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
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
    inline def create_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
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
    
    @JSImport("rxjs", "Subscriber")
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
    inline def EMPTY_=(x: typings.rxjs.subscriptionMod.Subscription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs", "TimeoutError")
  @js.native
  val TimeoutError: TimeoutErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs", "TimeoutError")
  @js.native
  class TimeoutErrorCls ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs", "UnsubscriptionError")
  @js.native
  val UnsubscriptionError: UnsubscriptionErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs", "UnsubscriptionError")
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
    
    @JSImport("rxjs", "VirtualAction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sortActions[T](
      a: typings.rxjs.virtualTimeSchedulerMod.VirtualAction[T],
      b: typings.rxjs.virtualTimeSchedulerMod.VirtualAction[T]
    ): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("sortActions")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
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
    
    @JSImport("rxjs", "VirtualTimeScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs", "VirtualTimeScheduler.frameTimeFactor")
    @js.native
    def frameTimeFactor: Double = js.native
    inline def frameTimeFactor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameTimeFactor")(x.asInstanceOf[js.Any])
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
  
  inline def bindCallback(callbackFunc: js.Function): js.Function1[/* repeated */ js.Any, Observable[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Any]]]
  inline def bindCallback(callbackFunc: js.Function1[/* callback */ js.Function0[js.Any], js.Any]): js.Function0[Observable[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Observable[Unit]]]
  inline def bindCallback(callbackFunc: js.Function1[/* callback */ js.Function0[js.Any], js.Any], scheduler: SchedulerLike): js.Function0[Observable[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Observable[Unit]]]
  inline def bindCallback(callbackFunc: js.Function, resultSelector: js.Function): js.Function1[/* repeated */ js.Any, Observable[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Any]]]
  inline def bindCallback(callbackFunc: js.Function, resultSelector: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, Observable[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Any]]]
  inline def bindCallback(callbackFunc: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, Observable[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Any]]]
  inline def bindCallback[A1](callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function0[js.Any], js.Any]): js.Function1[/* arg1 */ A1, Observable[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[Unit]]]
  inline def bindCallback[A1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function0[js.Any], js.Any],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[Unit]]]
  inline def bindCallback[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function0[js.Any], js.Any]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]]]
  inline def bindCallback[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function0[js.Any], js.Any],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]]]
  inline def bindCallback[A1, A2, A3](
    callbackFunc: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* callback */ js.Function0[js.Any], js.Any]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]]]
  inline def bindCallback[A1, A2, A3](
    callbackFunc: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* callback */ js.Function0[js.Any], js.Any],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]]]
  inline def bindCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function0[js.Any], 
      js.Any
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]]]
  inline def bindCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function0[js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]]]
  inline def bindCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function0[js.Any], 
      js.Any
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ]]
  inline def bindCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function0[js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ]]
  
  inline def bindCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* res1 */ R1, js.Any], 
      js.Any
    ]
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]]]
  inline def bindCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* res1 */ R1, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]]]
  
  inline def bindCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ]]
  inline def bindCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ]]
  
  inline def bindCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ]]
  inline def bindCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ]]
  
  inline def bindCallback_A1A2A3A4A5R1R2R3R4[A1, A2, A3, A4, A5, R1, R2, R3, R4](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Array[js.Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Array[js.Any]]
  ]]
  inline def bindCallback_A1A2A3A4A5R1R2R3R4[A1, A2, A3, A4, A5, R1, R2, R3, R4](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Array[js.Any]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Array[js.Any]]
  ]]
  
  inline def bindCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* res1 */ R1, js.Any], 
      js.Any
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]]]
  inline def bindCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* res1 */ R1, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]]]
  
  inline def bindCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ]]
  inline def bindCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ]]
  
  inline def bindCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ]]
  inline def bindCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ]]
  
  inline def bindCallback_A1A2A3A4R1R2R3R4[A1, A2, A3, A4, R1, R2, R3, R4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[js.Array[js.Any]]]]
  inline def bindCallback_A1A2A3A4R1R2R3R4[A1, A2, A3, A4, R1, R2, R3, R4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[js.Array[js.Any]]]]
  
  inline def bindCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* res1 */ R1, js.Any], 
      js.Any
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]]]
  inline def bindCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* res1 */ R1, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]]]
  
  inline def bindCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]]]
  inline def bindCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]]]
  
  inline def bindCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]]]
  inline def bindCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]]]
  
  inline def bindCallback_A1A2A3R1R2R3R4[A1, A2, A3, R1, R2, R3, R4](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Array[js.Any]]]]
  inline def bindCallback_A1A2A3R1R2R3R4[A1, A2, A3, R1, R2, R3, R4](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Array[js.Any]]]]
  
  inline def bindCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function1[/* res1 */ R1, js.Any], 
      js.Any
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]]]
  inline def bindCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function1[/* res1 */ R1, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]]]
  
  inline def bindCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]]]
  inline def bindCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]]]
  
  inline def bindCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]]]
  inline def bindCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]]]
  
  inline def bindCallback_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Array[js.Any]]]]
  inline def bindCallback_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Array[js.Any]]]]
  
  inline def bindCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* res1 */ R1, js.Any], js.Any]
  ): js.Function1[/* arg1 */ A1, Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[R1]]]
  inline def bindCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* res1 */ R1, js.Any], js.Any],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[R1]]]
  
  inline def bindCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]]]
  inline def bindCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]]]
  
  inline def bindCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]]]
  inline def bindCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]]]
  
  inline def bindCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Function1[/* arg1 */ A1, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[js.Array[js.Any]]]]
  inline def bindCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[js.Array[js.Any]]]]
  
  inline def bindCallback_AR_Function1[A, R](callbackFunc: js.Function1[A | (js.Function1[/* repeated */ R, js.Any]), js.Any]): js.Function1[/* repeated */ A, Observable[js.Array[R]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ A, Observable[js.Array[R]]]]
  inline def bindCallback_AR_Function1[A, R](
    callbackFunc: js.Function1[A | (js.Function1[/* repeated */ R, js.Any]), js.Any],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ A, Observable[js.Array[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ A, Observable[js.Array[R]]]]
  
  inline def bindCallback_R1[R1](callbackFunc: js.Function1[/* callback */ js.Function1[/* res1 */ R1, js.Any], js.Any]): js.Function0[Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Observable[R1]]]
  inline def bindCallback_R1[R1](
    callbackFunc: js.Function1[/* callback */ js.Function1[/* res1 */ R1, js.Any], js.Any],
    scheduler: SchedulerLike
  ): js.Function0[Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Observable[R1]]]
  
  inline def bindCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[/* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, js.Any], js.Any]
  ): js.Function0[Observable[js.Tuple2[R1, R2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Observable[js.Tuple2[R1, R2]]]]
  inline def bindCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[/* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, js.Any], js.Any],
    scheduler: SchedulerLike
  ): js.Function0[Observable[js.Tuple2[R1, R2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Observable[js.Tuple2[R1, R2]]]]
  
  inline def bindCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function0[Observable[js.Tuple3[R1, R2, R3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Observable[js.Tuple3[R1, R2, R3]]]]
  inline def bindCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function0[Observable[js.Tuple3[R1, R2, R3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Observable[js.Tuple3[R1, R2, R3]]]]
  
  inline def bindCallback_R1R2R3R4[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Function0[Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Observable[js.Array[js.Any]]]]
  inline def bindCallback_R1R2R3R4[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function0[Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Observable[js.Array[js.Any]]]]
  
  inline def bindNodeCallback(callbackFunc: js.Function): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback(callbackFunc: js.Function1[/* callback */ js.Function1[/* err */ js.Any, js.Any], js.Any]): js.Function0[Observable[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Observable[Unit]]]
  inline def bindNodeCallback(
    callbackFunc: js.Function1[/* callback */ js.Function1[/* err */ js.Any, js.Any], js.Any],
    scheduler: SchedulerLike
  ): js.Function0[Observable[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Observable[Unit]]]
  inline def bindNodeCallback(callbackFunc: js.Function, resultSelector: js.Function): js.Function1[/* repeated */ js.Any, Observable[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Any]]]
  inline def bindNodeCallback(callbackFunc: js.Function, resultSelector: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, Observable[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Any]]]
  inline def bindNodeCallback(callbackFunc: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback[A1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* err */ js.Any, js.Any], js.Any]
  ): js.Function1[/* arg1 */ A1, Observable[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[Unit]]]
  inline def bindNodeCallback[A1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* err */ js.Any, js.Any], js.Any],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[Unit]]]
  inline def bindNodeCallback[A1, A2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]]]
  inline def bindNodeCallback[A1, A2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]]]
  inline def bindNodeCallback[A1, A2, A3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]]]
  inline def bindNodeCallback[A1, A2, A3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]]]
  inline def bindNodeCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]]]
  inline def bindNodeCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]]]
  inline def bindNodeCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ]]
  inline def bindNodeCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ]]
  
  inline def bindNodeCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ]
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]]]
  inline def bindNodeCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]]]
  
  inline def bindNodeCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ]]
  inline def bindNodeCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ]]
  
  inline def bindNodeCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ]]
  inline def bindNodeCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ]]
  
  inline def bindNodeCallback_A1A2A3A4A5R1R2R3R4_Function1[A1, A2, A3, A4, A5, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback_A1A2A3A4A5R1R2R3R4_Function1[A1, A2, A3, A4, A5, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  
  inline def bindNodeCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]]]
  inline def bindNodeCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]]]
  
  inline def bindNodeCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ]]
  inline def bindNodeCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ]]
  
  inline def bindNodeCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ]]
  inline def bindNodeCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ]]
  
  inline def bindNodeCallback_A1A2A3A4R1R2R3R4_Function1[A1, A2, A3, A4, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback_A1A2A3A4R1R2R3R4_Function1[A1, A2, A3, A4, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  
  inline def bindNodeCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]]]
  inline def bindNodeCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]]]
  
  inline def bindNodeCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]]]
  inline def bindNodeCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]]]
  
  inline def bindNodeCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]]]
  inline def bindNodeCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]]]
  
  inline def bindNodeCallback_A1A2A3R1R2R3R4_Function1[A1, A2, A3, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback_A1A2A3R1R2R3R4_Function1[A1, A2, A3, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  
  inline def bindNodeCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]]]
  inline def bindNodeCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]]]
  
  inline def bindNodeCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]]]
  inline def bindNodeCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]]]
  
  inline def bindNodeCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]]]
  inline def bindNodeCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]]]
  
  inline def bindNodeCallback_A1A2R1R2R3R4_Function1[A1, A2, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback_A1A2R1R2R3R4_Function1[A1, A2, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  
  inline def bindNodeCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ]
  ): js.Function1[/* arg1 */ A1, Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[R1]]]
  inline def bindNodeCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[R1]]]
  
  inline def bindNodeCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]]]
  inline def bindNodeCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]]]
  
  inline def bindNodeCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]]]
  inline def bindNodeCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]]]
  
  inline def bindNodeCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        js.Any
      ], 
      js.Any
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        js.Any
      ], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  
  inline def bindNodeCallback_R1[R1](
    callbackFunc: js.Function1[/* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], js.Any]
  ): js.Function0[Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Observable[R1]]]
  inline def bindNodeCallback_R1[R1](
    callbackFunc: js.Function1[/* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], js.Any],
    scheduler: SchedulerLike
  ): js.Function0[Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Observable[R1]]]
  
  inline def bindNodeCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function0[Observable[js.Tuple2[R1, R2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Observable[js.Tuple2[R1, R2]]]]
  inline def bindNodeCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function0[Observable[js.Tuple2[R1, R2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Observable[js.Tuple2[R1, R2]]]]
  
  inline def bindNodeCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function0[Observable[js.Tuple3[R1, R2, R3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Observable[js.Tuple3[R1, R2, R3]]]]
  inline def bindNodeCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function0[Observable[js.Tuple3[R1, R2, R3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Observable[js.Tuple3[R1, R2, R3]]]]
  
  inline def bindNodeCallback_R1R2R3R4_Function1[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        js.Any
      ], 
      js.Any
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback_R1R2R3R4_Function1[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        js.Any
      ], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  
  inline def combineLatest[R](observables: (ObservableInput[js.Any] | (js.Function1[/* repeated */ js.Any, R]) | SchedulerLike)*): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */](sources: js.Array[O1]): Observable[js.Array[ObservedValueOf[O1]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[ObservedValueOf[O1]]]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */](sources: js.Array[O1], scheduler: SchedulerLike): Observable[js.Array[ObservedValueOf[O1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Array[ObservedValueOf[O1]]]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */](v1: O1): Observable[js.Array[ObservedValueOf[O1]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[ObservedValueOf[O1]]]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */](v1: O1, scheduler: SchedulerLike): Observable[js.Array[ObservedValueOf[O1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Array[ObservedValueOf[O1]]]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, R](sources: js.Array[O1], resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, R](
    sources: js.Array[O1],
    resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */](sources: js.Tuple2[O1, O2]): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */](sources: js.Tuple2[O1, O2], scheduler: SchedulerLike): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R], scheduler: SchedulerLike): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, scheduler: SchedulerLike): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple2[O1, O2],
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple2[O1, O2],
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */](sources: js.Tuple3[O1, O2, O3]): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */](sources: js.Tuple3[O1, O2, O3], scheduler: SchedulerLike): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, scheduler: SchedulerLike): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple3[O1, O2, O3],
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple3[O1, O2, O3],
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */](sources: js.Tuple4[O1, O2, O3, O4]): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */](sources: js.Tuple4[O1, O2, O3, O4], scheduler: SchedulerLike): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, R](
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
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, scheduler: SchedulerLike): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple4[O1, O2, O3, O4],
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple4[O1, O2, O3, O4],
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */](sources: js.Tuple5[O1, O2, O3, O4, O5]): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */](sources: js.Tuple5[O1, O2, O3, O4, O5], scheduler: SchedulerLike): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, R](
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
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, R](
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
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, scheduler: SchedulerLike): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple5[O1, O2, O3, O4, O5],
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, R](
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
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */](sources: js.Tuple6[O1, O2, O3, O4, O5, O6]): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */](sources: js.Tuple6[O1, O2, O3, O4, O5, O6], scheduler: SchedulerLike): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, R](
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
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, R](
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
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6, scheduler: SchedulerLike): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */, R](
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
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */, R](
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
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */, R](
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
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */, R](
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
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  inline def combineLatest_O_ObservableInputAny[O /* <: ObservableInput[js.Any] */](observables: (O | SchedulerLike)*): Observable[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[js.Any]]]
  inline def combineLatest_O_ObservableInputAny[O /* <: ObservableInput[js.Any] */](sources: js.Array[O]): Observable[js.Array[ObservedValueOf[O]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[ObservedValueOf[O]]]]
  inline def combineLatest_O_ObservableInputAny[O /* <: ObservableInput[js.Any] */](sources: js.Array[O], scheduler: SchedulerLike): Observable[js.Array[ObservedValueOf[O]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Array[ObservedValueOf[O]]]]
  
  inline def combineLatest_O_ObservableInputAnyR[O /* <: ObservableInput[js.Any] */, R](
    observables: ((js.Function1[(/* repeated */ js.Any) | (/* repeated */ ObservedValueOf[O]), R]) | O | ObservableInput[js.Any] | SchedulerLike)*
  ): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  inline def combineLatest_O_ObservableInputAnyR[O /* <: ObservableInput[js.Any] */, R](sources: js.Array[O], resultSelector: js.Function1[/* repeated */ ObservedValueOf[O], R]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest_O_ObservableInputAnyR[O /* <: ObservableInput[js.Any] */, R](
    sources: js.Array[O],
    resultSelector: js.Function1[/* repeated */ ObservedValueOf[O], R],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  inline def concat[R](observables: (ObservableInput[js.Any] | SchedulerLike)*): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  inline def concat[O1 /* <: ObservableInput[js.Any] */](v1: O1): Observable[ObservedValueOf[O1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v1.asInstanceOf[js.Any]).asInstanceOf[Observable[ObservedValueOf[O1]]]
  inline def concat[O1 /* <: ObservableInput[js.Any] */](v1: O1, scheduler: SchedulerLike): Observable[ObservedValueOf[O1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v1.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[O1]]]
  inline def concat[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2): Observable[ObservedValueOf[O1 | O2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[O1 | O2]]]
  inline def concat[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, scheduler: SchedulerLike): Observable[ObservedValueOf[O1 | O2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[O1 | O2]]]
  inline def concat[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3): Observable[ObservedValueOf[O1 | O2 | O3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[O1 | O2 | O3]]]
  inline def concat[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, scheduler: SchedulerLike): Observable[ObservedValueOf[O1 | O2 | O3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[O1 | O2 | O3]]]
  inline def concat[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4): Observable[ObservedValueOf[O1 | O2 | O3 | O4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[O1 | O2 | O3 | O4]]]
  inline def concat[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, scheduler: SchedulerLike): Observable[ObservedValueOf[O1 | O2 | O3 | O4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[O1 | O2 | O3 | O4]]]
  inline def concat[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5]]]
  inline def concat[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, scheduler: SchedulerLike): Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5]]]
  inline def concat[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5 | O6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5 | O6]]]
  inline def concat[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6, scheduler: SchedulerLike): Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5 | O6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5 | O6]]]
  
  inline def concat_O_ObservableInputAny[O /* <: ObservableInput[js.Any] */](observables: (O | SchedulerLike)*): Observable[ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[ObservedValueOf[O]]]
  
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
    @JSImport("rxjs", "config.Promise")
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
    @JSImport("rxjs", "config.useDeprecatedSynchronousErrorHandling")
    @js.native
    def useDeprecatedSynchronousErrorHandling: Boolean = js.native
    inline def useDeprecatedSynchronousErrorHandling_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useDeprecatedSynchronousErrorHandling")(x.asInstanceOf[js.Any])
  }
  
  inline def defer[R /* <: ObservableInput[js.Any] | Unit */](observableFactory: js.Function0[R]): Observable[ObservedValueOf[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(observableFactory.asInstanceOf[js.Any]).asInstanceOf[Observable[ObservedValueOf[R]]]
  
  inline def empty(): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Observable[scala.Nothing]]
  inline def empty(scheduler: SchedulerLike): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  
  inline def forkJoin(args: (ObservableInput[js.Any] | js.Function)*): Observable[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(args.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Any]]
  inline def forkJoin(sourcesObject: js.Object): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sourcesObject.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def forkJoin[A /* <: js.Array[ObservableInput[js.Any]] */](sources: A): Observable[js.Array[ObservedValuesFromArray[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[ObservedValuesFromArray[A]]]]
  inline def forkJoin[A](sources: js.Array[ObservableInput[A]]): Observable[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[A]]]
  inline def forkJoin[A, B](sources: js.Tuple2[ObservableInput[A], ObservableInput[B]]): Observable[js.Tuple2[A, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[A, B]]]
  inline def forkJoin[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2]): Observable[js.Tuple2[T, T2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[T, T2]]]
  inline def forkJoin[A, B, C](sources: js.Tuple3[ObservableInput[A], ObservableInput[B], ObservableInput[C]]): Observable[js.Tuple3[A, B, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple3[A, B, C]]]
  inline def forkJoin[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable[js.Tuple3[T, T2, T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple3[T, T2, T3]]]
  inline def forkJoin[A, B, C, D](sources: js.Tuple4[ObservableInput[A], ObservableInput[B], ObservableInput[C], ObservableInput[D]]): Observable[js.Tuple4[A, B, C, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple4[A, B, C, D]]]
  inline def forkJoin[T, T2, T3, T4](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple4[T, T2, T3, T4]]]
  inline def forkJoin[A, B, C, D, E](
    sources: js.Tuple5[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E]
    ]
  ): Observable[js.Tuple5[A, B, C, D, E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple5[A, B, C, D, E]]]
  inline def forkJoin[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple5[T, T2, T3, T4, T5]]]
  inline def forkJoin[A, B, C, D, E, F](
    sources: js.Tuple6[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E], 
      ObservableInput[F]
    ]
  ): Observable[js.Tuple6[A, B, C, D, E, F]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple6[A, B, C, D, E, F]]]
  inline def forkJoin[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable[js.Tuple6[T, T2, T3, T4, T5, T6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple6[T, T2, T3, T4, T5, T6]]]
  
  inline def forkJoin_T[T](sources: ObservableInput[T]*): Observable[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[T]]]
  inline def forkJoin_T[T](v1: SubscribableOrPromise[T]): Observable[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(v1.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[T]]]
  
  inline def forkJoin_TK_String[T, K /* <: /* keyof T */ String */](sourcesObject: T): Observable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: rxjs.rxjs/internal/types.ObservedValueOf<T[K]>}
    */ forkJoin & TopLevel[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sourcesObject.asInstanceOf[js.Any]).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: rxjs.rxjs/internal/types.ObservedValueOf<T[K]>}
    */ forkJoin & TopLevel[T]
  ]]
  
  inline def from[O /* <: ObservableInput[js.Any] */](input: O): Observable[ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any]).asInstanceOf[Observable[ObservedValueOf[O]]]
  inline def from[O /* <: ObservableInput[js.Any] */](input: O, scheduler: SchedulerLike): Observable[ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[O]]]
  
  inline def fromEvent[T](target: FromEventTarget[T], eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent[T](target: FromEventTarget[T], eventName: String, options: EventListenerOptions): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent[T](
    target: FromEventTarget[T],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent[T](
    target: FromEventTarget[T],
    eventName: String,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  inline def fromEventPattern[T](addHandler: js.Function1[/* handler */ NodeEventHandler, js.Any]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, js.Any],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, js.UndefOr[js.Any], Unit]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, js.Any],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, /* signal */ js.UndefOr[js.Any], Unit],
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, js.Any],
    removeHandler: Unit,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  inline def generate[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S]): Observable[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any])).asInstanceOf[Observable[S]]
  inline def generate[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S], scheduler: SchedulerLike): Observable[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[S]]
  inline def generate[S](options: GenerateBaseOptions[S]): Observable[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[Observable[S]]
  inline def generate[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def generate[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T],
    scheduler: SchedulerLike
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def generate[T, S](options: GenerateOptions[T, S]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def identity[T](x: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def iif[T, F](condition: js.Function0[Boolean]): Observable[T | F] = ^.asInstanceOf[js.Dynamic].applyDynamic("iif")(condition.asInstanceOf[js.Any]).asInstanceOf[Observable[T | F]]
  inline def iif[T, F](condition: js.Function0[Boolean], trueResult: Unit, falseResult: SubscribableOrPromise[F]): Observable[T | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("iif")(condition.asInstanceOf[js.Any], trueResult.asInstanceOf[js.Any], falseResult.asInstanceOf[js.Any])).asInstanceOf[Observable[T | F]]
  inline def iif[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): Observable[T | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("iif")(condition.asInstanceOf[js.Any], trueResult.asInstanceOf[js.Any])).asInstanceOf[Observable[T | F]]
  inline def iif[T, F](
    condition: js.Function0[Boolean],
    trueResult: SubscribableOrPromise[T],
    falseResult: SubscribableOrPromise[F]
  ): Observable[T | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("iif")(condition.asInstanceOf[js.Any], trueResult.asInstanceOf[js.Any], falseResult.asInstanceOf[js.Any])).asInstanceOf[Observable[T | F]]
  
  inline def interval(): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")().asInstanceOf[Observable[Double]]
  inline def interval(period: Double): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")(period.asInstanceOf[js.Any]).asInstanceOf[Observable[Double]]
  inline def interval(period: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def interval(period: Unit, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  
  inline def isObservable[T](obj: js.Any): /* is rxjs.rxjs/internal/Observable.Observable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.rxjs/internal/Observable.Observable<T> */ Boolean]
  
  inline def merge[T](observables: (Double | ObservableInput[T] | SchedulerLike)*): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def merge[T](v1: ObservableInput[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def merge[T](v1: ObservableInput[T], concurrent: Double): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def merge[T](v1: ObservableInput[T], concurrent: Double, scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def merge[T](v1: ObservableInput[T], scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def merge[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2]): Observable[T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2]]
  inline def merge[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2], concurrent: Double): Observable[T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2]]
  inline def merge[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2], concurrent: Double, scheduler: SchedulerLike): Observable[T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2]]
  inline def merge[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2], scheduler: SchedulerLike): Observable[T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2]]
  inline def merge[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable[T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3]]
  inline def merge[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double): Observable[T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3]]
  inline def merge[T, T2, T3](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3]]
  inline def merge[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): Observable[T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3]]
  inline def merge[T, T2, T3, T4](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable[T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4]]
  inline def merge[T, T2, T3, T4](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Double
  ): Observable[T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4]]
  inline def merge[T, T2, T3, T4](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4]]
  inline def merge[T, T2, T3, T4](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4]]
  inline def merge[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5]
  ): Observable[T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5]]
  inline def merge[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double
  ): Observable[T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5]]
  inline def merge[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5]]
  inline def merge[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5]]
  inline def merge[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable[T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6]]
  inline def merge[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double
  ): Observable[T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6]]
  inline def merge[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6]]
  inline def merge[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6]]
  
  inline def merge_TR[T, R](observables: (Double | ObservableInput[js.Any] | SchedulerLike)*): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  
  inline def never(): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[Observable[scala.Nothing]]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  @JSImport("rxjs", "observable")
  @js.native
  val observable: String | js.Symbol = js.native
  
  inline def of[T](a: T): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def of[T](a: T, scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def of[T](args: (SchedulerLike | T)*): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(args.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def of[T, T2](a: T, b: T2): Observable[T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2]]
  inline def of[T, T2](a: T, b: T2, scheduler: SchedulerLike): Observable[T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2]]
  inline def of[T, T2, T3](a: T, b: T2, c: T3): Observable[T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3]]
  inline def of[T, T2, T3](a: T, b: T2, c: T3, scheduler: SchedulerLike): Observable[T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3]]
  inline def of[T, T2, T3, T4](a: T, b: T2, c: T3, d: T4): Observable[T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4]]
  inline def of[T, T2, T3, T4](a: T, b: T2, c: T3, d: T4, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4]]
  inline def of[T, T2, T3, T4, T5](a: T, b: T2, c: T3, d: T4, e: T5): Observable[T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5]]
  inline def of[T, T2, T3, T4, T5](a: T, b: T2, c: T3, d: T4, e: T5, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5]]
  inline def of[T, T2, T3, T4, T5, T6](a: T, b: T2, c: T3, d: T4, e: T5, f: T6): Observable[T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6]]
  inline def of[T, T2, T3, T4, T5, T6](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6]]
  inline def of[T, T2, T3, T4, T5, T6, T7](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7): Observable[T | T2 | T3 | T4 | T5 | T6 | T7] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6 | T7]]
  inline def of[T, T2, T3, T4, T5, T6, T7](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4 | T5 | T6 | T7] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6 | T7]]
  inline def of[T, T2, T3, T4, T5, T6, T7, T8](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8): Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8]]
  inline def of[T, T2, T3, T4, T5, T6, T7, T8](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], h.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8]]
  inline def of[T, T2, T3, T4, T5, T6, T7, T8, T9](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8, i: T9): Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], h.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]
  inline def of[T, T2, T3, T4, T5, T6, T7, T8, T9](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8, i: T9, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], h.asInstanceOf[js.Any], i.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]
  
  inline def onErrorResumeNext[R](array: js.Array[ObservableInput[js.Any]]): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(array.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  inline def onErrorResumeNext[R](observables: (ObservableInput[js.Any] | (js.Function1[/* repeated */ js.Any, R]))*): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  inline def onErrorResumeNext[R](v: ObservableInput[R]): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  inline def onErrorResumeNext[T2, T3, R](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def onErrorResumeNext[T2, T3, T4, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def onErrorResumeNext[T2, T3, T4, T5, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def onErrorResumeNext[T2, T3, T4, T5, T6, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  inline def pairs[T](obj: js.Object): Observable[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[String, T]]]
  inline def pairs[T](obj: js.Object, scheduler: SchedulerLike): Observable[js.Tuple2[String, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[String, T]]]
  
  inline def partition[T](source: ObservableInput[T], predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Tuple2[Observable[T], Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Observable[T], Observable[T]]]
  inline def partition[T](
    source: ObservableInput[T],
    predicate: js.Function2[/* value */ T, /* index */ Double, Boolean],
    thisArg: js.Any
  ): js.Tuple2[Observable[T], Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Observable[T], Observable[T]]]
  
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
  
  @JSImport("rxjs", "queue")
  @js.native
  val queue: QueueScheduler = js.native
  
  @JSImport("rxjs", "queueScheduler")
  @js.native
  val queueScheduler: QueueScheduler = js.native
  
  inline def race(arg: js.Array[ObservableInput[js.Any]]): Observable[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Object]]
  inline def race(observables: ObservableInput[js.Any]*): Observable[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Object]]
  inline def race[A](a: ObservableInput[A]): Observable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(a.asInstanceOf[js.Any]).asInstanceOf[Observable[A]]
  inline def race[A, B](arg: js.Tuple2[ObservableInput[A], ObservableInput[B]]): Observable[A | B] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[A | B]]
  inline def race[A, B](a: ObservableInput[A], b: ObservableInput[B]): Observable[A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Observable[A | B]]
  inline def race[A, B, C](arg: js.Tuple3[ObservableInput[A], ObservableInput[B], ObservableInput[C]]): Observable[A | B | C] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[A | B | C]]
  inline def race[A, B, C](a: ObservableInput[A], b: ObservableInput[B], c: ObservableInput[C]): Observable[A | B | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Observable[A | B | C]]
  inline def race[A, B, C, D](arg: js.Tuple4[ObservableInput[A], ObservableInput[B], ObservableInput[C], ObservableInput[D]]): Observable[A | B | C | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[A | B | C | D]]
  inline def race[A, B, C, D](a: ObservableInput[A], b: ObservableInput[B], c: ObservableInput[C], d: ObservableInput[D]): Observable[A | B | C | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Observable[A | B | C | D]]
  inline def race[A, B, C, D, E](
    arg: js.Tuple5[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E]
    ]
  ): Observable[A | B | C | D | E] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[A | B | C | D | E]]
  inline def race[A, B, C, D, E](
    a: ObservableInput[A],
    b: ObservableInput[B],
    c: ObservableInput[C],
    d: ObservableInput[D],
    e: ObservableInput[E]
  ): Observable[A | B | C | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Observable[A | B | C | D | E]]
  
  inline def race_A[A](arg: js.Array[ObservableInput[A]]): Observable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[A]]
  
  inline def race_T[T](arg: js.Array[ObservableInput[T]]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def race_T[T](observables: ObservableInput[T]*): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def range(): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")().asInstanceOf[Observable[Double]]
  inline def range(start: Double): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any]).asInstanceOf[Observable[Double]]
  inline def range(start: Double, count: Double): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def range(start: Double, count: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def range(start: Double, count: Unit, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def range(start: Unit, count: Double): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def range(start: Unit, count: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def range(start: Unit, count: Unit, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  
  inline def scheduled[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduled")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  
  inline def throwError(error: js.Any): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(error.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def throwError(error: js.Any, scheduler: SchedulerLike): Observable[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(error.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[scala.Nothing]]
  
  inline def timer(): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")().asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Double): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any]).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Double, periodOrScheduler: Double): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Double, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Double, periodOrScheduler: Unit, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Double, periodOrScheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Double, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Unit, periodOrScheduler: Double): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Unit, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Unit, periodOrScheduler: Unit, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Unit, periodOrScheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Unit, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Date): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any]).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Date, periodOrScheduler: Double): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Date, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Date, periodOrScheduler: Unit, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Date, periodOrScheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(dueTime: Date, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  
  inline def `using`[T](
    resourceFactory: js.Function0[Unsubscribable | Unit],
    observableFactory: js.Function1[/* resource */ Unsubscribable | Unit, ObservableInput[T] | Unit]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("using")(resourceFactory.asInstanceOf[js.Any], observableFactory.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  inline def zip[R](array: js.Array[ObservableInput[js.Any]]): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(array.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  inline def zip[R](array: js.Array[ObservableInput[js.Any]], resultSelector: js.Function1[/* repeated */ js.Any, R]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(array.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def zip[R](observables: (ObservableInput[js.Any] | (js.Function1[/* repeated */ js.Any, R]))*): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, R](
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
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, R](
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
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */, R](
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
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  inline def zip_O_ObservableInputAny[O /* <: ObservableInput[js.Any] */](array: js.Array[O]): Observable[js.Array[ObservedValueOf[O]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(array.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[ObservedValueOf[O]]]]
  inline def zip_O_ObservableInputAny[O /* <: ObservableInput[js.Any] */](observables: O*): Observable[js.Array[ObservedValueOf[O]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[ObservedValueOf[O]]]]
  
  inline def zip_O_ObservableInputAnyR[O /* <: ObservableInput[js.Any] */, R](array: js.Array[O], resultSelector: js.Function1[/* repeated */ ObservedValueOf[O], R]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(array.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def zip_O_ObservableInputAnyR[O /* <: ObservableInput[js.Any] */, R](observables: (O | (js.Function1[/* repeated */ ObservedValueOf[O], R]))*): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
}
