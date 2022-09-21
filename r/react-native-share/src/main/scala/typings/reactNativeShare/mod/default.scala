package typings.reactNativeShare.mod

import typings.reactNativeShare.anon.OptionssocialSocial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("react-native-share", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-share", "default.InstagramStories")
  @js.native
  object InstagramStories extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactNativeShare.mod.Share.InstagramStories & String] = js.native
    
    /* "shareBackgroundAndStickerImage" */ val SHARE_BACKGROUND_AND_STICKER_IMAGE: typings.reactNativeShare.mod.Share.InstagramStories.SHARE_BACKGROUND_AND_STICKER_IMAGE & String = js.native
    
    /* "shareBackgroundImage" */ val SHARE_BACKGROUND_IMAGE: typings.reactNativeShare.mod.Share.InstagramStories.SHARE_BACKGROUND_IMAGE & String = js.native
    
    /* "shareBackgroundVideo" */ val SHARE_BACKGROUND_VIDEO: typings.reactNativeShare.mod.Share.InstagramStories.SHARE_BACKGROUND_VIDEO & String = js.native
    
    /* "shareStickerImage" */ val SHARE_STICKER_IMAGE: typings.reactNativeShare.mod.Share.InstagramStories.SHARE_STICKER_IMAGE & String = js.native
  }
  
  @JSImport("react-native-share", "default.Social")
  @js.native
  object Social extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactNativeShare.mod.Share.Social & String] = js.native
    
    /* "email" */ val EMAIL: typings.reactNativeShare.mod.Share.Social.EMAIL & String = js.native
    
    /* "facebook" */ val FACEBOOK: typings.reactNativeShare.mod.Share.Social.FACEBOOK & String = js.native
    
    /* "googleplus" */ val GOOGLEPLUS: typings.reactNativeShare.mod.Share.Social.GOOGLEPLUS & String = js.native
    
    /* "instagram" */ val INSTAGRAM: typings.reactNativeShare.mod.Share.Social.INSTAGRAM & String = js.native
    
    /* "instagram-stories" */ val INSTAGRAM_STORIES: typings.reactNativeShare.mod.Share.Social.INSTAGRAM_STORIES & String = js.native
    
    /* "linkedin" */ val LINKEDIN: typings.reactNativeShare.mod.Share.Social.LINKEDIN & String = js.native
    
    /* "pagesmanager" */ val PAGESMANAGER: typings.reactNativeShare.mod.Share.Social.PAGESMANAGER & String = js.native
    
    /* "pinterest" */ val PINTEREST: typings.reactNativeShare.mod.Share.Social.PINTEREST & String = js.native
    
    /* "SMS" */ val SMS: typings.reactNativeShare.mod.Share.Social.SMS & String = js.native
    
    /* "twitter" */ val TWITTER: typings.reactNativeShare.mod.Share.Social.TWITTER & String = js.native
    
    /* "whatsapp" */ val WHATSAPP: typings.reactNativeShare.mod.Share.Social.WHATSAPP & String = js.native
  }
  
  inline def isPackageInstalled(packageName: String): js.Promise[ShareSingleReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("isPackageInstalled")(packageName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ShareSingleReturn]]
  
  inline def open(options: MultipleOptions): js.Promise[OpenReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OpenReturn]]
  inline def open(options: Options): js.Promise[OpenReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OpenReturn]]
  
  inline def shareSingle(options: OptionssocialSocial): js.Promise[ShareSingleReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareSingle")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ShareSingleReturn]]
}
