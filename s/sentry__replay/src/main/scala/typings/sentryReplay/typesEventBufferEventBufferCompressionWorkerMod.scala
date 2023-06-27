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

object typesEventBufferEventBufferCompressionWorkerMod {
  
  @JSImport("@sentry/replay/types/eventBuffer/EventBufferCompressionWorker", "EventBufferCompressionWorker")
  @js.native
  open class EventBufferCompressionWorker protected ()
    extends StObject
       with EventBuffer {
    def this(worker: Worker) = this()
    
    /* private */ var _earliestTimestamp: Any = js.native
    
    /**
      * Finish the request and return the compressed data from the worker.
      */
    /* private */ var _finishRequest: Any = js.native
    
    /**
      * Send the event to the worker.
      */
    /* private */ var _sendEventToWorker: Any = js.native
    
    /* private */ var _totalSize: Any = js.native
    
    /* private */ var _worker: Any = js.native
    
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
    
    /**
      * Ensure the worker is ready (or not).
      * This will either resolve when the worker is ready, or reject if an error occured.
      */
    def ensureReady(): js.Promise[Unit] = js.native
    
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
    /** @inheritdoc */
    @JSName("hasEvents")
    def hasEvents_MEventBufferCompressionWorker: Boolean = js.native
    
    /**
      * The buffer type
      */
    /* CompleteClass */
    override val `type`: EventBufferType = js.native
    /** @inheritdoc */
    @JSName("type")
    def type_MEventBufferCompressionWorker: EventBufferType = js.native
  }
}
