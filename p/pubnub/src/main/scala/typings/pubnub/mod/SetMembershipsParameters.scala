package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetMembershipsParameters[Custom /* <: ObjectCustom */] extends ChannelMembersParameters {
  
  var channels: js.UndefOr[js.Array[String | SetCustom[Custom]]] = js.native
  
  var uuid: js.UndefOr[String] = js.native
}
object SetMembershipsParameters {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](): SetMembershipsParameters[Custom] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetMembershipsParameters[Custom]]
  }
  
  @scala.inline
  implicit class SetMembershipsParametersMutableBuilder[Self <: SetMembershipsParameters[_], Custom /* <: ObjectCustom */] (val x: Self with SetMembershipsParameters[Custom]) extends AnyVal {
    
    @scala.inline
    def setChannels(value: js.Array[String | SetCustom[Custom]]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: (String | SetCustom[Custom])*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
