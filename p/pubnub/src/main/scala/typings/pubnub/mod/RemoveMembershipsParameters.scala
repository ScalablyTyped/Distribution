package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveMembershipsParameters
  extends StObject
     with ChannelMembersParameters {
  
  var channels: js.Array[String]
  
  var uuid: js.UndefOr[String] = js.undefined
}
object RemoveMembershipsParameters {
  
  @scala.inline
  def apply(channels: js.Array[String]): RemoveMembershipsParameters = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveMembershipsParameters]
  }
  
  @scala.inline
  implicit class RemoveMembershipsParametersMutableBuilder[Self <: RemoveMembershipsParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
