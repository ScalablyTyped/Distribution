package typings.scheduler

import typings.scheduler.anon.Cancel
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tracingMod {
  
  @JSImport("scheduler/tracing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("scheduler/tracing", "__interactionsRef")
  @js.native
  val _InteractionsRef: IfSchedulerTracing[InteractionsRef, Null] = js.native
  
  @JSImport("scheduler/tracing", "__subscriberRef")
  @js.native
  val _SubscriberRef: IfSchedulerTracing[SubscriberRef, Null] = js.native
  
  @scala.inline
  def unstableClear[T](callback: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_clear")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def unstableGetCurrent(): Set[Interaction] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_getCurrent")().asInstanceOf[Set[Interaction] | Null]
  
  @scala.inline
  def unstableGetThreadID(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_getThreadID")().asInstanceOf[Double]
  
  @scala.inline
  def unstableSubscribe(subscriber: Subscriber): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_subscribe")(subscriber.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def unstableTrace[T](name: String, timestamp: Double, callback: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_trace")(name.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def unstableTrace[T](name: String, timestamp: Double, callback: js.Function0[T], threadID: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_trace")(name.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], threadID.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def unstableUnsubscribe(subscriber: Subscriber): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_unsubscribe")(subscriber.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def unstableWrap[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](callback: T): IfSchedulerTracing[WrappedFunction[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_wrap")(callback.asInstanceOf[js.Any]).asInstanceOf[IfSchedulerTracing[WrappedFunction[T], T]]
  @scala.inline
  def unstableWrap[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](callback: T, threadID: Double): IfSchedulerTracing[WrappedFunction[T], T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_wrap")(callback.asInstanceOf[js.Any], threadID.asInstanceOf[js.Any])).asInstanceOf[IfSchedulerTracing[WrappedFunction[T], T]]
  
  trait Build extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typings.scheduler.schedulerBooleans.`true`
    - typings.scheduler.schedulerBooleans.`false`
  */
  type EnableSchedulerTracing = js.UndefOr[_EnableSchedulerTracing]
  
  type IfSchedulerTracing[WhenTrue, WhenFalse] = TypeByBuildFlag[EnableSchedulerTracing, WhenTrue, WhenFalse]
  
  trait Interaction extends StObject {
    
    var __count: Double
    
    var id: Double
    
    var name: String
    
    var timestamp: Double
  }
  object Interaction {
    
    @scala.inline
    def apply(__count: Double, id: Double, name: String, timestamp: Double): Interaction = {
      val __obj = js.Dynamic.literal(__count = __count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Interaction]
    }
    
    @scala.inline
    implicit class InteractionMutableBuilder[Self <: Interaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__count(value: Double): Self = StObject.set(x, "__count", value.asInstanceOf[js.Any])
    }
  }
  
  trait InteractionsRef extends StObject {
    
    var current: Set[Interaction]
  }
  object InteractionsRef {
    
    @scala.inline
    def apply(current: Set[Interaction]): InteractionsRef = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionsRef]
    }
    
    @scala.inline
    implicit class InteractionsRefMutableBuilder[Self <: InteractionsRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Set[Interaction]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
  
  trait Subscriber extends StObject {
    
    /**
      * All scheduled async work for an interaction has finished.
      */
    def onInteractionScheduledWorkCompleted(interaction: Interaction): Unit
    
    /**
      * A new interaction has been created via the trace() method.
      */
    def onInteractionTraced(interaction: Interaction): Unit
    
    /**
      * A batch of scheduled work has been canceled.
      * Work is done by a "thread" which is identified by a unique ID.
      */
    def onWorkCanceled(interactions: Set[Interaction], threadID: Double): Unit
    
    /**
      * New async work has been scheduled for a set of interactions.
      * When this work is later run, onWorkStarted/onWorkStopped will be called.
      * A batch of async/yieldy work may be scheduled multiple times before completing.
      * In that case, onWorkScheduled may be called more than once before onWorkStopped.
      * Work is scheduled by a "thread" which is identified by a unique ID.
      */
    def onWorkScheduled(interactions: Set[Interaction], threadID: Double): Unit
    
    /**
      * A batch of work has started for a set of interactions.
      * When this work is complete, onWorkStopped will be called.
      * Work is not always completed synchronously; yielding may occur in between.
      * A batch of async/yieldy work may also be re-started before completing.
      * In that case, onWorkStarted may be called more than once before onWorkStopped.
      * Work is done by a "thread" which is identified by a unique ID.
      */
    def onWorkStarted(interactions: Set[Interaction], threadID: Double): Unit
    
    /**
      * A batch of work has completed for a set of interactions.
      * Work is done by a "thread" which is identified by a unique ID.
      */
    def onWorkStopped(interactions: Set[Interaction], threadID: Double): Unit
  }
  object Subscriber {
    
    @scala.inline
    def apply(
      onInteractionScheduledWorkCompleted: Interaction => Unit,
      onInteractionTraced: Interaction => Unit,
      onWorkCanceled: (Set[Interaction], Double) => Unit,
      onWorkScheduled: (Set[Interaction], Double) => Unit,
      onWorkStarted: (Set[Interaction], Double) => Unit,
      onWorkStopped: (Set[Interaction], Double) => Unit
    ): Subscriber = {
      val __obj = js.Dynamic.literal(onInteractionScheduledWorkCompleted = js.Any.fromFunction1(onInteractionScheduledWorkCompleted), onInteractionTraced = js.Any.fromFunction1(onInteractionTraced), onWorkCanceled = js.Any.fromFunction2(onWorkCanceled), onWorkScheduled = js.Any.fromFunction2(onWorkScheduled), onWorkStarted = js.Any.fromFunction2(onWorkStarted), onWorkStopped = js.Any.fromFunction2(onWorkStopped))
      __obj.asInstanceOf[Subscriber]
    }
    
    @scala.inline
    implicit class SubscriberMutableBuilder[Self <: Subscriber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnInteractionScheduledWorkCompleted(value: Interaction => Unit): Self = StObject.set(x, "onInteractionScheduledWorkCompleted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInteractionTraced(value: Interaction => Unit): Self = StObject.set(x, "onInteractionTraced", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWorkCanceled(value: (Set[Interaction], Double) => Unit): Self = StObject.set(x, "onWorkCanceled", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnWorkScheduled(value: (Set[Interaction], Double) => Unit): Self = StObject.set(x, "onWorkScheduled", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnWorkStarted(value: (Set[Interaction], Double) => Unit): Self = StObject.set(x, "onWorkStarted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnWorkStopped(value: (Set[Interaction], Double) => Unit): Self = StObject.set(x, "onWorkStopped", js.Any.fromFunction2(value))
    }
  }
  
  trait SubscriberRef extends StObject {
    
    var current: Subscriber | Null
  }
  object SubscriberRef {
    
    @scala.inline
    def apply(): SubscriberRef = {
      val __obj = js.Dynamic.literal(current = null)
      __obj.asInstanceOf[SubscriberRef]
    }
    
    @scala.inline
    implicit class SubscriberRefMutableBuilder[Self <: SubscriberRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Subscriber): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentNull: Self = StObject.set(x, "current", null)
    }
  }
  
  type TypeByBuildFlag[Flag /* <: js.UndefOr[Boolean] */, WhenTrue, WhenFalse] = WhenFalse | WhenTrue
  
  type WrappedFunction[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */] = T & Cancel
  
  trait _EnableSchedulerTracing extends StObject
}
