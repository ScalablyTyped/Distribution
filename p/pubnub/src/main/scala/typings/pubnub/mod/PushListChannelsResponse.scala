package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushListChannelsResponse extends StObject {
  
  var channels: js.Array[String]
}
object PushListChannelsResponse {
  
  inline def apply(channels: js.Array[String]): PushListChannelsResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushListChannelsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PushListChannelsResponse] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
  }
}
