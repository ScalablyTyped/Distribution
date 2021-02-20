package typings.stompit

import typings.std.Error
import typings.stompit.channelMod.ChannelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelPoolMod {
  
  @JSImport("stompit/lib/ChannelPool", JSImport.Namespace)
  @js.native
  class ^ protected () extends ChannelPool {
    def this(connectFailover: typings.stompit.connectFailoverMod.^) = this()
    def this(connectFailover: typings.stompit.connectFailoverMod.^, options: ChannelPoolOptions) = this()
  }
  
  @js.native
  trait ChannelPool extends StObject {
    
    def channel(callback: js.Function2[/* err */ Error | Null, /* channel */ typings.stompit.channelMod.^, Unit]): Unit = js.native
    
    def close(): Unit = js.native
  }
  object ChannelPool {
    
    @scala.inline
    def apply(
      channel: js.Function2[/* err */ Error | Null, /* channel */ typings.stompit.channelMod.^, Unit] => Unit,
      close: () => Unit
    ): ChannelPool = {
      val __obj = js.Dynamic.literal(channel = js.Any.fromFunction1(channel), close = js.Any.fromFunction0(close))
      __obj.asInstanceOf[ChannelPool]
    }
    
    @scala.inline
    implicit class ChannelPoolMutableBuilder[Self <: ChannelPool] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(
        value: js.Function2[/* err */ Error | Null, /* channel */ typings.stompit.channelMod.^, Unit] => Unit
      ): Self = StObject.set(x, "channel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ChannelPoolOptions extends StObject {
    
    var channelOptions: js.UndefOr[ChannelOptions] = js.native
    
    var freeExcessTimeout: js.UndefOr[Double] = js.native
    
    var maxChannels: js.UndefOr[Double] = js.native
    
    var minChannels: js.UndefOr[Double] = js.native
    
    var minFreeChannels: js.UndefOr[Double] = js.native
    
    var requestChannelTimeout: js.UndefOr[Double] = js.native
  }
  object ChannelPoolOptions {
    
    @scala.inline
    def apply(): ChannelPoolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelPoolOptions]
    }
    
    @scala.inline
    implicit class ChannelPoolOptionsMutableBuilder[Self <: ChannelPoolOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelOptions(value: ChannelOptions): Self = StObject.set(x, "channelOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelOptionsUndefined: Self = StObject.set(x, "channelOptions", js.undefined)
      
      @scala.inline
      def setFreeExcessTimeout(value: Double): Self = StObject.set(x, "freeExcessTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeExcessTimeoutUndefined: Self = StObject.set(x, "freeExcessTimeout", js.undefined)
      
      @scala.inline
      def setMaxChannels(value: Double): Self = StObject.set(x, "maxChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxChannelsUndefined: Self = StObject.set(x, "maxChannels", js.undefined)
      
      @scala.inline
      def setMinChannels(value: Double): Self = StObject.set(x, "minChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinChannelsUndefined: Self = StObject.set(x, "minChannels", js.undefined)
      
      @scala.inline
      def setMinFreeChannels(value: Double): Self = StObject.set(x, "minFreeChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinFreeChannelsUndefined: Self = StObject.set(x, "minFreeChannels", js.undefined)
      
      @scala.inline
      def setRequestChannelTimeout(value: Double): Self = StObject.set(x, "requestChannelTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestChannelTimeoutUndefined: Self = StObject.set(x, "requestChannelTimeout", js.undefined)
    }
  }
}
