package typings.sendgrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Asm extends StObject {
    
    var asm: js.Any = js.native
    
    var attachments: js.Array[_] = js.native
    
    var batch_id: String = js.native
    
    var categories: js.Array[_] = js.native
    
    var content: String = js.native
    
    var custom_args: js.Array[_] = js.native
    
    var from: js.Any = js.native
    
    var headers: js.Array[_] = js.native
    
    var ip_pool_name: String = js.native
    
    var mail_settings: js.Any = js.native
    
    var personalizations: js.Array[_] = js.native
    
    var reply_to: js.Any = js.native
    
    var sections: js.Array[_] = js.native
    
    var send_at: Double = js.native
    
    var subject: String = js.native
    
    var template_id: String = js.native
    
    var tracking_settings: js.Any = js.native
  }
  object Asm {
    
    @scala.inline
    def apply(
      asm: js.Any,
      attachments: js.Array[_],
      batch_id: String,
      categories: js.Array[_],
      content: String,
      custom_args: js.Array[_],
      from: js.Any,
      headers: js.Array[_],
      ip_pool_name: String,
      mail_settings: js.Any,
      personalizations: js.Array[_],
      reply_to: js.Any,
      sections: js.Array[_],
      send_at: Double,
      subject: String,
      template_id: String,
      tracking_settings: js.Any
    ): Asm = {
      val __obj = js.Dynamic.literal(asm = asm.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], custom_args = custom_args.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip_pool_name = ip_pool_name.asInstanceOf[js.Any], mail_settings = mail_settings.asInstanceOf[js.Any], personalizations = personalizations.asInstanceOf[js.Any], reply_to = reply_to.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], send_at = send_at.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any], tracking_settings = tracking_settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Asm]
    }
    
    @scala.inline
    implicit class AsmMutableBuilder[Self <: Asm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsm(value: js.Any): Self = StObject.set(x, "asm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachments(value: js.Array[_]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsVarargs(value: js.Any*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      
      @scala.inline
      def setBatch_id(value: String): Self = StObject.set(x, "batch_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategories(value: js.Array[_]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesVarargs(value: js.Any*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_args(value: js.Array[_]): Self = StObject.set(x, "custom_args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_argsVarargs(value: js.Any*): Self = StObject.set(x, "custom_args", js.Array(value :_*))
      
      @scala.inline
      def setFrom(value: js.Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Array[_]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersVarargs(value: js.Any*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setIp_pool_name(value: String): Self = StObject.set(x, "ip_pool_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMail_settings(value: js.Any): Self = StObject.set(x, "mail_settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonalizations(value: js.Array[_]): Self = StObject.set(x, "personalizations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonalizationsVarargs(value: js.Any*): Self = StObject.set(x, "personalizations", js.Array(value :_*))
      
      @scala.inline
      def setReply_to(value: js.Any): Self = StObject.set(x, "reply_to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSections(value: js.Array[_]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionsVarargs(value: js.Any*): Self = StObject.set(x, "sections", js.Array(value :_*))
      
      @scala.inline
      def setSend_at(value: Double): Self = StObject.set(x, "send_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracking_settings(value: js.Any): Self = StObject.set(x, "tracking_settings", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Bcc extends StObject {
    
    var bcc: js.Any = js.native
    
    var bypass_list_management: js.Any = js.native
    
    var footer: js.Any = js.native
    
    var sandbox_mode: js.Any = js.native
    
    var spam_check: js.Any = js.native
  }
  object Bcc {
    
    @scala.inline
    def apply(
      bcc: js.Any,
      bypass_list_management: js.Any,
      footer: js.Any,
      sandbox_mode: js.Any,
      spam_check: js.Any
    ): Bcc = {
      val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], bypass_list_management = bypass_list_management.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], sandbox_mode = sandbox_mode.asInstanceOf[js.Any], spam_check = spam_check.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bcc]
    }
    
    @scala.inline
    implicit class BccMutableBuilder[Self <: Bcc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBcc(value: js.Any): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBypass_list_management(value: js.Any): Self = StObject.set(x, "bypass_list_management", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooter(value: js.Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSandbox_mode(value: js.Any): Self = StObject.set(x, "sandbox_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpam_check(value: js.Any): Self = StObject.set(x, "spam_check", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cc extends StObject {
    
    var bcc: js.Any = js.native
    
    var cc: js.Any = js.native
    
    var custom_args: js.Any = js.native
    
    var headers: js.Any = js.native
    
    var send_at: Double = js.native
    
    var subject: String = js.native
    
    var substitutions: js.Any = js.native
    
    var to: js.Any = js.native
  }
  object Cc {
    
    @scala.inline
    def apply(
      bcc: js.Any,
      cc: js.Any,
      custom_args: js.Any,
      headers: js.Any,
      send_at: Double,
      subject: String,
      substitutions: js.Any,
      to: js.Any
    ): Cc = {
      val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], cc = cc.asInstanceOf[js.Any], custom_args = custom_args.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], send_at = send_at.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], substitutions = substitutions.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cc]
    }
    
    @scala.inline
    implicit class CcMutableBuilder[Self <: Cc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBcc(value: js.Any): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCc(value: js.Any): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_args(value: js.Any): Self = StObject.set(x, "custom_args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSend_at(value: Double): Self = StObject.set(x, "send_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubstitutions(value: js.Any): Self = StObject.set(x, "substitutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: js.Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Clicktracking extends StObject {
    
    var click_tracking: js.Any = js.native
    
    var ganalytics: js.Any = js.native
    
    var open_tracking: js.Any = js.native
    
    var subscription_tracking: js.Any = js.native
  }
  object Clicktracking {
    
    @scala.inline
    def apply(click_tracking: js.Any, ganalytics: js.Any, open_tracking: js.Any, subscription_tracking: js.Any): Clicktracking = {
      val __obj = js.Dynamic.literal(click_tracking = click_tracking.asInstanceOf[js.Any], ganalytics = ganalytics.asInstanceOf[js.Any], open_tracking = open_tracking.asInstanceOf[js.Any], subscription_tracking = subscription_tracking.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clicktracking]
    }
    
    @scala.inline
    implicit class ClicktrackingMutableBuilder[Self <: Clicktracking] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick_tracking(value: js.Any): Self = StObject.set(x, "click_tracking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGanalytics(value: js.Any): Self = StObject.set(x, "ganalytics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen_tracking(value: js.Any): Self = StObject.set(x, "open_tracking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscription_tracking(value: js.Any): Self = StObject.set(x, "subscription_tracking", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Content extends StObject {
    
    var content: String = js.native
    
    var content_id: String = js.native
    
    var disposition: String = js.native
    
    var filename: String = js.native
    
    var `type`: String = js.native
  }
  object Content {
    
    @scala.inline
    def apply(content: String, content_id: String, disposition: String, filename: String, `type`: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], content_id = content_id.asInstanceOf[js.Any], disposition = disposition.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_id(value: String): Self = StObject.set(x, "content_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Email extends StObject {
    
    var email: js.Any = js.native
    
    var enable: Boolean = js.native
  }
  object Email {
    
    @scala.inline
    def apply(email: js.Any, enable: Boolean): Email = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: js.Any): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Enable extends StObject {
    
    var enable: Boolean = js.native
    
    var enable_text: Boolean = js.native
  }
  object Enable {
    
    @scala.inline
    def apply(enable: Boolean, enable_text: Boolean): Enable = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], enable_text = enable_text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enable]
    }
    
    @scala.inline
    implicit class EnableMutableBuilder[Self <: Enable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnable_text(value: Boolean): Self = StObject.set(x, "enable_text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EnableBoolean extends StObject {
    
    var enable: Boolean = js.native
  }
  object EnableBoolean {
    
    @scala.inline
    def apply(enable: Boolean): EnableBoolean = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnableBoolean]
    }
    
    @scala.inline
    implicit class EnableBooleanMutableBuilder[Self <: EnableBoolean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Html extends StObject {
    
    var enable: Boolean = js.native
    
    var html: String = js.native
    
    var substitution_tag: String = js.native
    
    var text: String = js.native
  }
  object Html {
    
    @scala.inline
    def apply(enable: Boolean, html: String, substitution_tag: String, text: String): Html = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], substitution_tag = substitution_tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit class HtmlMutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubstitution_tag(value: String): Self = StObject.set(x, "substitution_tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Posttourl extends StObject {
    
    var enable: Boolean = js.native
    
    var post_to_url: String = js.native
    
    var threshold: Double = js.native
  }
  object Posttourl {
    
    @scala.inline
    def apply(enable: Boolean, post_to_url: String, threshold: Double): Posttourl = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], post_to_url = post_to_url.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[Posttourl]
    }
    
    @scala.inline
    implicit class PosttourlMutableBuilder[Self <: Posttourl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPost_to_url(value: String): Self = StObject.set(x, "post_to_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Substitutiontag extends StObject {
    
    var enable: Boolean = js.native
    
    var substitution_tag: String = js.native
  }
  object Substitutiontag {
    
    @scala.inline
    def apply(enable: Boolean, substitution_tag: String): Substitutiontag = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], substitution_tag = substitution_tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Substitutiontag]
    }
    
    @scala.inline
    implicit class SubstitutiontagMutableBuilder[Self <: Substitutiontag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubstitution_tag(value: String): Self = StObject.set(x, "substitution_tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Text extends StObject {
    
    var enable: Boolean = js.native
    
    var html: String = js.native
    
    var text: String = js.native
  }
  object Text {
    
    @scala.inline
    def apply(enable: Boolean, html: String, text: String): Text = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Utmcampaign extends StObject {
    
    var enable: Boolean = js.native
    
    var utm_campaign: String = js.native
    
    var utm_content: String = js.native
    
    var utm_medium: String = js.native
    
    var utm_source: String = js.native
    
    var utm_term: String = js.native
  }
  object Utmcampaign {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class UtmcampaignMutableBuilder[Self <: Utmcampaign] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtm_campaign(value: String): Self = StObject.set(x, "utm_campaign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtm_content(value: String): Self = StObject.set(x, "utm_content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtm_medium(value: String): Self = StObject.set(x, "utm_medium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtm_source(value: String): Self = StObject.set(x, "utm_source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtm_term(value: String): Self = StObject.set(x, "utm_term", value.asInstanceOf[js.Any])
    }
  }
}
