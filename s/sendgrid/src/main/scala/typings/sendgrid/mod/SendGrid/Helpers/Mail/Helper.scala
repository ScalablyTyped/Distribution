package typings.sendgrid.mod.SendGrid.Helpers.Mail

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Helper extends js.Object {
  var Asm: Instantiable2[
    /* group_id */ Double, 
    /* groups_to_display */ js.Array[Double], 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Asm
  ] = js.native
  var Attachment: Instantiable0[typings.sendgrid.mod.SendGrid.Helpers.Mail.Attachment] = js.native
  var Bcc: Instantiable2[
    /* enable */ Boolean, 
    /* email */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Bcc
  ] = js.native
  var BypassListManagement: Instantiable1[
    /* enable */ Boolean, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.BypassListManagement
  ] = js.native
  var Category: Instantiable1[/* name */ String, typings.sendgrid.mod.SendGrid.Helpers.Mail.Category] = js.native
  var ClickTracking: Instantiable2[
    /* enable */ Boolean, 
    /* enableText */ Boolean, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.ClickTracking
  ] = js.native
  var Content: Instantiable2[
    /* mimetype */ String, 
    /* text */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Content
  ] = js.native
  var CustomArgs: Instantiable2[
    /* key */ String, 
    /* value */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.CustomArgs
  ] = js.native
  var Email: Instantiable2[
    /* address */ String, 
    /* name */ js.UndefOr[String], 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Email
  ] = js.native
  var Footer: Instantiable3[
    /* enable */ Boolean, 
    /* text */ String, 
    /* html */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Footer
  ] = js.native
  var Ganalytics: Instantiable6[
    /* enable */ Boolean, 
    /* utm_source */ String, 
    /* utm_medium */ String, 
    /* utm_term */ String, 
    /* utm_content */ String, 
    /* utm_campaign */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Ganalytics
  ] = js.native
  var Header: Instantiable2[
    /* key */ String, 
    /* value */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Header
  ] = js.native
  var Mail: Instantiable0[typings.sendgrid.mod.SendGrid.Helpers.Mail.Mail] = js.native
  var MailSettings: Instantiable0[typings.sendgrid.mod.SendGrid.Helpers.Mail.MailSettings] = js.native
  var OpenTracking: Instantiable2[
    /* enable */ Boolean, 
    /* subscriptionTag */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.OpenTracking
  ] = js.native
  var Personalization: Instantiable0[typings.sendgrid.mod.SendGrid.Helpers.Mail.Personalization] = js.native
  var SandBoxMode: Instantiable1[/* enable */ Boolean, typings.sendgrid.mod.SendGrid.Helpers.Mail.SandBoxMode] = js.native
  var Section: Instantiable2[
    /* key */ String, 
    /* value */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Section
  ] = js.native
  var SpamCheck: Instantiable3[
    /* enable */ Boolean, 
    /* threshold */ Double, 
    /* post_to_url */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.SpamCheck
  ] = js.native
  var SubscriptionTracking: Instantiable4[
    /* enable */ Boolean, 
    /* text */ String, 
    /* html */ String, 
    /* substitution_tag */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.SubscriptionTracking
  ] = js.native
  var Substitution: Instantiable2[
    /* key */ String, 
    /* value */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Substitution
  ] = js.native
  var TrackingSettings: Instantiable0[typings.sendgrid.mod.SendGrid.Helpers.Mail.TrackingSettings] = js.native
}

object Helper {
  @scala.inline
  def apply(
    Asm: Instantiable2[/* group_id */ Double, /* groups_to_display */ js.Array[Double], Asm],
    Attachment: Instantiable0[Attachment],
    Bcc: Instantiable2[/* enable */ Boolean, /* email */ String, Bcc],
    BypassListManagement: Instantiable1[/* enable */ Boolean, BypassListManagement],
    Category: Instantiable1[/* name */ String, Category],
    ClickTracking: Instantiable2[/* enable */ Boolean, /* enableText */ Boolean, ClickTracking],
    Content: Instantiable2[/* mimetype */ String, /* text */ String, Content],
    CustomArgs: Instantiable2[/* key */ String, /* value */ String, CustomArgs],
    Email: Instantiable2[/* address */ String, /* name */ js.UndefOr[String], Email],
    Footer: Instantiable3[/* enable */ Boolean, /* text */ String, /* html */ String, Footer],
    Ganalytics: Instantiable6[
      /* enable */ Boolean, 
      /* utm_source */ String, 
      /* utm_medium */ String, 
      /* utm_term */ String, 
      /* utm_content */ String, 
      /* utm_campaign */ String, 
      Ganalytics
    ],
    Header: Instantiable2[/* key */ String, /* value */ String, Header],
    Mail: Instantiable0[typings.sendgrid.mod.SendGrid.Helpers.Mail.Mail],
    MailSettings: Instantiable0[MailSettings],
    OpenTracking: Instantiable2[/* enable */ Boolean, /* subscriptionTag */ String, OpenTracking],
    Personalization: Instantiable0[Personalization],
    SandBoxMode: Instantiable1[/* enable */ Boolean, SandBoxMode],
    Section: Instantiable2[/* key */ String, /* value */ String, Section],
    SpamCheck: Instantiable3[/* enable */ Boolean, /* threshold */ Double, /* post_to_url */ String, SpamCheck],
    SubscriptionTracking: Instantiable4[
      /* enable */ Boolean, 
      /* text */ String, 
      /* html */ String, 
      /* substitution_tag */ String, 
      SubscriptionTracking
    ],
    Substitution: Instantiable2[/* key */ String, /* value */ String, Substitution],
    TrackingSettings: Instantiable0[TrackingSettings]
  ): Helper = {
    val __obj = js.Dynamic.literal(Asm = Asm.asInstanceOf[js.Any], Attachment = Attachment.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], BypassListManagement = BypassListManagement.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], ClickTracking = ClickTracking.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], CustomArgs = CustomArgs.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], Ganalytics = Ganalytics.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], Mail = Mail.asInstanceOf[js.Any], MailSettings = MailSettings.asInstanceOf[js.Any], OpenTracking = OpenTracking.asInstanceOf[js.Any], Personalization = Personalization.asInstanceOf[js.Any], SandBoxMode = SandBoxMode.asInstanceOf[js.Any], Section = Section.asInstanceOf[js.Any], SpamCheck = SpamCheck.asInstanceOf[js.Any], SubscriptionTracking = SubscriptionTracking.asInstanceOf[js.Any], Substitution = Substitution.asInstanceOf[js.Any], TrackingSettings = TrackingSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Helper]
  }
  @scala.inline
  implicit class HelperOps[Self <: Helper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsm(value: Instantiable2[/* group_id */ Double, /* groups_to_display */ js.Array[Double], Asm]): Self = this.set("Asm", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachment(value: Instantiable0[Attachment]): Self = this.set("Attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def setBcc(value: Instantiable2[/* enable */ Boolean, /* email */ String, Bcc]): Self = this.set("Bcc", value.asInstanceOf[js.Any])
    @scala.inline
    def setBypassListManagement(value: Instantiable1[/* enable */ Boolean, BypassListManagement]): Self = this.set("BypassListManagement", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: Instantiable1[/* name */ String, Category]): Self = this.set("Category", value.asInstanceOf[js.Any])
    @scala.inline
    def setClickTracking(value: Instantiable2[/* enable */ Boolean, /* enableText */ Boolean, ClickTracking]): Self = this.set("ClickTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: Instantiable2[/* mimetype */ String, /* text */ String, Content]): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomArgs(value: Instantiable2[/* key */ String, /* value */ String, CustomArgs]): Self = this.set("CustomArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: Instantiable2[/* address */ String, /* name */ js.UndefOr[String], Email]): Self = this.set("Email", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooter(value: Instantiable3[/* enable */ Boolean, /* text */ String, /* html */ String, Footer]): Self = this.set("Footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setGanalytics(
      value: Instantiable6[
          /* enable */ Boolean, 
          /* utm_source */ String, 
          /* utm_medium */ String, 
          /* utm_term */ String, 
          /* utm_content */ String, 
          /* utm_campaign */ String, 
          Ganalytics
        ]
    ): Self = this.set("Ganalytics", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: Instantiable2[/* key */ String, /* value */ String, Header]): Self = this.set("Header", value.asInstanceOf[js.Any])
    @scala.inline
    def setMail(value: Instantiable0[typings.sendgrid.mod.SendGrid.Helpers.Mail.Mail]): Self = this.set("Mail", value.asInstanceOf[js.Any])
    @scala.inline
    def setMailSettings(value: Instantiable0[MailSettings]): Self = this.set("MailSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenTracking(value: Instantiable2[/* enable */ Boolean, /* subscriptionTag */ String, OpenTracking]): Self = this.set("OpenTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersonalization(value: Instantiable0[Personalization]): Self = this.set("Personalization", value.asInstanceOf[js.Any])
    @scala.inline
    def setSandBoxMode(value: Instantiable1[/* enable */ Boolean, SandBoxMode]): Self = this.set("SandBoxMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSection(value: Instantiable2[/* key */ String, /* value */ String, Section]): Self = this.set("Section", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpamCheck(
      value: Instantiable3[/* enable */ Boolean, /* threshold */ Double, /* post_to_url */ String, SpamCheck]
    ): Self = this.set("SpamCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionTracking(
      value: Instantiable4[
          /* enable */ Boolean, 
          /* text */ String, 
          /* html */ String, 
          /* substitution_tag */ String, 
          SubscriptionTracking
        ]
    ): Self = this.set("SubscriptionTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubstitution(value: Instantiable2[/* key */ String, /* value */ String, Substitution]): Self = this.set("Substitution", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackingSettings(value: Instantiable0[TrackingSettings]): Self = this.set("TrackingSettings", value.asInstanceOf[js.Any])
  }
  
}

