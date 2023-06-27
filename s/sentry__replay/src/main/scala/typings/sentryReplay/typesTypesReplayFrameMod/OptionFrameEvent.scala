package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.anon.Tag
import typings.sentryReplay.typesTypesRrwebMod.EventType.Custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionFrameEvent
  extends StObject
     with RecordingCustomEvent
     with ReplayFrameEvent {
  
  @JSName("data")
  var data_OptionFrameEvent: Tag
}
object OptionFrameEvent {
  
  inline def apply(data: Tag, timestamp: Double, `type`: Custom): OptionFrameEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionFrameEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionFrameEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: Tag): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
