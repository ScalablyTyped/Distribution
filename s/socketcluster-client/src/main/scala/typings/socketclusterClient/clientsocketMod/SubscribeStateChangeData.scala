package typings.socketclusterClient.clientsocketMod

import typings.agChannel.mod.ChannelState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeStateChangeData
  extends StObject
     with SubscribeData {
  
  var newChannelState: ChannelState
  
  var oldChannelState: ChannelState
}
object SubscribeStateChangeData {
  
  @scala.inline
  def apply(
    channel: String,
    newChannelState: ChannelState,
    oldChannelState: ChannelState,
    subscriptionOptions: SubscribeOptions
  ): SubscribeStateChangeData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], newChannelState = newChannelState.asInstanceOf[js.Any], oldChannelState = oldChannelState.asInstanceOf[js.Any], subscriptionOptions = subscriptionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeStateChangeData]
  }
  
  @scala.inline
  implicit class SubscribeStateChangeDataMutableBuilder[Self <: SubscribeStateChangeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewChannelState(value: ChannelState): Self = StObject.set(x, "newChannelState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldChannelState(value: ChannelState): Self = StObject.set(x, "oldChannelState", value.asInstanceOf[js.Any])
  }
}
