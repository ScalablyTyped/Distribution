package typings.pubnub.anon

import typings.pubnub.mod.ObjectCustom
import typings.pubnub.pubnubStrings.membership
import typings.pubnub.pubnubStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataChannel[MembershipCustom /* <: ObjectCustom */] extends StObject {
  
  var data: Channel[MembershipCustom] = js.native
  
  var event: set = js.native
  
  var `type`: membership = js.native
}
object DataChannel {
  
  @scala.inline
  def apply[MembershipCustom /* <: ObjectCustom */](data: Channel[MembershipCustom], event: set, `type`: membership): DataChannel[MembershipCustom] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataChannel[MembershipCustom]]
  }
  
  @scala.inline
  implicit class DataChannelMutableBuilder[Self <: DataChannel[_], MembershipCustom /* <: ObjectCustom */] (val x: Self with DataChannel[MembershipCustom]) extends AnyVal {
    
    @scala.inline
    def setData(value: Channel[MembershipCustom]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: set): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: membership): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
