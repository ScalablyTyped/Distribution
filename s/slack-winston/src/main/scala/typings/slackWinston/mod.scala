package typings.slackWinston

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    var log: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.native
    
    var logv: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait SlackTransportOptions extends StObject {
    
    var channel: String = js.native
    
    var close: js.UndefOr[js.Function0[Unit]] = js.native
    
    var domain: String = js.native
    
    // from winston-transport TransportStreamOptions
    var format: js.UndefOr[Format] = js.native
    
    var handleExceptions: js.UndefOr[Boolean] = js.native
    
    var icon_emoji: js.UndefOr[String] = js.native
    
    var level: js.UndefOr[String] = js.native
    
    var log: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.native
    
    var logv: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var queueDelay: js.UndefOr[Double] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
    
    var token: String = js.native
    
    var username: js.UndefOr[String] = js.native
    
    var webhook_url: String = js.native
  }
  object SlackTransportOptions {
    
    @scala.inline
    def apply(channel: String, domain: String, token: String, webhook_url: String): SlackTransportOptions = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], webhook_url = webhook_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlackTransportOptions]
    }
    
    @scala.inline
    implicit class SlackTransportOptionsMutableBuilder[Self <: SlackTransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHandleExceptions(value: Boolean): Self = StObject.set(x, "handleExceptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleExceptionsUndefined: Self = StObject.set(x, "handleExceptions", js.undefined)
      
      @scala.inline
      def setIcon_emoji(value: String): Self = StObject.set(x, "icon_emoji", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon_emojiUndefined: Self = StObject.set(x, "icon_emoji", js.undefined)
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setLog(value: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setLogv(value: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _): Self = StObject.set(x, "logv", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLogvUndefined: Self = StObject.set(x, "logv", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setQueueDelay(value: Double): Self = StObject.set(x, "queueDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueDelayUndefined: Self = StObject.set(x, "queueDelay", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      @scala.inline
      def setWebhook_url(value: String): Self = StObject.set(x, "webhook_url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransformableInfo
    extends /* key */ StringDictionary[js.Any] {
    
    var level: String = js.native
    
    var message: String = js.native
  }
  object TransformableInfo {
    
    @scala.inline
    def apply(level: String, message: String): TransformableInfo = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformableInfo]
    }
    
    @scala.inline
    implicit class TransformableInfoMutableBuilder[Self <: TransformableInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
