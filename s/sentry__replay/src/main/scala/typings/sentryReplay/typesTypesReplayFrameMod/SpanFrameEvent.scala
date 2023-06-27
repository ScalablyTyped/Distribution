package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.anon.Payload
import typings.sentryReplay.typesTypesRrwebMod.EventType.Custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpanFrameEvent
  extends StObject
     with RecordingCustomEvent
     with ReplayFrameEvent {
  
  @JSName("data")
  var data_SpanFrameEvent: Payload
}
object SpanFrameEvent {
  
  inline def apply(data: Payload, timestamp: Double, `type`: Custom): SpanFrameEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpanFrameEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpanFrameEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: Payload): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
