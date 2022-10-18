package typings.pusherJs

import typings.pusherJs.typesSrcCoreConnectionConnectionManagerOptionsMod.ConnectionManagerOptions
import typings.pusherJs.typesSrcCoreTimelineTimelineSenderMod.TimelineSenderOptions
import typings.pusherJs.typesSrcCoreTransportsPingDelayOptionsMod.PingDelayOptions
import typings.tweetnacl.mod.nacl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreUtilsFactoryMod {
  
  object default {
    
    @JSImport("pusher-js/types/src/core/utils/factory", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createAssistantToTheTransportManager(
      manager: typings.pusherJs.typesSrcCoreTransportsTransportManagerMod.default,
      transport: typings.pusherJs.typesSrcCoreTransportsTransportMod.default,
      options: PingDelayOptions
    ): typings.pusherJs.typesSrcCoreTransportsAssistantToTheTransportManagerMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createAssistantToTheTransportManager")(manager.asInstanceOf[js.Any], transport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.typesSrcCoreTransportsAssistantToTheTransportManagerMod.default]
    
    inline def createChannel(name: String, pusher: typings.pusherJs.typesSrcCorePusherMod.default): typings.pusherJs.typesSrcCoreChannelsChannelMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createChannel")(name.asInstanceOf[js.Any], pusher.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.typesSrcCoreChannelsChannelMod.default]
    
    inline def createChannels(): typings.pusherJs.typesSrcCoreChannelsChannelsMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("createChannels")().asInstanceOf[typings.pusherJs.typesSrcCoreChannelsChannelsMod.default]
    
    inline def createConnectionManager(key: String, options: ConnectionManagerOptions): typings.pusherJs.typesSrcCoreConnectionConnectionManagerMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnectionManager")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.typesSrcCoreConnectionConnectionManagerMod.default]
    
    inline def createEncryptedChannel(name: String, pusher: typings.pusherJs.typesSrcCorePusherMod.default, nacl: nacl): typings.pusherJs.typesSrcCoreChannelsEncryptedChannelMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createEncryptedChannel")(name.asInstanceOf[js.Any], pusher.asInstanceOf[js.Any], nacl.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.typesSrcCoreChannelsEncryptedChannelMod.default]
    
    inline def createHandshake(
      transport: typings.pusherJs.typesSrcCoreTransportsTransportConnectionMod.default,
      callback: js.Function1[/* HandshakePayload */ Any, Unit]
    ): typings.pusherJs.typesSrcCoreConnectionHandshakeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createHandshake")(transport.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.typesSrcCoreConnectionHandshakeMod.default]
    
    inline def createPresenceChannel(name: String, pusher: typings.pusherJs.typesSrcCorePusherMod.default): typings.pusherJs.typesSrcCoreChannelsPresenceChannelMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createPresenceChannel")(name.asInstanceOf[js.Any], pusher.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.typesSrcCoreChannelsPresenceChannelMod.default]
    
    inline def createPrivateChannel(name: String, pusher: typings.pusherJs.typesSrcCorePusherMod.default): typings.pusherJs.typesSrcCoreChannelsPrivateChannelMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateChannel")(name.asInstanceOf[js.Any], pusher.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.typesSrcCoreChannelsPrivateChannelMod.default]
    
    inline def createTimelineSender(timeline: typings.pusherJs.typesSrcCoreTimelineTimelineMod.default, options: TimelineSenderOptions): typings.pusherJs.typesSrcCoreTimelineTimelineSenderMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createTimelineSender")(timeline.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pusherJs.typesSrcCoreTimelineTimelineSenderMod.default]
  }
}
