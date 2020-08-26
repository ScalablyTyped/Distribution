package typings.reactNativeVideoPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoPlayerState extends js.Object {
  var duration: Double = js.native
  var hasEnded: Boolean = js.native
  var isControlsVisible: Boolean = js.native
  var isMuted: Boolean = js.native
  var isPlaying: Boolean = js.native
  var isSeeking: Boolean = js.native
  var isStarted: Boolean = js.native
  var progress: Double = js.native
  var width: Double = js.native
}

object VideoPlayerState {
  @scala.inline
  def apply(
    duration: Double,
    hasEnded: Boolean,
    isControlsVisible: Boolean,
    isMuted: Boolean,
    isPlaying: Boolean,
    isSeeking: Boolean,
    isStarted: Boolean,
    progress: Double,
    width: Double
  ): VideoPlayerState = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], hasEnded = hasEnded.asInstanceOf[js.Any], isControlsVisible = isControlsVisible.asInstanceOf[js.Any], isMuted = isMuted.asInstanceOf[js.Any], isPlaying = isPlaying.asInstanceOf[js.Any], isSeeking = isSeeking.asInstanceOf[js.Any], isStarted = isStarted.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerState]
  }
  @scala.inline
  implicit class VideoPlayerStateOps[Self <: VideoPlayerState] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasEnded(value: Boolean): Self = this.set("hasEnded", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsControlsVisible(value: Boolean): Self = this.set("isControlsVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMuted(value: Boolean): Self = this.set("isMuted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPlaying(value: Boolean): Self = this.set("isPlaying", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSeeking(value: Boolean): Self = this.set("isSeeking", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsStarted(value: Boolean): Self = this.set("isStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

