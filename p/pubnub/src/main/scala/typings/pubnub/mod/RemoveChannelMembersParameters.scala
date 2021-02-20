package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveChannelMembersParameters extends UUIDMembersParameters {
  
  var channel: String = js.native
  
  var uuids: js.Array[String] = js.native
}
object RemoveChannelMembersParameters {
  
  @scala.inline
  def apply(channel: String, uuids: js.Array[String]): RemoveChannelMembersParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], uuids = uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveChannelMembersParameters]
  }
  
  @scala.inline
  implicit class RemoveChannelMembersParametersMutableBuilder[Self <: RemoveChannelMembersParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuids(value: js.Array[String]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidsVarargs(value: String*): Self = StObject.set(x, "uuids", js.Array(value :_*))
  }
}
