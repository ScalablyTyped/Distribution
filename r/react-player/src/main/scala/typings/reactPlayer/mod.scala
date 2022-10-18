package typings.reactPlayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseReactPlayer<ReactPlayerProps> * / any */ @JSImport("react-player", JSImport.Default)
  @js.native
  open class default () extends StObject
  
  trait Config extends StObject {
    
    var dailymotion: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DailyMotionConfig */ Any
      ] = js.undefined
    
    var facebook: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FacebookConfig */ Any
      ] = js.undefined
    
    var file: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileConfig */ Any
      ] = js.undefined
    
    var mixcloud: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MixcloudConfig */ Any
      ] = js.undefined
    
    var soundcloud: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SoundCloudConfig */ Any
      ] = js.undefined
    
    var twitch: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TwitchConfig */ Any
      ] = js.undefined
    
    var vidyard: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VidyardConfig */ Any
      ] = js.undefined
    
    var vimeo: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VimeoConfig */ Any
      ] = js.undefined
    
    var wistia: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WistiaConfig */ Any
      ] = js.undefined
    
    var youtube: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify YouTubeConfig */ Any
      ] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setDailymotion(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DailyMotionConfig */ Any
      ): Self = StObject.set(x, "dailymotion", value.asInstanceOf[js.Any])
      
      inline def setDailymotionUndefined: Self = StObject.set(x, "dailymotion", js.undefined)
      
      inline def setFacebook(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FacebookConfig */ Any
      ): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
      
      inline def setFacebookUndefined: Self = StObject.set(x, "facebook", js.undefined)
      
      inline def setFile(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileConfig */ Any
      ): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setMixcloud(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MixcloudConfig */ Any
      ): Self = StObject.set(x, "mixcloud", value.asInstanceOf[js.Any])
      
      inline def setMixcloudUndefined: Self = StObject.set(x, "mixcloud", js.undefined)
      
      inline def setSoundcloud(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SoundCloudConfig */ Any
      ): Self = StObject.set(x, "soundcloud", value.asInstanceOf[js.Any])
      
      inline def setSoundcloudUndefined: Self = StObject.set(x, "soundcloud", js.undefined)
      
      inline def setTwitch(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TwitchConfig */ Any
      ): Self = StObject.set(x, "twitch", value.asInstanceOf[js.Any])
      
      inline def setTwitchUndefined: Self = StObject.set(x, "twitch", js.undefined)
      
      inline def setVidyard(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VidyardConfig */ Any
      ): Self = StObject.set(x, "vidyard", value.asInstanceOf[js.Any])
      
      inline def setVidyardUndefined: Self = StObject.set(x, "vidyard", js.undefined)
      
      inline def setVimeo(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VimeoConfig */ Any
      ): Self = StObject.set(x, "vimeo", value.asInstanceOf[js.Any])
      
      inline def setVimeoUndefined: Self = StObject.set(x, "vimeo", js.undefined)
      
      inline def setWistia(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WistiaConfig */ Any
      ): Self = StObject.set(x, "wistia", value.asInstanceOf[js.Any])
      
      inline def setWistiaUndefined: Self = StObject.set(x, "wistia", js.undefined)
      
      inline def setYoutube(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify YouTubeConfig */ Any
      ): Self = StObject.set(x, "youtube", value.asInstanceOf[js.Any])
      
      inline def setYoutubeUndefined: Self = StObject.set(x, "youtube", js.undefined)
    }
  }
  
  type ReactPlayer = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseReactPlayer<ReactPlayerProps> */ Any
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseReactPlayerProps * / any */ trait ReactPlayerProps extends StObject {
    
    var config: js.UndefOr[Config] = js.undefined
  }
  object ReactPlayerProps {
    
    inline def apply(): ReactPlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactPlayerProps]
    }
    
    extension [Self <: ReactPlayerProps](x: Self) {
      
      inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
}
