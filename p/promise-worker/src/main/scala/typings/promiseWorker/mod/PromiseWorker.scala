package typings.promiseWorker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseWorker extends js.Object {
  
  /**
    * Send a message to the worker
    *
    * The message you send can be any object, array, string, number, etc.
    * Note that the message will be `JSON.stringify`d, so you can't send functions, `Date`s, custom classes, etc.
    *
    * @param userMessage Data or message to send to the worker
    * @returns Promise resolved with the processed result or rejected with an error
    */
  def postMessage[TResult, TInput](userMessage: TInput): js.Promise[TResult] = js.native
}
object PromiseWorker {
  
  @scala.inline
  def apply(postMessage: js.Any => js.Promise[js.Any]): PromiseWorker = {
    val __obj = js.Dynamic.literal(postMessage = js.Any.fromFunction1(postMessage))
    __obj.asInstanceOf[PromiseWorker]
  }
  
  @scala.inline
  implicit class PromiseWorkerOps[Self <: PromiseWorker] (val x: Self) extends AnyVal {
    
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
    def setPostMessage(value: js.Any => js.Promise[js.Any]): Self = this.set("postMessage", js.Any.fromFunction1(value))
  }
}
