package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.anon.PayloadTag
import typings.sentryReplay.typesTypesRrwebMod.EventType.Custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingCustomEvent extends StObject {
  
  var data: PayloadTag
  
  var timestamp: Double
  
  var `type`: Custom
}
object RecordingCustomEvent {
  
  inline def apply(data: PayloadTag, timestamp: Double, `type`: Custom): RecordingCustomEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingCustomEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordingCustomEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: PayloadTag): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: Custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
