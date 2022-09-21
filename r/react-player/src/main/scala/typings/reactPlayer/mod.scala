package typings.reactPlayer

import typings.reactPlayer.baseMod.BaseReactPlayerProps
import typings.reactPlayer.dailymotionMod.DailyMotionConfig
import typings.reactPlayer.facebookMod.FacebookConfig
import typings.reactPlayer.fileMod.FileConfig
import typings.reactPlayer.mixcloudMod.MixcloudConfig
import typings.reactPlayer.soundcloudMod.SoundCloudConfig
import typings.reactPlayer.twitchMod.TwitchConfig
import typings.reactPlayer.vidyardMod.VidyardConfig
import typings.reactPlayer.vimeoMod.VimeoConfig
import typings.reactPlayer.wistiaMod.WistiaConfig
import typings.reactPlayer.youtubeMod.YouTubeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-player", JSImport.Default)
  @js.native
  open class default ()
    extends typings.reactPlayer.baseMod.default[ReactPlayerProps]
  
  trait Config extends StObject {
    
    var dailymotion: js.UndefOr[DailyMotionConfig] = js.undefined
    
    var facebook: js.UndefOr[FacebookConfig] = js.undefined
    
    var file: js.UndefOr[FileConfig] = js.undefined
    
    var mixcloud: js.UndefOr[MixcloudConfig] = js.undefined
    
    var soundcloud: js.UndefOr[SoundCloudConfig] = js.undefined
    
    var twitch: js.UndefOr[TwitchConfig] = js.undefined
    
    var vidyard: js.UndefOr[VidyardConfig] = js.undefined
    
    var vimeo: js.UndefOr[VimeoConfig] = js.undefined
    
    var wistia: js.UndefOr[WistiaConfig] = js.undefined
    
    var youtube: js.UndefOr[YouTubeConfig] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setDailymotion(value: DailyMotionConfig): Self = StObject.set(x, "dailymotion", value.asInstanceOf[js.Any])
      
      inline def setDailymotionUndefined: Self = StObject.set(x, "dailymotion", js.undefined)
      
      inline def setFacebook(value: FacebookConfig): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
      
      inline def setFacebookUndefined: Self = StObject.set(x, "facebook", js.undefined)
      
      inline def setFile(value: FileConfig): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setMixcloud(value: MixcloudConfig): Self = StObject.set(x, "mixcloud", value.asInstanceOf[js.Any])
      
      inline def setMixcloudUndefined: Self = StObject.set(x, "mixcloud", js.undefined)
      
      inline def setSoundcloud(value: SoundCloudConfig): Self = StObject.set(x, "soundcloud", value.asInstanceOf[js.Any])
      
      inline def setSoundcloudUndefined: Self = StObject.set(x, "soundcloud", js.undefined)
      
      inline def setTwitch(value: TwitchConfig): Self = StObject.set(x, "twitch", value.asInstanceOf[js.Any])
      
      inline def setTwitchUndefined: Self = StObject.set(x, "twitch", js.undefined)
      
      inline def setVidyard(value: VidyardConfig): Self = StObject.set(x, "vidyard", value.asInstanceOf[js.Any])
      
      inline def setVidyardUndefined: Self = StObject.set(x, "vidyard", js.undefined)
      
      inline def setVimeo(value: VimeoConfig): Self = StObject.set(x, "vimeo", value.asInstanceOf[js.Any])
      
      inline def setVimeoUndefined: Self = StObject.set(x, "vimeo", js.undefined)
      
      inline def setWistia(value: WistiaConfig): Self = StObject.set(x, "wistia", value.asInstanceOf[js.Any])
      
      inline def setWistiaUndefined: Self = StObject.set(x, "wistia", js.undefined)
      
      inline def setYoutube(value: YouTubeConfig): Self = StObject.set(x, "youtube", value.asInstanceOf[js.Any])
      
      inline def setYoutubeUndefined: Self = StObject.set(x, "youtube", js.undefined)
    }
  }
  
  type ReactPlayer = typings.reactPlayer.baseMod.default[ReactPlayerProps]
  
  trait ReactPlayerProps
    extends StObject
       with BaseReactPlayerProps {
    
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
