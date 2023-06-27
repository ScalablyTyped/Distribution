package typings.sentryReplay.typesTypesReplayMod

import typings.sentryReplay.anon.Metric
import typings.sentryReplay.anon.Payload
import typings.sentryReplay.anon.Tag
import typings.sentryReplay.typesTypesRrwebMod.EventType
import typings.sentryReplay.typesTypesRrwebMod.EventType.Custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrameEvent
  - typings.sentryReplay.typesTypesRrwebMod.eventWithTime
*/
trait RecordingEvent extends StObject
object RecordingEvent {
  
  inline def BreadcrumbFrameEvent(data: Metric, timestamp: Double, `type`: Custom): typings.sentryReplay.typesTypesReplayFrameMod.BreadcrumbFrameEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.BreadcrumbFrameEvent]
  }
  
  inline def OptionFrameEvent(data: Tag, timestamp: Double, `type`: Custom): typings.sentryReplay.typesTypesReplayFrameMod.OptionFrameEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.OptionFrameEvent]
  }
  
  inline def SpanFrameEvent(data: Payload, timestamp: Double, `type`: Custom): typings.sentryReplay.typesTypesReplayFrameMod.SpanFrameEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.SpanFrameEvent]
  }
  
  inline def eventWithTime(data: Any, timestamp: Double, `type`: EventType): typings.sentryReplay.typesTypesRrwebMod.eventWithTime = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesRrwebMod.eventWithTime]
  }
}
