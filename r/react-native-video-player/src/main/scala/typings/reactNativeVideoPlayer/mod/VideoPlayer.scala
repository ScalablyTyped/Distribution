package typings.reactNativeVideoPlayer.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoPlayer
  extends Component[VideoPlayerProps, VideoPlayerState, js.Any] {
  
  /* private */ def getSizeStyles(): js.Any = js.native
  
  /* private */ def hideControls(): js.Any = js.native
  
  /* private */ def onEnd(event: js.Any): js.Any = js.native
  
  /* private */ def onLayout(event: js.Any): js.Any = js.native
  
  /* private */ def onLoad(event: js.Any): js.Any = js.native
  
  /* private */ def onMutePress(): js.Any = js.native
  
  /* private */ def onPlayPress(): js.Any = js.native
  
  /* private */ def onProgress(event: js.Any): js.Any = js.native
  
  /* private */ def onSeek(event: js.Any): js.Any = js.native
  
  /* private */ def onSeekBarLayout(event: js.Any): js.Any = js.native
  
  /* private */ def onSeekGrant(event: js.Any): js.Any = js.native
  
  /* private */ def onSeekRelease(): js.Any = js.native
  
  /* private */ def onStartPress(): js.Any = js.native
  
  /* private */ def onToggleFullScreen(): js.Any = js.native
  
  def pause(): js.Any = js.native
  
  def resume(): js.Any = js.native
  
  def seek(t: Double): js.Any = js.native
  
  var seekBarWidth: Double = js.native
  
  var seekProgressStart: Double = js.native
  
  var seekTouchStart: Double = js.native
  
  /* private */ def showControls(): js.Any = js.native
  
  def stop(): js.Any = js.native
  
  var wasPlayingBeforeSeek: Boolean = js.native
}
