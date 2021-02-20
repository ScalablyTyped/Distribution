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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // Async
  // time
  object Rx {
    
    @JSGlobal("Rx.CompositeDisposable")
    @js.native
    class CompositeDisposable protected ()
      extends typings.rxLite.Rx.CompositeDisposable {
      def this(disposables: IDisposable*) = this()
      def this(disposables: js.Array[IDisposable]) = this()
    }
    
    @JSGlobal("Rx.Disposable")
    @js.native
    class Disposable protected ()
      extends typings.rxLite.Rx.Disposable {
      def this(action: js.Function0[Unit]) = this()
    }
    object Disposable {
      
      @JSGlobal("Rx.Disposable")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Rx.Disposable.create")
      @js.native
      def create(action: js.Function0[Unit]): IDisposable = js.native
      
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
      extends typings.rxLite.Rx.Notification[T]
    object Notification {
      
      /* static member */
      @JSGlobal("Rx.Notification.createOnCompleted")
      @js.native
      def createOnCompleted[T](): typings.rxLite.Rx.Notification[T] = js.native
      
      /* static member */
      @JSGlobal("Rx.Notification.createOnError")
      @js.native
      def createOnError[T](exception: js.Any): typings.rxLite.Rx.Notification[T] = js.native
      
      /* static member */
      @JSGlobal("Rx.Notification.createOnNext")
      @js.native
      def createOnNext[T](value: T): typings.rxLite.Rx.Notification[T] = js.native
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
      extends typings.rxLite.Rx.RefCountDisposable {
      def this(disposable: IDisposable) = this()
    }
    
    @JSGlobal("Rx.Scheduler")
    @js.native
    val Scheduler: SchedulerStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Rx.Scheduler")
    @js.native
    class SchedulerCls protected () extends IScheduler {
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
    }
    
    // SerialDisposable it's an alias of SingleAssignmentDisposable
    @JSGlobal("Rx.SerialDisposable")
    @js.native
    class SerialDisposable ()
      extends typings.rxLite.Rx.SingleAssignmentDisposable
    
    // Single assignment
    @JSGlobal("Rx.SingleAssignmentDisposable")
    @js.native
    class SingleAssignmentDisposable ()
      extends typings.rxLite.Rx.SingleAssignmentDisposable
    
    object config {
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("Rx.config.Promise")
      @js.native
      class Promise[T] protected () extends IPromise[T] {
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
      
      @JSGlobal("Rx.helpers.asArray")
      @js.native
      def asArray[T](args: T*): js.Array[T] = js.native
      
      @JSGlobal("Rx.helpers.defaultComparer")
      @js.native
      def defaultComparer(left: js.Any, right: js.Any): Boolean = js.native
      
      @JSGlobal("Rx.helpers.defaultError")
      @js.native
      def defaultError(err: js.Any): Unit = js.native
      
      @JSGlobal("Rx.helpers.defaultKeySerializer")
      @js.native
      def defaultKeySerializer(key: js.Any): String = js.native
      
      @JSGlobal("Rx.helpers.defaultNow")
      @js.native
      def defaultNow(): Double = js.native
      
      @JSGlobal("Rx.helpers.defaultSubComparer")
      @js.native
      def defaultSubComparer(left: js.Any, right: js.Any): Double = js.native
      
      @JSGlobal("Rx.helpers.identity")
      @js.native
      def identity[T](value: T): T = js.native
      
      @JSGlobal("Rx.helpers.isFunction")
      @js.native
      def isFunction(value: js.Any): Boolean = js.native
      
      @JSGlobal("Rx.helpers.isPromise")
      @js.native
      def isPromise(p: js.Any): Boolean = js.native
      
      @JSGlobal("Rx.helpers.noop")
      @js.native
      def noop(): Unit = js.native
      
      @JSGlobal("Rx.helpers.not")
      @js.native
      def not(value: js.Any): Boolean = js.native
      
      @JSGlobal("Rx.helpers.notDefined")
      @js.native
      def notDefined(value: js.Any): Boolean = js.native
    }
    
    object internals {
      
      // Priority Queue for Scheduling
      @JSGlobal("Rx.internals.PriorityQueue")
      @js.native
      class PriorityQueue[TTime] protected ()
        extends typings.rxLite.Rx.internals.PriorityQueue[TTime] {
        def this(capacity: Double) = this()
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
        extends typings.rxLite.Rx.internals.ScheduledItem[TTime] {
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
      }
      
      @JSGlobal("Rx.internals.addRef")
      @js.native
      def addRef[T](xs: typings.rxLite.Rx.Observable[T], r: GetDisposable): typings.rxLite.Rx.Observable[T] = js.native
      
      @JSGlobal("Rx.internals.isEqual")
      @js.native
      def isEqual(left: js.Any, right: js.Any): Boolean = js.native
    }
  }
}
