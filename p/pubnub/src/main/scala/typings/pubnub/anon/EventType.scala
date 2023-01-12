package typings.pubnub.anon

import typings.pubnub.pubnubStrings.channel
import typings.pubnub.pubnubStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventType extends StObject {
  
  var data: IdString
  
  var event: delete
  
  var `type`: channel
}
object EventType {
  
  inline def apply(data: IdString): EventType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = "delete")
    __obj.updateDynamic("type")("channel")
    __obj.asInstanceOf[EventType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventType] (val x: Self) extends AnyVal {
    
    inline def setData(value: IdString): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: delete): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: channel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
