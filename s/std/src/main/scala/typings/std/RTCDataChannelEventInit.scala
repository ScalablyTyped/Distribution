package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDataChannelEventInit extends EventInit {
  
  var channel: RTCDataChannel = js.native
}
object RTCDataChannelEventInit {
  
  @scala.inline
  def apply(channel: RTCDataChannel): RTCDataChannelEventInit = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEventInit]
  }
  
  @scala.inline
  implicit class RTCDataChannelEventInitMutableBuilder[Self <: RTCDataChannelEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: RTCDataChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
