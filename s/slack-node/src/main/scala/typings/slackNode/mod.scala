package typings.slackNode

import typings.slackNode.anon.Key
import typings.slackNode.slackNodeStrings.fail
import typings.slackNode.slackNodeStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("slack-node", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Slack {
    def this(token: String) = this()
    def this(token: String, domain: String) = this()
    def this(token: Unit, domain: String) = this()
  }
  
  @js.native
  trait Slack extends StObject {
    
    def api(method: String, callback: js.Function2[/* err */ Any, /* response */ Any, Unit]): this.type = js.native
    def api(method: String, options: Any, callback: js.Function2[/* err */ Any, /* response */ Any, Unit]): this.type = js.native
    
    var apiMode: Boolean = js.native
    
    def composeUrl(): String = js.native
    
    def detectEmoji(emoji: String): Key = js.native
    
    var domain: String = js.native
    
    var maxAttempts: Double = js.native
    
    def setWebhook(url: String): this.type = js.native
    
    var timeout: Double = js.native
    
    var token: String = js.native
    
    var url: String = js.native
    
    def webhook(
      options: WebhookOptions,
      callback: js.Function2[/* err */ Any, /* response */ WebhookResponse, Unit]
    ): Unit = js.native
  }
  
  trait WebhookOptions extends StObject {
    
    var attachments: js.UndefOr[js.Array[Any]] = js.undefined
    
    var channel: js.UndefOr[String] = js.undefined
    
    var icon_emoji: js.UndefOr[String] = js.undefined
    
    var link_names: js.UndefOr[Any] = js.undefined
    
    var response_type: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object WebhookOptions {
    
    inline def apply(): WebhookOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebhookOptions] (val x: Self) extends AnyVal {
      
      inline def setAttachments(value: js.Array[Any]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setAttachmentsVarargs(value: Any*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setIcon_emoji(value: String): Self = StObject.set(x, "icon_emoji", value.asInstanceOf[js.Any])
      
      inline def setIcon_emojiUndefined: Self = StObject.set(x, "icon_emoji", js.undefined)
      
      inline def setLink_names(value: Any): Self = StObject.set(x, "link_names", value.asInstanceOf[js.Any])
      
      inline def setLink_namesUndefined: Self = StObject.set(x, "link_names", js.undefined)
      
      inline def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
      
      inline def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait WebhookResponse extends StObject {
    
    var headers: Any
    
    var response: Any
    
    var status: fail | ok
    
    var statusCode: Double
  }
  object WebhookResponse {
    
    inline def apply(headers: Any, response: Any, status: fail | ok, statusCode: Double): WebhookResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebhookResponse] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: fail | ok): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
