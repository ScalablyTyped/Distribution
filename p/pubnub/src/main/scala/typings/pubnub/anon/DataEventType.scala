package typings.pubnub.anon

import typings.pubnub.mod.ObjectCustom
import typings.pubnub.pubnubStrings.membership
import typings.pubnub.pubnubStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataEventType[MembershipCustom /* <: ObjectCustom */] extends StObject {
  
  var data: Channel[MembershipCustom]
  
  var event: set
  
  var `type`: membership
}
object DataEventType {
  
  inline def apply[MembershipCustom /* <: ObjectCustom */](data: Channel[MembershipCustom]): DataEventType[MembershipCustom] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = "set")
    __obj.updateDynamic("type")("membership")
    __obj.asInstanceOf[DataEventType[MembershipCustom]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataEventType[?], MembershipCustom /* <: ObjectCustom */] (val x: Self & DataEventType[MembershipCustom]) extends AnyVal {
    
    inline def setData(value: Channel[MembershipCustom]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: set): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: membership): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
