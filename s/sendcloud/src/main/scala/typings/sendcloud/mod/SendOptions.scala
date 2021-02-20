package typings.sendcloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendOptions extends StObject {
  
  var api_key: js.UndefOr[String] = js.native
  
  var api_user: js.UndefOr[String] = js.native
  
  var bcc: js.UndefOr[String] = js.native
  
  var cc: js.UndefOr[String] = js.native
  
  var files: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[String] = js.native
  
  var fromname: js.UndefOr[String] = js.native
  
  var gzip_compress: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[String] = js.native
  
  var html: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[Double] = js.native
  
  var replyto: js.UndefOr[String] = js.native
  
  var resp_email_id: js.UndefOr[String] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var to: js.UndefOr[String] = js.native
  
  var use_maillist: js.UndefOr[String] = js.native
  
  var x_smtpapi: js.UndefOr[String] = js.native
}
object SendOptions {
  
  @scala.inline
  def apply(): SendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendOptions]
  }
  
  @scala.inline
  implicit class SendOptionsMutableBuilder[Self <: SendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_keyUndefined: Self = StObject.set(x, "api_key", js.undefined)
    
    @scala.inline
    def setApi_user(value: String): Self = StObject.set(x, "api_user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_userUndefined: Self = StObject.set(x, "api_user", js.undefined)
    
    @scala.inline
    def setBcc(value: String): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
    
    @scala.inline
    def setCc(value: String): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
    
    @scala.inline
    def setFiles(value: String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setFromname(value: String): Self = StObject.set(x, "fromname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromnameUndefined: Self = StObject.set(x, "fromname", js.undefined)
    
    @scala.inline
    def setGzip_compress(value: String): Self = StObject.set(x, "gzip_compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGzip_compressUndefined: Self = StObject.set(x, "gzip_compress", js.undefined)
    
    @scala.inline
    def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setLabel(value: Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setReplyto(value: String): Self = StObject.set(x, "replyto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplytoUndefined: Self = StObject.set(x, "replyto", js.undefined)
    
    @scala.inline
    def setResp_email_id(value: String): Self = StObject.set(x, "resp_email_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResp_email_idUndefined: Self = StObject.set(x, "resp_email_id", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setUse_maillist(value: String): Self = StObject.set(x, "use_maillist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_maillistUndefined: Self = StObject.set(x, "use_maillist", js.undefined)
    
    @scala.inline
    def setX_smtpapi(value: String): Self = StObject.set(x, "x_smtpapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_smtpapiUndefined: Self = StObject.set(x, "x_smtpapi", js.undefined)
  }
}
