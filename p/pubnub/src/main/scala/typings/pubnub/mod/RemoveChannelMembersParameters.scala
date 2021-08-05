package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveChannelMembersParameters
  extends StObject
     with UUIDMembersParameters {
  
  var channel: String
  
  var uuids: js.Array[String]
}
object RemoveChannelMembersParameters {
  
  inline def apply(channel: String, uuids: js.Array[String]): RemoveChannelMembersParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], uuids = uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveChannelMembersParameters]
  }
  
  extension [Self <: RemoveChannelMembersParameters](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setUuids(value: js.Array[String]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    inline def setUuidsVarargs(value: String*): Self = StObject.set(x, "uuids", js.Array(value :_*))
  }
}
