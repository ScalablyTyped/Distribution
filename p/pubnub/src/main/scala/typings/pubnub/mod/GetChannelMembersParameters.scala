package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelMembersParameters
  extends StObject
     with UUIDMembersParameters {
  
  var channel: String
}
object GetChannelMembersParameters {
  
  @scala.inline
  def apply(channel: String): GetChannelMembersParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelMembersParameters]
  }
  
  @scala.inline
  implicit class GetChannelMembersParametersMutableBuilder[Self <: GetChannelMembersParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
