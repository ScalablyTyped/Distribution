package typings.reactDashPlayer.reactDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var dailymotion: js.UndefOr[DailyMotionConfig] = js.undefined
  var facebook: js.UndefOr[FacebookConfig] = js.undefined
  var file: js.UndefOr[FileConfig] = js.undefined
  var mixcloud: js.UndefOr[MixcloudConfig] = js.undefined
  var soundcloud: js.UndefOr[SoundCloudConfig] = js.undefined
  var vimeo: js.UndefOr[VimeoConfig] = js.undefined
  var wistia: js.UndefOr[WistiaConfig] = js.undefined
  var youtube: js.UndefOr[YouTubeConfig] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    dailymotion: DailyMotionConfig = null,
    facebook: FacebookConfig = null,
    file: FileConfig = null,
    mixcloud: MixcloudConfig = null,
    soundcloud: SoundCloudConfig = null,
    vimeo: VimeoConfig = null,
    wistia: WistiaConfig = null,
    youtube: YouTubeConfig = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (dailymotion != null) __obj.updateDynamic("dailymotion")(dailymotion)
    if (facebook != null) __obj.updateDynamic("facebook")(facebook)
    if (file != null) __obj.updateDynamic("file")(file)
    if (mixcloud != null) __obj.updateDynamic("mixcloud")(mixcloud)
    if (soundcloud != null) __obj.updateDynamic("soundcloud")(soundcloud)
    if (vimeo != null) __obj.updateDynamic("vimeo")(vimeo)
    if (wistia != null) __obj.updateDynamic("wistia")(wistia)
    if (youtube != null) __obj.updateDynamic("youtube")(youtube)
    __obj.asInstanceOf[Config]
  }
}

