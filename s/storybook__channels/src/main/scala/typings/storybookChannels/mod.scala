package typings.storybookChannels

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/channels", JSImport.Default)
  @js.native
  open class default () extends Channel {
    def this(param0: ChannelArgs) = this()
  }
  
  @JSImport("@storybook/channels", "Channel")
  @js.native
  open class Channel () extends StObject {
    def this(param0: ChannelArgs) = this()
    
    def addListener(eventName: String, listener: Listener): Unit = js.native
    
    def addPeerListener(eventName: String, listener: Listener): Unit = js.native
    
    /* private */ var data: Any = js.native
    
    def emit(
      eventName: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Unit = js.native
    
    def eventNames(): js.Array[String] = js.native
    
    /* private */ var events: Any = js.native
    
    /* private */ var handleEvent: Any = js.native
    
    def hasTransport: Boolean = js.native
    
    val isAsync: Boolean = js.native
    
    def last(eventName: String): Any = js.native
    
    def listenerCount(eventName: String): Double = js.native
    
    def listeners(eventName: String): js.UndefOr[js.Array[Listener]] = js.native
    
    def off(eventName: String, listener: Listener): Unit = js.native
    
    def on(eventName: String, listener: Listener): Unit = js.native
    
    def once(eventName: String, listener: Listener): Unit = js.native
    
    /* private */ var onceListener: Any = js.native
    
    def removeAllListeners(): Unit = js.native
    def removeAllListeners(eventName: String): Unit = js.native
    
    def removeListener(eventName: String, listener: Listener): Unit = js.native
    
    /* private */ var sender: Any = js.native
    
    /* private */ val transport: Any = js.native
  }
  
  trait ChannelArgs extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var transport: js.UndefOr[ChannelTransport] = js.undefined
  }
  object ChannelArgs {
    
    inline def apply(): ChannelArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelArgs] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setTransport(value: ChannelTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  trait ChannelEvent extends StObject {
    
    var args: js.Array[Any]
    
    var from: String
    
    var `type`: String
  }
  object ChannelEvent {
    
    inline def apply(args: js.Array[Any], from: String, `type`: String): ChannelEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelEvent] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ChannelHandler = js.Function1[/* event */ ChannelEvent, Unit]
  
  @js.native
  trait ChannelTransport extends StObject {
    
    def send(event: ChannelEvent): Unit = js.native
    def send(event: ChannelEvent, options: Any): Unit = js.native
    
    def setHandler(handler: ChannelHandler): Unit = js.native
  }
  
  type Listener = js.Function1[/* repeated */ Any, Unit]
}
