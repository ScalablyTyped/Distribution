package typings.sentryReplay

import typings.sentryReplay.typesTypesReplayMod.AddEventResult
import typings.sentryReplay.typesTypesReplayMod.EventBuffer
import typings.sentryReplay.typesTypesReplayMod.EventBufferType
import typings.sentryReplay.typesTypesReplayMod.RecordingEvent
import typings.sentryTypes.typesReplayMod.ReplayRecordingData
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventBufferEventBufferProxyMod {
  
  @JSImport("@sentry/replay/types/eventBuffer/EventBufferProxy", "EventBufferProxy")
  @js.native
  open class EventBufferProxy protected ()
    extends StObject
       with EventBuffer {
    def this(worker: Worker) = this()
    
    /* private */ var _compression: Any = js.native
    
    /** Actually check if the worker has been loaded. */
    /* private */ var _ensureWorkerIsLoaded: Any = js.native
    
    /* private */ var _ensureWorkerIsLoadedPromise: Any = js.native
    
    /* private */ var _fallback: Any = js.native
    
    /** Switch the used buffer to the compression worker. */
    /* private */ var _switchToCompressionWorker: Any = js.native
    
    /* private */ var _used: Any = js.native
    
    /**
      * Add an event to the event buffer.
      *
      * Returns a promise that resolves if the event was successfully added, else rejects.
      */
    /* CompleteClass */
    override def addEvent(event: RecordingEvent): js.Promise[AddEventResult] = js.native
    
    /**
      * Clear the event buffer.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Destroy the event buffer.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /** Ensure the worker has loaded. */
    def ensureWorkerIsLoaded(): js.Promise[Unit] = js.native
    
    /**
      * Clears and returns the contents of the buffer.
      */
    /* CompleteClass */
    override def finish(): js.Promise[ReplayRecordingData] = js.native
    
    /**
      * Get the earliest timestamp in ms of any event currently in the buffer.
      */
    /* CompleteClass */
    override def getEarliestTimestamp(): Double | Null = js.native
    
    /**
      * If any events have been added to the buffer.
      */
    /* CompleteClass */
    override val hasEvents: Boolean = js.native
    /** @inheritDoc */
    @JSName("hasEvents")
    def hasEvents_MEventBufferProxy: Boolean = js.native
    
    /**
      * The buffer type
      */
    /* CompleteClass */
    override val `type`: EventBufferType = js.native
    /** @inheritdoc */
    @JSName("type")
    def type_MEventBufferProxy: EventBufferType = js.native
  }
}
