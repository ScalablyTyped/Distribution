package typings.sendmail

import typings.sendmail.anon.Content
import typings.sendmail.anon.Debug
import typings.sendmail.anon.KeySelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): SendMailFn = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[SendMailFn]
  
  @JSImport("sendmail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CallbackFn = js.Function2[/* err */ js.Error, /* domain */ String, Unit]
  
  trait MailInput extends StObject {
    
    var attachments: js.UndefOr[js.Array[Content]] = js.undefined
    
    var bcc: js.UndefOr[String] = js.undefined
    
    var cc: js.UndefOr[String] = js.undefined
    
    var charset: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var from: String
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var html: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inReplyTo: js.UndefOr[String] = js.undefined
    
    var replyTo: js.UndefOr[String] = js.undefined
    
    var returnTo: js.UndefOr[String] = js.undefined
    
    var sender: js.UndefOr[String] = js.undefined
    
    var subject: String
    
    var text: js.UndefOr[String] = js.undefined
    
    var to: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MailInput {
    
    inline def apply(from: String, subject: String, to: String): MailInput = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MailInput] (val x: Self) extends AnyVal {
      
      inline def setAttachments(value: js.Array[Content]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setAttachmentsVarargs(value: Content*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setBcc(value: String): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      inline def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
      
      inline def setCc(value: String): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      inline def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInReplyTo(value: String): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
      
      inline def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
      
      inline def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
      
      inline def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
      
      inline def setReturnTo(value: String): Self = StObject.set(x, "returnTo", value.asInstanceOf[js.Any])
      
      inline def setReturnToUndefined: Self = StObject.set(x, "returnTo", js.undefined)
      
      inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /** Default: localhost */
    var devHost: js.UndefOr[String] = js.undefined
    
    /** Default: False */
    var devPort: js.UndefOr[Double | Boolean] = js.undefined
    
    /** Default: False */
    var dkim: js.UndefOr[Boolean | KeySelector] = js.undefined
    
    var logger: js.UndefOr[Debug] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    /** Default: -1 - extra smtp host after resolveMX */
    var smtpHost: js.UndefOr[String | Double] = js.undefined
    
    /** Default: 25 */
    var smtpPort: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDevHost(value: String): Self = StObject.set(x, "devHost", value.asInstanceOf[js.Any])
      
      inline def setDevHostUndefined: Self = StObject.set(x, "devHost", js.undefined)
      
      inline def setDevPort(value: Double | Boolean): Self = StObject.set(x, "devPort", value.asInstanceOf[js.Any])
      
      inline def setDevPortUndefined: Self = StObject.set(x, "devPort", js.undefined)
      
      inline def setDkim(value: Boolean | KeySelector): Self = StObject.set(x, "dkim", value.asInstanceOf[js.Any])
      
      inline def setDkimUndefined: Self = StObject.set(x, "dkim", js.undefined)
      
      inline def setLogger(value: Debug): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSmtpHost(value: String | Double): Self = StObject.set(x, "smtpHost", value.asInstanceOf[js.Any])
      
      inline def setSmtpHostUndefined: Self = StObject.set(x, "smtpHost", js.undefined)
      
      inline def setSmtpPort(value: Double): Self = StObject.set(x, "smtpPort", value.asInstanceOf[js.Any])
      
      inline def setSmtpPortUndefined: Self = StObject.set(x, "smtpPort", js.undefined)
    }
  }
  
  type SendMailFn = js.Function2[/* mail */ MailInput, /* callback */ CallbackFn, Unit]
}
