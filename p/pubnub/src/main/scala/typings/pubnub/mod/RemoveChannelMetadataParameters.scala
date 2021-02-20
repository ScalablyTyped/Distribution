package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveChannelMetadataParameters extends StObject {
  
  var channel: String = js.native
}
object RemoveChannelMetadataParameters {
  
  @scala.inline
  def apply(channel: String): RemoveChannelMetadataParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveChannelMetadataParameters]
  }
  
  @scala.inline
  implicit class RemoveChannelMetadataParametersMutableBuilder[Self <: RemoveChannelMetadataParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
