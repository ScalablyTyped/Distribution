package typings.pubnub.anon

import typings.pubnub.pubnubStrings.delete
import typings.pubnub.pubnubStrings.membership
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataUuid extends StObject {
  
  var data: Uuid
  
  var event: delete
  
  var `type`: membership
}
object DataUuid {
  
  inline def apply(data: Uuid): DataUuid = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = "delete")
    __obj.updateDynamic("type")("membership")
    __obj.asInstanceOf[DataUuid]
  }
  
  extension [Self <: DataUuid](x: Self) {
    
    inline def setData(value: Uuid): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: delete): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: membership): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
