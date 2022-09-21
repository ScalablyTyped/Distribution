package typings.pusherJs

import typings.pusherJs.connectionManagerOptionsMod.ConnectionManagerOptions
import typings.pusherJs.pingDelayOptionsMod.PingDelayOptions
import typings.pusherJs.timelineSenderMod.TimelineSenderOptions
import typings.tweetnacl.mod.nacl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  object default {
    
    @JSImport("pusher-js/types/src/core/utils/factory", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createAssistantToTheTransportManager(
      manager: typings.pusherJs.transportManagerMod.default,
      transport: typings.pusherJs.transportMod.default,
      options: PingDelayOptions
    ): typings.pusherJs.assistantToTheTransportManagerMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createAssistantToTheTransportManager")(manager.asInstanceOf[js.Any], transport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.assistantToTheTransportManagerMod.default]
    
    inline def createChannel(name: String, pusher: typings.pusherJs.pusherMod.default): typings.pusherJs.channelMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createChannel")(name.asInstanceOf[js.Any], pusher.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.channelMod.default]
    
    inline def createChannels(): typings.pusherJs.channelsMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("createChannels")().asInstanceOf[typings.pusherJs.channelsMod.default]
    
    inline def createConnectionManager(key: String, options: ConnectionManagerOptions): typings.pusherJs.connectionManagerMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnectionManager")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.connectionManagerMod.default]
    
    inline def createEncryptedChannel(name: String, pusher: typings.pusherJs.pusherMod.default, nacl: nacl): typings.pusherJs.encryptedChannelMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createEncryptedChannel")(name.asInstanceOf[js.Any], pusher.asInstanceOf[js.Any], nacl.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.encryptedChannelMod.default]
    
    inline def createHandshake(
      transport: typings.pusherJs.transportConnectionMod.default,
      callback: js.Function1[/* HandshakePayload */ Any, Unit]
    ): typings.pusherJs.handshakeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createHandshake")(transport.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.handshakeMod.default]
    
    inline def createPresenceChannel(name: String, pusher: typings.pusherJs.pusherMod.default): typings.pusherJs.presenceChannelMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createPresenceChannel")(name.asInstanceOf[js.Any], pusher.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.presenceChannelMod.default]
    
    inline def createPrivateChannel(name: String, pusher: typings.pusherJs.pusherMod.default): typings.pusherJs.privateChannelMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateChannel")(name.asInstanceOf[js.Any], pusher.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.privateChannelMod.default]
    
    inline def createTimelineSender(timeline: typings.pusherJs.timelineMod.default, options: TimelineSenderOptions): typings.pusherJs.timelineSenderMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createTimelineSender")(timeline.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.timelineSenderMod.default]
  }
}
