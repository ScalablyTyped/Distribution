package typings.promiseQueue.mod

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
  def this(maxPendingPromises: js.UndefOr[scala.Nothing], maxQueuedPromises: Double) = this()
  def this(maxPendingPromises: Double, maxQueuedPromises: Double) = this()
  def this(
    maxPendingPromises: js.UndefOr[scala.Nothing],
    maxQueuedPromises: js.UndefOr[scala.Nothing],
    options: QueueOptions
  ) = this()
  def this(maxPendingPromises: js.UndefOr[scala.Nothing], maxQueuedPromises: Double, options: QueueOptions) = this()
  def this(maxPendingPromises: Double, maxQueuedPromises: js.UndefOr[scala.Nothing], options: QueueOptions) = this()
  def this(maxPendingPromises: Double, maxQueuedPromises: Double, options: QueueOptions) = this()
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

