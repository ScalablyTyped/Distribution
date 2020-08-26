package typings.reactYoutube.mod

import typings.reactYoutube.anon.Data
import typings.reactYoutube.anon.DataTarget
import typings.reactYoutube.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YouTubeProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var containerClassName: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var onEnd: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.native
  var onPause: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.native
  var onPlay: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.native
  var onPlaybackQualityChange: js.UndefOr[js.Function1[/* event */ DataTarget, Unit]] = js.native
  var onPlaybackRateChange: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.native
  var onReady: js.UndefOr[js.Function1[/* event */ Target, Unit]] = js.native
  var onStateChange: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.native
  var opts: js.UndefOr[Options] = js.native
  var videoId: js.UndefOr[String] = js.native
}

object YouTubeProps {
  @scala.inline
  def apply(): YouTubeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YouTubeProps]
  }
  @scala.inline
  implicit class YouTubePropsOps[Self <: YouTubeProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnEnd(value: /* event */ Data => Unit): Self = this.set("onEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    @scala.inline
    def setOnError(value: /* event */ Data => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnPause(value: /* event */ Data => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPlay(value: /* event */ Data => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    @scala.inline
    def setOnPlaybackQualityChange(value: /* event */ DataTarget => Unit): Self = this.set("onPlaybackQualityChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlaybackQualityChange: Self = this.set("onPlaybackQualityChange", js.undefined)
    @scala.inline
    def setOnPlaybackRateChange(value: /* event */ Data => Unit): Self = this.set("onPlaybackRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlaybackRateChange: Self = this.set("onPlaybackRateChange", js.undefined)
    @scala.inline
    def setOnReady(value: /* event */ Target => Unit): Self = this.set("onReady", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    @scala.inline
    def setOnStateChange(value: /* event */ Data => Unit): Self = this.set("onStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStateChange: Self = this.set("onStateChange", js.undefined)
    @scala.inline
    def setOpts(value: Options): Self = this.set("opts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpts: Self = this.set("opts", js.undefined)
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
  }
  
}

