package typings
package promiseDashQueueLib.promiseDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseQueue extends js.Object {
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
  def add[T](promiseGenerator: js.Function0[js.Promise[T]]): js.Promise[T]
  /**
    * Returns the number of promiseGenerators waiting in queue.
    */
  def getPendingLength(): scala.Double
  /**
    * Returns the number of in-flight promises
    */
  def getQueueLength(): scala.Double
}

object PromiseQueue {
  @scala.inline
  def apply(
    add: js.Function1[js.Function0[js.Promise[js.Any]], js.Promise[js.Any]],
    getPendingLength: js.Function0[scala.Double],
    getQueueLength: js.Function0[scala.Double]
  ): PromiseQueue = {
    val __obj = js.Dynamic.literal(add = add, getPendingLength = getPendingLength, getQueueLength = getQueueLength)
  
    __obj.asInstanceOf[PromiseQueue]
  }
}

