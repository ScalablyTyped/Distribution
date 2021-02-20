package typings.pubnub.anon

import typings.pubnub.pubnubStrings.delete
import typings.pubnub.pubnubStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataId extends StObject {
  
  var data: Id = js.native
  
  var event: delete = js.native
  
  var `type`: uuid = js.native
}
object DataId {
  
  @scala.inline
  def apply(data: Id, event: delete, `type`: uuid): DataId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataId]
  }
  
  @scala.inline
  implicit class DataIdMutableBuilder[Self <: DataId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Id): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: delete): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: uuid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
