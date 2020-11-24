package typings.promiseQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  def add[T](promiseGenerator: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
  
  /**
    * Returns the number of promiseGenerators waiting in queue.
    */
  def getPendingLength(): Double = js.native
  
  /**
    * Returns the number of in-flight promises
    */
  def getQueueLength(): Double = js.native
}
object PromiseQueue {
  
  @scala.inline
  def apply(
    add: js.Function0[js.Promise[js.Any]] => js.Promise[js.Any],
    getPendingLength: () => Double,
    getQueueLength: () => Double
  ): PromiseQueue = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getPendingLength = js.Any.fromFunction0(getPendingLength), getQueueLength = js.Any.fromFunction0(getQueueLength))
    __obj.asInstanceOf[PromiseQueue]
  }
  
  @scala.inline
  implicit class PromiseQueueOps[Self <: PromiseQueue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: js.Function0[js.Promise[js.Any]] => js.Promise[js.Any]): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPendingLength(value: () => Double): Self = this.set("getPendingLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetQueueLength(value: () => Double): Self = this.set("getQueueLength", js.Any.fromFunction0(value))
  }
}
