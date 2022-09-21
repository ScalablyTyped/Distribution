package typings.pusherJs

import typings.pusherJs.messageTypesMod.PusherEvent
import typings.pusherJs.optionsMod.ChannelAuthorizationCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelMod {
  
  @JSImport("pusher-js/types/src/core/channels/channel", JSImport.Default)
  @js.native
  open class default protected () extends Channel {
    def this(name: String, pusher: typings.pusherJs.pusherMod.default) = this()
  }
  
  @js.native
  trait Channel
    extends typings.pusherJs.dispatcherMod.default {
    
    def authorize(socketId: String, callback: ChannelAuthorizationCallback): Unit = js.native
    
    def cancelSubscription(): Unit = js.native
    
    def disconnect(): Unit = js.native
    
    def handleEvent(event: PusherEvent): Unit = js.native
    
    def handleSubscriptionCountEvent(event: PusherEvent): Unit = js.native
    
    def handleSubscriptionSucceededEvent(event: PusherEvent): Unit = js.native
    
    var name: String = js.native
    
    var pusher: typings.pusherJs.pusherMod.default = js.native
    
    def reinstateSubscription(): Unit = js.native
    
    def subscribe(): Unit = js.native
    
    var subscribed: Boolean = js.native
    
    var subscriptionCancelled: Boolean = js.native
    
    var subscriptionCount: Null = js.native
    
    var subscriptionPending: Boolean = js.native
    
    def trigger(event: String, data: Any): Boolean = js.native
    
    def unsubscribe(): Unit = js.native
  }
}
