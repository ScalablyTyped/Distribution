package typings.reactSound.mod

import typings.reactSound.reactSoundStrings.PAUSED
import typings.reactSound.reactSoundStrings.PLAYING
import typings.reactSound.reactSoundStrings.STOPPED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSoundProps extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var onBufferChange: js.UndefOr[js.Function0[Unit]] = js.native
  var onError: js.UndefOr[js.Function0[Unit]] = js.native
  var onFinishedPlaying: js.UndefOr[js.Function0[Unit]] = js.native
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var onLoading: js.UndefOr[js.Function0[Unit]] = js.native
  var onPause: js.UndefOr[js.Function0[Unit]] = js.native
  var onPlaying: js.UndefOr[js.Function0[Unit]] = js.native
  var onResume: js.UndefOr[js.Function0[Unit]] = js.native
  var onStop: js.UndefOr[js.Function0[Unit]] = js.native
  var playFromPosition: js.UndefOr[Double] = js.native
  var playStatus: PLAYING | STOPPED | PAUSED = js.native
  var playbackRate: js.UndefOr[Double] = js.native
  var position: js.UndefOr[Double] = js.native
  var url: String = js.native
  var volume: js.UndefOr[Double] = js.native
}

object ReactSoundProps {
  @scala.inline
  def apply(playStatus: PLAYING | STOPPED | PAUSED, url: String): ReactSoundProps = {
    val __obj = js.Dynamic.literal(playStatus = playStatus.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSoundProps]
  }
  @scala.inline
  implicit class ReactSoundPropsOps[Self <: ReactSoundProps] (val x: Self) extends AnyVal {
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
    def setPlayStatus(value: PLAYING | STOPPED | PAUSED): Self = this.set("playStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoLoad(value: Boolean): Self = this.set("autoLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoLoad: Self = this.set("autoLoad", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setOnBufferChange(value: () => Unit): Self = this.set("onBufferChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBufferChange: Self = this.set("onBufferChange", js.undefined)
    @scala.inline
    def setOnError(value: () => Unit): Self = this.set("onError", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnFinishedPlaying(value: () => Unit): Self = this.set("onFinishedPlaying", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFinishedPlaying: Self = this.set("onFinishedPlaying", js.undefined)
    @scala.inline
    def setOnLoad(value: () => Unit): Self = this.set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnLoading(value: () => Unit): Self = this.set("onLoading", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoading: Self = this.set("onLoading", js.undefined)
    @scala.inline
    def setOnPause(value: () => Unit): Self = this.set("onPause", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPlaying(value: () => Unit): Self = this.set("onPlaying", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    @scala.inline
    def setOnResume(value: () => Unit): Self = this.set("onResume", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnResume: Self = this.set("onResume", js.undefined)
    @scala.inline
    def setOnStop(value: () => Unit): Self = this.set("onStop", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStop: Self = this.set("onStop", js.undefined)
    @scala.inline
    def setPlayFromPosition(value: Double): Self = this.set("playFromPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayFromPosition: Self = this.set("playFromPosition", js.undefined)
    @scala.inline
    def setPlaybackRate(value: Double): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaybackRate: Self = this.set("playbackRate", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
  
}

