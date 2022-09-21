package typings.resourceLoader

import typings.typeSignals.mod.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncQueueMod {
  
  @JSImport("resource-loader/dist/async/AsyncQueue", "AsyncQueue")
  @js.native
  open class AsyncQueue[T] protected () extends StObject {
    def this(worker: IWorker[T]) = this()
    def this(worker: IWorker[T], concurrency: Double) = this()
    
    /* private */ var _insert: Any = js.native
    
    /* private */ var _next: Any = js.native
    
    /* private */ var _started: Any = js.native
    
    /* private */ var _tasks: Any = js.native
    
    /* private */ var buffer: Any = js.native
    
    var concurrency: Double = js.native
    
    def getTask(index: Double): ITask[T] = js.native
    
    def idle(): Boolean = js.native
    
    def length(): Double = js.native
    
    val onDrain: Signal[OnDrainSignal] = js.native
    
    val onEmpty: Signal[OnEmptySignal] = js.native
    
    val onError: Signal[OnErrorSignal[T]] = js.native
    
    val onSaturated: Signal[OnSaturatedSignal] = js.native
    
    val onUnsaturated: Signal[OnUnsaturatedSignal] = js.native
    
    def pause(): Unit = js.native
    
    /* private */ var paused: Any = js.native
    
    def process(): Unit = js.native
    
    def push(data: T): Unit = js.native
    def push(data: T, callback: IItemCallback): Unit = js.native
    
    def reset(): Unit = js.native
    
    def resume(): Unit = js.native
    
    def running(): Double = js.native
    
    def started: Boolean = js.native
    
    def unshift(data: T): Unit = js.native
    def unshift(data: T, callback: IItemCallback): Unit = js.native
    
    def worker(item: T, next: INext): Unit = js.native
    
    /* private */ var workers: Any = js.native
  }
  
  @js.native
  trait IItemCallback extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  type INext = js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  
  trait ITask[T] extends StObject {
    
    var callback: js.UndefOr[IItemCallback] = js.undefined
    
    var data: T
  }
  object ITask {
    
    inline def apply[T](data: T): ITask[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITask[T]]
    }
    
    extension [Self <: ITask[?], T](x: Self & ITask[T]) {
      
      inline def setCallback(value: IItemCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type IWorker[T] = js.Function2[/* item */ T, /* next */ INext, Unit]
  
  type OnDoneSignal = js.Function0[Unit]
  
  type OnDrainSignal = js.Function0[Unit]
  
  type OnEmptySignal = js.Function0[Unit]
  
  type OnErrorSignal[T] = js.Function2[/* err */ js.Error, /* data */ T, Unit]
  
  type OnSaturatedSignal = js.Function0[Unit]
  
  type OnUnsaturatedSignal = js.Function0[Unit]
}
