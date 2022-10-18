package typings.pubnub.anon

import typings.pubnub.mod.ObjectCustom
import typings.pubnub.pubnubStrings.membership
import typings.pubnub.pubnubStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCustom[MembershipCustom /* <: ObjectCustom */] extends StObject {
  
  var data: Custom[MembershipCustom]
  
  var event: set
  
  var `type`: membership
}
object DataCustom {
  
  inline def apply[MembershipCustom /* <: ObjectCustom */](data: Custom[MembershipCustom]): DataCustom[MembershipCustom] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = "set")
    __obj.updateDynamic("type")("membership")
    __obj.asInstanceOf[DataCustom[MembershipCustom]]
  }
  
  extension [Self <: DataCustom[?], MembershipCustom /* <: ObjectCustom */](x: Self & DataCustom[MembershipCustom]) {
    
    inline def setData(value: Custom[MembershipCustom]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: set): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: membership): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
