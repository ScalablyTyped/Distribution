package typings.stompit

import typings.stompit.channelMod.ChannelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelPoolMod {
  
  @JSImport("stompit/lib/ChannelPool", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ChannelPool {
    def this(connectFailover: typings.stompit.connectFailoverMod.^) = this()
    def this(connectFailover: typings.stompit.connectFailoverMod.^, options: ChannelPoolOptions) = this()
    
    /* CompleteClass */
    override def channel(
      callback: js.Function2[/* err */ js.Error | Null, /* channel */ typings.stompit.channelMod.^, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
  }
  
  trait ChannelPool extends StObject {
    
    def channel(
      callback: js.Function2[/* err */ js.Error | Null, /* channel */ typings.stompit.channelMod.^, Unit]
    ): Unit
    
    def close(): Unit
  }
  object ChannelPool {
    
    inline def apply(
      channel: js.Function2[/* err */ js.Error | Null, /* channel */ typings.stompit.channelMod.^, Unit] => Unit,
      close: () => Unit
    ): ChannelPool = {
      val __obj = js.Dynamic.literal(channel = js.Any.fromFunction1(channel), close = js.Any.fromFunction0(close))
      __obj.asInstanceOf[ChannelPool]
    }
    
    extension [Self <: ChannelPool](x: Self) {
      
      inline def setChannel(
        value: js.Function2[/* err */ js.Error | Null, /* channel */ typings.stompit.channelMod.^, Unit] => Unit
      ): Self = StObject.set(x, "channel", js.Any.fromFunction1(value))
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    }
  }
  
  trait ChannelPoolOptions extends StObject {
    
    var channelOptions: js.UndefOr[ChannelOptions] = js.undefined
    
    var freeExcessTimeout: js.UndefOr[Double] = js.undefined
    
    var maxChannels: js.UndefOr[Double] = js.undefined
    
    var minChannels: js.UndefOr[Double] = js.undefined
    
    var minFreeChannels: js.UndefOr[Double] = js.undefined
    
    var requestChannelTimeout: js.UndefOr[Double] = js.undefined
  }
  object ChannelPoolOptions {
    
    inline def apply(): ChannelPoolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelPoolOptions]
    }
    
    extension [Self <: ChannelPoolOptions](x: Self) {
      
      inline def setChannelOptions(value: ChannelOptions): Self = StObject.set(x, "channelOptions", value.asInstanceOf[js.Any])
      
      inline def setChannelOptionsUndefined: Self = StObject.set(x, "channelOptions", js.undefined)
      
      inline def setFreeExcessTimeout(value: Double): Self = StObject.set(x, "freeExcessTimeout", value.asInstanceOf[js.Any])
      
      inline def setFreeExcessTimeoutUndefined: Self = StObject.set(x, "freeExcessTimeout", js.undefined)
      
      inline def setMaxChannels(value: Double): Self = StObject.set(x, "maxChannels", value.asInstanceOf[js.Any])
      
      inline def setMaxChannelsUndefined: Self = StObject.set(x, "maxChannels", js.undefined)
      
      inline def setMinChannels(value: Double): Self = StObject.set(x, "minChannels", value.asInstanceOf[js.Any])
      
      inline def setMinChannelsUndefined: Self = StObject.set(x, "minChannels", js.undefined)
      
      inline def setMinFreeChannels(value: Double): Self = StObject.set(x, "minFreeChannels", value.asInstanceOf[js.Any])
      
      inline def setMinFreeChannelsUndefined: Self = StObject.set(x, "minFreeChannels", js.undefined)
      
      inline def setRequestChannelTimeout(value: Double): Self = StObject.set(x, "requestChannelTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestChannelTimeoutUndefined: Self = StObject.set(x, "requestChannelTimeout", js.undefined)
    }
  }
}
