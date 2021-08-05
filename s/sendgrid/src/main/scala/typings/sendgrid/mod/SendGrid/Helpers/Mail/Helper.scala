package typings.sendgrid.mod.SendGrid.Helpers.Mail

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Helper extends StObject {
  
  var Asm: Instantiable2[
    /* group_id */ Double, 
    /* groups_to_display */ js.Array[Double], 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Asm
  ]
  
  var Attachment: Instantiable0[typings.sendgrid.mod.SendGrid.Helpers.Mail.Attachment]
  
  var Bcc: Instantiable2[
    /* enable */ Boolean, 
    /* email */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Bcc
  ]
  
  var BypassListManagement: Instantiable1[
    /* enable */ Boolean, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.BypassListManagement
  ]
  
  var Category: Instantiable1[/* name */ String, typings.sendgrid.mod.SendGrid.Helpers.Mail.Category]
  
  var ClickTracking: Instantiable2[
    /* enable */ Boolean, 
    /* enableText */ Boolean, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.ClickTracking
  ]
  
  var Content: Instantiable2[
    /* mimetype */ String, 
    /* text */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Content
  ]
  
  var CustomArgs: Instantiable2[
    /* key */ String, 
    /* value */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.CustomArgs
  ]
  
  var Email: Instantiable2[
    /* address */ String, 
    /* name */ js.UndefOr[String], 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Email
  ]
  
  var Footer: Instantiable3[
    /* enable */ Boolean, 
    /* text */ String, 
    /* html */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Footer
  ]
  
  var Ganalytics: Instantiable6[
    /* enable */ Boolean, 
    /* utm_source */ String, 
    /* utm_medium */ String, 
    /* utm_term */ String, 
    /* utm_content */ String, 
    /* utm_campaign */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Ganalytics
  ]
  
  var Header: Instantiable2[
    /* key */ String, 
    /* value */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Header
  ]
  
  var Mail: Instantiable0[typings.sendgrid.mod.SendGrid.Helpers.Mail.Mail]
  
  var MailSettings: Instantiable0[typings.sendgrid.mod.SendGrid.Helpers.Mail.MailSettings]
  
  var OpenTracking: Instantiable2[
    /* enable */ Boolean, 
    /* subscriptionTag */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.OpenTracking
  ]
  
  var Personalization: Instantiable0[typings.sendgrid.mod.SendGrid.Helpers.Mail.Personalization]
  
  var SandBoxMode: Instantiable1[/* enable */ Boolean, typings.sendgrid.mod.SendGrid.Helpers.Mail.SandBoxMode]
  
  var Section: Instantiable2[
    /* key */ String, 
    /* value */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Section
  ]
  
  var SpamCheck: Instantiable3[
    /* enable */ Boolean, 
    /* threshold */ Double, 
    /* post_to_url */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.SpamCheck
  ]
  
  var SubscriptionTracking: Instantiable4[
    /* enable */ Boolean, 
    /* text */ String, 
    /* html */ String, 
    /* substitution_tag */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.SubscriptionTracking
  ]
  
  var Substitution: Instantiable2[
    /* key */ String, 
    /* value */ String, 
    typings.sendgrid.mod.SendGrid.Helpers.Mail.Substitution
  ]
  
  var TrackingSettings: Instantiable0[typings.sendgrid.mod.SendGrid.Helpers.Mail.TrackingSettings]
}
object Helper {
  
  inline def apply(
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
  
  extension [Self <: Helper](x: Self) {
    
    inline def setAsm(value: Instantiable2[/* group_id */ Double, /* groups_to_display */ js.Array[Double], Asm]): Self = StObject.set(x, "Asm", value.asInstanceOf[js.Any])
    
    inline def setAttachment(value: Instantiable0[Attachment]): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setBcc(value: Instantiable2[/* enable */ Boolean, /* email */ String, Bcc]): Self = StObject.set(x, "Bcc", value.asInstanceOf[js.Any])
    
    inline def setBypassListManagement(value: Instantiable1[/* enable */ Boolean, BypassListManagement]): Self = StObject.set(x, "BypassListManagement", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: Instantiable1[/* name */ String, Category]): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setClickTracking(value: Instantiable2[/* enable */ Boolean, /* enableText */ Boolean, ClickTracking]): Self = StObject.set(x, "ClickTracking", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Instantiable2[/* mimetype */ String, /* text */ String, Content]): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setCustomArgs(value: Instantiable2[/* key */ String, /* value */ String, CustomArgs]): Self = StObject.set(x, "CustomArgs", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: Instantiable2[/* address */ String, /* name */ js.UndefOr[String], Email]): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setFooter(value: Instantiable3[/* enable */ Boolean, /* text */ String, /* html */ String, Footer]): Self = StObject.set(x, "Footer", value.asInstanceOf[js.Any])
    
    inline def setGanalytics(
      value: Instantiable6[
          /* enable */ Boolean, 
          /* utm_source */ String, 
          /* utm_medium */ String, 
          /* utm_term */ String, 
          /* utm_content */ String, 
          /* utm_campaign */ String, 
          Ganalytics
        ]
    ): Self = StObject.set(x, "Ganalytics", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: Instantiable2[/* key */ String, /* value */ String, Header]): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setMail(value: Instantiable0[typings.sendgrid.mod.SendGrid.Helpers.Mail.Mail]): Self = StObject.set(x, "Mail", value.asInstanceOf[js.Any])
    
    inline def setMailSettings(value: Instantiable0[MailSettings]): Self = StObject.set(x, "MailSettings", value.asInstanceOf[js.Any])
    
    inline def setOpenTracking(value: Instantiable2[/* enable */ Boolean, /* subscriptionTag */ String, OpenTracking]): Self = StObject.set(x, "OpenTracking", value.asInstanceOf[js.Any])
    
    inline def setPersonalization(value: Instantiable0[Personalization]): Self = StObject.set(x, "Personalization", value.asInstanceOf[js.Any])
    
    inline def setSandBoxMode(value: Instantiable1[/* enable */ Boolean, SandBoxMode]): Self = StObject.set(x, "SandBoxMode", value.asInstanceOf[js.Any])
    
    inline def setSection(value: Instantiable2[/* key */ String, /* value */ String, Section]): Self = StObject.set(x, "Section", value.asInstanceOf[js.Any])
    
    inline def setSpamCheck(
      value: Instantiable3[/* enable */ Boolean, /* threshold */ Double, /* post_to_url */ String, SpamCheck]
    ): Self = StObject.set(x, "SpamCheck", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionTracking(
      value: Instantiable4[
          /* enable */ Boolean, 
          /* text */ String, 
          /* html */ String, 
          /* substitution_tag */ String, 
          SubscriptionTracking
        ]
    ): Self = StObject.set(x, "SubscriptionTracking", value.asInstanceOf[js.Any])
    
    inline def setSubstitution(value: Instantiable2[/* key */ String, /* value */ String, Substitution]): Self = StObject.set(x, "Substitution", value.asInstanceOf[js.Any])
    
    inline def setTrackingSettings(value: Instantiable0[TrackingSettings]): Self = StObject.set(x, "TrackingSettings", value.asInstanceOf[js.Any])
  }
}
