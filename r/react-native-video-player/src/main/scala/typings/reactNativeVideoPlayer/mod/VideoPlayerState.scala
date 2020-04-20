package typings.reactNativeVideoPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPlayerState extends js.Object {
  var duration: Double
  var hasEnded: Boolean
  var isControlsVisible: Boolean
  var isMuted: Boolean
  var isPlaying: Boolean
  var isSeeking: Boolean
  var isStarted: Boolean
  var progress: Double
  var width: Double
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
}

