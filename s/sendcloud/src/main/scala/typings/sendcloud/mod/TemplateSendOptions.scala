package typings.sendcloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateSendOptions extends StObject {
  
  var api_key: js.UndefOr[String] = js.native
  
  var api_user: js.UndefOr[String] = js.native
  
  var files: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[String] = js.native
  
  var fromname: js.UndefOr[String] = js.native
  
  var gzip_compress: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[Double] = js.native
  
  var replyTo: js.UndefOr[String] = js.native
  
  var resp_email_id: js.UndefOr[String] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var substitution_vars: js.UndefOr[String] = js.native
  
  var template_invoke_name: js.UndefOr[String] = js.native
  
  var to: js.UndefOr[String] = js.native
  
  var use_maillist: js.UndefOr[String] = js.native
}
object TemplateSendOptions {
  
  @scala.inline
  def apply(): TemplateSendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSendOptions]
  }
  
  @scala.inline
  implicit class TemplateSendOptionsMutableBuilder[Self <: TemplateSendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_keyUndefined: Self = StObject.set(x, "api_key", js.undefined)
    
    @scala.inline
    def setApi_user(value: String): Self = StObject.set(x, "api_user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_userUndefined: Self = StObject.set(x, "api_user", js.undefined)
    
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
    def setLabel(value: Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
    
    @scala.inline
    def setResp_email_id(value: String): Self = StObject.set(x, "resp_email_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResp_email_idUndefined: Self = StObject.set(x, "resp_email_id", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setSubstitution_vars(value: String): Self = StObject.set(x, "substitution_vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitution_varsUndefined: Self = StObject.set(x, "substitution_vars", js.undefined)
    
    @scala.inline
    def setTemplate_invoke_name(value: String): Self = StObject.set(x, "template_invoke_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate_invoke_nameUndefined: Self = StObject.set(x, "template_invoke_name", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setUse_maillist(value: String): Self = StObject.set(x, "use_maillist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_maillistUndefined: Self = StObject.set(x, "use_maillist", js.undefined)
  }
}
