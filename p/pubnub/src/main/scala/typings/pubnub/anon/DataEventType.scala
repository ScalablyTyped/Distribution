package typings.pubnub.anon

import typings.pubnub.mod.ObjectCustom
import typings.pubnub.mod.UUIDMetadataObject
import typings.pubnub.pubnubStrings.set
import typings.pubnub.pubnubStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataEventType[UUIDCustom /* <: ObjectCustom */] extends StObject {
  
  var data: UUIDMetadataObject[UUIDCustom] = js.native
  
  var event: set = js.native
  
  var `type`: uuid = js.native
}
object DataEventType {
  
  @scala.inline
  def apply[UUIDCustom /* <: ObjectCustom */](data: UUIDMetadataObject[UUIDCustom], event: set, `type`: uuid): DataEventType[UUIDCustom] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEventType[UUIDCustom]]
  }
  
  @scala.inline
  implicit class DataEventTypeMutableBuilder[Self <: DataEventType[_], UUIDCustom /* <: ObjectCustom */] (val x: Self with DataEventType[UUIDCustom]) extends AnyVal {
    
    @scala.inline
    def setData(value: UUIDMetadataObject[UUIDCustom]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: set): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: uuid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
