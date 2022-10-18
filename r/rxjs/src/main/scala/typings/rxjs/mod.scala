package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.anon.Elapsed
import typings.rxjs.anon.FnCall
import typings.rxjs.anon.With
import typings.rxjs.distTypesInternalConfigMod.GlobalConfig
import typings.rxjs.distTypesInternalFirstValueFromMod.FirstValueFromConfig
import typings.rxjs.distTypesInternalLastValueFromMod.LastValueFromConfig
import typings.rxjs.distTypesInternalObservableConnectableMod.ConnectableConfig
import typings.rxjs.distTypesInternalObservableFromEventMod.EventListenerOptions
import typings.rxjs.distTypesInternalObservableFromEventMod.HasEventTargetAddRemove
import typings.rxjs.distTypesInternalObservableFromEventMod.JQueryStyleEventEmitter
import typings.rxjs.distTypesInternalObservableFromEventMod.NodeCompatibleEventEmitter
import typings.rxjs.distTypesInternalObservableFromEventMod.NodeEventHandler
import typings.rxjs.distTypesInternalObservableFromEventMod.NodeStyleEventEmitter
import typings.rxjs.distTypesInternalObservableGenerateMod.ConditionFunc
import typings.rxjs.distTypesInternalObservableGenerateMod.GenerateBaseOptions
import typings.rxjs.distTypesInternalObservableGenerateMod.GenerateOptions
import typings.rxjs.distTypesInternalObservableGenerateMod.IterateFunc
import typings.rxjs.distTypesInternalObservableGenerateMod.ResultFunc
import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalOperatorsConnectMod.ConnectConfig
import typings.rxjs.distTypesInternalOperatorsGroupByMod.BasicGroupByOptions
import typings.rxjs.distTypesInternalOperatorsGroupByMod.GroupByOptionsWithElement
import typings.rxjs.distTypesInternalOperatorsGroupByMod.GroupedObservable
import typings.rxjs.distTypesInternalOperatorsRepeatMod.RepeatConfig
import typings.rxjs.distTypesInternalOperatorsRetryMod.RetryConfig
import typings.rxjs.distTypesInternalOperatorsShareMod.ShareConfig
import typings.rxjs.distTypesInternalOperatorsShareReplayMod.ShareReplayConfig
import typings.rxjs.distTypesInternalOperatorsTapMod.TapObserver
import typings.rxjs.distTypesInternalOperatorsThrottleMod.ThrottleConfig
import typings.rxjs.distTypesInternalOperatorsTimeIntervalMod.TimeInterval_
import typings.rxjs.distTypesInternalOperatorsTimeoutMod.TimeoutConfig
import typings.rxjs.distTypesInternalOperatorsTimeoutMod.TimeoutErrorCtor
import typings.rxjs.distTypesInternalOperatorsTimeoutMod.TimeoutInfo
import typings.rxjs.distTypesInternalSchedulerActionMod.Action
import typings.rxjs.distTypesInternalSchedulerAnimationFrameSchedulerMod.AnimationFrameScheduler
import typings.rxjs.distTypesInternalSchedulerAsapSchedulerMod.AsapScheduler
import typings.rxjs.distTypesInternalSchedulerAsyncActionMod.AsyncAction
import typings.rxjs.distTypesInternalSchedulerAsyncSchedulerMod.AsyncScheduler
import typings.rxjs.distTypesInternalSchedulerQueueSchedulerMod.QueueScheduler
import typings.rxjs.distTypesInternalTypesMod.CompleteNotification
import typings.rxjs.distTypesInternalTypesMod.Connectable
import typings.rxjs.distTypesInternalTypesMod.Cons
import typings.rxjs.distTypesInternalTypesMod.ErrorNotification
import typings.rxjs.distTypesInternalTypesMod.InteropObservable
import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.NextNotification
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservableNotification
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.Observer
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.ReadableStreamLike
import typings.rxjs.distTypesInternalTypesMod.SchedulerAction
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.rxjs.distTypesInternalTypesMod.Timestamp
import typings.rxjs.distTypesInternalTypesMod.TimestampProvider
import typings.rxjs.distTypesInternalTypesMod.TruthyTypesOf
import typings.rxjs.distTypesInternalTypesMod.UnaryFunction
import typings.rxjs.distTypesInternalTypesMod.Unsubscribable
import typings.rxjs.distTypesInternalTypesMod.ValueFromArray
import typings.rxjs.distTypesInternalTypesMod.ValueFromNotification
import typings.rxjs.distTypesInternalUtilArgumentOutOfRangeErrorMod.ArgumentOutOfRangeErrorCtor
import typings.rxjs.distTypesInternalUtilEmptyErrorMod.EmptyErrorCtor
import typings.rxjs.distTypesInternalUtilNotFoundErrorMod.NotFoundErrorCtor
import typings.rxjs.distTypesInternalUtilObjectUnsubscribedErrorMod.ObjectUnsubscribedErrorCtor
import typings.rxjs.distTypesInternalUtilSequenceErrorMod.SequenceErrorCtor
import typings.rxjs.distTypesInternalUtilUnsubscriptionErrorMod.UnsubscriptionErrorCtor
import typings.rxjs.rxjsBooleans.`false`
import typings.rxjs.rxjsBooleans.`true`
import typings.rxjs.rxjsInts.`0`
import typings.rxjs.rxjsStrings.C
import typings.rxjs.rxjsStrings.E
import typings.rxjs.rxjsStrings.N
import typings.rxjs.rxjsStrings.`with`
import typings.std.ArrayLike
import typings.std.AsyncIterable
import typings.std.BooleanConstructor
import typings.std.Error
import typings.std.Exclude
import typings.std.Omit
import typings.std.Partial
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
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
  /**
    * @deprecated Internal implementation detail. Do not construct error instances.
    * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
    */
  open class ArgumentOutOfRangeErrorCls ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs", "AsyncSubject")
  @js.native
  open class AsyncSubject[T] ()
    extends typings.rxjs.distTypesMod.AsyncSubject[T]
  
  @JSImport("rxjs", "BehaviorSubject")
  @js.native
  open class BehaviorSubject[T] protected ()
    extends typings.rxjs.distTypesMod.BehaviorSubject[T] {
    def this(_value: T) = this()
  }
  
  @JSImport("rxjs", "ConnectableObservable")
  @js.native
  open class ConnectableObservable[T] protected ()
    extends typings.rxjs.distTypesMod.ConnectableObservable[T] {
    /**
      * @param source The source observable
      * @param subjectFactory The factory that creates the subject used internally.
      * @deprecated Will be removed in v8. Use {@link connectable} to create a connectable observable.
      * `new ConnectableObservable(source, factory)` is equivalent to
      * `connectable(source, { connector: factory })`.
      * When the `refCount()` method is needed, the {@link share} operator should be used instead:
      * `new ConnectableObservable(source, factory).refCount()` is equivalent to
      * `source.pipe(share({ connector: factory }))`.
      * Details: https://rxjs.dev/deprecations/multicasting
      */
    def this(
      source: Observable[T],
      subjectFactory: js.Function0[typings.rxjs.distTypesInternalSubjectMod.Subject[T]]
    ) = this()
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
  /**
    * @deprecated Internal implementation detail. Do not construct error instances.
    * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
    */
  open class EmptyErrorCls ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs", "NEVER")
  @js.native
  val NEVER_ : Observable[scala.Nothing] = js.native
  
  @JSImport("rxjs", "NotFoundError")
  @js.native
  val NotFoundError: NotFoundErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs", "NotFoundError")
  @js.native
  open class NotFoundErrorCls protected ()
    extends StObject
       with Error {
    /**
      * @deprecated Internal implementation detail. Do not construct error instances.
      * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
      */
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs", "Notification")
  @js.native
  open class Notification[T] protected ()
    extends typings.rxjs.distTypesMod.Notification[T] {
    /**
      * Creates a "completion" notification object.
      * @param kind Always `'C'`
      * @deprecated Internal implementation detail. Use {@link Notification#createComplete createComplete} instead.
      */
    def this(kind: C) = this()
    /**
      * Creates a "Next" notification object.
      * @param kind Always `'N'`
      * @param value The value to notify with if observed.
      * @deprecated Internal implementation detail. Use {@link Notification#createNext createNext} instead.
      */
    def this(kind: N) = this()
    def this(kind: N, value: T) = this()
    /**
      * Creates an "Error" notification object.
      * @param kind Always `'E'`
      * @param value Always `undefined`
      * @param error The error to notify with if observed.
      * @deprecated Internal implementation detail. Use {@link Notification#createError createError} instead.
      */
    def this(kind: E, value: Unit, error: Any) = this()
  }
  /* static members */
  object Notification {
    
    @JSImport("rxjs", "Notification")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs", "Notification.completeNotification")
    @js.native
    def completeNotification: Any = js.native
    inline def completeNotification_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completeNotification")(x.asInstanceOf[js.Any])
    
    /**
      * A shortcut to create a Notification instance of the type `complete`.
      * @return {Notification<any>} The valueless "complete" Notification.
      * @nocollapse
      * @deprecated It is NOT recommended to create instances of `Notification` directly.
      * Rather, try to create POJOs matching the signature outlined in {@link ObservableNotification}.
      * For example: `{ kind: 'N', value: 1 }`, `{ kind: 'E', error: new Error('bad') }`, or `{ kind: 'C' }`.
      * Will be removed in v8.
      */
    inline def createComplete(): typings.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & CompleteNotification = ^.asInstanceOf[js.Dynamic].applyDynamic("createComplete")().asInstanceOf[typings.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & CompleteNotification]
    
    /**
      * A shortcut to create a Notification instance of the type `error` from a
      * given error.
      * @param {any} [err] The `error` error.
      * @return {Notification<T>} The "error" Notification representing the
      * argument.
      * @nocollapse
      * @deprecated It is NOT recommended to create instances of `Notification` directly.
      * Rather, try to create POJOs matching the signature outlined in {@link ObservableNotification}.
      * For example: `{ kind: 'N', value: 1 }`, `{ kind: 'E', error: new Error('bad') }`, or `{ kind: 'C' }`.
      * Will be removed in v8.
      */
    inline def createError(): typings.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & ErrorNotification = ^.asInstanceOf[js.Dynamic].applyDynamic("createError")().asInstanceOf[typings.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & ErrorNotification]
    inline def createError(err: Any): typings.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & ErrorNotification = ^.asInstanceOf[js.Dynamic].applyDynamic("createError")(err.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & ErrorNotification]
    
    /**
      * A shortcut to create a Notification instance of the type `next` from a
      * given value.
      * @param {T} value The `next` value.
      * @return {Notification<T>} The "next" Notification representing the
      * argument.
      * @nocollapse
      * @deprecated It is NOT recommended to create instances of `Notification` directly.
      * Rather, try to create POJOs matching the signature outlined in {@link ObservableNotification}.
      * For example: `{ kind: 'N', value: 1 }`, `{ kind: 'E', error: new Error('bad') }`, or `{ kind: 'C' }`.
      * Will be removed in v8.
      */
    inline def createNext[T](value: T): typings.rxjs.distTypesInternalNotificationMod.Notification[T] & NextNotification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNext")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalNotificationMod.Notification[T] & NextNotification[T]]
  }
  
  @JSImport("rxjs", "NotificationKind")
  @js.native
  object NotificationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.rxjs.distTypesInternalNotificationMod.NotificationKind & String] = js.native
    
    /* "C" */ val COMPLETE: typings.rxjs.distTypesInternalNotificationMod.NotificationKind.COMPLETE & String = js.native
    
    /* "E" */ val ERROR: typings.rxjs.distTypesInternalNotificationMod.NotificationKind.ERROR & String = js.native
    
    /* "N" */ val NEXT: typings.rxjs.distTypesInternalNotificationMod.NotificationKind.NEXT & String = js.native
  }
  
  @JSImport("rxjs", "ObjectUnsubscribedError")
  @js.native
  val ObjectUnsubscribedError: ObjectUnsubscribedErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs", "ObjectUnsubscribedError")
  @js.native
  /**
    * @deprecated Internal implementation detail. Do not construct error instances.
    * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
    */
  open class ObjectUnsubscribedErrorCls ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
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
  open class Observable_[T] ()
    extends typings.rxjs.distTypesMod.Observable_[T] {
    def this(subscribe: js.ThisFunction1[
            /* this */ Observable[T], 
            /* subscriber */ typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T], 
            TeardownLogic
          ]) = this()
  }
  /* static members */
  object Observable_ {
    
    @JSImport("rxjs", "Observable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Observable by calling the Observable constructor
      * @owner Observable
      * @method create
      * @param {Function} subscribe? the subscriber function to be passed to the Observable constructor
      * @return {Observable} a new observable
      * @nocollapse
      * @deprecated Use `new Observable()` instead. Will be removed in v8.
      */
    inline def create(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  }
  
  @JSImport("rxjs", "ReplaySubject")
  @js.native
  /**
    * @param bufferSize The size of the buffer to replay on subscription
    * @param windowTime The amount of time the buffered items will say buffered
    * @param timestampProvider An object with a `now()` method that provides the current timestamp. This is used to
    * calculate the amount of time something has been buffered.
    */
  open class ReplaySubject[T] ()
    extends typings.rxjs.distTypesMod.ReplaySubject[T] {
    def this(_bufferSize: Double) = this()
    def this(_bufferSize: Double, _windowTime: Double) = this()
    def this(_bufferSize: Unit, _windowTime: Double) = this()
    def this(_bufferSize: Double, _windowTime: Double, _timestampProvider: TimestampProvider) = this()
    def this(_bufferSize: Double, _windowTime: Unit, _timestampProvider: TimestampProvider) = this()
    def this(_bufferSize: Unit, _windowTime: Double, _timestampProvider: TimestampProvider) = this()
    def this(_bufferSize: Unit, _windowTime: Unit, _timestampProvider: TimestampProvider) = this()
  }
  
  @JSImport("rxjs", "Scheduler")
  @js.native
  open class Scheduler protected ()
    extends typings.rxjs.distTypesMod.Scheduler {
    def this(schedulerActionCtor: Instantiable2[
            /* scheduler */ typings.rxjs.distTypesInternalSchedulerMod.Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              Unit
            ], 
            Action[js.Object]
          ]) = this()
    def this(
      schedulerActionCtor: Instantiable2[
            /* scheduler */ typings.rxjs.distTypesInternalSchedulerMod.Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
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
    
    inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  }
  
  @JSImport("rxjs", "SequenceError")
  @js.native
  val SequenceError: SequenceErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs", "SequenceError")
  @js.native
  open class SequenceErrorCls protected ()
    extends StObject
       with Error {
    /**
      * @deprecated Internal implementation detail. Do not construct error instances.
      * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
      */
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs", "Subject")
  @js.native
  open class Subject[T] ()
    extends typings.rxjs.distTypesMod.Subject[T]
  /* static members */
  object Subject {
    
    @JSImport("rxjs", "Subject")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a "subject" by basically gluing an observer to an observable.
      *
      * @nocollapse
      * @deprecated Recommended you do not use. Will be removed at some point in the future. Plans for replacement still under discussion.
      */
    inline def create(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  }
  
  @JSImport("rxjs", "Subscriber")
  @js.native
  /**
    * @deprecated Internal implementation detail, do not use directly. Will be made internal in v8.
    * There is no reason to directly create an instance of Subscriber. This type is exported for typings reasons.
    */
  open class Subscriber[T] ()
    extends typings.rxjs.distTypesMod.Subscriber[T] {
    def this(destination: typings.rxjs.distTypesInternalSubscriberMod.Subscriber[Any]) = this()
    def this(destination: Observer[Any]) = this()
  }
  /* static members */
  object Subscriber {
    
    @JSImport("rxjs", "Subscriber")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A static factory for a Subscriber, given a (potentially partial) definition
      * of an Observer.
      * @param next The `next` callback of an Observer.
      * @param error The `error` callback of an
      * Observer.
      * @param complete The `complete` callback of an
      * Observer.
      * @return A Subscriber wrapping the (partially defined)
      * Observer represented by the given arguments.
      * @nocollapse
      * @deprecated Do not use. Will be removed in v8. There is no replacement for this
      * method, and there is no reason to be creating instances of `Subscriber` directly.
      * If you have a specific use case, please file an issue.
      */
    inline def create[T](): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
    inline def create[T](next: js.Function1[/* x */ js.UndefOr[T], Unit]): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
    inline def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[Any], Unit]
    ): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
    inline def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[Any], Unit],
      complete: js.Function0[Unit]
    ): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
    inline def create[T](next: js.Function1[/* x */ js.UndefOr[T], Unit], error: Unit, complete: js.Function0[Unit]): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
    inline def create[T](next: Unit, error: js.Function1[/* e */ js.UndefOr[Any], Unit]): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
    inline def create[T](next: Unit, error: js.Function1[/* e */ js.UndefOr[Any], Unit], complete: js.Function0[Unit]): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
    inline def create[T](next: Unit, error: Unit, complete: js.Function0[Unit]): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
  }
  
  @JSImport("rxjs", "Subscription")
  @js.native
  /**
    * @param initialTeardown A function executed first as part of the finalization
    * process that is kicked off when {@link #unsubscribe} is called.
    */
  open class Subscription ()
    extends typings.rxjs.distTypesMod.Subscription {
    def this(initialTeardown: js.Function0[Unit]) = this()
  }
  /* static members */
  object Subscription {
    
    @JSImport("rxjs", "Subscription")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("rxjs", "Subscription.EMPTY")
    @js.native
    def EMPTY: typings.rxjs.distTypesInternalSubscriptionMod.Subscription = js.native
    inline def EMPTY_=(x: typings.rxjs.distTypesInternalSubscriptionMod.Subscription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs", "TimeoutError")
  @js.native
  val TimeoutError: TimeoutErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs", "TimeoutError")
  @js.native
  /**
    * @deprecated Internal implementation detail. Do not construct error instances.
    * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
    */
  open class TimeoutErrorCls[T, M] ()
    extends StObject
       with typings.rxjs.distTypesInternalOperatorsTimeoutMod.TimeoutError[T, M] {
    def this(info: TimeoutInfo[T, M]) = this()
    
    /**
      * The information provided to the error by the timeout
      * operation that created the error. Will be `null` if
      * used directly in non-RxJS code with an empty constructor.
      * (Note that using this constructor directly is not recommended,
      * you should create your own errors)
      */
    /* CompleteClass */
    var info: (TimeoutInfo[T, M]) | Null = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs", "UnsubscriptionError")
  @js.native
  val UnsubscriptionError: UnsubscriptionErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs", "UnsubscriptionError")
  @js.native
  open class UnsubscriptionErrorCls protected ()
    extends StObject
       with typings.rxjs.distTypesInternalUtilUnsubscriptionErrorMod.UnsubscriptionError {
    /**
      * @deprecated Internal implementation detail. Do not construct error instances.
      * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
      */
    def this(errors: js.Array[Any]) = this()
    
    /* CompleteClass */
    override val errors: js.Array[Any] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("rxjs", "VirtualAction")
  @js.native
  open class VirtualAction[T] protected ()
    extends typings.rxjs.distTypesMod.VirtualAction[T] {
    def this(
      scheduler: typings.rxjs.distTypesInternalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    def this(
      scheduler: typings.rxjs.distTypesInternalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
      index: Double
    ) = this()
  }
  /* static members */
  object VirtualAction {
    
    @JSImport("rxjs", "VirtualAction")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs", "VirtualAction.sortActions")
    @js.native
    def sortActions: Any = js.native
    inline def sortActions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sortActions")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs", "VirtualTimeScheduler")
  @js.native
  /**
    * This creates an instance of a `VirtualTimeScheduler`. Experts only. The signature of
    * this constructor is likely to change in the long run.
    *
    * @param schedulerActionCtor The type of Action to initialize when initializing actions during scheduling.
    * @param maxFrames The maximum number of frames to process before stopping. Used to prevent endless flush cycles.
    */
  open class VirtualTimeScheduler ()
    extends typings.rxjs.distTypesMod.VirtualTimeScheduler {
    def this(schedulerActionCtor: Instantiable2[
            /* scheduler */ AsyncScheduler, 
            /* work */ js.ThisFunction1[
              /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              Unit
            ], 
            AsyncAction[js.Object]
          ]) = this()
    def this(
      schedulerActionCtor: Instantiable2[
            /* scheduler */ AsyncScheduler, 
            /* work */ js.ThisFunction1[
              /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              Unit
            ], 
            AsyncAction[js.Object]
          ],
      maxFrames: Double
    ) = this()
    def this(schedulerActionCtor: Unit, maxFrames: Double) = this()
  }
  /* static members */
  object VirtualTimeScheduler {
    
    @JSImport("rxjs", "VirtualTimeScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    /** @deprecated Not used in VirtualTimeScheduler directly. Will be removed in v8. */
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
  
  inline def animationFrames(): Observable[Elapsed] = ^.asInstanceOf[js.Dynamic].applyDynamic("animationFrames")().asInstanceOf[Observable[Elapsed]]
  inline def animationFrames(timestampProvider: TimestampProvider): Observable[Elapsed] = ^.asInstanceOf[js.Dynamic].applyDynamic("animationFrames")(timestampProvider.asInstanceOf[js.Any]).asInstanceOf[Observable[Elapsed]]
  
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
  
  inline def audit[T](durationSelector: js.Function1[/* value */ T, ObservableInput[Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("audit")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def auditTime[T](duration: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("auditTime")(duration.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def auditTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("auditTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def bindCallback(
    callbackFunc: js.Function1[/* repeated */ Any, Unit],
    resultSelector: js.Function1[/* repeated */ Any, Any]
  ): js.Function1[/* repeated */ Any, Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable[Any]]]
  inline def bindCallback(
    callbackFunc: js.Function1[/* repeated */ Any, Unit],
    resultSelector: js.Function1[/* repeated */ Any, Any],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ Any, Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable[Any]]]
  inline def bindCallback[A /* <: js.Array[Any] */, R /* <: js.Array[Any] */](
    callbackFunc: js.Function1[
      /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
      Unit
    ]
  ): js.Function1[
    /* arg */ A, 
    Observable[
      /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* arg */ A, 
    Observable[
      /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
    ]
  ]]
  inline def bindCallback[A /* <: js.Array[Any] */, R /* <: js.Array[Any] */](
    callbackFunc: js.Function1[
      /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
      Unit
    ],
    schedulerLike: SchedulerLike
  ): js.Function1[
    /* arg */ A, 
    Observable[
      /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], schedulerLike.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* arg */ A, 
    Observable[
      /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
    ]
  ]]
  
  inline def bindNodeCallback(
    callbackFunc: js.Function1[/* repeated */ Any, Unit],
    resultSelector: js.Function1[/* repeated */ Any, Any]
  ): js.Function1[/* repeated */ Any, Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable[Any]]]
  inline def bindNodeCallback(
    callbackFunc: js.Function1[/* repeated */ Any, Unit],
    resultSelector: js.Function1[/* repeated */ Any, Any],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ Any, Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable[Any]]]
  inline def bindNodeCallback[A /* <: js.Array[Any] */, R /* <: js.Array[Any] */](
    callbackFunc: js.Function1[
      /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
      Unit
    ]
  ): js.Function1[
    /* arg */ A, 
    Observable[
      /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* arg */ A, 
    Observable[
      /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
    ]
  ]]
  inline def bindNodeCallback[A /* <: js.Array[Any] */, R /* <: js.Array[Any] */](
    callbackFunc: js.Function1[
      /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
      Unit
    ],
    schedulerLike: SchedulerLike
  ): js.Function1[
    /* arg */ A, 
    Observable[
      /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], schedulerLike.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* arg */ A, 
    Observable[
      /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
    ]
  ]]
  
  inline def buffer[T](closingNotifier: Observable[Any]): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(closingNotifier.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  
  inline def bufferCount[T](bufferSize: Double): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferCount")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  inline def bufferCount[T](bufferSize: Double, startBufferEvery: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferCount")(bufferSize.asInstanceOf[js.Any], startBufferEvery.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  
  inline def bufferTime[T](bufferTimeSpan: Double): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  inline def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Double,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  inline def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Null,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Unit, maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  inline def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Unit,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Unit, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  
  inline def bufferToggle[T, O](openings: ObservableInput[O], closingSelector: js.Function1[/* value */ O, ObservableInput[Any]]): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToggle")(openings.asInstanceOf[js.Any], closingSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  
  inline def bufferWhen[T](closingSelector: js.Function0[ObservableInput[Any]]): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferWhen")(closingSelector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  
  inline def catchError[T, O /* <: ObservableInput[Any] */](selector: js.Function2[/* err */ Any, /* caught */ Observable[T], O]): OperatorFunction[T, T | ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("catchError")(selector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | ObservedValueOf[O]]]
  
  inline def combineAll[T](): OperatorFunction[Any, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")().asInstanceOf[OperatorFunction[Any, js.Array[T]]]
  inline def combineAll[R](project: js.Function1[/* repeated */ Any, R]): OperatorFunction[Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, R]]
  
  inline def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[ObservableInput[T], R]]
  
  inline def combineLatest(
    sourcesObject: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any ]: never} */ js.Any
  ): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sourcesObject.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def combineLatest(sources: js.Array[Any]): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def combineLatest[T /* <: Record[String, ObservableInput[Any]] */](sourcesObject: T): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservedValueOf<T[K]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sourcesObject.asInstanceOf[js.Any]).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservedValueOf<T[K]>} */ js.Any
  ]]
  inline def combineLatest[A /* <: js.Array[Any] */](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ],
    scheduler: SchedulerLike
  ): Observable[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[A]]
  inline def combineLatest[A /* <: js.Array[Any] */, R](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ],
    resultSelector: js.Function1[/* values */ A, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[A /* <: js.Array[Any] */, R](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ],
    resultSelector: js.Function1[/* values */ A, R],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  inline def combineLatestAll[T](): OperatorFunction[Any, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatestAll")().asInstanceOf[OperatorFunction[Any, js.Array[T]]]
  inline def combineLatestAll[R](project: js.Function1[/* repeated */ Any, R]): OperatorFunction[Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatestAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, R]]
  
  inline def combineLatestAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatestAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[ObservableInput[T], R]]
  
  inline def combineLatestWith[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param otherSources because its type [...ObservableInputTuple<A>] is not an array type */ otherSources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): OperatorFunction[T, Cons[T, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatestWith")(otherSources.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Cons[T, A]]]
  
  inline def combineLatest_A[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sourcesAndScheduler because its type [...ObservableInputTuple<A>, SchedulerLike] is not an array type */ sourcesAndScheduler: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): Observable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sourcesAndScheduler.asInstanceOf[js.Any]).asInstanceOf[Observable[A]]
  
  inline def combineLatest_AR[A /* <: js.Array[Any] */, R](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sourcesAndResultSelector because its type [...ObservableInputTuple<A>, (values : A): R] is not an array type */ sourcesAndResultSelector: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sourcesAndResultSelector.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  
  inline def concat[T /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param inputsAndScheduler because its type [...ObservableInputTuple<T>, SchedulerLike] is not an array type */ inputsAndScheduler: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<T[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<T[K]>} */ js.Any
    ]
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(inputsAndScheduler.asInstanceOf[js.Any]).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ]]
  
  inline def concatAll[O /* <: ObservableInput[Any] */](): OperatorFunction[O, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")().asInstanceOf[OperatorFunction[O, ObservedValueOf[O]]]
  
  inline def concatMap[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def concatMap[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], resultSelector: Unit): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def concatMap[T, R, O /* <: ObservableInput[Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  inline def concatMapTo(observable: js.Iterable[Any]): OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]]]
  inline def concatMapTo(observable: js.Iterable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]]]
  inline def concatMapTo(observable: Observable[Any]): OperatorFunction[Any, ObservedValueOf[Observable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[Observable[Any]]]]
  inline def concatMapTo(observable: Observable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[Observable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[Observable[Any]]]]
  inline def concatMapTo(observable: InteropObservable[Any]): OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]]]
  inline def concatMapTo(observable: InteropObservable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]]]
  inline def concatMapTo(observable: ReadableStreamLike[Any]): OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]]]
  inline def concatMapTo(observable: ReadableStreamLike[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]]]
  inline def concatMapTo(observable: ArrayLike[Any]): OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]]]
  inline def concatMapTo(observable: ArrayLike[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]]]
  inline def concatMapTo(observable: AsyncIterable[Any]): OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]]]
  inline def concatMapTo(observable: AsyncIterable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]]]
  inline def concatMapTo(observable: PromiseLike[Any]): OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]]]
  inline def concatMapTo(observable: PromiseLike[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]]]
  inline def concatMapTo[T, R](
    observable: js.Iterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[js.Iterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def concatMapTo[T, R](
    observable: Observable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[Observable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def concatMapTo[T, R](
    observable: InteropObservable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[InteropObservable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def concatMapTo[T, R](
    observable: ReadableStreamLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ReadableStreamLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def concatMapTo[T, R](
    observable: ArrayLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ArrayLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def concatMapTo[T, R](
    observable: AsyncIterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[AsyncIterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def concatMapTo[T, R](
    observable: PromiseLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[PromiseLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  inline def concatWith[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param otherSources because its type [...ObservableInputTuple<A>] is not an array type */ otherSources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): OperatorFunction[
    T, 
    T | (/* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any)
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatWith")(otherSources.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    T | (/* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any)
  ]]
  
  @JSImport("rxjs", "config")
  @js.native
  val config: GlobalConfig = js.native
  
  inline def connect[T, O /* <: ObservableInput[Any] */](selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(selector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def connect[T, O /* <: ObservableInput[Any] */](selector: js.Function1[/* shared */ Observable[T], O], config: ConnectConfig[T]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(selector.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  
  inline def connectable[T](source: ObservableInput[T]): Connectable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectable")(source.asInstanceOf[js.Any]).asInstanceOf[Connectable[T]]
  inline def connectable[T](source: ObservableInput[T], config: ConnectableConfig[T]): Connectable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("connectable")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Connectable[T]]
  
  inline def count[T](): OperatorFunction[T, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[OperatorFunction[T, Double]]
  inline def count[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): OperatorFunction[T, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Double]]
  
  inline def debounce[T](durationSelector: js.Function1[/* value */ T, ObservableInput[Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def debounceTime[T](dueTime: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounceTime")(dueTime.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def debounceTime[T](dueTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounceTime")(dueTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def defaultIfEmpty[T, R](defaultValue: R): OperatorFunction[T, T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | R]]
  
  inline def defer[R /* <: ObservableInput[Any] */](observableFactory: js.Function0[R]): Observable[ObservedValueOf[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(observableFactory.asInstanceOf[js.Any]).asInstanceOf[Observable[ObservedValueOf[R]]]
  
  inline def delay[T](due: js.Date): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(due.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def delay[T](due: js.Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def delay[T](due: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(due.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def delay[T](due: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def delayWhen[T](delayDurationSelector: js.Function2[/* value */ T, /* index */ Double, Observable[Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delayWhen")(delayDurationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def delayWhen[T](
    delayDurationSelector: js.Function2[/* value */ T, /* index */ Double, Observable[Any]],
    subscriptionDelay: Observable[Any]
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delayWhen")(delayDurationSelector.asInstanceOf[js.Any], subscriptionDelay.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def dematerialize[N /* <: ObservableNotification[Any] */](): OperatorFunction[N, ValueFromNotification[N]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dematerialize")().asInstanceOf[OperatorFunction[N, ValueFromNotification[N]]]
  
  inline def distinct[T, K](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def distinct[T, K](keySelector: js.Function1[/* value */ T, K], flushes: Observable[Any]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any], flushes.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def distinct[T, K](keySelector: Unit, flushes: Observable[Any]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any], flushes.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def distinctUntilChanged[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def distinctUntilChanged[T](comparator: js.Function2[/* previous */ T, /* current */ T, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")(comparator.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def distinctUntilChanged[T, K](
    comparator: js.Function2[/* previous */ K, /* current */ K, Boolean],
    keySelector: js.Function1[/* value */ T, K]
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")(comparator.asInstanceOf[js.Any], keySelector.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def distinctUntilKeyChanged[T](key: /* keyof T */ String): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilKeyChanged")(key.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def distinctUntilKeyChanged[T, K /* <: /* keyof T */ String */](
    key: K,
    compare: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* x */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* y */ js.Any, 
      Boolean
    ]
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilKeyChanged")(key.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def elementAt[T, D](index: Double): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementAt")(index.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | D]]
  inline def elementAt[T, D](index: Double, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("elementAt")(index.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  
  inline def empty(): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Observable[scala.Nothing]]
  inline def empty(scheduler: SchedulerLike): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  
  inline def endWith[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def endWith[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): OperatorFunction[T, T | ValueFromArray[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(values.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | ValueFromArray[A]]]
  inline def endWith[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param valuesAndScheduler because its type [...A, SchedulerLike] is not an array type */ valuesAndScheduler: /* import warning: importer.ImportType#apply c repeated non-array type: A */ js.Array[A]
  ): OperatorFunction[T, T | ValueFromArray[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(valuesAndScheduler.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | ValueFromArray[A]]]
  
  inline def every[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Boolean]]
  inline def every[T](predicate: BooleanConstructor): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<T, rxjs.rxjs/dist/types/internal/types.Falsy> extends never ? false : boolean */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<T, rxjs.rxjs/dist/types/internal/types.Falsy> extends never ? false : boolean */ js.Any
  ]]
  inline def every[T](predicate: BooleanConstructor, thisArg: Any): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<T, rxjs.rxjs/dist/types/internal/types.Falsy> extends never ? false : boolean */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<T, rxjs.rxjs/dist/types/internal/types.Falsy> extends never ? false : boolean */ js.Any
  ]]
  inline def every[T, A](
    predicate: js.ThisFunction3[/* this */ A, /* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: A
  ): OperatorFunction[T, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Boolean]]
  
  inline def exhaust[O /* <: ObservableInput[Any] */](): OperatorFunction[O, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaust")().asInstanceOf[OperatorFunction[O, ObservedValueOf[O]]]
  
  inline def exhaustAll[O /* <: ObservableInput[Any] */](): OperatorFunction[O, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaustAll")().asInstanceOf[OperatorFunction[O, ObservedValueOf[O]]]
  
  inline def exhaustMap[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaustMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def exhaustMap[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], resultSelector: Unit): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exhaustMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def exhaustMap[T, I, R](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[I]],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ I, 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("exhaustMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  inline def expand[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def expand[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], concurrent: Double): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def expand[T, O /* <: ObservableInput[Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def expand[T, O /* <: ObservableInput[Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  
  inline def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def filter[T](predicate: BooleanConstructor): OperatorFunction[T, TruthyTypesOf[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TruthyTypesOf[T]]]
  inline def filter[T, A](predicate: js.ThisFunction2[/* this */ A, /* value */ T, /* index */ Double, Boolean], thisArg: A): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def filter_TSA_OperatorFunction[T, S /* <: T */, A](
    predicate: js.ThisFunction2[/* this */ A, /* value */ T, /* index */ Double, /* is S */ Boolean],
    thisArg: A
  ): OperatorFunction[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S]]
  
  inline def filter_TS_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): OperatorFunction[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, S]]
  
  inline def finalize_[T](callback: js.Function0[Unit]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("finalize")(callback.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def find[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.UndefOr[T]]]
  inline def find[T](predicate: BooleanConstructor): OperatorFunction[T, TruthyTypesOf[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TruthyTypesOf[T]]]
  inline def find[T, A](
    predicate: js.ThisFunction3[/* this */ A, /* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: A
  ): OperatorFunction[T, js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.UndefOr[T]]]
  
  inline def findIndex[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Double]]
  inline def findIndex[T](predicate: BooleanConstructor): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends rxjs.rxjs/dist/types/internal/types.Falsy ? -1 : number */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends rxjs.rxjs/dist/types/internal/types.Falsy ? -1 : number */ js.Any
  ]]
  inline def findIndex[T](predicate: BooleanConstructor, thisArg: Any): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends rxjs.rxjs/dist/types/internal/types.Falsy ? -1 : number */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends rxjs.rxjs/dist/types/internal/types.Falsy ? -1 : number */ js.Any
  ]]
  inline def findIndex[T, A](
    predicate: js.ThisFunction3[/* this */ A, /* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: A
  ): OperatorFunction[T, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Double]]
  
  inline def find_TS[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): OperatorFunction[T, js.UndefOr[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.UndefOr[S]]]
  
  inline def find_TSA[T, S /* <: T */, A](
    predicate: js.ThisFunction3[
      /* this */ A, 
      /* value */ T, 
      /* index */ Double, 
      /* source */ Observable[T], 
      /* is S */ Boolean
    ],
    thisArg: A
  ): OperatorFunction[T, js.UndefOr[S]] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.UndefOr[S]]]
  
  inline def first[T](predicate: BooleanConstructor): OperatorFunction[T, TruthyTypesOf[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TruthyTypesOf[T]]]
  inline def first[T, D](): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[OperatorFunction[T, T | D]]
  inline def first[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): OperatorFunction[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, S]]
  inline def first[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean],
    defaultValue: S
  ): OperatorFunction[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S]]
  inline def first[T, D](predicate: Null, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  inline def first[T, D](predicate: Unit, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  inline def first[T, D](predicate: BooleanConstructor, defaultValue: D): OperatorFunction[T, TruthyTypesOf[T] | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, TruthyTypesOf[T] | D]]
  
  inline def firstValueFrom[T](source: Observable[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("firstValueFrom")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def firstValueFrom[T, D](source: Observable[T], config: FirstValueFromConfig[D]): js.Promise[T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("firstValueFrom")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | D]]
  
  inline def first_TD[T, D](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | D]]
  inline def first_TD[T, D](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    defaultValue: D
  ): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  
  inline def first_TSD[T, S /* <: T */, D](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean],
    defaultValue: D
  ): OperatorFunction[T, S | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S | D]]
  
  inline def flatMap[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def flatMap[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], concurrent: Double): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def flatMap[T, O /* <: ObservableInput[Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: Unit,
    concurrent: Double
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def flatMap[T, R, O /* <: ObservableInput[Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def flatMap[T, R, O /* <: ObservableInput[Any] */](
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
  
  inline def forkJoin(): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")().asInstanceOf[Observable[scala.Nothing]]
  inline def forkJoin(
    sourcesObject: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any ]: never} */ js.Any
  ): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sourcesObject.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def forkJoin(sources: js.Array[Any]): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def forkJoin[T /* <: Record[String, ObservableInput[Any]] */](sourcesObject: T): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservedValueOf<T[K]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sourcesObject.asInstanceOf[js.Any]).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservedValueOf<T[K]>} */ js.Any
  ]]
  inline def forkJoin[A /* <: js.Array[Any] */, R](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ],
    resultSelector: js.Function1[/* values */ A, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  inline def forkJoin_A[A /* <: js.Array[Any] */](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): Observable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[A]]
  
  inline def forkJoin_AR[A /* <: js.Array[Any] */, R](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sourcesAndResultSelector because its type [...ObservableInputTuple<A>, (values : A): R] is not an array type */ sourcesAndResultSelector: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sourcesAndResultSelector.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  
  inline def from[O /* <: ObservableInput[Any] */](input: O): Observable[ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any]).asInstanceOf[Observable[ObservedValueOf[O]]]
  inline def from[O /* <: ObservableInput[Any] */](input: O, scheduler: SchedulerLike): Observable[ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[O]]]
  
  inline def fromEvent(target: NodeCompatibleEventEmitter, eventName: String): Observable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[Any]]
  inline def fromEvent(target: NodeStyleEventEmitter, eventName: String): Observable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[Any]]
  inline def fromEvent(target: ArrayLike[NodeCompatibleEventEmitter | NodeStyleEventEmitter], eventName: String): Observable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[Any]]
  inline def fromEvent[T](target: HasEventTargetAddRemove[T], eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent[T](target: HasEventTargetAddRemove[T], eventName: String, options: EventListenerOptions): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent[T](target: JQueryStyleEventEmitter[Any, T], eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent[R](
    target: NodeCompatibleEventEmitter,
    eventName: String,
    resultSelector: js.Function1[/* repeated */ Any, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[R](
    target: NodeStyleEventEmitter,
    eventName: String,
    resultSelector: js.Function1[/* repeated */ Any, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T](target: ArrayLike[HasEventTargetAddRemove[T]], eventName: String, options: EventListenerOptions): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent[R](
    target: ArrayLike[NodeCompatibleEventEmitter | NodeStyleEventEmitter],
    eventName: String,
    resultSelector: js.Function1[/* repeated */ Any, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T, R](
    target: HasEventTargetAddRemove[T],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* event */ T, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T, R](
    target: HasEventTargetAddRemove[T],
    eventName: String,
    resultSelector: js.Function1[/* event */ T, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T, R](
    target: JQueryStyleEventEmitter[Any, T],
    eventName: String,
    resultSelector: js.Function2[/* value */ T, /* repeated */ Any, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T, R](
    target: ArrayLike[HasEventTargetAddRemove[T]],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* event */ T, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T, R](
    target: ArrayLike[JQueryStyleEventEmitter[Any, T]],
    eventName: String,
    resultSelector: js.Function2[/* value */ T, /* repeated */ Any, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  inline def fromEventPattern[T](addHandler: js.Function1[/* handler */ NodeEventHandler, Any]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, Any],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, js.UndefOr[Any], Unit]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, Any],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, /* signal */ js.UndefOr[Any], Unit],
    resultSelector: js.Function1[/* repeated */ Any, T]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, Any],
    removeHandler: Unit,
    resultSelector: js.Function1[/* repeated */ Any, T]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  inline def fromEvent_T[T](target: NodeCompatibleEventEmitter, eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent_T[T](target: NodeStyleEventEmitter, eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent_T[T](
    target: ArrayLike[
      HasEventTargetAddRemove[T] | (JQueryStyleEventEmitter[Any, T]) | NodeCompatibleEventEmitter | NodeStyleEventEmitter
    ],
    eventName: String
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  inline def fromEvent_TR[T, R](
    target: ArrayLike[HasEventTargetAddRemove[T]],
    eventName: String,
    resultSelector: js.Function1[/* event */ T, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
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
  
  inline def groupBy[T, K](key: js.Function1[/* value */ T, (/* is K */ Boolean) | K]): OperatorFunction[T, GroupedObservable[K, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, GroupedObservable[K, T]]]
  inline def groupBy[T, K](
    key: js.Function1[/* value */ T, K],
    element: Unit,
    duration: js.Function1[/* grouped */ GroupedObservable[K, T], Observable[Any]]
  ): OperatorFunction[T, GroupedObservable[K, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, T]]]
  inline def groupBy[T, K](key: js.Function1[/* value */ T, K], options: BasicGroupByOptions[K, T]): OperatorFunction[T, GroupedObservable[K, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, T]]]
  inline def groupBy[T, K, R](key: js.Function1[/* value */ T, K], element: js.Function1[/* value */ T, R]): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: js.Function1[/* value */ T, R],
    duration: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[Any]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: js.Function1[/* value */ T, R],
    duration: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[Any]],
    connector: js.Function0[typings.rxjs.distTypesInternalSubjectMod.Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: js.Function1[/* value */ T, R],
    duration: Unit,
    connector: js.Function0[typings.rxjs.distTypesInternalSubjectMod.Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: Unit,
    duration: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[Any]],
    connector: js.Function0[typings.rxjs.distTypesInternalSubjectMod.Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: Unit,
    duration: Unit,
    connector: js.Function0[typings.rxjs.distTypesInternalSubjectMod.Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, E](key: js.Function1[/* value */ T, K], options: GroupByOptionsWithElement[K, E, T]): OperatorFunction[T, GroupedObservable[K, E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, E]]]
  
  inline def groupBy_TKR[T, K, R](key: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy_TKR[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: Unit,
    duration: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[Any]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  
  inline def identity[T](x: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def ignoreElements(): OperatorFunction[Any, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("ignoreElements")().asInstanceOf[OperatorFunction[Any, scala.Nothing]]
  
  inline def iif[T, F](condition: js.Function0[Boolean], trueResult: ObservableInput[T], falseResult: ObservableInput[F]): Observable[T | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("iif")(condition.asInstanceOf[js.Any], trueResult.asInstanceOf[js.Any], falseResult.asInstanceOf[js.Any])).asInstanceOf[Observable[T | F]]
  
  inline def interval(): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")().asInstanceOf[Observable[Double]]
  inline def interval(period: Double): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")(period.asInstanceOf[js.Any]).asInstanceOf[Observable[Double]]
  inline def interval(period: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def interval(period: Unit, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  
  inline def isEmpty[T](): OperatorFunction[T, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")().asInstanceOf[OperatorFunction[T, Boolean]]
  
  inline def isObservable(obj: Any): /* is rxjs.rxjs/dist/types/internal/Observable.Observable<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.rxjs/dist/types/internal/Observable.Observable<unknown> */ Boolean]
  
  inline def last[T](predicate: BooleanConstructor): OperatorFunction[T, TruthyTypesOf[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TruthyTypesOf[T]]]
  inline def last[T, D](): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[OperatorFunction[T, T | D]]
  inline def last[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): OperatorFunction[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, S]]
  inline def last[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean],
    defaultValue: S
  ): OperatorFunction[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S]]
  inline def last[T, D](predicate: Null, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  inline def last[T, D](predicate: Unit, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  inline def last[T, D](predicate: BooleanConstructor, defaultValue: D): OperatorFunction[T, TruthyTypesOf[T] | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, TruthyTypesOf[T] | D]]
  
  inline def lastValueFrom[T](source: Observable[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastValueFrom")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def lastValueFrom[T, D](source: Observable[T], config: LastValueFromConfig[D]): js.Promise[T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("lastValueFrom")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | D]]
  
  inline def last_TD[T, D](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | D]]
  inline def last_TD[T, D](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    defaultValue: D
  ): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  
  inline def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  inline def map[T, R, A](project: js.ThisFunction2[/* this */ A, /* value */ T, /* index */ Double, R], thisArg: A): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(project.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  inline def mapTo[R](value: R): OperatorFunction[Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapTo")(value.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, R]]
  
  inline def mapTo_TR[T, R](value: R): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapTo")(value.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  
  inline def materialize[T](): OperatorFunction[
    T, 
    typings.rxjs.distTypesInternalNotificationMod.Notification[T] & ObservableNotification[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("materialize")().asInstanceOf[OperatorFunction[
    T, 
    typings.rxjs.distTypesInternalNotificationMod.Notification[T] & ObservableNotification[T]
  ]]
  
  inline def max[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def max[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(comparer.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def merge[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sourcesAndConcurrencyAndScheduler because its type [...ObservableInputTuple<A>, number | undefined, SchedulerLike | undefined] is not an array type */ sourcesAndConcurrencyAndScheduler: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(sourcesAndConcurrencyAndScheduler.asInstanceOf[js.Any]).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ]]
  
  inline def mergeAll[O /* <: ObservableInput[Any] */](): OperatorFunction[O, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")().asInstanceOf[OperatorFunction[O, ObservedValueOf[O]]]
  inline def mergeAll[O /* <: ObservableInput[Any] */](concurrent: Double): OperatorFunction[O, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(concurrent.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[O, ObservedValueOf[O]]]
  
  inline def mergeMap[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def mergeMap[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], concurrent: Double): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def mergeMap[T, O /* <: ObservableInput[Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: Unit,
    concurrent: Double
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def mergeMap[T, R, O /* <: ObservableInput[Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMap[T, R, O /* <: ObservableInput[Any] */](
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
  
  inline def mergeMapTo(innerObservable: js.Iterable[Any]): OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]]]
  inline def mergeMapTo(innerObservable: js.Iterable[Any], concurrent: Double): OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]]]
  inline def mergeMapTo(innerObservable: Observable[Any]): OperatorFunction[Any, ObservedValueOf[Observable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[Observable[Any]]]]
  inline def mergeMapTo(innerObservable: Observable[Any], concurrent: Double): OperatorFunction[Any, ObservedValueOf[Observable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[Observable[Any]]]]
  inline def mergeMapTo(innerObservable: InteropObservable[Any]): OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]]]
  inline def mergeMapTo(innerObservable: InteropObservable[Any], concurrent: Double): OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]]]
  inline def mergeMapTo(innerObservable: ReadableStreamLike[Any]): OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]]]
  inline def mergeMapTo(innerObservable: ReadableStreamLike[Any], concurrent: Double): OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]]]
  inline def mergeMapTo(innerObservable: ArrayLike[Any]): OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]]]
  inline def mergeMapTo(innerObservable: ArrayLike[Any], concurrent: Double): OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]]]
  inline def mergeMapTo(innerObservable: AsyncIterable[Any]): OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]]]
  inline def mergeMapTo(innerObservable: AsyncIterable[Any], concurrent: Double): OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]]]
  inline def mergeMapTo(innerObservable: PromiseLike[Any]): OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]]]
  inline def mergeMapTo(innerObservable: PromiseLike[Any], concurrent: Double): OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]]]
  inline def mergeMapTo[T, R](
    innerObservable: js.Iterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[js.Iterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: js.Iterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[js.Iterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: Observable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[Observable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: Observable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[Observable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: InteropObservable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[InteropObservable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: InteropObservable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[InteropObservable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: ReadableStreamLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ReadableStreamLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: ReadableStreamLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ReadableStreamLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: ArrayLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ArrayLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: ArrayLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ArrayLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: AsyncIterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[AsyncIterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: AsyncIterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[AsyncIterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: PromiseLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[PromiseLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: PromiseLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[PromiseLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  inline def mergeScan[T, R](
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
    seed: R
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeScan[T, R](
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
    seed: R,
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  inline def mergeWith[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param otherSources because its type [...ObservableInputTuple<A>] is not an array type */ otherSources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): OperatorFunction[
    T, 
    T | (/* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any)
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeWith")(otherSources.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    T | (/* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any)
  ]]
  
  inline def min[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def min[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(comparer.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def multicast[T](subjectFactory: js.Function0[typings.rxjs.distTypesInternalSubjectMod.Subject[T]]): UnaryFunction[
    Observable[T], 
    typings.rxjs.distTypesInternalObservableConnectableObservableMod.ConnectableObservable[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subjectFactory.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[
    Observable[T], 
    typings.rxjs.distTypesInternalObservableConnectableObservableMod.ConnectableObservable[T]
  ]]
  inline def multicast[T](subject: typings.rxjs.distTypesInternalSubjectMod.Subject[T]): UnaryFunction[
    Observable[T], 
    typings.rxjs.distTypesInternalObservableConnectableObservableMod.ConnectableObservable[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subject.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[
    Observable[T], 
    typings.rxjs.distTypesInternalObservableConnectableObservableMod.ConnectableObservable[T]
  ]]
  inline def multicast[T, O /* <: ObservableInput[Any] */](
    subjectFactory: js.Function0[typings.rxjs.distTypesInternalSubjectMod.Subject[T]],
    selector: js.Function1[/* shared */ Observable[T], O]
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subjectFactory.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def multicast[T, O /* <: ObservableInput[Any] */](
    subject: typings.rxjs.distTypesInternalSubjectMod.Subject[T],
    selector: js.Function1[/* shared */ Observable[T], O]
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subject.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  
  inline def never(): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[Observable[scala.Nothing]]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  @JSImport("rxjs", "observable")
  @js.native
  val observable: String | js.Symbol = js.native
  
  inline def observeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observeOn")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def observeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observeOn")(scheduler.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def of(): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")().asInstanceOf[Observable[scala.Nothing]]
  inline def of(scheduler: SchedulerLike): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def of(value: Null): Observable[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[Observable[Null]]
  inline def of(value: Unit): Observable[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[Observable[Unit]]
  inline def of[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): Observable[ValueFromArray[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[js.Any]).asInstanceOf[Observable[ValueFromArray[A]]]
  inline def of[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param valuesAndScheduler because its type [...A, SchedulerLike] is not an array type */ valuesAndScheduler: /* import warning: importer.ImportType#apply c repeated non-array type: A */ js.Array[A]
  ): Observable[ValueFromArray[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(valuesAndScheduler.asInstanceOf[js.Any]).asInstanceOf[Observable[ValueFromArray[A]]]
  
  inline def of_T[T](): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")().asInstanceOf[Observable[T]]
  inline def of_T[T](value: T): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def onErrorResumeNext[A /* <: js.Array[Any] */](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ]]
  
  inline def pairs(n: js.BigInt): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: js.BigInt, scheduler: SchedulerLike): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: js.Function1[/* repeated */ Any, Any]): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: js.Function1[/* repeated */ Any, Any], scheduler: SchedulerLike): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: js.Symbol): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: js.Symbol, scheduler: SchedulerLike): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: Boolean): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: Boolean, scheduler: SchedulerLike): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: Double): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: Double, scheduler: SchedulerLike): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs[T](arr: js.Array[T]): Observable[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(arr.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[String, T]]]
  inline def pairs[T](arr: js.Array[T], scheduler: SchedulerLike): Observable[js.Tuple2[String, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(arr.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[String, T]]]
  inline def pairs[T](iterable: js.Iterable[T]): Observable[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(iterable.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[String, T]]]
  inline def pairs[T](iterable: js.Iterable[T], scheduler: SchedulerLike): Observable[js.Tuple2[String, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(iterable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[String, T]]]
  inline def pairs[O /* <: Record[String, Any] */](obj: O): Observable[
    js.Tuple2[
      /* keyof O */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any]).asInstanceOf[Observable[
    js.Tuple2[
      /* keyof O */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
    ]
  ]]
  inline def pairs[O /* <: Record[String, Any] */](obj: O, scheduler: SchedulerLike): Observable[
    js.Tuple2[
      /* keyof O */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple2[
      /* keyof O */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
    ]
  ]]
  
  inline def pairwise[T](): OperatorFunction[T, js.Tuple2[T, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairwise")().asInstanceOf[OperatorFunction[T, js.Tuple2[T, T]]]
  
  inline def partition[T](source: ObservableInput[T], predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Tuple2[Observable[T], Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Observable[T], Observable[T]]]
  inline def partition[T, A](
    source: ObservableInput[T],
    predicate: js.ThisFunction2[/* this */ A, /* value */ T, /* index */ Double, Boolean],
    thisArg: A
  ): js.Tuple2[Observable[T], Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Observable[T], Observable[T]]]
  
  inline def partition_TU[T, U /* <: T */](
    source: ObservableInput[T],
    predicate: js.Function2[/* value */ T, /* index */ Double, /* is U */ Boolean]
  ): js.Tuple2[Observable[U], Observable[Exclude[T, U]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Observable[U], Observable[Exclude[T, U]]]]
  
  inline def partition_TUA[T, U /* <: T */, A](
    source: ObservableInput[T],
    predicate: js.ThisFunction2[/* this */ A, /* value */ T, /* index */ Double, /* is U */ Boolean],
    thisArg: A
  ): js.Tuple2[Observable[U], Observable[Exclude[T, U]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Observable[U], Observable[Exclude[T, U]]]]
  
  inline def pipe(): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")().asInstanceOf[FnCall]
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
    fns: (UnaryFunction[Any, Any])*
  ): UnaryFunction[T, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")((scala.List(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any], fn6.asInstanceOf[js.Any], fn7.asInstanceOf[js.Any], fn8.asInstanceOf[js.Any], fn9.asInstanceOf[js.Any])).`++`(fns.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[UnaryFunction[T, Any]]
  
  inline def pluck[T](properties: String*): OperatorFunction[T, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(properties.asInstanceOf[Seq[js.Any]]*).asInstanceOf[OperatorFunction[T, Any]]
  inline def pluck[T, K1 /* <: /* keyof T */ String */](k1: K1): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1] */ js.Any
  ]]
  inline def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */](k1: K1, k2: K2): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2] */ js.Any
  ]]
  inline def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */](k1: K1, k2: K2, k3: K3): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any], k3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3] */ js.Any
  ]]
  inline def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any], k3.asInstanceOf[js.Any], k4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4] */ js.Any
  ]]
  inline def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */, K5 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4, k5: K5): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any], k3.asInstanceOf[js.Any], k4.asInstanceOf[js.Any], k5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5] */ js.Any
  ]]
  inline def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */, K5 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4] */ js.Any */, K6 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4][K5] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4, k5: K5, k6: K6): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5][K6] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any], k3.asInstanceOf[js.Any], k4.asInstanceOf[js.Any], k5.asInstanceOf[js.Any], k6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5][K6] */ js.Any
  ]]
  inline def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */, K5 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4] */ js.Any */, K6 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4][K5] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4, k5: K5, k6: K6, rest: String*): OperatorFunction[T, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")((scala.List(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any], k3.asInstanceOf[js.Any], k4.asInstanceOf[js.Any], k5.asInstanceOf[js.Any], k6.asInstanceOf[js.Any])).`++`(rest.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[OperatorFunction[T, Any]]
  
  inline def publish[T](): UnaryFunction[
    Observable[T], 
    typings.rxjs.distTypesInternalObservableConnectableObservableMod.ConnectableObservable[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")().asInstanceOf[UnaryFunction[
    Observable[T], 
    typings.rxjs.distTypesInternalObservableConnectableObservableMod.ConnectableObservable[T]
  ]]
  inline def publish[T, O /* <: ObservableInput[Any] */](selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")(selector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  
  inline def publishBehavior[T](initialValue: T): UnaryFunction[
    Observable[T], 
    typings.rxjs.distTypesInternalObservableConnectableObservableMod.ConnectableObservable[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishBehavior")(initialValue.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[
    Observable[T], 
    typings.rxjs.distTypesInternalObservableConnectableObservableMod.ConnectableObservable[T]
  ]]
  
  inline def publishLast[T](): UnaryFunction[
    Observable[T], 
    typings.rxjs.distTypesInternalObservableConnectableObservableMod.ConnectableObservable[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishLast")().asInstanceOf[UnaryFunction[
    Observable[T], 
    typings.rxjs.distTypesInternalObservableConnectableObservableMod.ConnectableObservable[T]
  ]]
  
  inline def publishReplay[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T](bufferSize: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T](bufferSize: Double, windowTime: Double, timestampProvider: TimestampProvider): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T](bufferSize: Double, windowTime: Unit, timestampProvider: TimestampProvider): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T](bufferSize: Unit, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T](bufferSize: Unit, windowTime: Double, timestampProvider: TimestampProvider): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T](bufferSize: Unit, windowTime: Unit, timestampProvider: TimestampProvider): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Double, windowTime: Double, selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](
    bufferSize: Double,
    windowTime: Double,
    selector: js.Function1[/* shared */ Observable[T], O],
    timestampProvider: TimestampProvider
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Double, windowTime: Double, selector: Unit, timestampProvider: TimestampProvider): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Double, windowTime: Unit, selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](
    bufferSize: Double,
    windowTime: Unit,
    selector: js.Function1[/* shared */ Observable[T], O],
    timestampProvider: TimestampProvider
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Double, windowTime: Unit, selector: Unit, timestampProvider: TimestampProvider): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Unit, windowTime: Double, selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](
    bufferSize: Unit,
    windowTime: Double,
    selector: js.Function1[/* shared */ Observable[T], O],
    timestampProvider: TimestampProvider
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Unit, windowTime: Double, selector: Unit, timestampProvider: TimestampProvider): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Unit, windowTime: Unit, selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](
    bufferSize: Unit,
    windowTime: Unit,
    selector: js.Function1[/* shared */ Observable[T], O],
    timestampProvider: TimestampProvider
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Unit, windowTime: Unit, selector: Unit, timestampProvider: TimestampProvider): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  
  @JSImport("rxjs", "queue")
  @js.native
  val queue: QueueScheduler = js.native
  
  @JSImport("rxjs", "queueScheduler")
  @js.native
  val queueScheduler: QueueScheduler = js.native
  
  inline def race[T /* <: js.Array[Any] */](
    inputs: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<T[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<T[K]>} */ js.Any
    ]
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(inputs.asInstanceOf[js.Any]).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ]]
  
  inline def raceWith[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param otherSources because its type [...ObservableInputTuple<A>] is not an array type */ otherSources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): OperatorFunction[
    T, 
    T | (/* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any)
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("raceWith")(otherSources.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    T | (/* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any)
  ]]
  
  inline def range(start: Double): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any]).asInstanceOf[Observable[Double]]
  inline def range(start: Double, count: Double): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def range(start: Double, count: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def range(start: Double, count: Unit, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  
  inline def reduce[V, A](accumulator: js.Function3[/* acc */ A | V, /* value */ V, /* index */ Double, A]): OperatorFunction[V, V | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(accumulator.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[V, V | A]]
  inline def reduce[V, A](accumulator: js.Function3[/* acc */ A, /* value */ V, /* index */ Double, A], seed: A): OperatorFunction[V, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[V, A]]
  
  inline def reduce_VAS[V, A, S](accumulator: js.Function3[/* acc */ A | S, /* value */ V, /* index */ Double, A], seed: S): OperatorFunction[V, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[V, A]]
  
  inline def refCount[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("refCount")().asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def repeat[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def repeat[T](countOrConfig: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(countOrConfig.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def repeat[T](countOrConfig: RepeatConfig): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(countOrConfig.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def repeatWhen[T](notifier: js.Function1[/* notifications */ Observable[Unit], Observable[Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeatWhen")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def retry[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def retry[T](config: RetryConfig): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(config.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def retry[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def retryWhen[T](notifier: js.Function1[/* errors */ Observable[Any], Observable[Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryWhen")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def sample[T](notifier: Observable[Any]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sample")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def sampleTime[T](period: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sampleTime")(period.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def sampleTime[T](period: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sampleTime")(period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def scan[V, A](accumulator: js.Function3[/* acc */ A | V, /* value */ V, /* index */ Double, A]): OperatorFunction[V, V | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[V, V | A]]
  inline def scan[V, A](accumulator: js.Function3[/* acc */ A, /* value */ V, /* index */ Double, A], seed: A): OperatorFunction[V, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[V, A]]
  
  inline def scan_VAS[V, A, S](accumulator: js.Function3[/* acc */ A | S, /* value */ V, /* index */ Double, A], seed: S): OperatorFunction[V, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[V, A]]
  
  inline def scheduled[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduled")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  inline def sequenceEqual[T](compareTo: Observable[T]): OperatorFunction[T, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Boolean]]
  inline def sequenceEqual[T](compareTo: Observable[T], comparator: js.Function2[/* a */ T, /* b */ T, Boolean]): OperatorFunction[T, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Boolean]]
  
  inline def share[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("share")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def share[T](options: ShareConfig[T]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("share")(options.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def shareReplay[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def shareReplay[T](bufferSize: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def shareReplay[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def shareReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def shareReplay[T](bufferSize: Double, windowTime: Unit, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def shareReplay[T](bufferSize: Unit, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def shareReplay[T](bufferSize: Unit, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def shareReplay[T](bufferSize: Unit, windowTime: Unit, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def shareReplay[T](config: ShareReplayConfig): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(config.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def single[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def single[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def single[T](predicate: BooleanConstructor): OperatorFunction[T, TruthyTypesOf[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TruthyTypesOf[T]]]
  
  inline def skip[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def skipLast[T](skipCount: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipLast")(skipCount.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def skipUntil[T](notifier: Observable[Any]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def skipWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def skipWhile[T](predicate: BooleanConstructor): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<T, rxjs.rxjs/dist/types/internal/types.Falsy> extends never ? never : T */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<T, rxjs.rxjs/dist/types/internal/types.Falsy> extends never ? never : T */ js.Any
  ]]
  
  inline def skipWhile_true[T](predicate: js.Function2[/* value */ T, /* index */ Double, `true`]): OperatorFunction[T, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, scala.Nothing]]
  
  inline def startWith[T](value: Null): OperatorFunction[T, T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(value.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | Null]]
  inline def startWith[T](value: Unit): OperatorFunction[T, js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(value.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.UndefOr[T]]]
  inline def startWith[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): OperatorFunction[T, T | ValueFromArray[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(values.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | ValueFromArray[A]]]
  inline def startWith[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param valuesAndScheduler because its type [...A, SchedulerLike] is not an array type */ valuesAndScheduler: /* import warning: importer.ImportType#apply c repeated non-array type: A */ js.Array[A]
  ): OperatorFunction[T, T | ValueFromArray[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(valuesAndScheduler.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | ValueFromArray[A]]]
  
  inline def subscribeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribeOn")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def subscribeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeOn")(scheduler.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def switchAll[O /* <: ObservableInput[Any] */](): OperatorFunction[O, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchAll")().asInstanceOf[OperatorFunction[O, ObservedValueOf[O]]]
  
  inline def switchMap[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def switchMap[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], resultSelector: Unit): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def switchMap[T, R, O /* <: ObservableInput[Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  inline def switchMapTo(observable: js.Iterable[Any]): OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]]]
  inline def switchMapTo(observable: js.Iterable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]]]
  inline def switchMapTo(observable: Observable[Any]): OperatorFunction[Any, ObservedValueOf[Observable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[Observable[Any]]]]
  inline def switchMapTo(observable: Observable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[Observable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[Observable[Any]]]]
  inline def switchMapTo(observable: InteropObservable[Any]): OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]]]
  inline def switchMapTo(observable: InteropObservable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]]]
  inline def switchMapTo(observable: ReadableStreamLike[Any]): OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]]]
  inline def switchMapTo(observable: ReadableStreamLike[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]]]
  inline def switchMapTo(observable: ArrayLike[Any]): OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]]]
  inline def switchMapTo(observable: ArrayLike[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]]]
  inline def switchMapTo(observable: AsyncIterable[Any]): OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]]]
  inline def switchMapTo(observable: AsyncIterable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]]]
  inline def switchMapTo(observable: PromiseLike[Any]): OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]]]
  inline def switchMapTo(observable: PromiseLike[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]]]
  inline def switchMapTo[T, R](
    observable: js.Iterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[js.Iterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def switchMapTo[T, R](
    observable: Observable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[Observable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def switchMapTo[T, R](
    observable: InteropObservable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[InteropObservable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def switchMapTo[T, R](
    observable: ReadableStreamLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ReadableStreamLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def switchMapTo[T, R](
    observable: ArrayLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ArrayLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def switchMapTo[T, R](
    observable: AsyncIterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[AsyncIterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def switchMapTo[T, R](
    observable: PromiseLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[PromiseLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  inline def switchScan[T, R, O /* <: ObservableInput[Any] */](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, O], seed: R): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  
  inline def take[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def takeLast[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeLast")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def takeUntil[T](notifier: ObservableInput[Any]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], inclusive: Boolean): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def takeWhile[T](predicate: BooleanConstructor): OperatorFunction[T, TruthyTypesOf[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TruthyTypesOf[T]]]
  
  inline def takeWhile_TS_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): OperatorFunction[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, S]]
  
  inline def takeWhile_false[T](predicate: BooleanConstructor, inclusive: `false`): OperatorFunction[T, TruthyTypesOf[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, TruthyTypesOf[T]]]
  inline def takeWhile_false[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], inclusive: `false`): OperatorFunction[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S]]
  
  inline def takeWhile_true[T](predicate: BooleanConstructor, inclusive: `true`): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def tap[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: js.Function1[/* value */ T, Unit]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ Any, Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](
    next: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ Any, Unit],
    complete: js.Function0[Unit]
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: js.Function1[/* value */ T, Unit], error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Null, error: js.Function1[/* error */ Any, Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Null, error: js.Function1[/* error */ Any, Unit], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Null, error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Null, error: Unit, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Unit, error: js.Function1[/* error */ Any, Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Unit, error: js.Function1[/* error */ Any, Unit], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Unit, error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Unit, error: Unit, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](observer: Partial[TapObserver[T]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(observer.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def throttle[T](durationSelector: js.Function1[/* value */ T, ObservableInput[Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def throttle[T](durationSelector: js.Function1[/* value */ T, ObservableInput[Any]], config: ThrottleConfig): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def throttleTime[T](duration: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def throttleTime[T](duration: Double, scheduler: Unit, config: ThrottleConfig): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def throttleTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def throttleTime[T](duration: Double, scheduler: SchedulerLike, config: ThrottleConfig): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def throwError(errorFactory: js.Function0[Any]): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(errorFactory.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def throwError(errorOrErrorFactory: Any, scheduler: SchedulerLike): Observable[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(errorOrErrorFactory.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[scala.Nothing]]
  inline def throwError(error: Any): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(error.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  
  inline def throwIfEmpty[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfEmpty")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def throwIfEmpty[T](errorFactory: js.Function0[Any]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfEmpty")(errorFactory.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def timeInterval[T](): OperatorFunction[T, TimeInterval_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")().asInstanceOf[OperatorFunction[T, TimeInterval_[T]]]
  inline def timeInterval[T](scheduler: SchedulerLike): OperatorFunction[T, TimeInterval_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(scheduler.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TimeInterval_[T]]]
  
  inline def timeout[T](each: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(each.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def timeout[T](each: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(each.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def timeout[T](first: js.Date): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(first.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def timeout[T](first: js.Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(first.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def timeout[T, O /* <: ObservableInput[Any] */, M](config: (TimeoutConfig[T, O, M]) & (With[T, M, O])): OperatorFunction[T, T | ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(config.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | ObservedValueOf[O]]]
  
  inline def timeoutWith[T, R](dueBy: js.Date, switchTo: ObservableInput[R]): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(dueBy.asInstanceOf[js.Any], switchTo.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
  inline def timeoutWith[T, R](dueBy: js.Date, switchTo: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(dueBy.asInstanceOf[js.Any], switchTo.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
  inline def timeoutWith[T, R](waitFor: Double, switchTo: ObservableInput[R]): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(waitFor.asInstanceOf[js.Any], switchTo.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
  inline def timeoutWith[T, R](waitFor: Double, switchTo: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(waitFor.asInstanceOf[js.Any], switchTo.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
  
  inline def timeout_with[T, M](config: Omit[TimeoutConfig[T, Any, M], `with`]): OperatorFunction[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(config.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T]]
  
  inline def timer(dueTime: js.Date): Observable[`0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any]).asInstanceOf[Observable[`0`]]
  inline def timer(dueTime: js.Date, unused: Unit, scheduler: SchedulerLike): Observable[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], unused.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[`0`]]
  inline def timer(dueTime: Double): Observable[`0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any]).asInstanceOf[Observable[`0`]]
  inline def timer(dueTime: Double, unused: Unit, scheduler: SchedulerLike): Observable[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], unused.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[`0`]]
  inline def timer(due: js.Date, scheduler: SchedulerLike): Observable[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[`0`]]
  inline def timer(due: Double, scheduler: SchedulerLike): Observable[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[`0`]]
  inline def timer(startDue: js.Date, intervalDuration: Double): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(startDue.asInstanceOf[js.Any], intervalDuration.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(startDue: js.Date, intervalDuration: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(startDue.asInstanceOf[js.Any], intervalDuration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(startDue: Double, intervalDuration: Double): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(startDue.asInstanceOf[js.Any], intervalDuration.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(startDue: Double, intervalDuration: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(startDue.asInstanceOf[js.Any], intervalDuration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  
  inline def timestamp[T](): OperatorFunction[T, Timestamp[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")().asInstanceOf[OperatorFunction[T, Timestamp[T]]]
  inline def timestamp[T](timestampProvider: TimestampProvider): OperatorFunction[T, Timestamp[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(timestampProvider.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Timestamp[T]]]
  
  inline def toArray[T](): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[OperatorFunction[T, js.Array[T]]]
  
  inline def `using`[T /* <: ObservableInput[Any] */](
    resourceFactory: js.Function0[Unsubscribable | Unit],
    observableFactory: js.Function1[/* resource */ Unsubscribable | Unit, T | Unit]
  ): Observable[ObservedValueOf[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("using")(resourceFactory.asInstanceOf[js.Any], observableFactory.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[T]]]
  
  inline def window[T](windowBoundaries: Observable[Any]): OperatorFunction[T, Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("window")(windowBoundaries.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Observable[T]]]
  
  inline def windowCount[T](windowSize: Double): OperatorFunction[T, Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowCount")(windowSize.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowCount[T](windowSize: Double, startWindowEvery: Double): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowCount")(windowSize.asInstanceOf[js.Any], startWindowEvery.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  
  inline def windowTime[T](windowTimeSpan: Double): OperatorFunction[T, Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](windowTimeSpan: Double, scheduler: SchedulerLike): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](
    windowTimeSpan: Double,
    windowCreationInterval: Double,
    maxWindowSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, scheduler: SchedulerLike): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Null, maxWindowSize: Double): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](
    windowTimeSpan: Double,
    windowCreationInterval: Null,
    maxWindowSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Unit, maxWindowSize: Double): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](
    windowTimeSpan: Double,
    windowCreationInterval: Unit,
    maxWindowSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  
  inline def windowToggle[T, O](
    openings: ObservableInput[O],
    closingSelector: js.Function1[/* openValue */ O, ObservableInput[Any]]
  ): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowToggle")(openings.asInstanceOf[js.Any], closingSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  
  inline def windowWhen[T](closingSelector: js.Function0[ObservableInput[Any]]): OperatorFunction[T, Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowWhen")(closingSelector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Observable[T]]]
  
  inline def withLatestFrom[T, O /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param inputs because its type [...ObservableInputTuple<O>] is not an array type */ inputs: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof O ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<O[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<O[K]>} */ js.Any
    ]
  ): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply c repeated non-array type: O */ js.Array[O]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(inputs.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply c repeated non-array type: O */ js.Array[O]
  ]]
  
  inline def withLatestFrom_TOR[T, O /* <: js.Array[Any] */, R](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param inputs because its type [...ObservableInputTuple<O>, (value : [T, ...O]): R] is not an array type */ inputs: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof O ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<O[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<O[K]>} */ js.Any
    ]
  ): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(inputs.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  
  inline def zip[A /* <: js.Array[Any] */](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): Observable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[A]]
  inline def zip[A /* <: js.Array[Any] */, R](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ],
    resultSelector: js.Function1[/* values */ A, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  inline def zipAll[T](): OperatorFunction[Any, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")().asInstanceOf[OperatorFunction[Any, js.Array[T]]]
  inline def zipAll[R](project: js.Function1[/* repeated */ Any, R]): OperatorFunction[Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, R]]
  
  inline def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[ObservableInput[T], R]]
  
  inline def zipWith[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param otherInputs because its type [...ObservableInputTuple<A>] is not an array type */ otherInputs: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): OperatorFunction[T, Cons[T, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipWith")(otherInputs.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Cons[T, A]]]
  
  inline def zip_AR[A /* <: js.Array[Any] */, R](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sourcesAndResultSelector because its type [...ObservableInputTuple<A>, (values : A): R] is not an array type */ sourcesAndResultSelector: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(sourcesAndResultSelector.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
}
