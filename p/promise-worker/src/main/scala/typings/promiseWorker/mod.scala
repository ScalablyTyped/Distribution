package typings.promiseWorker

import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-worker", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PromiseWorker {
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
  
  trait PromiseWorker extends StObject {
    
    /**
      * Send a message to the worker
      *
      * The message you send can be any object, array, string, number, etc.
      * Note that the message will be `JSON.stringify`d, so you can't send functions, `Date`s, custom classes, etc.
      *
      * @param userMessage Data or message to send to the worker
      * @returns Promise resolved with the processed result or rejected with an error
      */
    def postMessage[TResult, TInput](userMessage: TInput): js.Promise[TResult]
  }
  object PromiseWorker {
    
    inline def apply(postMessage: Any => js.Promise[Any]): PromiseWorker = {
      val __obj = js.Dynamic.literal(postMessage = js.Any.fromFunction1(postMessage))
      __obj.asInstanceOf[PromiseWorker]
    }
    
    extension [Self <: PromiseWorker](x: Self) {
      
      inline def setPostMessage(value: Any => js.Promise[Any]): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
    }
  }
}
