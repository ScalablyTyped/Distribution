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

object mod {
  
  @JSImport("rx-lite", "CompositeDisposable")
  @js.native
  class CompositeDisposable protected ()
    extends typings.rxLite.Rx.CompositeDisposable {
    def this(disposables: IDisposable*) = this()
    def this(disposables: js.Array[IDisposable]) = this()
  }
  
  @JSImport("rx-lite", "Disposable")
  @js.native
  class Disposable protected ()
    extends typings.rxLite.Rx.Disposable {
    def this(action: js.Function0[Unit]) = this()
  }
  object Disposable {
    
    @JSImport("rx-lite", "Disposable")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rx-lite", "Disposable.create")
    @js.native
    def create(action: js.Function0[Unit]): IDisposable = js.native
    
    /* static member */
    @JSImport("rx-lite", "Disposable.empty")
    @js.native
    def empty: IDisposable = js.native
    @scala.inline
    def empty_=(x: IDisposable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
  }
  
  // Notifications
  @JSImport("rx-lite", "Notification")
  @js.native
  class Notification[T] ()
    extends typings.rxLite.Rx.Notification[T]
  object Notification {
    
    /* static member */
    @JSImport("rx-lite", "Notification.createOnCompleted")
    @js.native
    def createOnCompleted[T](): typings.rxLite.Rx.Notification[T] = js.native
    
    /* static member */
    @JSImport("rx-lite", "Notification.createOnError")
    @js.native
    def createOnError[T](exception: js.Any): typings.rxLite.Rx.Notification[T] = js.native
    
    /* static member */
    @JSImport("rx-lite", "Notification.createOnNext")
    @js.native
    def createOnNext[T](value: T): typings.rxLite.Rx.Notification[T] = js.native
  }
  
  @JSImport("rx-lite", "Observable")
  @js.native
  val Observable: ObservableStatic = js.native
  
  @JSImport("rx-lite", "Observer")
  @js.native
  val Observer: ObserverStatic = js.native
  
  @JSImport("rx-lite", "RefCountDisposable")
  @js.native
  class RefCountDisposable protected ()
    extends typings.rxLite.Rx.RefCountDisposable {
    def this(disposable: IDisposable) = this()
  }
  
  @JSImport("rx-lite", "Scheduler")
  @js.native
  val Scheduler: SchedulerStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx-lite", "Scheduler")
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
  @JSImport("rx-lite", "SerialDisposable")
  @js.native
  class SerialDisposable ()
    extends typings.rxLite.Rx.SingleAssignmentDisposable
  
  // Single assignment
  @JSImport("rx-lite", "SingleAssignmentDisposable")
  @js.native
  class SingleAssignmentDisposable ()
    extends typings.rxLite.Rx.SingleAssignmentDisposable
  
  object config {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rx-lite", "config.Promise")
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
    @JSImport("rx-lite", "config.useNativeEvents")
    @js.native
    val useNativeEvents: Boolean = js.native
  }
  
  object helpers {
    
    @JSImport("rx-lite", "helpers.asArray")
    @js.native
    def asArray[T](args: T*): js.Array[T] = js.native
    
    @JSImport("rx-lite", "helpers.defaultComparer")
    @js.native
    def defaultComparer(left: js.Any, right: js.Any): Boolean = js.native
    
    @JSImport("rx-lite", "helpers.defaultError")
    @js.native
    def defaultError(err: js.Any): Unit = js.native
    
    @JSImport("rx-lite", "helpers.defaultKeySerializer")
    @js.native
    def defaultKeySerializer(key: js.Any): String = js.native
    
    @JSImport("rx-lite", "helpers.defaultNow")
    @js.native
    def defaultNow(): Double = js.native
    
    @JSImport("rx-lite", "helpers.defaultSubComparer")
    @js.native
    def defaultSubComparer(left: js.Any, right: js.Any): Double = js.native
    
    @JSImport("rx-lite", "helpers.identity")
    @js.native
    def identity[T](value: T): T = js.native
    
    @JSImport("rx-lite", "helpers.isFunction")
    @js.native
    def isFunction(value: js.Any): Boolean = js.native
    
    @JSImport("rx-lite", "helpers.isPromise")
    @js.native
    def isPromise(p: js.Any): Boolean = js.native
    
    @JSImport("rx-lite", "helpers.noop")
    @js.native
    def noop(): Unit = js.native
    
    @JSImport("rx-lite", "helpers.not")
    @js.native
    def not(value: js.Any): Boolean = js.native
    
    @JSImport("rx-lite", "helpers.notDefined")
    @js.native
    def notDefined(value: js.Any): Boolean = js.native
  }
  
  object internals {
    
    // Priority Queue for Scheduling
    @JSImport("rx-lite", "internals.PriorityQueue")
    @js.native
    class PriorityQueue[TTime] protected ()
      extends typings.rxLite.Rx.internals.PriorityQueue[TTime] {
      def this(capacity: Double) = this()
    }
    object PriorityQueue {
      
      @JSImport("rx-lite", "internals.PriorityQueue")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("rx-lite", "internals.PriorityQueue.count")
      @js.native
      def count: Double = js.native
      @scala.inline
      def count_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("rx-lite", "internals.ScheduledItem")
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
    
    @JSImport("rx-lite", "internals.addRef")
    @js.native
    def addRef[T](xs: typings.rxLite.Rx.Observable[T], r: GetDisposable): typings.rxLite.Rx.Observable[T] = js.native
    
    @JSImport("rx-lite", "internals.isEqual")
    @js.native
    def isEqual(left: js.Any, right: js.Any): Boolean = js.native
  }
}
