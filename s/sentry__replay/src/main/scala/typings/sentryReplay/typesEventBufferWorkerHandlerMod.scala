package typings.sentryReplay

import typings.sentryReplay.sentryReplayStrings.addEvent
import typings.sentryReplay.sentryReplayStrings.clear
import typings.sentryReplay.sentryReplayStrings.finish
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventBufferWorkerHandlerMod {
  
  @JSImport("@sentry/replay/types/eventBuffer/WorkerHandler", "WorkerHandler")
  @js.native
  open class WorkerHandler protected () extends StObject {
    def this(worker: Worker) = this()
    
    /* private */ var _ensureReadyPromise: Any = js.native
    
    /** Get the current ID and increment it for the next call. */
    /* private */ var _getAndIncrementId: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _worker: Any = js.native
    
    /**
      * Destroy the worker.
      */
    def destroy(): Unit = js.native
    
    /**
      * Ensure the worker is ready (or not).
      * This will either resolve when the worker is ready, or reject if an error occured.
      */
    def ensureReady(): js.Promise[Unit] = js.native
    
    /**
      * Post message to worker and wait for response before resolving promise.
      */
    def postMessage[T](method: clear | addEvent | finish): js.Promise[T] = js.native
    def postMessage[T](method: clear | addEvent | finish, arg: js.UndefOr[String]): js.Promise[T] = js.native
  }
}
