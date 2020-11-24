package typings.reactPlayer.lazyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var dailymotion: js.UndefOr[DailyMotionConfig] = js.native
  
  var facebook: js.UndefOr[FacebookConfig] = js.native
  
  var file: js.UndefOr[FileConfig] = js.native
  
  var mixcloud: js.UndefOr[MixcloudConfig] = js.native
  
  var soundcloud: js.UndefOr[SoundCloudConfig] = js.native
  
  var twitch: js.UndefOr[TwitchConfig] = js.native
  
  var vidyard: js.UndefOr[VidyardConfig] = js.native
  
  var vimeo: js.UndefOr[VimeoConfig] = js.native
  
  var wistia: js.UndefOr[WistiaConfig] = js.native
  
  var youtube: js.UndefOr[YouTubeConfig] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setDailymotion(value: DailyMotionConfig): Self = this.set("dailymotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDailymotion: Self = this.set("dailymotion", js.undefined)
    
    @scala.inline
    def setFacebook(value: FacebookConfig): Self = this.set("facebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacebook: Self = this.set("facebook", js.undefined)
    
    @scala.inline
    def setFile(value: FileConfig): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setMixcloud(value: MixcloudConfig): Self = this.set("mixcloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMixcloud: Self = this.set("mixcloud", js.undefined)
    
    @scala.inline
    def setSoundcloud(value: SoundCloudConfig): Self = this.set("soundcloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoundcloud: Self = this.set("soundcloud", js.undefined)
    
    @scala.inline
    def setTwitch(value: TwitchConfig): Self = this.set("twitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwitch: Self = this.set("twitch", js.undefined)
    
    @scala.inline
    def setVidyard(value: VidyardConfig): Self = this.set("vidyard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVidyard: Self = this.set("vidyard", js.undefined)
    
    @scala.inline
    def setVimeo(value: VimeoConfig): Self = this.set("vimeo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVimeo: Self = this.set("vimeo", js.undefined)
    
    @scala.inline
    def setWistia(value: WistiaConfig): Self = this.set("wistia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWistia: Self = this.set("wistia", js.undefined)
    
    @scala.inline
    def setYoutube(value: YouTubeConfig): Self = this.set("youtube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYoutube: Self = this.set("youtube", js.undefined)
  }
}
