package typings.pubnub.anon

import typings.pubnub.mod.ObjectCustom
import typings.pubnub.mod.UUIDMetadataObject
import typings.pubnub.pubnubStrings.set
import typings.pubnub.pubnubStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataEventType[UUIDCustom /* <: ObjectCustom */] extends StObject {
  
  var data: UUIDMetadataObject[UUIDCustom]
  
  var event: set
  
  var `type`: uuid
}
object DataEventType {
  
  inline def apply[UUIDCustom /* <: ObjectCustom */](data: UUIDMetadataObject[UUIDCustom]): DataEventType[UUIDCustom] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = "set")
    __obj.updateDynamic("type")("uuid")
    __obj.asInstanceOf[DataEventType[UUIDCustom]]
  }
  
  extension [Self <: DataEventType[?], UUIDCustom /* <: ObjectCustom */](x: Self & DataEventType[UUIDCustom]) {
    
    inline def setData(value: UUIDMetadataObject[UUIDCustom]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: set): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: uuid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
