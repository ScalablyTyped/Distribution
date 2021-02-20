package typings.reactNativeShare.mod

import typings.reactNativeShare.anon.OptionssocialSocial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("react-native-share", "default.InstagramStories")
  @js.native
  object InstagramStories extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactNativeShare.mod.Share.InstagramStories with String] = js.native
    
    /* "shareBackgroundAndStickerImage" */ val SHARE_BACKGROUND_AND_STICKER_IMAGE: typings.reactNativeShare.mod.Share.InstagramStories.SHARE_BACKGROUND_AND_STICKER_IMAGE with String = js.native
    
    /* "shareBackgroundImage" */ val SHARE_BACKGROUND_IMAGE: typings.reactNativeShare.mod.Share.InstagramStories.SHARE_BACKGROUND_IMAGE with String = js.native
    
    /* "shareStickerImage" */ val SHARE_STICKER_IMAGE: typings.reactNativeShare.mod.Share.InstagramStories.SHARE_STICKER_IMAGE with String = js.native
  }
  
  @JSImport("react-native-share", "default.Social")
  @js.native
  object Social extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactNativeShare.mod.Share.Social with String] = js.native
    
    /* "email" */ val EMAIL: typings.reactNativeShare.mod.Share.Social.EMAIL with String = js.native
    
    /* "facebook" */ val FACEBOOK: typings.reactNativeShare.mod.Share.Social.FACEBOOK with String = js.native
    
    /* "googleplus" */ val GOOGLEPLUS: typings.reactNativeShare.mod.Share.Social.GOOGLEPLUS with String = js.native
    
    /* "instagram" */ val INSTAGRAM: typings.reactNativeShare.mod.Share.Social.INSTAGRAM with String = js.native
    
    /* "instagram-stories" */ val INSTAGRAM_STORIES: typings.reactNativeShare.mod.Share.Social.INSTAGRAM_STORIES with String = js.native
    
    /* "linkedin" */ val LINKEDIN: typings.reactNativeShare.mod.Share.Social.LINKEDIN with String = js.native
    
    /* "pagesmanager" */ val PAGESMANAGER: typings.reactNativeShare.mod.Share.Social.PAGESMANAGER with String = js.native
    
    /* "pinterest" */ val PINTEREST: typings.reactNativeShare.mod.Share.Social.PINTEREST with String = js.native
    
    /* "twitter" */ val TWITTER: typings.reactNativeShare.mod.Share.Social.TWITTER with String = js.native
    
    /* "whatsapp" */ val WHATSAPP: typings.reactNativeShare.mod.Share.Social.WHATSAPP with String = js.native
  }
  
  @JSImport("react-native-share", "default.isPackageInstalled")
  @js.native
  def isPackageInstalled(packageName: String): js.Promise[ShareSingleReturn] = js.native
  
  @JSImport("react-native-share", "default.open")
  @js.native
  def open(options: MultipleOptions): js.Promise[OpenReturn] = js.native
  @JSImport("react-native-share", "default.open")
  @js.native
  def open(options: Options): js.Promise[OpenReturn] = js.native
  
  @JSImport("react-native-share", "default.shareSingle")
  @js.native
  def shareSingle(options: OptionssocialSocial): js.Promise[ShareSingleReturn] = js.native
}
