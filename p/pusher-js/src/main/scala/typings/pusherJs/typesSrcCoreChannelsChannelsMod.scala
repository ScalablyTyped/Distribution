package typings.pusherJs

import typings.pusherJs.typesSrcCoreChannelsChannelTableMod.ChannelTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreChannelsChannelsMod {
  
  @JSImport("pusher-js/types/src/core/channels/channels", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Channels {
    
    /* CompleteClass */
    override def add(name: String, pusher: typings.pusherJs.typesSrcCorePusherMod.default): typings.pusherJs.typesSrcCoreChannelsChannelMod.default = js.native
    
    /* CompleteClass */
    override def all(): js.Array[typings.pusherJs.typesSrcCoreChannelsChannelMod.default] = js.native
    
    /* CompleteClass */
    var channels: ChannelTable = js.native
    
    /* CompleteClass */
    override def disconnect(): Unit = js.native
    
    /* CompleteClass */
    override def find(name: String): typings.pusherJs.typesSrcCoreChannelsChannelMod.default = js.native
    
    /* CompleteClass */
    override def remove(name: String): typings.pusherJs.typesSrcCoreChannelsChannelMod.default = js.native
  }
  
  trait Channels extends StObject {
    
    def add(name: String, pusher: typings.pusherJs.typesSrcCorePusherMod.default): typings.pusherJs.typesSrcCoreChannelsChannelMod.default
    
    def all(): js.Array[typings.pusherJs.typesSrcCoreChannelsChannelMod.default]
    
    var channels: ChannelTable
    
    def disconnect(): Unit
    
    def find(name: String): typings.pusherJs.typesSrcCoreChannelsChannelMod.default
    
    def remove(name: String): typings.pusherJs.typesSrcCoreChannelsChannelMod.default
  }
  object Channels {
    
    inline def apply(
      add: (String, typings.pusherJs.typesSrcCorePusherMod.default) => typings.pusherJs.typesSrcCoreChannelsChannelMod.default,
      all: () => js.Array[typings.pusherJs.typesSrcCoreChannelsChannelMod.default],
      channels: ChannelTable,
      disconnect: () => Unit,
      find: String => typings.pusherJs.typesSrcCoreChannelsChannelMod.default,
      remove: String => typings.pusherJs.typesSrcCoreChannelsChannelMod.default
    ): Channels = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), all = js.Any.fromFunction0(all), channels = channels.asInstanceOf[js.Any], disconnect = js.Any.fromFunction0(disconnect), find = js.Any.fromFunction1(find), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[Channels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Channels] (val x: Self) extends AnyVal {
      
      inline def setAdd(
        value: (String, typings.pusherJs.typesSrcCorePusherMod.default) => typings.pusherJs.typesSrcCoreChannelsChannelMod.default
      ): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setAll(value: () => js.Array[typings.pusherJs.typesSrcCoreChannelsChannelMod.default]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
      
      inline def setChannels(value: ChannelTable): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setFind(value: String => typings.pusherJs.typesSrcCoreChannelsChannelMod.default): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setRemove(value: String => typings.pusherJs.typesSrcCoreChannelsChannelMod.default): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
}
