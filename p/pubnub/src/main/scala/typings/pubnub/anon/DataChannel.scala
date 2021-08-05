package typings.pubnub.anon

import typings.pubnub.mod.ObjectCustom
import typings.pubnub.pubnubStrings.membership
import typings.pubnub.pubnubStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataChannel[MembershipCustom /* <: ObjectCustom */] extends StObject {
  
  var data: Channel[MembershipCustom]
  
  var event: set
  
  var `type`: membership
}
object DataChannel {
  
  inline def apply[MembershipCustom /* <: ObjectCustom */](data: Channel[MembershipCustom]): DataChannel[MembershipCustom] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = "set")
    __obj.updateDynamic("type")("membership")
    __obj.asInstanceOf[DataChannel[MembershipCustom]]
  }
  
  extension [Self <: DataChannel[?], MembershipCustom /* <: ObjectCustom */](x: Self & DataChannel[MembershipCustom]) {
    
    inline def setData(value: Channel[MembershipCustom]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: set): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: membership): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
