package typings.sendmail

import typings.sendmail.anon.Content
import typings.sendmail.anon.Debug
import typings.sendmail.anon.KeySelector
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sendmail", JSImport.Namespace)
  @js.native
  def apply(options: Options): SendMailFn = js.native
  
  type CallbackFn = js.Function2[/* err */ Error, /* domain */ String, Unit]
  
  @js.native
  trait MailInput extends StObject {
    
    var attachments: js.UndefOr[js.Array[Content]] = js.native
    
    var bcc: js.UndefOr[String] = js.native
    
    var cc: js.UndefOr[String] = js.native
    
    var charset: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var from: String = js.native
    
    var headers: js.UndefOr[js.Object] = js.native
    
    var html: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var replyTo: js.UndefOr[String] = js.native
    
    var returnTo: js.UndefOr[String] = js.native
    
    var subject: String = js.native
    
    var to: String = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object MailInput {
    
    @scala.inline
    def apply(from: String, subject: String, to: String): MailInput = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailInput]
    }
    
    @scala.inline
    implicit class MailInputMutableBuilder[Self <: MailInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachments(value: js.Array[Content]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      @scala.inline
      def setAttachmentsVarargs(value: Content*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      
      @scala.inline
      def setBcc(value: String): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
      
      @scala.inline
      def setCc(value: String): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
      
      @scala.inline
      def setReturnTo(value: String): Self = StObject.set(x, "returnTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnToUndefined: Self = StObject.set(x, "returnTo", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /** Default: localhost */
    var devHost: js.UndefOr[String] = js.native
    
    /** Default: False */
    var devPort: js.UndefOr[Double | Boolean] = js.native
    
    /** Default: False */
    var dkim: js.UndefOr[Boolean | KeySelector] = js.native
    
    var logger: js.UndefOr[Debug] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
    
    /** Default: -1 - extra smtp host after resolveMX */
    var smtpHost: js.UndefOr[String | Double] = js.native
    
    /** Default: 25 */
    var smtpPort: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevHost(value: String): Self = StObject.set(x, "devHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevHostUndefined: Self = StObject.set(x, "devHost", js.undefined)
      
      @scala.inline
      def setDevPort(value: Double | Boolean): Self = StObject.set(x, "devPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevPortUndefined: Self = StObject.set(x, "devPort", js.undefined)
      
      @scala.inline
      def setDkim(value: Boolean | KeySelector): Self = StObject.set(x, "dkim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDkimUndefined: Self = StObject.set(x, "dkim", js.undefined)
      
      @scala.inline
      def setLogger(value: Debug): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setSmtpHost(value: String | Double): Self = StObject.set(x, "smtpHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmtpHostUndefined: Self = StObject.set(x, "smtpHost", js.undefined)
      
      @scala.inline
      def setSmtpPort(value: Double): Self = StObject.set(x, "smtpPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmtpPortUndefined: Self = StObject.set(x, "smtpPort", js.undefined)
    }
  }
  
  type SendMailFn = js.Function2[/* mail */ MailInput, /* callback */ CallbackFn, Unit]
}
