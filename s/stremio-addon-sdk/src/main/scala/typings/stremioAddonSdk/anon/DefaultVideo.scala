package typings.stremioAddonSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultVideo extends js.Object {
  /**
    * Set to a Video Object id in order to open the Detail page directly to that video's streams.
    */
  var defaultVideo: js.UndefOr[Boolean | String] = js.undefined
}

object DefaultVideo {
  @scala.inline
  def apply(defaultVideo: Boolean | String = null): DefaultVideo = {
    val __obj = js.Dynamic.literal()
    if (defaultVideo != null) __obj.updateDynamic("defaultVideo")(defaultVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultVideo]
  }
}

