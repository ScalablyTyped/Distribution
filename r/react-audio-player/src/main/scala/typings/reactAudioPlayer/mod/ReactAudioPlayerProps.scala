package typings.reactAudioPlayer.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLAudioElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactAudioPlayerProps extends js.Object {
  var autoPlay: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var controls: js.UndefOr[Boolean] = js.native
  var controlsList: js.UndefOr[String] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var listenInterval: js.UndefOr[Double] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var muted: js.UndefOr[Boolean] = js.native
  var onAbort: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.native
  var onCanPlay: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.native
  var onCanPlayThrough: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.native
  var onEnded: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.native
  var onListen: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.native
  var onLoadedMetadata: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.native
  var onPause: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.native
  var onPlay: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.native
  var onSeeked: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.native
  var onVolumeChanged: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.native
  var preload: js.UndefOr[Preload] = js.native
  var src: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[String] = js.native
  var volume: js.UndefOr[Double] = js.native
}

object ReactAudioPlayerProps {
  @scala.inline
  def apply(): ReactAudioPlayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactAudioPlayerProps]
  }
  @scala.inline
  implicit class ReactAudioPlayerPropsOps[Self <: ReactAudioPlayerProps] (val x: Self) extends AnyVal {
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
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setControlsList(value: String): Self = this.set("controlsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlsList: Self = this.set("controlsList", js.undefined)
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setListenInterval(value: Double): Self = this.set("listenInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListenInterval: Self = this.set("listenInterval", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    @scala.inline
    def setOnAbort(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    @scala.inline
    def setOnCanPlay(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = this.set("onCanPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    @scala.inline
    def setOnCanPlayThrough(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = this.set("onCanPlayThrough", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    @scala.inline
    def setOnEnded(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    @scala.inline
    def setOnError(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnListen(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = this.set("onListen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnListen: Self = this.set("onListen", js.undefined)
    @scala.inline
    def setOnLoadedMetadata(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = this.set("onLoadedMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    @scala.inline
    def setOnPause(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPlay(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    @scala.inline
    def setOnSeeked(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    @scala.inline
    def setOnVolumeChanged(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = this.set("onVolumeChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVolumeChanged: Self = this.set("onVolumeChanged", js.undefined)
    @scala.inline
    def setPreload(value: Preload): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
  
}

