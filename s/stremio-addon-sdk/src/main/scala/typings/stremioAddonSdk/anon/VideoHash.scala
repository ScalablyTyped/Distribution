package typings.stremioAddonSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoHash extends StObject {
  
  /**
    * OpenSubtitles file hash for the video.
    */
  var videoHash: String = js.native
  
  /**
    * Size of the video file in bytes.
    */
  var videoSize: String = js.native
}
object VideoHash {
  
  @scala.inline
  def apply(videoHash: String, videoSize: String): VideoHash = {
    val __obj = js.Dynamic.literal(videoHash = videoHash.asInstanceOf[js.Any], videoSize = videoSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoHash]
  }
  
  @scala.inline
  implicit class VideoHashMutableBuilder[Self <: VideoHash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVideoHash(value: String): Self = StObject.set(x, "videoHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSize(value: String): Self = StObject.set(x, "videoSize", value.asInstanceOf[js.Any])
  }
}
