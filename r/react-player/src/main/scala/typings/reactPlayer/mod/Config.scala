package typings.reactPlayer.mod

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
    if (dailymotion != null) __obj.updateDynamic("dailymotion")(dailymotion.asInstanceOf[js.Any])
    if (facebook != null) __obj.updateDynamic("facebook")(facebook.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (mixcloud != null) __obj.updateDynamic("mixcloud")(mixcloud.asInstanceOf[js.Any])
    if (soundcloud != null) __obj.updateDynamic("soundcloud")(soundcloud.asInstanceOf[js.Any])
    if (vimeo != null) __obj.updateDynamic("vimeo")(vimeo.asInstanceOf[js.Any])
    if (wistia != null) __obj.updateDynamic("wistia")(wistia.asInstanceOf[js.Any])
    if (youtube != null) __obj.updateDynamic("youtube")(youtube.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

