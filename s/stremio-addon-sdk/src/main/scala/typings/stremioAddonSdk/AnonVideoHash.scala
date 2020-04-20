package typings.stremioAddonSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVideoHash extends js.Object {
  /**
    * OpenSubtitles file hash for the video.
    */
  var videoHash: String
  /**
    * Size of the video file in bytes.
    */
  var videoSize: String
}

object AnonVideoHash {
  @scala.inline
  def apply(videoHash: String, videoSize: String): AnonVideoHash = {
    val __obj = js.Dynamic.literal(videoHash = videoHash.asInstanceOf[js.Any], videoSize = videoSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVideoHash]
  }
}

