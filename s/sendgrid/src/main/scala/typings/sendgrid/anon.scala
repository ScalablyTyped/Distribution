package typings.sendgrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Asm extends StObject {
    
    var asm: Any
    
    var attachments: js.Array[Any]
    
    var batch_id: String
    
    var categories: js.Array[Any]
    
    var content: String
    
    var custom_args: js.Array[Any]
    
    var from: Any
    
    var headers: js.Array[Any]
    
    var ip_pool_name: String
    
    var mail_settings: Any
    
    var personalizations: js.Array[Any]
    
    var reply_to: Any
    
    var sections: js.Array[Any]
    
    var send_at: Double
    
    var subject: String
    
    var template_id: String
    
    var tracking_settings: Any
  }
  object Asm {
    
    inline def apply(
      asm: Any,
      attachments: js.Array[Any],
      batch_id: String,
      categories: js.Array[Any],
      content: String,
      custom_args: js.Array[Any],
      from: Any,
      headers: js.Array[Any],
      ip_pool_name: String,
      mail_settings: Any,
      personalizations: js.Array[Any],
      reply_to: Any,
      sections: js.Array[Any],
      send_at: Double,
      subject: String,
      template_id: String,
      tracking_settings: Any
    ): Asm = {
      val __obj = js.Dynamic.literal(asm = asm.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], custom_args = custom_args.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip_pool_name = ip_pool_name.asInstanceOf[js.Any], mail_settings = mail_settings.asInstanceOf[js.Any], personalizations = personalizations.asInstanceOf[js.Any], reply_to = reply_to.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], send_at = send_at.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any], tracking_settings = tracking_settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Asm]
    }
    
    extension [Self <: Asm](x: Self) {
      
      inline def setAsm(value: Any): Self = StObject.set(x, "asm", value.asInstanceOf[js.Any])
      
      inline def setAttachments(value: js.Array[Any]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsVarargs(value: Any*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setBatch_id(value: String): Self = StObject.set(x, "batch_id", value.asInstanceOf[js.Any])
      
      inline def setCategories(value: js.Array[Any]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: Any*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setCustom_args(value: js.Array[Any]): Self = StObject.set(x, "custom_args", value.asInstanceOf[js.Any])
      
      inline def setCustom_argsVarargs(value: Any*): Self = StObject.set(x, "custom_args", js.Array(value*))
      
      inline def setFrom(value: Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Array[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: Any*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIp_pool_name(value: String): Self = StObject.set(x, "ip_pool_name", value.asInstanceOf[js.Any])
      
      inline def setMail_settings(value: Any): Self = StObject.set(x, "mail_settings", value.asInstanceOf[js.Any])
      
      inline def setPersonalizations(value: js.Array[Any]): Self = StObject.set(x, "personalizations", value.asInstanceOf[js.Any])
      
      inline def setPersonalizationsVarargs(value: Any*): Self = StObject.set(x, "personalizations", js.Array(value*))
      
      inline def setReply_to(value: Any): Self = StObject.set(x, "reply_to", value.asInstanceOf[js.Any])
      
      inline def setSections(value: js.Array[Any]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      inline def setSectionsVarargs(value: Any*): Self = StObject.set(x, "sections", js.Array(value*))
      
      inline def setSend_at(value: Double): Self = StObject.set(x, "send_at", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
      
      inline def setTracking_settings(value: Any): Self = StObject.set(x, "tracking_settings", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bcc extends StObject {
    
    var bcc: Any
    
    var bypass_list_management: Any
    
    var footer: Any
    
    var sandbox_mode: Any
    
    var spam_check: Any
  }
  object Bcc {
    
    inline def apply(bcc: Any, bypass_list_management: Any, footer: Any, sandbox_mode: Any, spam_check: Any): Bcc = {
      val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], bypass_list_management = bypass_list_management.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], sandbox_mode = sandbox_mode.asInstanceOf[js.Any], spam_check = spam_check.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bcc]
    }
    
    extension [Self <: Bcc](x: Self) {
      
      inline def setBcc(value: Any): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      inline def setBypass_list_management(value: Any): Self = StObject.set(x, "bypass_list_management", value.asInstanceOf[js.Any])
      
      inline def setFooter(value: Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setSandbox_mode(value: Any): Self = StObject.set(x, "sandbox_mode", value.asInstanceOf[js.Any])
      
      inline def setSpam_check(value: Any): Self = StObject.set(x, "spam_check", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cc extends StObject {
    
    var bcc: Any
    
    var cc: Any
    
    var custom_args: Any
    
    var headers: Any
    
    var send_at: Double
    
    var subject: String
    
    var substitutions: Any
    
    var to: Any
  }
  object Cc {
    
    inline def apply(
      bcc: Any,
      cc: Any,
      custom_args: Any,
      headers: Any,
      send_at: Double,
      subject: String,
      substitutions: Any,
      to: Any
    ): Cc = {
      val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], cc = cc.asInstanceOf[js.Any], custom_args = custom_args.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], send_at = send_at.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], substitutions = substitutions.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cc]
    }
    
    extension [Self <: Cc](x: Self) {
      
      inline def setBcc(value: Any): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      inline def setCc(value: Any): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      inline def setCustom_args(value: Any): Self = StObject.set(x, "custom_args", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setSend_at(value: Double): Self = StObject.set(x, "send_at", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubstitutions(value: Any): Self = StObject.set(x, "substitutions", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait Clicktracking extends StObject {
    
    var click_tracking: Any
    
    var ganalytics: Any
    
    var open_tracking: Any
    
    var subscription_tracking: Any
  }
  object Clicktracking {
    
    inline def apply(click_tracking: Any, ganalytics: Any, open_tracking: Any, subscription_tracking: Any): Clicktracking = {
      val __obj = js.Dynamic.literal(click_tracking = click_tracking.asInstanceOf[js.Any], ganalytics = ganalytics.asInstanceOf[js.Any], open_tracking = open_tracking.asInstanceOf[js.Any], subscription_tracking = subscription_tracking.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clicktracking]
    }
    
    extension [Self <: Clicktracking](x: Self) {
      
      inline def setClick_tracking(value: Any): Self = StObject.set(x, "click_tracking", value.asInstanceOf[js.Any])
      
      inline def setGanalytics(value: Any): Self = StObject.set(x, "ganalytics", value.asInstanceOf[js.Any])
      
      inline def setOpen_tracking(value: Any): Self = StObject.set(x, "open_tracking", value.asInstanceOf[js.Any])
      
      inline def setSubscription_tracking(value: Any): Self = StObject.set(x, "subscription_tracking", value.asInstanceOf[js.Any])
    }
  }
  
  trait Content extends StObject {
    
    var content: String
    
    var content_id: String
    
    var disposition: String
    
    var filename: String
    
    var `type`: String
  }
  object Content {
    
    inline def apply(content: String, content_id: String, disposition: String, filename: String, `type`: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], content_id = content_id.asInstanceOf[js.Any], disposition = disposition.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContent_id(value: String): Self = StObject.set(x, "content_id", value.asInstanceOf[js.Any])
      
      inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Email extends StObject {
    
    var email: Any
    
    var enable: Boolean
  }
  object Email {
    
    inline def apply(email: Any, enable: Boolean): Email = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    extension [Self <: Email](x: Self) {
      
      inline def setEmail(value: Any): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enable extends StObject {
    
    var enable: Boolean
    
    var enable_text: Boolean
  }
  object Enable {
    
    inline def apply(enable: Boolean, enable_text: Boolean): Enable = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], enable_text = enable_text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enable]
    }
    
    extension [Self <: Enable](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnable_text(value: Boolean): Self = StObject.set(x, "enable_text", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnableBoolean extends StObject {
    
    var enable: Boolean
  }
  object EnableBoolean {
    
    inline def apply(enable: Boolean): EnableBoolean = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnableBoolean]
    }
    
    extension [Self <: EnableBoolean](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    }
  }
  
  trait Html extends StObject {
    
    var enable: Boolean
    
    var html: String
    
    var substitution_tag: String
    
    var text: String
  }
  object Html {
    
    inline def apply(enable: Boolean, html: String, substitution_tag: String, text: String): Html = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], substitution_tag = substitution_tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    extension [Self <: Html](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setSubstitution_tag(value: String): Self = StObject.set(x, "substitution_tag", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Posttourl extends StObject {
    
    var enable: Boolean
    
    var post_to_url: String
    
    var threshold: Double
  }
  object Posttourl {
    
    inline def apply(enable: Boolean, post_to_url: String, threshold: Double): Posttourl = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], post_to_url = post_to_url.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[Posttourl]
    }
    
    extension [Self <: Posttourl](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setPost_to_url(value: String): Self = StObject.set(x, "post_to_url", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  trait Substitutiontag extends StObject {
    
    var enable: Boolean
    
    var substitution_tag: String
  }
  object Substitutiontag {
    
    inline def apply(enable: Boolean, substitution_tag: String): Substitutiontag = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], substitution_tag = substitution_tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Substitutiontag]
    }
    
    extension [Self <: Substitutiontag](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setSubstitution_tag(value: String): Self = StObject.set(x, "substitution_tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var enable: Boolean
    
    var html: String
    
    var text: String
  }
  object Text {
    
    inline def apply(enable: Boolean, html: String, text: String): Text = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Utmcampaign extends StObject {
    
    var enable: Boolean
    
    var utm_campaign: String
    
    var utm_content: String
    
    var utm_medium: String
    
    var utm_source: String
    
    var utm_term: String
  }
  object Utmcampaign {
    
    inline def apply(
      enable: Boolean,
      utm_campaign: String,
      utm_content: String,
      utm_medium: String,
      utm_source: String,
      utm_term: String
    ): Utmcampaign = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], utm_campaign = utm_campaign.asInstanceOf[js.Any], utm_content = utm_content.asInstanceOf[js.Any], utm_medium = utm_medium.asInstanceOf[js.Any], utm_source = utm_source.asInstanceOf[js.Any], utm_term = utm_term.asInstanceOf[js.Any])
      __obj.asInstanceOf[Utmcampaign]
    }
    
    extension [Self <: Utmcampaign](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setUtm_campaign(value: String): Self = StObject.set(x, "utm_campaign", value.asInstanceOf[js.Any])
      
      inline def setUtm_content(value: String): Self = StObject.set(x, "utm_content", value.asInstanceOf[js.Any])
      
      inline def setUtm_medium(value: String): Self = StObject.set(x, "utm_medium", value.asInstanceOf[js.Any])
      
      inline def setUtm_source(value: String): Self = StObject.set(x, "utm_source", value.asInstanceOf[js.Any])
      
      inline def setUtm_term(value: String): Self = StObject.set(x, "utm_term", value.asInstanceOf[js.Any])
    }
  }
}
