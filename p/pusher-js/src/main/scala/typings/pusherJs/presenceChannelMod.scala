package typings.pusherJs

import typings.pusherJs.messageTypesMod.PusherEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presenceChannelMod {
  
  @JSImport("pusher-js/types/src/core/channels/presence_channel", JSImport.Default)
  @js.native
  open class default protected () extends PresenceChannel {
    def this(name: String, pusher: typings.pusherJs.pusherMod.default) = this()
  }
  
  @js.native
  trait PresenceChannel
    extends typings.pusherJs.privateChannelMod.default {
    
    def authorize(socketId: String, callback: js.Function): Unit = js.native
    
    def handleInternalEvent(event: PusherEvent): Unit = js.native
    
    var members: typings.pusherJs.membersMod.default = js.native
  }
}
