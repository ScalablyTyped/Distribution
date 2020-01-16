package typings.promiseDashWorker.promiseDashWorkerMod

import typings.std.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-worker", JSImport.Default)
@js.native
class default protected () extends PromiseWorker {
  /**
    * Pass in the worker instance to promisify
    *
    * @param worker The worker instance to wrap
    */
  def this(worker: Worker) = this()
  /**
    * Send a message to the worker
    *
    * The message you send can be any object, array, string, number, etc.
    * Note that the message will be `JSON.stringify`d, so you can't send functions, `Date`s, custom classes, etc.
    *
    * @param userMessage Data or message to send to the worker
    * @returns Promise resolved with the processed result or rejected with an error
    */
  /* CompleteClass */
  override def postMessage[TResult, TInput](userMessage: TInput): js.Promise[TResult] = js.native
}

