package typings.reactSpringCore.mod

import typings.reactSpringCore.mod.FrameValue.Event
import typings.reactSpringCore.reactSpringCoreStrings.change
import typings.reactSpringCore.reactSpringCoreStrings.idle
import typings.reactSpringCore.reactSpringCoreStrings.priority
import typings.reactSpringShared.mod.FluidValue
import typings.reactSpringTypes.mod.InterpolatorArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A kind of `FluidValue` that manages an `AnimatedValue` node.
  *
  * Its underlying value can be accessed and even observed.
  */
/* note: abstract class */ @JSImport("@react-spring/core", "FrameValue")
@js.native
open class FrameValue[T] () extends FluidValue[T, Event[T]] {
  def this(get: js.Function0[T]) = this()
  
  /** Called when the first child is added. */
  /* protected */ def _attach(): Unit = js.native
  
  /** Called when the last child is removed. */
  /* protected */ def _detach(): Unit = js.native
  
  /** Tell our children about our new value */
  /* protected */ def _onChange(value: T): Unit = js.native
  /* protected */ def _onChange(value: T, idle: Boolean): Unit = js.native
  
  /** Tell our children about our new priority */
  /* protected */ def _onPriorityChange(priority: Double): Unit = js.native
  
  /* protected */ var _priority: Double = js.native
  
  /** @internal */
  def advance(dt: Double): Unit = js.native
  
  /** @internal */
  def eventObserved(_event: Event[scala.Any]): Unit = js.native
  
  /** Get the current value */
  @JSName("get")
  def get_MFrameValue(): T = js.native
  
  val id: Double = js.native
  
  def idle: Boolean = js.native
  
  /** @deprecated Use the `to` method instead. */
  def interpolate[Out](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InterpolatorArgs<T, Out> is not an array type */ args: InterpolatorArgs[T, Out]
  ): Interpolation[T, Out] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  /* protected */ @JSName("observerAdded")
  def observerAdded_MFrameValue(count: Double): Unit = js.native
  
  /* protected */ @JSName("observerRemoved")
  def observerRemoved_MFrameValue(count: Double): Unit = js.native
  
  def priority: Double = js.native
  def priority_=(priority: Double): Unit = js.native
  
  /** Create a spring that maps our value to another value */
  def to[Out](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InterpolatorArgs<T, Out> is not an array type */ args: InterpolatorArgs[T, Out]
  ): Interpolation[T, Out] = js.native
  
  def toJSON(): T = js.native
}
object FrameValue {
  
  /** A parent changed its value */
  trait ChangeEvent[T]
    extends StObject
       with Event[T] {
    
    var idle: Boolean
    
    var parent: FrameValue[T]
    
    var `type`: change
    
    var value: T
  }
  object ChangeEvent {
    
    inline def apply[T](idle: Boolean, parent: FrameValue[T], value: T): ChangeEvent[T] = {
      val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("change")
      __obj.asInstanceOf[ChangeEvent[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEvent[?], T] (val x: Self & ChangeEvent[T]) extends AnyVal {
      
      inline def setIdle(value: Boolean): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setParent(value: FrameValue[T]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setType(value: change): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** Events sent to children of `FrameValue` objects */
  /* Rewritten from type alias, can be one of: 
    - typings.reactSpringCore.mod.FrameValue.ChangeEvent[T]
    - typings.reactSpringCore.mod.FrameValue.PriorityEvent[T]
    - typings.reactSpringCore.mod.FrameValue.IdleEvent[T]
  */
  trait Event[T] extends StObject
  object Event {
    
    inline def ChangeEvent[T](idle: Boolean, parent: FrameValue[T], value: T): typings.reactSpringCore.mod.FrameValue.ChangeEvent[T] = {
      val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("change")
      __obj.asInstanceOf[typings.reactSpringCore.mod.FrameValue.ChangeEvent[T]]
    }
    
    inline def IdleEvent[T](parent: FrameValue[T]): typings.reactSpringCore.mod.FrameValue.IdleEvent[T] = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("idle")
      __obj.asInstanceOf[typings.reactSpringCore.mod.FrameValue.IdleEvent[T]]
    }
    
    inline def PriorityEvent[T](parent: FrameValue[T], priority: Double): typings.reactSpringCore.mod.FrameValue.PriorityEvent[T] = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("priority")
      __obj.asInstanceOf[typings.reactSpringCore.mod.FrameValue.PriorityEvent[T]]
    }
  }
  
  /** A parent is done animating */
  trait IdleEvent[T]
    extends StObject
       with Event[T] {
    
    var parent: FrameValue[T]
    
    var `type`: idle
  }
  object IdleEvent {
    
    inline def apply[T](parent: FrameValue[T]): IdleEvent[T] = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("idle")
      __obj.asInstanceOf[IdleEvent[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdleEvent[?], T] (val x: Self & IdleEvent[T]) extends AnyVal {
      
      inline def setParent(value: FrameValue[T]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setType(value: idle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** A parent changed its priority */
  trait PriorityEvent[T]
    extends StObject
       with Event[T] {
    
    var parent: FrameValue[T]
    
    var priority: Double
    
    var `type`: priority
  }
  object PriorityEvent {
    
    inline def apply[T](parent: FrameValue[T], priority: Double): PriorityEvent[T] = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("priority")
      __obj.asInstanceOf[PriorityEvent[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PriorityEvent[?], T] (val x: Self & PriorityEvent[T]) extends AnyVal {
      
      inline def setParent(value: FrameValue[T]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setType(value: priority): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
