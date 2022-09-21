package typings.reactNativeShare.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Share {
  
  @js.native
  sealed trait InstagramStories extends StObject
  @JSImport("react-native-share", "Share.InstagramStories")
  @js.native
  object InstagramStories extends StObject {
    
    @js.native
    sealed trait SHARE_BACKGROUND_AND_STICKER_IMAGE
      extends StObject
         with InstagramStories
    
    @js.native
    sealed trait SHARE_BACKGROUND_IMAGE
      extends StObject
         with InstagramStories
    
    @js.native
    sealed trait SHARE_BACKGROUND_VIDEO
      extends StObject
         with InstagramStories
    
    @js.native
    sealed trait SHARE_STICKER_IMAGE
      extends StObject
         with InstagramStories
  }
  
  @js.native
  sealed trait Social extends StObject
  @JSImport("react-native-share", "Share.Social")
  @js.native
  object Social extends StObject {
    
    @js.native
    sealed trait EMAIL
      extends StObject
         with Social
    
    @js.native
    sealed trait FACEBOOK
      extends StObject
         with Social
    
    @js.native
    sealed trait GOOGLEPLUS
      extends StObject
         with Social
    
    @js.native
    sealed trait INSTAGRAM
      extends StObject
         with Social
    
    @js.native
    sealed trait INSTAGRAM_STORIES
      extends StObject
         with Social
    
    @js.native
    sealed trait LINKEDIN
      extends StObject
         with Social
    
    @js.native
    sealed trait PAGESMANAGER
      extends StObject
         with Social
    
    @js.native
    sealed trait PINTEREST
      extends StObject
         with Social
    
    @js.native
    sealed trait SMS
      extends StObject
         with Social
    
    @js.native
    sealed trait TWITTER
      extends StObject
         with Social
    
    @js.native
    sealed trait WHATSAPP
      extends StObject
         with Social
  }
}
