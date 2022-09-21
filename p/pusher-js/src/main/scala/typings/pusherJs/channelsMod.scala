package typings.pusherJs

import typings.pusherJs.channelTableMod.ChannelTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelsMod {
  
  @JSImport("pusher-js/types/src/core/channels/channels", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Channels {
    
    /* CompleteClass */
    override def add(name: String, pusher: typings.pusherJs.pusherMod.default): typings.pusherJs.channelMod.default = js.native
    
    /* CompleteClass */
    override def all(): js.Array[typings.pusherJs.channelMod.default] = js.native
    
    /* CompleteClass */
    var channels: ChannelTable = js.native
    
    /* CompleteClass */
    override def disconnect(): Unit = js.native
    
    /* CompleteClass */
    override def find(name: String): typings.pusherJs.channelMod.default = js.native
    
    /* CompleteClass */
    override def remove(name: String): typings.pusherJs.channelMod.default = js.native
  }
  
  trait Channels extends StObject {
    
    def add(name: String, pusher: typings.pusherJs.pusherMod.default): typings.pusherJs.channelMod.default
    
    def all(): js.Array[typings.pusherJs.channelMod.default]
    
    var channels: ChannelTable
    
    def disconnect(): Unit
    
    def find(name: String): typings.pusherJs.channelMod.default
    
    def remove(name: String): typings.pusherJs.channelMod.default
  }
  object Channels {
    
    inline def apply(
      add: (String, typings.pusherJs.pusherMod.default) => typings.pusherJs.channelMod.default,
      all: () => js.Array[typings.pusherJs.channelMod.default],
      channels: ChannelTable,
      disconnect: () => Unit,
      find: String => typings.pusherJs.channelMod.default,
      remove: String => typings.pusherJs.channelMod.default
    ): Channels = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), all = js.Any.fromFunction0(all), channels = channels.asInstanceOf[js.Any], disconnect = js.Any.fromFunction0(disconnect), find = js.Any.fromFunction1(find), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[Channels]
    }
    
    extension [Self <: Channels](x: Self) {
      
      inline def setAdd(value: (String, typings.pusherJs.pusherMod.default) => typings.pusherJs.channelMod.default): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setAll(value: () => js.Array[typings.pusherJs.channelMod.default]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
      
      inline def setChannels(value: ChannelTable): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setFind(value: String => typings.pusherJs.channelMod.default): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setRemove(value: String => typings.pusherJs.channelMod.default): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
}
