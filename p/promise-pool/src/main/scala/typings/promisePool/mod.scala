package typings.promisePool

import typings.q.mod.IPromise
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-pool", "Pool")
  @js.native
  open class Pool[T] protected () extends StObject {
    /**
      * initialize a task pool.
      * @param processor a function takes the data and index as parameters and returns a promise.
      * @param concurrency the concurrency of this task pool.
      * @param endless defaults to false. indicates whether this task pool is endless, if so, tasks can still be added even after all previous tasks have been fulfilled.
      * @param tasksData an initializing array of task data.
      */
    def this(processor: js.Function2[/* data */ T, /* index */ Double, IPromise[Unit]], concurrency: Double) = this()
    def this(
      processor: js.Function2[/* data */ T, /* index */ Double, IPromise[Unit]],
      concurrency: Double,
      endless: Boolean
    ) = this()
    def this(
      processor: js.Function2[/* data */ T, /* index */ Double, IPromise[Unit]],
      concurrency: Double,
      endless: Boolean,
      tasksData: js.Array[T]
    ) = this()
    def this(
      processor: js.Function2[/* data */ T, /* index */ Double, IPromise[Unit]],
      concurrency: Double,
      endless: Unit,
      tasksData: js.Array[T]
    ) = this()
    
    /* private */ var _currentConcurrency: Any = js.native
    
    /* private */ var _deferred: Any = js.native
    
    /* private */ var _index: Any = js.native
    
    /* private */ def _next(): Any = js.native
    
    /* private */ def _notifyProgress(index: Any, success: Any, err: Any, retries: Any): Any = js.native
    
    /* private */ var _pauseDeferred: Any = js.native
    
    /* private */ def _process(data: Any, index: Any): Any = js.native
    
    /* private */ def _start(): Any = js.native
    
    /* private */ var _tasksData: Any = js.native
    
    /**
      * add a data item.
      * @param taskData task data to add.
      */
    def add(taskData: T): Unit = js.native
    /**
      * add data items.
      * @param tasskData tasks data to add.
      */
    def add(tasksData: js.Array[T]): Unit = js.native
    
    /**
      * (get/set) the max concurrency of this task pool.
      */
    var concurrency: Double = js.native
    
    /**
      * (get/set) indicates whether this task pool is endless, if so, tasks can still be added even after all previous tasks have been fulfilled.
      */
    var endless: Boolean = js.native
    
    /**
      * (get) the number of successful tasks.
      */
    var fulfilled: Double = js.native
    
    /**
      * (get/set) defaults to Infinity, max retry interval when retry interval multiplier applied.
      */
    var maxRetryInterval: Double = js.native
    
    def onProgress(progress: IProgress): Unit = js.native
    
    /**
      * pause tasks and return a promise that will be fulfilled after the running tasks accomplish. this will wait for running tasks to complete instead of aborting them.
      */
    def pause(): Promise[Unit] = js.native
    
    /**
      * (get) the number of pending tasks.
      */
    var pending: Double = js.native
    
    /**
      * (get/set) the processor function that handles tasks data.
      */
    def processor(data: T, index: Double): IPromise[Unit] = js.native
    
    /**
      * (get) the number of failed tasks.
      */
    var rejected: Double = js.native
    
    /**
      * pause tasks, then clear pending tasks data and reset counters. return a promise that will be fulfilled after resetting accomplish.
      */
    def reset(): Promise[Unit] = js.native
    
    /**
      * resume tasks.
      */
    def resume(): Unit = js.native
    
    /**
      * (get/set) defaults to 0, the number or retries that this task pool will take for every single task, could be Infinity.
      */
    var retries: Double = js.native
    
    /**
      * (get/set) defaults to 0, interval (milliseconds) between each retries.
      */
    var retryInterval: Double = js.native
    
    /**
      * (get/set) defaults to 1, the multiplier applies to interval after every retry.
      */
    var retryIntervalMultiplier: Double = js.native
    
    /**
      * start tasks, return a promise that will be fulfilled after all tasks accomplish if endless is false.
      * @param onProgress a callback that will be triggered every time when a single task is fulfilled.
      */
    def start(): Promise[IResult] = js.native
    def start(onProgress: js.Function1[/* progress */ IProgress, Unit]): Promise[IResult] = js.native
    
    /**
      * (get) the number of completed tasks and pending tasks in total.
      */
    var total: Double = js.native
  }
  
  trait IProgress extends StObject {
    
    var error: Any
    
    var fulfilled: Double
    
    var index: Double
    
    var pending: Double
    
    var rejected: Double
    
    var retries: Double
    
    var success: Boolean
    
    var total: Double
  }
  object IProgress {
    
    inline def apply(
      error: Any,
      fulfilled: Double,
      index: Double,
      pending: Double,
      rejected: Double,
      retries: Double,
      success: Boolean,
      total: Double
    ): IProgress = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fulfilled = fulfilled.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProgress]
    }
    
    extension [Self <: IProgress](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFulfilled(value: Double): Self = StObject.set(x, "fulfilled", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setRejected(value: Double): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait IResult extends StObject {
    
    var fulfilled: Double
    
    var rejected: Double
    
    var total: Double
  }
  object IResult {
    
    inline def apply(fulfilled: Double, rejected: Double, total: Double): IResult = {
      val __obj = js.Dynamic.literal(fulfilled = fulfilled.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResult]
    }
    
    extension [Self <: IResult](x: Self) {
      
      inline def setFulfilled(value: Double): Self = StObject.set(x, "fulfilled", value.asInstanceOf[js.Any])
      
      inline def setRejected(value: Double): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
