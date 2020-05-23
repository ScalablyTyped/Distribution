package typings.stremioAddonSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoHash extends js.Object {
  /**
    * OpenSubtitles file hash for the video.
    */
  var videoHash: String
  /**
    * Size of the video file in bytes.
    */
  var videoSize: String
}

object VideoHash {
  @scala.inline
  def apply(videoHash: String, videoSize: String): VideoHash = {
    val __obj = js.Dynamic.literal(videoHash = videoHash.asInstanceOf[js.Any], videoSize = videoSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoHash]
  }
}

