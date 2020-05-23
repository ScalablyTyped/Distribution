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
    from: js.UndefOr[Null | Double] = js.undefined,
    loops: js.UndefOr[Double] = js.undefined,
    multiShot: js.UndefOr[Boolean] = js.undefined,
    multiShotEvents: js.UndefOr[Boolean] = js.undefined,
    onerror: js.UndefOr[Null | (() => Unit)] = js.undefined,
    onfinish: js.UndefOr[Null | (() => Unit)] = js.undefined,
    onid3: js.UndefOr[Null | (() => Unit)] = js.undefined,
    onload: js.UndefOr[Null | (() => Unit)] = js.undefined,
    onpause: js.UndefOr[Null | (() => Unit)] = js.undefined,
    onplay: js.UndefOr[Null | (() => Unit)] = js.undefined,
    onposition: js.UndefOr[Null | (() => Unit)] = js.undefined,
    onresume: js.UndefOr[Null | (() => Unit)] = js.undefined,
    onstop: js.UndefOr[Null | (() => Unit)] = js.undefined,
    pan: js.UndefOr[Double] = js.undefined,
    playbackRate: js.UndefOr[Double] = js.undefined,
    position: js.UndefOr[Null | Double] = js.undefined,
    stream: js.UndefOr[Boolean] = js.undefined,
    to: js.UndefOr[Null | Double] = js.undefined,
    `type`: js.UndefOr[Null | String] = js.undefined,
    usePolicyFile: js.UndefOr[Boolean] = js.undefined,
    volume: js.UndefOr[Double] = js.undefined,
    whileloading: js.UndefOr[Null | (() => Unit)] = js.undefined,
    whileplaying: js.UndefOr[Null | (() => Unit)] = js.undefined
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(loops)) __obj.updateDynamic("loops")(loops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiShot)) __obj.updateDynamic("multiShot")(multiShot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiShotEvents)) __obj.updateDynamic("multiShotEvents")(multiShotEvents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onerror)) __obj.updateDynamic("onerror")(if (onerror != null) js.Any.fromFunction0(onerror.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(onfinish)) __obj.updateDynamic("onfinish")(if (onfinish != null) js.Any.fromFunction0(onfinish.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(onid3)) __obj.updateDynamic("onid3")(if (onid3 != null) js.Any.fromFunction0(onid3.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(onload)) __obj.updateDynamic("onload")(if (onload != null) js.Any.fromFunction0(onload.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(onpause)) __obj.updateDynamic("onpause")(if (onpause != null) js.Any.fromFunction0(onpause.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(onplay)) __obj.updateDynamic("onplay")(if (onplay != null) js.Any.fromFunction0(onplay.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(onposition)) __obj.updateDynamic("onposition")(if (onposition != null) js.Any.fromFunction0(onposition.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(onresume)) __obj.updateDynamic("onresume")(if (onresume != null) js.Any.fromFunction0(onresume.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(onstop)) __obj.updateDynamic("onstop")(if (onstop != null) js.Any.fromFunction0(onstop.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(pan)) __obj.updateDynamic("pan")(pan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(playbackRate)) __obj.updateDynamic("playbackRate")(playbackRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(usePolicyFile)) __obj.updateDynamic("usePolicyFile")(usePolicyFile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    if (!js.isUndefined(whileloading)) __obj.updateDynamic("whileloading")(if (whileloading != null) js.Any.fromFunction0(whileloading.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(whileplaying)) __obj.updateDynamic("whileplaying")(if (whileplaying != null) js.Any.fromFunction0(whileplaying.asInstanceOf[() => Unit]) else null)
    __obj.asInstanceOf[DefaultOptions]
  }
}

