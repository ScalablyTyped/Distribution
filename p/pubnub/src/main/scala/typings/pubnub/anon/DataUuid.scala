package typings.pubnub.anon

import typings.pubnub.pubnubStrings.delete
import typings.pubnub.pubnubStrings.membership
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataUuid extends StObject {
  
  var data: Uuid = js.native
  
  var event: delete = js.native
  
  var `type`: membership = js.native
}
object DataUuid {
  
  @scala.inline
  def apply(data: Uuid, event: delete, `type`: membership): DataUuid = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataUuid]
  }
  
  @scala.inline
  implicit class DataUuidMutableBuilder[Self <: DataUuid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Uuid): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: delete): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: membership): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
