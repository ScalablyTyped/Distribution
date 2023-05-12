package typings.sentryReplay

import typings.sentryReplay.typesTypesMod.AddEventResult
import typings.sentryReplay.typesTypesMod.EventBuffer
import typings.sentryReplay.typesTypesMod.EventBufferType
import typings.sentryReplay.typesTypesMod.RecordingEvent
import typings.sentryTypes.typesReplayMod.ReplayRecordingData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventBufferEventBufferArrayMod {
  
  @JSImport("@sentry/replay/types/eventBuffer/EventBufferArray", "EventBufferArray")
  @js.native
  open class EventBufferArray ()
    extends StObject
       with EventBuffer {
    
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
    
    /** All the events that are buffered to be sent. */
    var events: js.Array[RecordingEvent] = js.native
    
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
    def hasEvents_MEventBufferArray: Boolean = js.native
    
    /**
      * The buffer type
      */
    /* CompleteClass */
    override val `type`: EventBufferType = js.native
    /** @inheritdoc */
    @JSName("type")
    def type_MEventBufferArray: EventBufferType = js.native
  }
}
