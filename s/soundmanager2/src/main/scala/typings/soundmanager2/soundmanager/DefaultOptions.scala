package typings.soundmanager2.soundmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOptions extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var from: js.UndefOr[Double | Null] = js.undefined
  var loops: js.UndefOr[Double] = js.undefined
  var multiShot: js.UndefOr[Boolean] = js.undefined
  var multiShotEvents: js.UndefOr[Boolean] = js.undefined
  var onerror: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onfinish: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onid3: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onload: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onpause: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onplay: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onposition: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onresume: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onstop: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var pan: js.UndefOr[Double] = js.undefined
  var playbackRate: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[Double | Null] = js.undefined
  var stream: js.UndefOr[Boolean] = js.undefined
  var to: js.UndefOr[Double | Null] = js.undefined
  var `type`: js.UndefOr[String | Null] = js.undefined
  var usePolicyFile: js.UndefOr[Boolean] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
  var whileloading: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var whileplaying: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
}

object DefaultOptions {
  @scala.inline
  def apply(
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    from: Int | Double = null,
    loops: Int | Double = null,
    multiShot: js.UndefOr[Boolean] = js.undefined,
    multiShotEvents: js.UndefOr[Boolean] = js.undefined,
    onerror: () => Unit = null,
    onfinish: () => Unit = null,
    onid3: () => Unit = null,
    onload: () => Unit = null,
    onpause: () => Unit = null,
    onplay: () => Unit = null,
    onposition: () => Unit = null,
    onresume: () => Unit = null,
    onstop: () => Unit = null,
    pan: Int | Double = null,
    playbackRate: Int | Double = null,
    position: Int | Double = null,
    stream: js.UndefOr[Boolean] = js.undefined,
    to: Int | Double = null,
    `type`: String = null,
    usePolicyFile: js.UndefOr[Boolean] = js.undefined,
    volume: Int | Double = null,
    whileloading: () => Unit = null,
    whileplaying: () => Unit = null
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (loops != null) __obj.updateDynamic("loops")(loops.asInstanceOf[js.Any])
    if (!js.isUndefined(multiShot)) __obj.updateDynamic("multiShot")(multiShot.asInstanceOf[js.Any])
    if (!js.isUndefined(multiShotEvents)) __obj.updateDynamic("multiShotEvents")(multiShotEvents.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction0(onerror))
    if (onfinish != null) __obj.updateDynamic("onfinish")(js.Any.fromFunction0(onfinish))
    if (onid3 != null) __obj.updateDynamic("onid3")(js.Any.fromFunction0(onid3))
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction0(onload))
    if (onpause != null) __obj.updateDynamic("onpause")(js.Any.fromFunction0(onpause))
    if (onplay != null) __obj.updateDynamic("onplay")(js.Any.fromFunction0(onplay))
    if (onposition != null) __obj.updateDynamic("onposition")(js.Any.fromFunction0(onposition))
    if (onresume != null) __obj.updateDynamic("onresume")(js.Any.fromFunction0(onresume))
    if (onstop != null) __obj.updateDynamic("onstop")(js.Any.fromFunction0(onstop))
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(usePolicyFile)) __obj.updateDynamic("usePolicyFile")(usePolicyFile.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (whileloading != null) __obj.updateDynamic("whileloading")(js.Any.fromFunction0(whileloading))
    if (whileplaying != null) __obj.updateDynamic("whileplaying")(js.Any.fromFunction0(whileplaying))
    __obj.asInstanceOf[DefaultOptions]
  }
}

