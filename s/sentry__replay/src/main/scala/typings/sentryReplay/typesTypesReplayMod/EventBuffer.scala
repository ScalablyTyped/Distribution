package typings.sentryReplay.typesTypesReplayMod

import typings.sentryTypes.typesReplayMod.ReplayRecordingData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBuffer extends StObject {
  
  /**
    * Add an event to the event buffer.
    *
    * Returns a promise that resolves if the event was successfully added, else rejects.
    */
  def addEvent(event: RecordingEvent): js.Promise[AddEventResult]
  
  /**
    * Clear the event buffer.
    */
  def clear(): Unit
  
  /**
    * Destroy the event buffer.
    */
  def destroy(): Unit
  
  /**
    * Clears and returns the contents of the buffer.
    */
  def finish(): js.Promise[ReplayRecordingData]
  
  /**
    * Get the earliest timestamp in ms of any event currently in the buffer.
    */
  def getEarliestTimestamp(): Double | Null
  
  /**
    * If any events have been added to the buffer.
    */
  val hasEvents: Boolean
  
  /**
    * The buffer type
    */
  val `type`: EventBufferType
}
object EventBuffer {
  
  inline def apply(
    addEvent: RecordingEvent => js.Promise[AddEventResult],
    clear: () => Unit,
    destroy: () => Unit,
    finish: () => js.Promise[ReplayRecordingData],
    getEarliestTimestamp: () => Double | Null,
    hasEvents: Boolean,
    `type`: EventBufferType
  ): EventBuffer = {
    val __obj = js.Dynamic.literal(addEvent = js.Any.fromFunction1(addEvent), clear = js.Any.fromFunction0(clear), destroy = js.Any.fromFunction0(destroy), finish = js.Any.fromFunction0(finish), getEarliestTimestamp = js.Any.fromFunction0(getEarliestTimestamp), hasEvents = hasEvents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventBuffer] (val x: Self) extends AnyVal {
    
    inline def setAddEvent(value: RecordingEvent => js.Promise[AddEventResult]): Self = StObject.set(x, "addEvent", js.Any.fromFunction1(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setFinish(value: () => js.Promise[ReplayRecordingData]): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
    
    inline def setGetEarliestTimestamp(value: () => Double | Null): Self = StObject.set(x, "getEarliestTimestamp", js.Any.fromFunction0(value))
    
    inline def setHasEvents(value: Boolean): Self = StObject.set(x, "hasEvents", value.asInstanceOf[js.Any])
    
    inline def setType(value: EventBufferType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
