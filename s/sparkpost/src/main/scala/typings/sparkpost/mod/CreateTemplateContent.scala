package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTemplateContent extends StObject {
  
  /**
    * Address "from" : "deals@company.com" or JSON object composed of the "name" and "email" fields.
    * "from" : { "name" : "My Company", "email" : "deals@company.com" } used to compose the email’s "From" header.
    *
    */
  var from: Address | String
  
  /**  JSON dictionary containing headers other than “Subject”, “From”, “To”, and “Reply-To”. */
  var headers: js.UndefOr[js.Any] = js.undefined
  
  /** HTML content for the email’s text/html MIME part */
  var html: js.UndefOr[String] = js.undefined
  
  /** Email address used to compose the email’s “Reply-To” header. */
  var reply_to: js.UndefOr[String] = js.undefined
  
  /** Email subject line. */
  var subject: String
  
  /** Text content for the email’s text/plain MIME part */
  var text: js.UndefOr[String] = js.undefined
}
object CreateTemplateContent {
  
  inline def apply(from: Address | String, subject: String): CreateTemplateContent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateContent]
  }
  
  extension [Self <: CreateTemplateContent](x: Self) {
    
    inline def setFrom(value: Address | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setReply_to(value: String): Self = StObject.set(x, "reply_to", value.asInstanceOf[js.Any])
    
    inline def setReply_toUndefined: Self = StObject.set(x, "reply_to", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
