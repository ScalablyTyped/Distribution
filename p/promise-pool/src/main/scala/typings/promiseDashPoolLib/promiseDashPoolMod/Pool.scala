package typings
package promiseDashPoolLib.promiseDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pool", "Pool")
@js.native
class Pool[T] protected () extends js.Object {
  /**
      * initialize a task pool.
      * @param processor a function takes the data and index as parameters and returns a promise.
      * @param concurrency the concurrency of this task pool.
      * @param endless defaults to false. indicates whether this task pool is endless, if so, tasks can still be added even after all previous tasks have been fulfilled.
      * @param tasksData an initializing array of task data.
      */
  def this(processor: js.Function2[/* data */ T, /* index */ scala.Double, qLib.qMod.QNs.IPromise[scala.Unit]], concurrency: scala.Double) = this()
  /**
      * initialize a task pool.
      * @param processor a function takes the data and index as parameters and returns a promise.
      * @param concurrency the concurrency of this task pool.
      * @param endless defaults to false. indicates whether this task pool is endless, if so, tasks can still be added even after all previous tasks have been fulfilled.
      * @param tasksData an initializing array of task data.
      */
  def this(processor: js.Function2[/* data */ T, /* index */ scala.Double, qLib.qMod.QNs.IPromise[scala.Unit]], concurrency: scala.Double, endless: scala.Boolean) = this()
  /**
      * initialize a task pool.
      * @param processor a function takes the data and index as parameters and returns a promise.
      * @param concurrency the concurrency of this task pool.
      * @param endless defaults to false. indicates whether this task pool is endless, if so, tasks can still be added even after all previous tasks have been fulfilled.
      * @param tasksData an initializing array of task data.
      */
  def this(processor: js.Function2[/* data */ T, /* index */ scala.Double, qLib.qMod.QNs.IPromise[scala.Unit]], concurrency: scala.Double, endless: scala.Boolean, tasksData: js.Array[T]) = this()
  var _currentConcurrency: js.Any = js.native
  var _deferred: js.Any = js.native
  var _index: js.Any = js.native
  var _pauseDeferred: js.Any = js.native
  var _tasksData: js.Any = js.native
  /**
      * (get/set) the max concurrency of this task pool.
      */
  var concurrency: scala.Double = js.native
  /**
      * (get/set) indicates whether this task pool is endless, if so, tasks can still be added even after all previous tasks have been fulfilled.
      */
  var endless: scala.Boolean = js.native
  /**
      * (get) the number of successful tasks.
      */
  var fulfilled: scala.Double = js.native
  /**
      * (get/set) defaults to Infinity, max retry interval when retry interval multiplier applied.
      */
  var maxRetryInterval: scala.Double = js.native
  /**
      * (get) the number of pending tasks.
      */
  var pending: scala.Double = js.native
  /**
      * (get) the number of failed tasks.
      */
  var rejected: scala.Double = js.native
  /**
      * (get/set) defaults to 0, the number or retries that this task pool will take for every single task, could be Infinity.
      */
  var retries: scala.Double = js.native
  /**
      * (get/set) defaults to 0, interval (milliseconds) between each retries.
      */
  var retryInterval: scala.Double = js.native
  /**
      * (get/set) defaults to 1, the multiplier applies to interval after every retry.
      */
  var retryIntervalMultiplier: scala.Double = js.native
  /**
      * (get) the number of completed tasks and pending tasks in total.
      */
  var total: scala.Double = js.native
  /* private */ def _next(): js.Any = js.native
  /* private */ def _notifyProgress(index: js.Any, success: js.Any, err: js.Any, retries: js.Any): js.Any = js.native
  /* private */ def _process(data: js.Any, index: js.Any): js.Any = js.native
  /* private */ def _start(): js.Any = js.native
  /**
      * add a data item.
      * @param taskData task data to add.
      */
  def add(taskData: T): scala.Unit = js.native
  /**
      * add data items.
      * @param tasskData tasks data to add.
      */
  def add(tasksData: js.Array[T]): scala.Unit = js.native
  def onProgress(progress: IProgress): scala.Unit = js.native
  /**
      * pause tasks and return a promise that will be fulfilled after the running tasks accomplish. this will wait for running tasks to complete instead of aborting them.
      */
  def pause(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  /**
      * (get/set) the processor function that handles tasks data.
      */
  def processor(data: T, index: scala.Double): qLib.qMod.QNs.IPromise[scala.Unit] = js.native
  /**
      * pause tasks, then clear pending tasks data and reset counters. return a promise that will be fulfilled after resetting accomplish.
      */
  def reset(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  /**
      * resume tasks.
      */
  def resume(): scala.Unit = js.native
  /**
      * start tasks, return a promise that will be fulfilled after all tasks accomplish if endless is false.
      * @param onProgress a callback that will be triggered every time when a single task is fulfilled.
      */
  def start(): qLib.qMod.QNs.Promise[IResult] = js.native
  /**
      * start tasks, return a promise that will be fulfilled after all tasks accomplish if endless is false.
      * @param onProgress a callback that will be triggered every time when a single task is fulfilled.
      */
  def start(onProgress: js.Function1[/* progress */ IProgress, scala.Unit]): qLib.qMod.QNs.Promise[IResult] = js.native
}

