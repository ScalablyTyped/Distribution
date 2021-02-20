package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returned by the HTMLVideoElement.getVideoPlaybackQuality() method and contains metrics that can be used to determine the playback quality of a video. */
@js.native
trait VideoPlaybackQuality extends StObject {
  
  val creationTime: Double = js.native
  
  val droppedVideoFrames: Double = js.native
  
  val totalVideoFrames: Double = js.native
}
object VideoPlaybackQuality {
  
  @scala.inline
  def apply(creationTime: Double, droppedVideoFrames: Double, totalVideoFrames: Double): VideoPlaybackQuality = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], droppedVideoFrames = droppedVideoFrames.asInstanceOf[js.Any], totalVideoFrames = totalVideoFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlaybackQuality]
  }
  
  @scala.inline
  implicit class VideoPlaybackQualityMutableBuilder[Self <: VideoPlaybackQuality] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Double): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDroppedVideoFrames(value: Double): Self = StObject.set(x, "droppedVideoFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalVideoFrames(value: Double): Self = StObject.set(x, "totalVideoFrames", value.asInstanceOf[js.Any])
  }
}
