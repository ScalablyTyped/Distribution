package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveChannelMetadataParameters extends StObject {
  
  var channel: String
}
object RemoveChannelMetadataParameters {
  
  inline def apply(channel: String): RemoveChannelMetadataParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveChannelMetadataParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveChannelMetadataParameters] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
