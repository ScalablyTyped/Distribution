package typings.sendcloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateSendOptions extends StObject {
  
  var api_key: js.UndefOr[String] = js.undefined
  
  var api_user: js.UndefOr[String] = js.undefined
  
  var files: js.UndefOr[String] = js.undefined
  
  var from: js.UndefOr[String] = js.undefined
  
  var fromname: js.UndefOr[String] = js.undefined
  
  var gzip_compress: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[Double] = js.undefined
  
  var replyTo: js.UndefOr[String] = js.undefined
  
  var resp_email_id: js.UndefOr[String] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var substitution_vars: js.UndefOr[String] = js.undefined
  
  var template_invoke_name: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
  
  var use_maillist: js.UndefOr[String] = js.undefined
}
object TemplateSendOptions {
  
  inline def apply(): TemplateSendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSendOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateSendOptions] (val x: Self) extends AnyVal {
    
    inline def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
    
    inline def setApi_keyUndefined: Self = StObject.set(x, "api_key", js.undefined)
    
    inline def setApi_user(value: String): Self = StObject.set(x, "api_user", value.asInstanceOf[js.Any])
    
    inline def setApi_userUndefined: Self = StObject.set(x, "api_user", js.undefined)
    
    inline def setFiles(value: String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFromname(value: String): Self = StObject.set(x, "fromname", value.asInstanceOf[js.Any])
    
    inline def setFromnameUndefined: Self = StObject.set(x, "fromname", js.undefined)
    
    inline def setGzip_compress(value: String): Self = StObject.set(x, "gzip_compress", value.asInstanceOf[js.Any])
    
    inline def setGzip_compressUndefined: Self = StObject.set(x, "gzip_compress", js.undefined)
    
    inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setLabel(value: Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
    
    inline def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
    
    inline def setResp_email_id(value: String): Self = StObject.set(x, "resp_email_id", value.asInstanceOf[js.Any])
    
    inline def setResp_email_idUndefined: Self = StObject.set(x, "resp_email_id", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubstitution_vars(value: String): Self = StObject.set(x, "substitution_vars", value.asInstanceOf[js.Any])
    
    inline def setSubstitution_varsUndefined: Self = StObject.set(x, "substitution_vars", js.undefined)
    
    inline def setTemplate_invoke_name(value: String): Self = StObject.set(x, "template_invoke_name", value.asInstanceOf[js.Any])
    
    inline def setTemplate_invoke_nameUndefined: Self = StObject.set(x, "template_invoke_name", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setUse_maillist(value: String): Self = StObject.set(x, "use_maillist", value.asInstanceOf[js.Any])
    
    inline def setUse_maillistUndefined: Self = StObject.set(x, "use_maillist", js.undefined)
  }
}
