package typings.reactAudioPlayer.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLAudioElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactAudioPlayerProps extends js.Object {
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var controlsList: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var listenInterval: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var onAbort: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event_], Unit]] = js.undefined
  var onCanPlay: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event_], Unit]] = js.undefined
  var onCanPlayThrough: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event_], Unit]] = js.undefined
  var onEnded: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event_], Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event_], Unit]] = js.undefined
  var onListen: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event_], Unit]] = js.undefined
  var onLoadedMetadata: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event_], Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event_], Unit]] = js.undefined
  var onPlay: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event_], Unit]] = js.undefined
  var onSeeked: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event_], Unit]] = js.undefined
  var onVolumeChanged: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event_], Unit]] = js.undefined
  var preload: js.UndefOr[Preload] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object ReactAudioPlayerProps {
  @scala.inline
  def apply(
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    controlsList: String = null,
    crossOrigin: String = null,
    id: String = null,
    listenInterval: Int | Double = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    onAbort: /* event */ SyntheticEvent[HTMLAudioElement, Event_] => Unit = null,
    onCanPlay: /* event */ SyntheticEvent[HTMLAudioElement, Event_] => Unit = null,
    onCanPlayThrough: /* event */ SyntheticEvent[HTMLAudioElement, Event_] => Unit = null,
    onEnded: /* event */ SyntheticEvent[HTMLAudioElement, Event_] => Unit = null,
    onError: /* event */ SyntheticEvent[HTMLAudioElement, Event_] => Unit = null,
    onListen: /* event */ SyntheticEvent[HTMLAudioElement, Event_] => Unit = null,
    onLoadedMetadata: /* event */ SyntheticEvent[HTMLAudioElement, Event_] => Unit = null,
    onPause: /* event */ SyntheticEvent[HTMLAudioElement, Event_] => Unit = null,
    onPlay: /* event */ SyntheticEvent[HTMLAudioElement, Event_] => Unit = null,
    onSeeked: /* event */ SyntheticEvent[HTMLAudioElement, Event_] => Unit = null,
    onVolumeChanged: /* event */ SyntheticEvent[HTMLAudioElement, Event_] => Unit = null,
    preload: Preload = null,
    src: String = null,
    style: CSSProperties = null,
    title: String = null,
    volume: Int | Double = null
  ): ReactAudioPlayerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (controlsList != null) __obj.updateDynamic("controlsList")(controlsList.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (listenInterval != null) __obj.updateDynamic("listenInterval")(listenInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onListen != null) __obj.updateDynamic("onListen")(js.Any.fromFunction1(onListen))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onVolumeChanged != null) __obj.updateDynamic("onVolumeChanged")(js.Any.fromFunction1(onVolumeChanged))
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactAudioPlayerProps]
  }
}

