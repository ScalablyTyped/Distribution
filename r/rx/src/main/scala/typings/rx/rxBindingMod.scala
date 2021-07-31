package typings.rx

import typings.rx.Rx.AnonymousObserver
import typings.rx.Rx.AnonymousObserverStatic
import typings.rx.Rx.AnonymousSubjectStatic
import typings.rx.Rx.AsyncSubjectStatic
import typings.rx.Rx.BehaviorSubject
import typings.rx.Rx.BehaviorSubjectStatic
import typings.rx.Rx.CheckedObserver
import typings.rx.Rx.Comparer
import typings.rx.Rx.CompositeDisposable
import typings.rx.Rx.CompositeDisposableStatic
import typings.rx.Rx.Disposable
import typings.rx.Rx.DisposableStatic
import typings.rx.Rx.IDisposable
import typings.rx.Rx.IPromise
import typings.rx.Rx.IScheduler
import typings.rx.Rx.MockObserver
import typings.rx.Rx.MockObserverStatic
import typings.rx.Rx.Notification
import typings.rx.Rx.NotificationStatic
import typings.rx.Rx.Observable
import typings.rx.Rx.ObservableStatic
import typings.rx.Rx.Observer
import typings.rx.Rx.ObserverStatic
import typings.rx.Rx.Recorded
import typings.rx.Rx.RecordedStatic
import typings.rx.Rx.RefCountDisposable
import typings.rx.Rx.RefCountDisposableStatic
import typings.rx.Rx.ReplaySubjectStatic
import typings.rx.Rx.SchedulerStatic
import typings.rx.Rx.SerialDisposable
import typings.rx.Rx.SerialDisposableStatic
import typings.rx.Rx.SingleAssignmentDisposable
import typings.rx.Rx.SingleAssignmentDisposableStatic
import typings.rx.Rx.Subject
import typings.rx.Rx.SubjectStatic
import typings.rx.Rx.Subscription
import typings.rx.Rx.SubscriptionStatic
import typings.rx.Rx.TestScheduler
import typings.rx.Rx.VirtualTimeScheduler
import typings.rx.Rx.internals.AbstractObserver
import typings.rx.Rx.internals.AbstractObserverStatic
import typings.rx.Rx.internals.NotImplementedError
import typings.rx.Rx.internals.NotSupportedError
import typings.rx.Rx.internals.PriorityQueue
import typings.rx.Rx.internals.PriorityQueueStatic
import typings.rx.Rx.internals.SchedulePeriodicRecursive
import typings.rx.Rx.internals.SchedulePeriodicRecursiveStatic
import typings.rx.Rx.internals.ScheduledItem
import typings.rx.Rx.internals.ScheduledItemStatic
import typings.rx.anon.GetDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rxBindingMod {
  
  @JSImport("rx.binding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rx.binding", "AnonymousObserver")
  @js.native
  def AnonymousObserver: AnonymousObserverStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "AnonymousObserver")
  @js.native
  /**
    * Creates an observer from the specified OnNext, OnError, and OnCompleted actions.
    * @param {Any} onNext Observer's OnNext action implementation.
    * @param {Any} onError Observer's OnError action implementation.
    * @param {Any} onCompleted Observer's OnCompleted action implementation.
    */
  class AnonymousObserverCls[T] ()
    extends StObject
       with AnonymousObserver[T] {
    def this(onNext: js.Function1[/* value */ T, Unit]) = this()
    def this(onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* exception */ js.Any, Unit]) = this()
    def this(onNext: Unit, onError: js.Function1[/* exception */ js.Any, Unit]) = this()
    def this(
      onNext: js.Function1[/* value */ T, Unit],
      onError: js.Function1[/* exception */ js.Any, Unit],
      onCompleted: js.Function0[Unit]
    ) = this()
    def this(onNext: js.Function1[/* value */ T, Unit], onError: Unit, onCompleted: js.Function0[Unit]) = this()
    def this(onNext: Unit, onError: js.Function1[/* exception */ js.Any, Unit], onCompleted: js.Function0[Unit]) = this()
    def this(onNext: Unit, onError: Unit, onCompleted: js.Function0[Unit]) = this()
    
    /**
      *  Hides the identity of an observer.
      * @returns An observer that hides the identity of the specified observer.
      */
    /* CompleteClass */
    override def asObserver(): Observer[T] = js.native
    
    /**
      *  Checks access to the observer for grammar violations. This includes checking for multiple OnError or OnCompleted calls, as well as reentrancy in any of the observer methods.
      *  If a violation is detected, an Error is thrown from the offending observer method call.
      * @returns An observer that checks callbacks invocations against the observer grammar and, if the checks pass, forwards those to the specified observer.
      */
    /* CompleteClass */
    override def checked(): CheckedObserver[T] = js.native
    
    /* CompleteClass */
    override def makeSafe(disposable: IDisposable): Observer[T] = js.native
    
    /**
      * Schedules the invocation of observer methods on the given scheduler.
      * @param {Scheduler} scheduler Scheduler to schedule observer messages on.
      * @returns {Observer} Observer whose messages are scheduled on the given scheduler.
      */
    /* CompleteClass */
    override def notifyOn(scheduler: IScheduler): Observer[T] = js.native
    
    /**
      * Notifies the observer of the end of the sequence.
      */
    /* CompleteClass */
    override def onCompleted(): Unit = js.native
    
    /**
      * Notifies the observer that an exception has occurred.
      * @param {Any} error The error that has occurred.
      */
    /* CompleteClass */
    override def onError(exception: js.Any): Unit = js.native
    
    /**
      * Notifies the observer of a new element in the sequence.
      * @param {Any} value Next element in the sequence.
      */
    /* CompleteClass */
    override def onNext(value: T): Unit = js.native
    
    /**
      *  Creates a notification callback from an observer.
      * @returns The action that forwards its input notification to the underlying observer.
      */
    /* CompleteClass */
    override def toNotifier(): js.Function1[/* notification */ Notification[T], Unit] = js.native
  }
  
  @scala.inline
  def AnonymousObserver_=(x: AnonymousObserverStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnonymousObserver")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "AnonymousSubject")
  @js.native
  def AnonymousSubject: AnonymousSubjectStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "AnonymousSubject")
  @js.native
  /**
    * Creates a subject that can only receive one value and that value is cached for all future observations.
    * @constructor
    */
  class AnonymousSubjectCls[T] ()
    extends StObject
       with Subject[T] {
    
    /**
      *  Hides the identity of an observer.
      * @returns An observer that hides the identity of the specified observer.
      */
    /* CompleteClass */
    override def asObserver(): Observer[T] = js.native
    
    /**
      *  Checks access to the observer for grammar violations. This includes checking for multiple OnError or OnCompleted calls, as well as reentrancy in any of the observer methods.
      *  If a violation is detected, an Error is thrown from the offending observer method call.
      * @returns An observer that checks callbacks invocations against the observer grammar and, if the checks pass, forwards those to the specified observer.
      */
    /* CompleteClass */
    override def checked(): CheckedObserver[T] = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def makeSafe(disposable: IDisposable): Observer[T] = js.native
    
    /**
      * Schedules the invocation of observer methods on the given scheduler.
      * @param {Scheduler} scheduler Scheduler to schedule observer messages on.
      * @returns {Observer} Observer whose messages are scheduled on the given scheduler.
      */
    /* CompleteClass */
    override def notifyOn(scheduler: IScheduler): Observer[T] = js.native
    
    /**
      * Notifies the observer of the end of the sequence.
      */
    /* CompleteClass */
    override def onCompleted(): Unit = js.native
    
    /**
      * Notifies the observer that an exception has occurred.
      * @param {Any} error The error that has occurred.
      */
    /* CompleteClass */
    override def onError(exception: js.Any): Unit = js.native
    
    /**
      * Notifies the observer of a new element in the sequence.
      * @param {Any} value Next element in the sequence.
      */
    /* CompleteClass */
    override def onNext(value: T): Unit = js.native
    
    /**
      *  Creates a notification callback from an observer.
      * @returns The action that forwards its input notification to the underlying observer.
      */
    /* CompleteClass */
    override def toNotifier(): js.Function1[/* notification */ Notification[T], Unit] = js.native
  }
  
  @scala.inline
  def AnonymousSubject_=(x: AnonymousSubjectStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnonymousSubject")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "AsyncSubject")
  @js.native
  def AsyncSubject: AsyncSubjectStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "AsyncSubject")
  @js.native
  /**
    * Creates a subject that can only receive one value and that value is cached for all future observations.
    * @constructor
    */
  class AsyncSubjectCls[T] ()
    extends StObject
       with Subject[T] {
    
    /**
      *  Hides the identity of an observer.
      * @returns An observer that hides the identity of the specified observer.
      */
    /* CompleteClass */
    override def asObserver(): Observer[T] = js.native
    
    /**
      *  Checks access to the observer for grammar violations. This includes checking for multiple OnError or OnCompleted calls, as well as reentrancy in any of the observer methods.
      *  If a violation is detected, an Error is thrown from the offending observer method call.
      * @returns An observer that checks callbacks invocations against the observer grammar and, if the checks pass, forwards those to the specified observer.
      */
    /* CompleteClass */
    override def checked(): CheckedObserver[T] = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def makeSafe(disposable: IDisposable): Observer[T] = js.native
    
    /**
      * Schedules the invocation of observer methods on the given scheduler.
      * @param {Scheduler} scheduler Scheduler to schedule observer messages on.
      * @returns {Observer} Observer whose messages are scheduled on the given scheduler.
      */
    /* CompleteClass */
    override def notifyOn(scheduler: IScheduler): Observer[T] = js.native
    
    /**
      * Notifies the observer of the end of the sequence.
      */
    /* CompleteClass */
    override def onCompleted(): Unit = js.native
    
    /**
      * Notifies the observer that an exception has occurred.
      * @param {Any} error The error that has occurred.
      */
    /* CompleteClass */
    override def onError(exception: js.Any): Unit = js.native
    
    /**
      * Notifies the observer of a new element in the sequence.
      * @param {Any} value Next element in the sequence.
      */
    /* CompleteClass */
    override def onNext(value: T): Unit = js.native
    
    /**
      *  Creates a notification callback from an observer.
      * @returns The action that forwards its input notification to the underlying observer.
      */
    /* CompleteClass */
    override def toNotifier(): js.Function1[/* notification */ Notification[T], Unit] = js.native
  }
  
  @scala.inline
  def AsyncSubject_=(x: AsyncSubjectStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsyncSubject")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "BehaviorSubject")
  @js.native
  def BehaviorSubject: BehaviorSubjectStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "BehaviorSubject")
  @js.native
  class BehaviorSubjectCls[T] protected ()
    extends StObject
       with BehaviorSubject[T] {
    /**
      *  Initializes a new instance of the BehaviorSubject class which creates a subject that caches its last value and starts with the specified value.
      *  @param {Mixed} value Initial value sent to observers when no other value has been received by the subject yet.
      */
    def this(initialValue: T) = this()
    
    /**
      *  Hides the identity of an observer.
      * @returns An observer that hides the identity of the specified observer.
      */
    /* CompleteClass */
    override def asObserver(): Observer[T] = js.native
    
    /**
      *  Checks access to the observer for grammar violations. This includes checking for multiple OnError or OnCompleted calls, as well as reentrancy in any of the observer methods.
      *  If a violation is detected, an Error is thrown from the offending observer method call.
      * @returns An observer that checks callbacks invocations against the observer grammar and, if the checks pass, forwards those to the specified observer.
      */
    /* CompleteClass */
    override def checked(): CheckedObserver[T] = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def makeSafe(disposable: IDisposable): Observer[T] = js.native
    
    /**
      * Schedules the invocation of observer methods on the given scheduler.
      * @param {Scheduler} scheduler Scheduler to schedule observer messages on.
      * @returns {Observer} Observer whose messages are scheduled on the given scheduler.
      */
    /* CompleteClass */
    override def notifyOn(scheduler: IScheduler): Observer[T] = js.native
    
    /**
      * Notifies the observer of the end of the sequence.
      */
    /* CompleteClass */
    override def onCompleted(): Unit = js.native
    
    /**
      * Notifies the observer that an exception has occurred.
      * @param {Any} error The error that has occurred.
      */
    /* CompleteClass */
    override def onError(exception: js.Any): Unit = js.native
    
    /**
      * Notifies the observer of a new element in the sequence.
      * @param {Any} value Next element in the sequence.
      */
    /* CompleteClass */
    override def onNext(value: T): Unit = js.native
    
    /**
      *  Creates a notification callback from an observer.
      * @returns The action that forwards its input notification to the underlying observer.
      */
    /* CompleteClass */
    override def toNotifier(): js.Function1[/* notification */ Notification[T], Unit] = js.native
  }
  
  @scala.inline
  def BehaviorSubject_=(x: BehaviorSubjectStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BehaviorSubject")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "CompositeDisposable")
  @js.native
  def CompositeDisposable: CompositeDisposableStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "CompositeDisposable")
  @js.native
  class CompositeDisposableCls protected ()
    extends StObject
       with CompositeDisposable {
    /**
      * Represents a group of disposable resources that are disposed together.
      * @constructor
      */
    def this(disposables: IDisposable*) = this()
    /**
      * Represents a group of disposable resources that are disposed together.
      * @constructor
      */
    def this(disposables: js.Array[IDisposable]) = this()
    
    /**
      * Adds a disposable to the CompositeDisposable or disposes the disposable if the CompositeDisposable is disposed.
      * @param {Mixed} item Disposable to add.
      */
    /* CompleteClass */
    override def add(item: IDisposable): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Removes and disposes the first occurrence of a disposable from the CompositeDisposable.
      * @param {Mixed} item Disposable to remove.
      * @returns {Boolean} true if found; false otherwise.
      */
    /* CompleteClass */
    override def remove(item: IDisposable): Unit = js.native
  }
  
  @scala.inline
  def CompositeDisposable_=(x: CompositeDisposableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CompositeDisposable")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "Disposable")
  @js.native
  def Disposable: DisposableStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "Disposable")
  @js.native
  class DisposableCls protected ()
    extends StObject
       with Disposable {
    /**
      * Provides a set of static methods for creating Disposables.
      * @param {Function} dispose Action to run during the first call to dispose. The action is guaranteed to be run at most once.
      */
    def this(action: js.Function0[Unit]) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  @scala.inline
  def Disposable_=(x: DisposableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Disposable")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "HistoricalScheduler")
  @js.native
  class HistoricalSchedulerCls protected ()
    extends StObject
       with VirtualTimeScheduler[Double, Double] {
    /**
      * Creates a new historical scheduler with the specified initial clock value.
      * @constructor
      * @param {Number} initialClock Initial value for the clock.
      * @param {Function} comparer Comparer to determine causality of events based on absolute time.
      */
    def this(initialClock: Double, comparer: Comparer[Double, Double]) = this()
  }
  
  @JSImport("rx.binding", "MockObserver")
  @js.native
  def MockObserver: MockObserverStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "MockObserver")
  @js.native
  class MockObserverCls[T] protected ()
    extends StObject
       with MockObserver[T] {
    def this(scheduler: IScheduler) = this()
    
    /**
      *  Hides the identity of an observer.
      * @returns An observer that hides the identity of the specified observer.
      */
    /* CompleteClass */
    override def asObserver(): Observer[T] = js.native
    
    /**
      *  Checks access to the observer for grammar violations. This includes checking for multiple OnError or OnCompleted calls, as well as reentrancy in any of the observer methods.
      *  If a violation is detected, an Error is thrown from the offending observer method call.
      * @returns An observer that checks callbacks invocations against the observer grammar and, if the checks pass, forwards those to the specified observer.
      */
    /* CompleteClass */
    override def checked(): CheckedObserver[T] = js.native
    
    /* CompleteClass */
    override def makeSafe(disposable: IDisposable): Observer[T] = js.native
    
    /* CompleteClass */
    var messages: js.Array[Recorded] = js.native
    
    /**
      * Schedules the invocation of observer methods on the given scheduler.
      * @param {Scheduler} scheduler Scheduler to schedule observer messages on.
      * @returns {Observer} Observer whose messages are scheduled on the given scheduler.
      */
    /* CompleteClass */
    override def notifyOn(scheduler: IScheduler): Observer[T] = js.native
    
    /**
      * Notifies the observer of the end of the sequence.
      */
    /* CompleteClass */
    override def onCompleted(): Unit = js.native
    
    /**
      * Notifies the observer that an exception has occurred.
      * @param {Any} error The error that has occurred.
      */
    /* CompleteClass */
    override def onError(exception: js.Any): Unit = js.native
    
    /**
      * Notifies the observer of a new element in the sequence.
      * @param {Any} value Next element in the sequence.
      */
    /* CompleteClass */
    override def onNext(value: T): Unit = js.native
    
    /**
      *  Creates a notification callback from an observer.
      * @returns The action that forwards its input notification to the underlying observer.
      */
    /* CompleteClass */
    override def toNotifier(): js.Function1[/* notification */ Notification[T], Unit] = js.native
  }
  
  @scala.inline
  def MockObserver_=(x: MockObserverStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MockObserver")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "Notification")
  @js.native
  def Notification: NotificationStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "Notification")
  @js.native
  class NotificationCls[T] protected ()
    extends StObject
       with Notification[T] {
    def this(
      kind: js.Any,
      value: js.Any,
      exception: js.Any,
      accept: js.Any,
      acceptObservable: js.Any,
      toString: js.Any
    ) = this()
  }
  
  @scala.inline
  def Notification_=(x: NotificationStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Notification")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "Observable")
  @js.native
  def Observable: ObservableStatic = js.native
  @scala.inline
  def Observable_=(x: ObservableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Observable")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "Observer")
  @js.native
  def Observer: ObserverStatic = js.native
  @scala.inline
  def Observer_=(x: ObserverStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Observer")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "Plan")
  @js.native
  class Plan[T] ()
    extends StObject
       with typings.rx.Rx.Plan[T]
  
  object ReactiveTest {
    
    @JSImport("rx.binding", "ReactiveTest")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default virtual time used for creation of observable sequences in unit tests. */
    @JSImport("rx.binding", "ReactiveTest.created")
    @js.native
    def created: Double = js.native
    @scala.inline
    def created_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("created")(x.asInstanceOf[js.Any])
    
    /** Default virtual time used to dispose subscriptions in unit tests. */
    @JSImport("rx.binding", "ReactiveTest.disposed")
    @js.native
    def disposed: Double = js.native
    @scala.inline
    def disposed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disposed")(x.asInstanceOf[js.Any])
    
    /**
      * Factory method for an OnCompleted notification record at a given time.
      *
      * @param ticks Recorded virtual time the OnCompleted notification occurs.
      * @return Recorded OnCompleted notification.
      */
    @scala.inline
    def onCompleted(ticks: Double): Recorded = ^.asInstanceOf[js.Dynamic].applyDynamic("onCompleted")(ticks.asInstanceOf[js.Any]).asInstanceOf[Recorded]
    
    /**
      * Factory method for an OnError notification record at a given time with a given error.
      *
      * 1 - ReactiveTest.onNext(200, new Error('error'));
      * 2 - ReactiveTest.onNext(200, function (e) { return e.message === 'error'; });
      *
      * @param ticks Recorded virtual time the OnError notification occurs.
      * @param exception Recorded exception stored in the OnError notification.
      * @return Recorded OnError notification.
      */
    @scala.inline
    def onError(ticks: Double, exception: js.Any): Recorded = (^.asInstanceOf[js.Dynamic].applyDynamic("onError")(ticks.asInstanceOf[js.Any], exception.asInstanceOf[js.Any])).asInstanceOf[Recorded]
    /**
      * Factory method for an OnError notification record at a given time with a given error.
      *
      * 1 - ReactiveTest.onNext(200, new Error('error'));
      * 2 - ReactiveTest.onNext(200, function (e) { return e.message === 'error'; });
      *
      * @param ticks Recorded virtual time the OnError notification occurs.
      * @param exception Recorded exception stored in the OnError notification.
      * @return Recorded OnError notification.
      */
    @scala.inline
    def onError(ticks: Double, predicate: js.Function1[/* exception */ js.Any, Boolean]): Recorded = (^.asInstanceOf[js.Dynamic].applyDynamic("onError")(ticks.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Recorded]
    
    /**
      * Factory method for an OnNext notification record at a given time with a given value or a predicate function.
      *
      * 1 - ReactiveTest.onNext(200, 42);
      * 2 - ReactiveTest.onNext(200, function (x) { return x.length == 2; });
      *
      * @param ticks Recorded virtual time the OnNext notification occurs.
      * @param value Recorded value stored in the OnNext notification or a predicate.
      * @return Recorded OnNext notification.
      */
    @scala.inline
    def onNext(ticks: Double, predicate: js.Function1[/* value */ js.Any, Boolean]): Recorded = (^.asInstanceOf[js.Dynamic].applyDynamic("onNext")(ticks.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Recorded]
    /**
      * Factory method for an OnNext notification record at a given time with a given value or a predicate function.
      *
      * 1 - ReactiveTest.onNext(200, 42);
      * 2 - ReactiveTest.onNext(200, function (x) { return x.length == 2; });
      *
      * @param ticks Recorded virtual time the OnNext notification occurs.
      * @param value Recorded value stored in the OnNext notification or a predicate.
      * @return Recorded OnNext notification.
      */
    @scala.inline
    def onNext(ticks: Double, value: js.Any): Recorded = (^.asInstanceOf[js.Dynamic].applyDynamic("onNext")(ticks.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Recorded]
    
    /**
      * Factory method for a subscription record based on a given subscription and disposal time.
      *
      * @param start Virtual time indicating when the subscription was created.
      * @param end Virtual time indicating when the subscription was disposed.
      * @return Subscription object.
      */
    @scala.inline
    def subscribe(subscribeAt: Double): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(subscribeAt.asInstanceOf[js.Any]).asInstanceOf[Subscription]
    @scala.inline
    def subscribe(subscribeAt: Double, unsubscribeAt: Double): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(subscribeAt.asInstanceOf[js.Any], unsubscribeAt.asInstanceOf[js.Any])).asInstanceOf[Subscription]
    
    /** Default virtual time used to subscribe to observable sequences in unit tests. */
    @JSImport("rx.binding", "ReactiveTest.subscribed")
    @js.native
    def subscribed: Double = js.native
    @scala.inline
    def subscribed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subscribed")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rx.binding", "Recorded")
  @js.native
  def Recorded: RecordedStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "Recorded")
  @js.native
  class RecordedCls protected ()
    extends StObject
       with Recorded {
    /**
      * Creates a new object recording the production of the specified value at the given virtual time.
      *
      * @constructor
      * @param {Number} time Virtual time the value was produced on.
      * @param {Mixed} value Value that was produced.
      * @param {Function} comparer An optional comparer.
      */
    def this(time: Double, value: js.Any) = this()
    def this(time: Double, value: js.Any, equalityComparer: Comparer[js.Any, Boolean]) = this()
    
    /**
      * Checks whether the given recorded object is equal to the current instance.
      *
      * @param {Recorded} other Recorded object to check for equality.
      * @returns {Boolean} true if both objects are equal; false otherwise.
      */
    /* CompleteClass */
    override def equals(other: Recorded): Boolean = js.native
    
    /* CompleteClass */
    var time: Double = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @scala.inline
  def Recorded_=(x: RecordedStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Recorded")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "RefCountDisposable")
  @js.native
  def RefCountDisposable: RefCountDisposableStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "RefCountDisposable")
  @js.native
  class RefCountDisposableCls protected ()
    extends StObject
       with RefCountDisposable {
    /**
      * Initializes a new instance of the RefCountDisposable with the specified disposable.
      * @constructor
      * @param {Disposable} disposable Underlying disposable.
      */
    def this(disposable: IDisposable) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Returns a dependent disposable that when disposed decreases the refcount on the underlying disposable.
      * @returns {Disposable} A dependent disposable contributing to the reference count that manages the underlying disposable's lifetime.
      */
    /* CompleteClass */
    override def getDisposable(): IDisposable = js.native
    
    /** Is this value disposed. */
    /* CompleteClass */
    @JSName("isDisposed")
    var isDisposed_RefCountDisposable: Boolean = js.native
  }
  
  @scala.inline
  def RefCountDisposable_=(x: RefCountDisposableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RefCountDisposable")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "ReplaySubject")
  @js.native
  def ReplaySubject: ReplaySubjectStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "ReplaySubject")
  @js.native
  /**
    *  Initializes a new instance of the ReplaySubject class with the specified buffer size, window size and scheduler.
    *  @param {Number} [bufferSize] Maximum element count of the replay buffer.
    *  @param {Number} [windowSize] Maximum time length of the replay buffer.
    *  @param {Scheduler} [scheduler] Scheduler the observers are invoked on.
    */
  class ReplaySubjectCls[T] ()
    extends StObject
       with Subject[T] {
    def this(bufferSize: Double) = this()
    def this(bufferSize: Double, window: Double) = this()
    def this(bufferSize: Unit, window: Double) = this()
    def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
    def this(bufferSize: Double, window: Unit, scheduler: IScheduler) = this()
    def this(bufferSize: Unit, window: Double, scheduler: IScheduler) = this()
    def this(bufferSize: Unit, window: Unit, scheduler: IScheduler) = this()
    
    /**
      *  Hides the identity of an observer.
      * @returns An observer that hides the identity of the specified observer.
      */
    /* CompleteClass */
    override def asObserver(): Observer[T] = js.native
    
    /**
      *  Checks access to the observer for grammar violations. This includes checking for multiple OnError or OnCompleted calls, as well as reentrancy in any of the observer methods.
      *  If a violation is detected, an Error is thrown from the offending observer method call.
      * @returns An observer that checks callbacks invocations against the observer grammar and, if the checks pass, forwards those to the specified observer.
      */
    /* CompleteClass */
    override def checked(): CheckedObserver[T] = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def makeSafe(disposable: IDisposable): Observer[T] = js.native
    
    /**
      * Schedules the invocation of observer methods on the given scheduler.
      * @param {Scheduler} scheduler Scheduler to schedule observer messages on.
      * @returns {Observer} Observer whose messages are scheduled on the given scheduler.
      */
    /* CompleteClass */
    override def notifyOn(scheduler: IScheduler): Observer[T] = js.native
    
    /**
      * Notifies the observer of the end of the sequence.
      */
    /* CompleteClass */
    override def onCompleted(): Unit = js.native
    
    /**
      * Notifies the observer that an exception has occurred.
      * @param {Any} error The error that has occurred.
      */
    /* CompleteClass */
    override def onError(exception: js.Any): Unit = js.native
    
    /**
      * Notifies the observer of a new element in the sequence.
      * @param {Any} value Next element in the sequence.
      */
    /* CompleteClass */
    override def onNext(value: T): Unit = js.native
    
    /**
      *  Creates a notification callback from an observer.
      * @returns The action that forwards its input notification to the underlying observer.
      */
    /* CompleteClass */
    override def toNotifier(): js.Function1[/* notification */ Notification[T], Unit] = js.native
  }
  
  @scala.inline
  def ReplaySubject_=(x: ReplaySubjectStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReplaySubject")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "Scheduler")
  @js.native
  def Scheduler: SchedulerStatic = js.native
  @scala.inline
  def Scheduler_=(x: SchedulerStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Scheduler")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "SerialDisposable")
  @js.native
  def SerialDisposable: SerialDisposableStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "SerialDisposable")
  @js.native
  class SerialDisposableCls ()
    extends StObject
       with SerialDisposable {
    
    /** Performs the task of cleaning up resources. */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def getDisposable(): IDisposable = js.native
    
    /** Is this value disposed. */
    /* CompleteClass */
    var isDisposed: Boolean = js.native
    
    /* CompleteClass */
    override def setDisposable(value: IDisposable): Unit = js.native
  }
  
  @scala.inline
  def SerialDisposable_=(x: SerialDisposableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SerialDisposable")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "SingleAssignmentDisposable")
  @js.native
  def SingleAssignmentDisposable: SingleAssignmentDisposableStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "SingleAssignmentDisposable")
  @js.native
  class SingleAssignmentDisposableCls ()
    extends StObject
       with SingleAssignmentDisposable {
    
    /** Performs the task of cleaning up resources. */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def getDisposable(): IDisposable = js.native
    
    /** Is this value disposed. */
    /* CompleteClass */
    var isDisposed: Boolean = js.native
    
    /* CompleteClass */
    override def setDisposable(value: IDisposable): Unit = js.native
  }
  
  @scala.inline
  def SingleAssignmentDisposable_=(x: SingleAssignmentDisposableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SingleAssignmentDisposable")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "Subject")
  @js.native
  def Subject: SubjectStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "Subject")
  @js.native
  /**
    * Creates a subject.
    */
  class SubjectCls[T] ()
    extends StObject
       with Subject[T] {
    
    /**
      *  Hides the identity of an observer.
      * @returns An observer that hides the identity of the specified observer.
      */
    /* CompleteClass */
    override def asObserver(): Observer[T] = js.native
    
    /**
      *  Checks access to the observer for grammar violations. This includes checking for multiple OnError or OnCompleted calls, as well as reentrancy in any of the observer methods.
      *  If a violation is detected, an Error is thrown from the offending observer method call.
      * @returns An observer that checks callbacks invocations against the observer grammar and, if the checks pass, forwards those to the specified observer.
      */
    /* CompleteClass */
    override def checked(): CheckedObserver[T] = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def makeSafe(disposable: IDisposable): Observer[T] = js.native
    
    /**
      * Schedules the invocation of observer methods on the given scheduler.
      * @param {Scheduler} scheduler Scheduler to schedule observer messages on.
      * @returns {Observer} Observer whose messages are scheduled on the given scheduler.
      */
    /* CompleteClass */
    override def notifyOn(scheduler: IScheduler): Observer[T] = js.native
    
    /**
      * Notifies the observer of the end of the sequence.
      */
    /* CompleteClass */
    override def onCompleted(): Unit = js.native
    
    /**
      * Notifies the observer that an exception has occurred.
      * @param {Any} error The error that has occurred.
      */
    /* CompleteClass */
    override def onError(exception: js.Any): Unit = js.native
    
    /**
      * Notifies the observer of a new element in the sequence.
      * @param {Any} value Next element in the sequence.
      */
    /* CompleteClass */
    override def onNext(value: T): Unit = js.native
    
    /**
      *  Creates a notification callback from an observer.
      * @returns The action that forwards its input notification to the underlying observer.
      */
    /* CompleteClass */
    override def toNotifier(): js.Function1[/* notification */ Notification[T], Unit] = js.native
  }
  
  @scala.inline
  def Subject_=(x: SubjectStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Subject")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.binding", "Subscription")
  @js.native
  def Subscription: SubscriptionStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "Subscription")
  @js.native
  class SubscriptionCls protected ()
    extends StObject
       with Subscription {
    /**
      * Creates a new subscription object with the given virtual subscription and unsubscription time.
      *
      * @constructor
      * @param {Number} subscribe Virtual time at which the subscription occurred.
      * @param {Number} unsubscribe Virtual time at which the unsubscription occurred.
      */
    def this(subscribeAt: Double) = this()
    def this(subscribeAt: Double, unsubscribeAt: Double) = this()
    
    /**
      * Checks whether the given subscription is equal to the current instance.
      * @param other Subscription object to check for equality.
      * @returns {Boolean} true if both objects are equal; false otherwise.
      */
    /* CompleteClass */
    override def equals(other: Subscription): Boolean = js.native
  }
  
  @scala.inline
  def Subscription_=(x: SubscriptionStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Subscription")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.binding", "TestScheduler")
  @js.native
  class TestSchedulerCls ()
    extends StObject
       with TestScheduler
  
  object config {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rx.binding", "config.Promise")
    @js.native
    class Promise[T] protected ()
      extends StObject
         with IPromise[T] {
      def this(resolver: js.Function2[
                /* resolvePromise */ js.Function1[/* value */ T, Unit], 
                /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
                Unit
              ]) = this()
    }
  }
  
  object helpers {
    
    @JSImport("rx.binding", "helpers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rx.binding", "helpers.asArray")
    @js.native
    def asArray: js.Function1[/* repeated */ js.Any, js.Array[js.Any]] = js.native
    @scala.inline
    def asArray_=(x: js.Function1[/* repeated */ js.Any, js.Array[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asArray")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "helpers.defaultComparer")
    @js.native
    def defaultComparer: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean] = js.native
    @scala.inline
    def defaultComparer_=(x: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultComparer")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "helpers.defaultError")
    @js.native
    def defaultError: js.Function1[/* err */ js.Any, Unit] = js.native
    @scala.inline
    def defaultError_=(x: js.Function1[/* err */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultError")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "helpers.defaultKeySerializer")
    @js.native
    def defaultKeySerializer: js.Function1[/* key */ js.Any, String] = js.native
    @scala.inline
    def defaultKeySerializer_=(x: js.Function1[/* key */ js.Any, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultKeySerializer")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "helpers.defaultNow")
    @js.native
    def defaultNow: js.Function0[Double] = js.native
    @scala.inline
    def defaultNow_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultNow")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "helpers.defaultSubComparer")
    @js.native
    def defaultSubComparer: js.Function2[/* left */ js.Any, /* right */ js.Any, Double] = js.native
    @scala.inline
    def defaultSubComparer_=(x: js.Function2[/* left */ js.Any, /* right */ js.Any, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSubComparer")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "helpers.identity")
    @js.native
    def identity: js.Function1[/* value */ js.Any, js.Any] = js.native
    @scala.inline
    def identity_=(x: js.Function1[/* value */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "helpers.isFunction")
    @js.native
    def isFunction: js.Function1[/* value */ js.Any, Boolean] = js.native
    @scala.inline
    def isFunction_=(x: js.Function1[/* value */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "helpers.isPromise")
    @js.native
    def isPromise: js.Function1[/* p */ js.Any, Boolean] = js.native
    @scala.inline
    def isPromise_=(x: js.Function1[/* p */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isPromise")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "helpers.noop")
    @js.native
    def noop: js.Function0[Unit] = js.native
    @scala.inline
    def noop_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noop")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "helpers.not")
    @js.native
    def not: js.Function1[/* value */ js.Any, Boolean] = js.native
    
    @JSImport("rx.binding", "helpers.notDefined")
    @js.native
    def notDefined: js.Function1[/* value */ js.Any, Boolean] = js.native
    @scala.inline
    def notDefined_=(x: js.Function1[/* value */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notDefined")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "helpers.notImplemented")
    @js.native
    def notImplemented: js.Function0[NotImplementedError] = js.native
    @scala.inline
    def notImplemented_=(x: js.Function0[NotImplementedError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notImplemented")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "helpers.notSupported")
    @js.native
    def notSupported: js.Function0[NotSupportedError] = js.native
    @scala.inline
    def notSupported_=(x: js.Function0[NotSupportedError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notSupported")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def not_=(x: js.Function1[/* value */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("not")(x.asInstanceOf[js.Any])
  }
  
  object internals {
    
    @JSImport("rx.binding", "internals")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rx.binding", "internals.AbstractObserver")
    @js.native
    def AbstractObserver: AbstractObserverStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("rx.binding", "internals.AbstractObserver")
    @js.native
    class AbstractObserverCls[T] ()
      extends StObject
         with AbstractObserver[T] {
      
      /* CompleteClass */
      override def completed(): Unit = js.native
      
      /* CompleteClass */
      override def dispose(): Unit = js.native
      
      /* CompleteClass */
      override def error(error: js.Any): Unit = js.native
      
      /* CompleteClass */
      override def fail(e: js.Any): Boolean = js.native
      
      /* CompleteClass */
      var isStopped: Boolean = js.native
      
      // Must be implemented by other observers
      /* CompleteClass */
      override def next(value: T): Unit = js.native
      
      /**
        * Notifies the observer of the end of the sequence.
        */
      /* CompleteClass */
      override def onCompleted(): Unit = js.native
      
      /**
        * Notifies the observer that an exception has occurred.
        * @param {Any} error The error that has occurred.
        */
      /* CompleteClass */
      override def onError(exception: js.Any): Unit = js.native
      
      /**
        * Notifies the observer of a new element in the sequence.
        * @param {Any} value Next element in the sequence.
        */
      /* CompleteClass */
      override def onNext(value: T): Unit = js.native
    }
    
    @scala.inline
    def AbstractObserver_=(x: AbstractObserverStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AbstractObserver")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "internals.PriorityQueue")
    @js.native
    def PriorityQueue: PriorityQueueStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("rx.binding", "internals.PriorityQueue")
    @js.native
    class PriorityQueueCls[T] protected ()
      extends StObject
         with PriorityQueue[T] {
      def this(capacity: Double) = this()
      
      /* CompleteClass */
      override def dequeue(): js.Any = js.native
      
      /* CompleteClass */
      override def enqueue(
        item: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScheduledItem<TTime> */ js.Any
      ): Unit = js.native
      
      /* CompleteClass */
      override def heapify(index: Double): Unit = js.native
      
      /* CompleteClass */
      override def isHigherPriority(left: Double, right: Double): Boolean = js.native
      
      /* CompleteClass */
      var length: Double = js.native
      
      /* CompleteClass */
      override def peek(): js.Any = js.native
      
      /* CompleteClass */
      override def percolate(index: Double): Unit = js.native
      
      /* CompleteClass */
      override def remove(
        item: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScheduledItem<TTime> */ js.Any
      ): Boolean = js.native
      
      /* CompleteClass */
      override def removeAt(index: Double): Unit = js.native
    }
    
    @scala.inline
    def PriorityQueue_=(x: PriorityQueueStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PriorityQueue")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "internals.SchedulePeriodicRecursive")
    @js.native
    def SchedulePeriodicRecursive: SchedulePeriodicRecursiveStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("rx.binding", "internals.SchedulePeriodicRecursive")
    @js.native
    class SchedulePeriodicRecursiveCls protected ()
      extends StObject
         with SchedulePeriodicRecursive {
      def this(scheduler: js.Any, state: js.Any, period: js.Any, action: js.Any) = this()
      
      /* CompleteClass */
      override def start(): IDisposable = js.native
    }
    
    @scala.inline
    def SchedulePeriodicRecursive_=(x: SchedulePeriodicRecursiveStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SchedulePeriodicRecursive")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "internals.ScheduledItem")
    @js.native
    def ScheduledItem: ScheduledItemStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("rx.binding", "internals.ScheduledItem")
    @js.native
    class ScheduledItemCls[TTime] protected ()
      extends StObject
         with ScheduledItem[TTime] {
      def this(
        scheduler: IScheduler,
        state: js.Any,
        action: js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable],
        dueTime: TTime
      ) = this()
      def this(
        scheduler: IScheduler,
        state: js.Any,
        action: js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable],
        dueTime: TTime,
        comparer: Comparer[TTime, Double]
      ) = this()
      
      /* CompleteClass */
      override def action(scheduler: IScheduler, state: js.Any): IDisposable = js.native
      
      /* CompleteClass */
      override def compareTo(other: ScheduledItem[TTime]): Double = js.native
      
      /* CompleteClass */
      override def comparer(x: TTime, y: TTime): Double = js.native
      
      /* CompleteClass */
      var disposable: SingleAssignmentDisposable = js.native
      
      /* CompleteClass */
      var dueTime: TTime = js.native
      
      /* CompleteClass */
      override def invoke(): Unit = js.native
      
      /* CompleteClass */
      override def invokeCore(): IDisposable = js.native
      
      /* CompleteClass */
      override def isCancelled(): Boolean = js.native
      
      /* CompleteClass */
      var scheduler: IScheduler = js.native
      
      /* CompleteClass */
      var state: TTime = js.native
    }
    
    @scala.inline
    def ScheduledItem_=(x: ScheduledItemStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScheduledItem")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "internals.addProperties")
    @js.native
    def addProperties: js.Function2[/* obj */ js.Any, /* repeated */ js.Any, Unit] = js.native
    @scala.inline
    def addProperties_=(x: js.Function2[/* obj */ js.Any, /* repeated */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addProperties")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "internals.addRef")
    @js.native
    def addRef: js.Function2[/* xs */ Observable[js.Any], /* r */ GetDisposable, Observable[js.Any]] = js.native
    @scala.inline
    def addRef_=(x: js.Function2[/* xs */ Observable[js.Any], /* r */ GetDisposable, Observable[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addRef")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "internals.bindCallback")
    @js.native
    def bindCallback: js.Function3[/* func */ js.Function, /* thisArg */ js.Any, /* argCount */ Double, js.Function] = js.native
    @scala.inline
    def bindCallback_=(x: js.Function3[/* func */ js.Function, /* thisArg */ js.Any, /* argCount */ Double, js.Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bindCallback")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "internals.inherits")
    @js.native
    def inherits: js.Function2[/* child */ js.Any, /* parent */ js.Any, Unit] = js.native
    @scala.inline
    def inherits_=(x: js.Function2[/* child */ js.Any, /* parent */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inherits")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.binding", "internals.isEqual")
    @js.native
    def isEqual: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean] = js.native
    @scala.inline
    def isEqual_=(x: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(x.asInstanceOf[js.Any])
  }
}
