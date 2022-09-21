package typings.storybookChannelPostmessage

import typings.storybookChannelPostmessage.storybookChannelPostmessageStrings.manager
import typings.storybookChannelPostmessage.storybookChannelPostmessageStrings.preview
import typings.storybookChannels.mod.ChannelEvent
import typings.storybookChannels.mod.ChannelHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/channel-postmessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasPage: Config): typings.storybookChannels.mod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPage.asInstanceOf[js.Any]).asInstanceOf[typings.storybookChannels.mod.default]
  
  @JSImport("@storybook/channel-postmessage", "KEY")
  @js.native
  val KEY: /* "storybook-channel" */ String = js.native
  
  @JSImport("@storybook/channel-postmessage", "PostmsgTransport")
  @js.native
  open class PostmsgTransport protected () extends StObject {
    def this(config: Config) = this()
    
    /* private */ var buffer: Any = js.native
    
    /* private */ val config: Any = js.native
    
    /* private */ var connected: Any = js.native
    
    /* private */ var flush: Any = js.native
    
    /* private */ var getCurrentFrames: Any = js.native
    
    /* private */ var getFrames: Any = js.native
    
    /* private */ var getLocalFrame: Any = js.native
    
    /* private */ var handleEvent: Any = js.native
    
    /* private */ var handler: Any = js.native
    
    /**
      * Sends `event` to the associated window. If the window does not yet exist
      * the event will be stored in a buffer and sent when the window exists.
      * @param event
      */
    def send(event: ChannelEvent): js.Promise[Any] = js.native
    def send(event: ChannelEvent, options: Any): js.Promise[Any] = js.native
    
    def setHandler(handler: ChannelHandler): Unit = js.native
  }
  
  trait Config extends StObject {
    
    var page: manager | preview
  }
  object Config {
    
    inline def apply(page: manager | preview): Config = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setPage(value: manager | preview): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
}
