package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushListChannelsResponse extends StObject {
  
  var channels: js.Array[String] = js.native
}
object PushListChannelsResponse {
  
  @scala.inline
  def apply(channels: js.Array[String]): PushListChannelsResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushListChannelsResponse]
  }
  
  @scala.inline
  implicit class PushListChannelsResponseMutableBuilder[Self <: PushListChannelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
  }
}
