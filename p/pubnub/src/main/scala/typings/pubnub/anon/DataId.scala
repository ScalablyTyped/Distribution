package typings.pubnub.anon

import typings.pubnub.pubnubStrings.delete
import typings.pubnub.pubnubStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataId extends StObject {
  
  var data: Id
  
  var event: delete
  
  var `type`: uuid
}
object DataId {
  
  inline def apply(data: Id): DataId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = "delete")
    __obj.updateDynamic("type")("uuid")
    __obj.asInstanceOf[DataId]
  }
  
  extension [Self <: DataId](x: Self) {
    
    inline def setData(value: Id): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: delete): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: uuid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
