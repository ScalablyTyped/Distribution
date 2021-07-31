package typings.shareApiPolyfill

import typings.std.ShareData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait ShareAPIPolyfillData
    extends StObject
       with ShareData {
    
    var fbId: js.UndefOr[String] = js.undefined
    
    var hashtags: js.UndefOr[String] = js.undefined
  }
  object ShareAPIPolyfillData {
    
    @scala.inline
    def apply(): ShareAPIPolyfillData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShareAPIPolyfillData]
    }
    
    @scala.inline
    implicit class ShareAPIPolyfillDataMutableBuilder[Self <: ShareAPIPolyfillData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFbId(value: String): Self = StObject.set(x, "fbId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFbIdUndefined: Self = StObject.set(x, "fbId", js.undefined)
      
      @scala.inline
      def setHashtags(value: String): Self = StObject.set(x, "hashtags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtagsUndefined: Self = StObject.set(x, "hashtags", js.undefined)
    }
  }
  
  trait ShareAPIPolyfillOptions extends StObject {
    
    var copy: js.UndefOr[Boolean] = js.undefined
    
    var email: js.UndefOr[Boolean] = js.undefined
    
    var facebook: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var linkedin: js.UndefOr[Boolean] = js.undefined
    
    var messenger: js.UndefOr[Boolean] = js.undefined
    
    var print: js.UndefOr[Boolean] = js.undefined
    
    var skype: js.UndefOr[Boolean] = js.undefined
    
    var sms: js.UndefOr[Boolean] = js.undefined
    
    var telegram: js.UndefOr[Boolean] = js.undefined
    
    var twitter: js.UndefOr[Boolean] = js.undefined
    
    var whatsapp: js.UndefOr[Boolean] = js.undefined
  }
  object ShareAPIPolyfillOptions {
    
    @scala.inline
    def apply(): ShareAPIPolyfillOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShareAPIPolyfillOptions]
    }
    
    @scala.inline
    implicit class ShareAPIPolyfillOptionsMutableBuilder[Self <: ShareAPIPolyfillOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setEmail(value: Boolean): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setFacebook(value: Boolean): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacebookUndefined: Self = StObject.set(x, "facebook", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLinkedin(value: Boolean): Self = StObject.set(x, "linkedin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkedinUndefined: Self = StObject.set(x, "linkedin", js.undefined)
      
      @scala.inline
      def setMessenger(value: Boolean): Self = StObject.set(x, "messenger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessengerUndefined: Self = StObject.set(x, "messenger", js.undefined)
      
      @scala.inline
      def setPrint(value: Boolean): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      @scala.inline
      def setSkype(value: Boolean): Self = StObject.set(x, "skype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkypeUndefined: Self = StObject.set(x, "skype", js.undefined)
      
      @scala.inline
      def setSms(value: Boolean): Self = StObject.set(x, "sms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmsUndefined: Self = StObject.set(x, "sms", js.undefined)
      
      @scala.inline
      def setTelegram(value: Boolean): Self = StObject.set(x, "telegram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTelegramUndefined: Self = StObject.set(x, "telegram", js.undefined)
      
      @scala.inline
      def setTwitter(value: Boolean): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwitterUndefined: Self = StObject.set(x, "twitter", js.undefined)
      
      @scala.inline
      def setWhatsapp(value: Boolean): Self = StObject.set(x, "whatsapp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhatsappUndefined: Self = StObject.set(x, "whatsapp", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait Navigator extends StObject {
      
      def share(): js.Promise[Unit] = js.native
      def share(data: Unit, configuration: ShareAPIPolyfillOptions): js.Promise[Unit] = js.native
      def share(data: ShareAPIPolyfillData): js.Promise[Unit] = js.native
      def share(data: ShareAPIPolyfillData, configuration: ShareAPIPolyfillOptions): js.Promise[Unit] = js.native
    }
  }
}
