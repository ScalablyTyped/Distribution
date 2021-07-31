package typings.scChannel

import typings.scChannel.scChannelStrings.pending
import typings.scChannel.scChannelStrings.subscribed
import typings.scChannel.scChannelStrings.unsubscribed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sc-channel", JSImport.Namespace)
  @js.native
  class ^[T] protected () extends SCChannel[T] {
    def this(
      name: String,
      client: Client,
      eventDemux: typings.streamDemux.mod.^[T],
      dataStream: typings.asyncIterableStream.mod.^[T]
    ) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.scChannel.scChannelStrings.pending
    - typings.scChannel.scChannelStrings.subscribed
    - typings.scChannel.scChannelStrings.unsubscribed
  */
  trait ChannelState extends StObject
  object ChannelState {
    
    @scala.inline
    def pending: typings.scChannel.scChannelStrings.pending = "pending".asInstanceOf[typings.scChannel.scChannelStrings.pending]
    
    @scala.inline
    def subscribed: typings.scChannel.scChannelStrings.subscribed = "subscribed".asInstanceOf[typings.scChannel.scChannelStrings.subscribed]
    
    @scala.inline
    def unsubscribed: typings.scChannel.scChannelStrings.unsubscribed = "unsubscribed".asInstanceOf[typings.scChannel.scChannelStrings.unsubscribed]
  }
  
  @js.native
  trait Client extends StObject {
    
    def closeChannel(channelName: String): Unit = js.native
    
    def getChannelOptions(channelName: String): js.Object = js.native
    
    def getChannelState(channelName: String): ChannelState = js.native
    
    def isSubscribed(channelName: String): Boolean = js.native
    def isSubscribed(channelName: String, includePending: Boolean): Boolean = js.native
    
    def publish(channelName: String, data: js.Any): js.Any = js.native
    
    def subscribe(channelName: String): SCChannel[js.Any] = js.native
    
    def unsubscribe(channelName: String): Unit = js.native
  }
  
  @js.native
  trait SCChannel[T]
    extends typings.asyncIterableStream.mod.^[T] {
    
    val PENDING: pending = js.native
    
    val SUBSCRIBED: subscribed = js.native
    
    val UNSUBSCRIBED: unsubscribed = js.native
    
    var client: Client = js.native
    
    def close(): Unit = js.native
    
    def closeAllListeners(): Unit = js.native
    
    def closeListener(eventName: String): Unit = js.native
    
    def isSubscribed(): Boolean = js.native
    def isSubscribed(includePending: Boolean): Boolean = js.native
    
    def listener(eventName: String): typings.streamDemux.demuxedConsumableStreamMod.^[T] = js.native
    
    var name: String = js.native
    
    var options: js.Object = js.native
    
    def publish(data: js.Any): js.Any = js.native
    
    var state: ChannelState = js.native
    
    def subscribe(): Unit = js.native
    def subscribe(options: js.Any): Unit = js.native
    
    def unsubscribe(): Unit = js.native
  }
}
