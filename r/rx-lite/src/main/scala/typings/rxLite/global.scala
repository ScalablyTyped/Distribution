package typings.rxLite

import typings.rxCore.Rx.IDisposable
import typings.rxCore.Rx.IPromise
import typings.rxLite.Rx.IScheduler
import typings.rxLite.Rx.ObservableStatic
import typings.rxLite.Rx.ObserverStatic
import typings.rxLite.Rx.SchedulerStatic
import typings.rxLite.anon.GetDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // Async
  // time
  object Rx {
    
    @JSGlobal("Rx.CompositeDisposable")
    @js.native
    class CompositeDisposable protected ()
      extends StObject
         with typings.rxLite.Rx.CompositeDisposable {
      def this(disposables: IDisposable*) = this()
      def this(disposables: js.Array[IDisposable]) = this()
      
      /* CompleteClass */
      override def add(item: IDisposable): Unit = js.native
      
      /* CompleteClass */
      override def dispose(): Unit = js.native
      
      /* CompleteClass */
      var isDisposed: Boolean = js.native
      
      /* CompleteClass */
      var length: Double = js.native
      
      /* CompleteClass */
      override def remove(item: IDisposable): Boolean = js.native
      
      /* CompleteClass */
      override def toArray(): js.Array[IDisposable] = js.native
    }
    
    @JSGlobal("Rx.Disposable")
    @js.native
    class Disposable protected ()
      extends StObject
         with typings.rxLite.Rx.Disposable {
      def this(action: js.Function0[Unit]) = this()
      
      /* CompleteClass */
      override def dispose(): Unit = js.native
    }
    object Disposable {
      
      @JSGlobal("Rx.Disposable")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @scala.inline
      def create(action: js.Function0[Unit]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(action.asInstanceOf[js.Any]).asInstanceOf[IDisposable]
      
      /* static member */
      @JSGlobal("Rx.Disposable.empty")
      @js.native
      def empty: IDisposable = js.native
      @scala.inline
      def empty_=(x: IDisposable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
    }
    
    // Notifications
    @JSGlobal("Rx.Notification")
    @js.native
    class Notification[T] ()
      extends StObject
         with typings.rxLite.Rx.Notification[T]
    object Notification {
      
      @JSGlobal("Rx.Notification")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @scala.inline
      def createOnCompleted[T](): typings.rxLite.Rx.Notification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOnCompleted")().asInstanceOf[typings.rxLite.Rx.Notification[T]]
      
      /* static member */
      @scala.inline
      def createOnError[T](exception: js.Any): typings.rxLite.Rx.Notification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOnError")(exception.asInstanceOf[js.Any]).asInstanceOf[typings.rxLite.Rx.Notification[T]]
      
      /* static member */
      @scala.inline
      def createOnNext[T](value: T): typings.rxLite.Rx.Notification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOnNext")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rxLite.Rx.Notification[T]]
    }
    
    @JSGlobal("Rx.Observable")
    @js.native
    val Observable: ObservableStatic = js.native
    
    @JSGlobal("Rx.Observer")
    @js.native
    val Observer: ObserverStatic = js.native
    
    @JSGlobal("Rx.RefCountDisposable")
    @js.native
    class RefCountDisposable protected ()
      extends StObject
         with typings.rxLite.Rx.RefCountDisposable {
      def this(disposable: IDisposable) = this()
      
      /* CompleteClass */
      override def dispose(): Unit = js.native
      
      /* CompleteClass */
      override def getDisposable(): IDisposable = js.native
      
      /* CompleteClass */
      var isDisposed: Boolean = js.native
    }
    
    @JSGlobal("Rx.Scheduler")
    @js.native
    val Scheduler: SchedulerStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Rx.Scheduler")
    @js.native
    class SchedulerCls protected ()
      extends StObject
         with IScheduler {
      def this(
        now: js.Function0[Double],
        schedule: js.Function2[
                /* state */ js.Any, 
                /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable], 
                IDisposable
              ],
        scheduleRelative: js.Function3[
                /* state */ js.Any, 
                /* dueTime */ Double, 
                /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable], 
                IDisposable
              ],
        scheduleAbsolute: js.Function3[
                /* state */ js.Any, 
                /* dueTime */ Double, 
                /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable], 
                IDisposable
              ]
      ) = this()
      
      /* CompleteClass */
      override def isScheduler(value: js.Any): Boolean = js.native
      
      /* CompleteClass */
      override def now(): Double = js.native
      
      /* CompleteClass */
      override def schedule(action: js.Function0[Unit]): IDisposable = js.native
      
      /* CompleteClass */
      override def schedulePeriodic(period: Double, action: js.Function0[Unit]): IDisposable = js.native
      
      /* CompleteClass */
      override def schedulePeriodicWithState[TState](state: TState, period: Double, action: js.Function1[/* state */ TState, TState]): IDisposable = js.native
      
      /* CompleteClass */
      override def scheduleRecursive(action: js.Function1[/* action */ js.Function0[Unit], Unit]): IDisposable = js.native
      
      /* CompleteClass */
      override def scheduleRecursiveWithAbsolute(dueTime: Double, action: js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]): IDisposable = js.native
      
      /* CompleteClass */
      override def scheduleRecursiveWithAbsoluteAndState[TState](
        state: TState,
        dueTime: Double,
        action: js.Function2[
              /* state */ TState, 
              /* action */ js.Function2[/* state */ TState, /* dueTime */ Double, Unit], 
              Unit
            ]
      ): IDisposable = js.native
      
      /* CompleteClass */
      override def scheduleRecursiveWithRelative(dueTime: Double, action: js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]): IDisposable = js.native
      
      /* CompleteClass */
      override def scheduleRecursiveWithRelativeAndState[TState](
        state: TState,
        dueTime: Double,
        action: js.Function2[
              /* state */ TState, 
              /* action */ js.Function2[/* state */ TState, /* dueTime */ Double, Unit], 
              Unit
            ]
      ): IDisposable = js.native
      
      /* CompleteClass */
      override def scheduleRecursiveWithState[TState](
        state: TState,
        action: js.Function2[/* state */ TState, /* action */ js.Function1[/* state */ TState, Unit], Unit]
      ): IDisposable = js.native
      
      /* CompleteClass */
      override def scheduleWithAbsolute(dueTime: Double, action: js.Function0[Unit]): IDisposable = js.native
      
      /* CompleteClass */
      override def scheduleWithAbsoluteAndState[TState](
        state: TState,
        dueTime: Double,
        action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]
      ): IDisposable = js.native
      
      /* CompleteClass */
      override def scheduleWithRelative(dueTime: Double, action: js.Function0[Unit]): IDisposable = js.native
      
      /* CompleteClass */
      override def scheduleWithRelativeAndState[TState](
        state: TState,
        dueTime: Double,
        action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]
      ): IDisposable = js.native
      
      /* CompleteClass */
      override def scheduleWithState[TState](state: TState, action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]): IDisposable = js.native
    }
    
    // SerialDisposable it's an alias of SingleAssignmentDisposable
    @JSGlobal("Rx.SerialDisposable")
    @js.native
    class SerialDisposable ()
      extends StObject
         with typings.rxLite.Rx.SingleAssignmentDisposable {
      
      /* CompleteClass */
      var current: IDisposable = js.native
      
      /* CompleteClass */
      override def dispose(): Unit = js.native
      
      /* CompleteClass */
      override def getDisposable(): IDisposable = js.native
      
      /* CompleteClass */
      var isDisposed: Boolean = js.native
      
      /* CompleteClass */
      override def setDisposable(value: IDisposable): Unit = js.native
    }
    
    // Single assignment
    @JSGlobal("Rx.SingleAssignmentDisposable")
    @js.native
    class SingleAssignmentDisposable ()
      extends StObject
         with typings.rxLite.Rx.SingleAssignmentDisposable {
      
      /* CompleteClass */
      var current: IDisposable = js.native
      
      /* CompleteClass */
      override def dispose(): Unit = js.native
      
      /* CompleteClass */
      override def getDisposable(): IDisposable = js.native
      
      /* CompleteClass */
      var isDisposed: Boolean = js.native
      
      /* CompleteClass */
      override def setDisposable(value: IDisposable): Unit = js.native
    }
    
    object config {
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("Rx.config.Promise")
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
      
      /**
        * Configuration option to determine whether to use native events only
        */
      @JSGlobal("Rx.config.useNativeEvents")
      @js.native
      val useNativeEvents: Boolean = js.native
    }
    
    object helpers {
      
      @JSGlobal("Rx.helpers")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def asArray[T](args: T*): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
      
      @scala.inline
      def defaultComparer(left: js.Any, right: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultComparer")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      @scala.inline
      def defaultError(err: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def defaultKeySerializer(key: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultKeySerializer")(key.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @scala.inline
      def defaultNow(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultNow")().asInstanceOf[Double]
      
      @scala.inline
      def defaultSubComparer(left: js.Any, right: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultSubComparer")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      @scala.inline
      def identity[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(value.asInstanceOf[js.Any]).asInstanceOf[T]
      
      @scala.inline
      def isFunction(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      @scala.inline
      def isPromise(p: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      @scala.inline
      def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
      
      @scala.inline
      def not(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      @scala.inline
      def notDefined(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notDefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    object internals {
      
      @JSGlobal("Rx.internals")
      @js.native
      val ^ : js.Any = js.native
      
      // Priority Queue for Scheduling
      @JSGlobal("Rx.internals.PriorityQueue")
      @js.native
      class PriorityQueue[TTime] protected ()
        extends StObject
           with typings.rxLite.Rx.internals.PriorityQueue[TTime] {
        def this(capacity: Double) = this()
        
        /* CompleteClass */
        override def dequeue(): typings.rxLite.Rx.internals.ScheduledItem[TTime] = js.native
        
        /* CompleteClass */
        override def enqueue(item: typings.rxLite.Rx.internals.ScheduledItem[TTime]): Unit = js.native
        
        /* CompleteClass */
        override def heapify(index: Double): Unit = js.native
        
        /* CompleteClass */
        override def isHigherPriority(left: Double, right: Double): Boolean = js.native
        
        /* CompleteClass */
        var length: Double = js.native
        
        /* CompleteClass */
        override def peek(): typings.rxLite.Rx.internals.ScheduledItem[TTime] = js.native
        
        /* CompleteClass */
        override def percolate(index: Double): Unit = js.native
        
        /* CompleteClass */
        override def remove(item: typings.rxLite.Rx.internals.ScheduledItem[TTime]): Boolean = js.native
        
        /* CompleteClass */
        override def removeAt(index: Double): Unit = js.native
      }
      object PriorityQueue {
        
        @JSGlobal("Rx.internals.PriorityQueue")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("Rx.internals.PriorityQueue.count")
        @js.native
        def count: Double = js.native
        @scala.inline
        def count_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("Rx.internals.ScheduledItem")
      @js.native
      class ScheduledItem[TTime] protected ()
        extends StObject
           with typings.rxLite.Rx.internals.ScheduledItem[TTime] {
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
          comparer: js.Function2[/* x */ TTime, /* y */ TTime, Double]
        ) = this()
        
        /* CompleteClass */
        override def action(scheduler: IScheduler, state: js.Any): IDisposable = js.native
        
        /* CompleteClass */
        override def compareTo(other: typings.rxLite.Rx.internals.ScheduledItem[TTime]): Double = js.native
        
        /* CompleteClass */
        override def comparer(x: TTime, y: TTime): Double = js.native
        
        /* CompleteClass */
        var disposable: typings.rxLite.Rx.SingleAssignmentDisposable = js.native
        
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
      def addRef[T](xs: typings.rxLite.Rx.Observable[T], r: GetDisposable): typings.rxLite.Rx.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addRef")(xs.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[typings.rxLite.Rx.Observable[T]]
      
      @scala.inline
      def isEqual(left: js.Any, right: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    }
  }
}
