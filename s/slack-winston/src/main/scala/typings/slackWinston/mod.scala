package typings.slackWinston

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("slack-winston", "Format")
  @js.native
  class Format () extends StObject {
    def this(opts: js.Object) = this()
    
    var options: js.UndefOr[js.Object] = js.native
    
    def transform(info: TransformableInfo): TransformableInfo | Boolean = js.native
    def transform(info: TransformableInfo, opts: js.Any): TransformableInfo | Boolean = js.native
  }
  
  @JSImport("slack-winston", "Slack")
  @js.native
  class Slack () extends StObject {
    def this(options: SlackTransportOptions) = this()
    
    var close: js.UndefOr[js.Function0[Unit]] = js.native
    
    var format: js.UndefOr[Format] = js.native
    
    var handleExceptions: js.UndefOr[Boolean] = js.native
    
    var level: js.UndefOr[String] = js.native
    
    var log: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], js.Any]] = js.native
    
    var logv: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], js.Any]] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
  }
  
  trait SlackTransportOptions extends StObject {
    
    var channel: String
    
    var close: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var domain: String
    
    // from winston-transport TransportStreamOptions
    var format: js.UndefOr[Format] = js.undefined
    
    var handleExceptions: js.UndefOr[Boolean] = js.undefined
    
    var icon_emoji: js.UndefOr[String] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var log: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], js.Any]] = js.undefined
    
    var logv: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], js.Any]] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var queueDelay: js.UndefOr[Double] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var token: String
    
    var username: js.UndefOr[String] = js.undefined
    
    var webhook_url: String
  }
  object SlackTransportOptions {
    
    inline def apply(channel: String, domain: String, token: String, webhook_url: String): SlackTransportOptions = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], webhook_url = webhook_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlackTransportOptions]
    }
    
    extension [Self <: SlackTransportOptions](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHandleExceptions(value: Boolean): Self = StObject.set(x, "handleExceptions", value.asInstanceOf[js.Any])
      
      inline def setHandleExceptionsUndefined: Self = StObject.set(x, "handleExceptions", js.undefined)
      
      inline def setIcon_emoji(value: String): Self = StObject.set(x, "icon_emoji", value.asInstanceOf[js.Any])
      
      inline def setIcon_emojiUndefined: Self = StObject.set(x, "icon_emoji", js.undefined)
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLog(value: (/* info */ js.Any, /* next */ js.Function0[Unit]) => js.Any): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setLogv(value: (/* info */ js.Any, /* next */ js.Function0[Unit]) => js.Any): Self = StObject.set(x, "logv", js.Any.fromFunction2(value))
      
      inline def setLogvUndefined: Self = StObject.set(x, "logv", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setQueueDelay(value: Double): Self = StObject.set(x, "queueDelay", value.asInstanceOf[js.Any])
      
      inline def setQueueDelayUndefined: Self = StObject.set(x, "queueDelay", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setWebhook_url(value: String): Self = StObject.set(x, "webhook_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransformableInfo
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var level: String
    
    var message: String
  }
  object TransformableInfo {
    
    inline def apply(level: String, message: String): TransformableInfo = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformableInfo]
    }
    
    extension [Self <: TransformableInfo](x: Self) {
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
