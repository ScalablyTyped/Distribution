package typings.reactHowler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var format: js.UndefOr[js.Array[String]] = js.native
  var html5: js.UndefOr[Boolean] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var mute: js.UndefOr[Boolean] = js.native
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var onLoadError: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.native
  var onPause: js.UndefOr[js.Function0[Unit]] = js.native
  var onPlay: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.native
  var onStop: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.native
  var onVolume: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.native
  var playing: js.UndefOr[Boolean] = js.native
  var preload: js.UndefOr[Boolean] = js.native
  var src: String | js.Array[String] = js.native
  var volume: js.UndefOr[Double] = js.native
}

object Props {
  @scala.inline
  def apply(src: String | js.Array[String]): Props = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setSrcVarargs(value: String*): Self = this.set("src", js.Array(value :_*))
    @scala.inline
    def setSrc(value: String | js.Array[String]): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatVarargs(value: String*): Self = this.set("format", js.Array(value :_*))
    @scala.inline
    def setFormat(value: js.Array[String]): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHtml5(value: Boolean): Self = this.set("html5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml5: Self = this.set("html5", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setMute(value: Boolean): Self = this.set("mute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMute: Self = this.set("mute", js.undefined)
    @scala.inline
    def setOnEnd(value: () => Unit): Self = this.set("onEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    @scala.inline
    def setOnLoad(value: () => Unit): Self = this.set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnLoadError(value: /* id */ Double => Unit): Self = this.set("onLoadError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadError: Self = this.set("onLoadError", js.undefined)
    @scala.inline
    def setOnPause(value: () => Unit): Self = this.set("onPause", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPlay(value: /* id */ Double => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    @scala.inline
    def setOnStop(value: /* id */ Double => Unit): Self = this.set("onStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStop: Self = this.set("onStop", js.undefined)
    @scala.inline
    def setOnVolume(value: /* id */ Double => Unit): Self = this.set("onVolume", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVolume: Self = this.set("onVolume", js.undefined)
    @scala.inline
    def setPlaying(value: Boolean): Self = this.set("playing", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaying: Self = this.set("playing", js.undefined)
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
  
}

