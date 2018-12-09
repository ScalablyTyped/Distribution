package typings
package promiseDashQueueLib.promiseDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-queue", JSImport.Namespace)
@js.native
class namespaced () extends PromiseQueue {
  /**
       *
       * @param maxPendingPromises [Infinity] Number of promises that can run at once.
       * @param maxQueuedPromises [Infinity] Number of promises generators that can be in the queue at once.
       *                                     `add()` will return a rejected promise if this limit would be exceeded.
       * @param options [{}] See QueueOptions
       */
  def this(maxPendingPromises: scala.Double) = this()
  /**
       *
       * @param maxPendingPromises [Infinity] Number of promises that can run at once.
       * @param maxQueuedPromises [Infinity] Number of promises generators that can be in the queue at once.
       *                                     `add()` will return a rejected promise if this limit would be exceeded.
       * @param options [{}] See QueueOptions
       */
  def this(maxPendingPromises: scala.Double, maxQueuedPromises: scala.Double) = this()
  /**
       *
       * @param maxPendingPromises [Infinity] Number of promises that can run at once.
       * @param maxQueuedPromises [Infinity] Number of promises generators that can be in the queue at once.
       *                                     `add()` will return a rejected promise if this limit would be exceeded.
       * @param options [{}] See QueueOptions
       */
  def this(maxPendingPromises: scala.Double, maxQueuedPromises: scala.Double, options: promiseDashQueueLib.promiseDashQueueMod.PromiseQueueNs.QueueOptions) = this()
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
  override def getPendingLength(): scala.Double = js.native
  /**
       * Returns the number of in-flight promises
       */
  /* CompleteClass */
  override def getQueueLength(): scala.Double = js.native
}

@JSImport("promise-queue", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
       * Set which promise constructor to use for the value returned by PromiseQueue#add.
       * If this isn't called, the global `Promise` constructor is used.
       * @param GlobalPromise A constructor for Promises
       */
  def configure(GlobalPromise: stdLib.PromiseConstructor): scala.Unit = js.native
}

