package typings.reactNativeShare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-share", "Share")
@js.native
object Share extends js.Object {
  @js.native
  sealed trait InstagramStories extends js.Object
  
  @js.native
  sealed trait Social extends js.Object
  
  @js.native
  object InstagramStories extends js.Object {
    @js.native
    sealed trait SHARE_BACKGROUND_AND_STICKER_IMAGE extends InstagramStories
    
    @js.native
    sealed trait SHARE_BACKGROUND_IMAGE extends InstagramStories
    
    @js.native
    sealed trait SHARE_STICKER_IMAGE extends InstagramStories
    
  }
  
  @js.native
  object Social extends js.Object {
    @js.native
    sealed trait EMAIL extends Social
    
    @js.native
    sealed trait FACEBOOK extends Social
    
    @js.native
    sealed trait GOOGLEPLUS extends Social
    
    @js.native
    sealed trait INSTAGRAM extends Social
    
    @js.native
    sealed trait INSTAGRAM_STORIES extends Social
    
    @js.native
    sealed trait LINKEDIN extends Social
    
    @js.native
    sealed trait PAGESMANAGER extends Social
    
    @js.native
    sealed trait PINTEREST extends Social
    
    @js.native
    sealed trait TWITTER extends Social
    
    @js.native
    sealed trait WHATSAPP extends Social
    
  }
  
}

