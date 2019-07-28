package typings.promiseDashQueue.promiseDashQueueMod

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-queue", JSImport.Namespace)
@js.native
/**
  *
  * @param maxPendingPromises [Infinity] Number of promises that can run at once.
  * @param maxQueuedPromises [Infinity] Number of promises generators that can be in the queue at once.
  *                                     `add()` will return a rejected promise if this limit would be exceeded.
  * @param options [{}] See QueueOptions
  */
class ^ () extends PromiseQueue {
  def this(maxPendingPromises: Double) = this()
  def this(maxPendingPromises: Double, maxQueuedPromises: Double) = this()
  def this(maxPendingPromises: Double, maxQueuedPromises: Double, options: QueueOptions) = this()
  /**
    * Enqueue a promise generator. When the number of running promises is less than `maxPendingPromises`,
    * this function will be called and the returned promise will be held as a running promise until it
    * rejects or resolves.
    *
    * @throws If the global `Promise` is undefined and `Queue.configure` hasn't been called.
    * @param promiseGenerator A function that returns a promise when called.
    * @returns A promise that forwards the resolution/rejection of the promise returned by `promiseGenerator`,
    *          or immediately rejects if `maxQueuedPromise` is exceeded.
    */
  /* CompleteClass */
  override def add[T](promiseGenerator: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
  /**
    * Returns the number of promiseGenerators waiting in queue.
    */
  /* CompleteClass */
  override def getPendingLength(): Double = js.native
  /**
    * Returns the number of in-flight promises
    */
  /* CompleteClass */
  override def getQueueLength(): Double = js.native
}

@JSImport("promise-queue", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Set which promise constructor to use for the value returned by PromiseQueue#add.
    * If this isn't called, the global `Promise` constructor is used.
    * @param GlobalPromise A constructor for Promises
    */
  def configure(GlobalPromise: PromiseConstructor): Unit = js.native
}

