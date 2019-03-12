package typings
package soundmanager2Lib.soundmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoundProperties extends DefaultOptions {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object SoundProperties {
  @scala.inline
  def apply(
    url: java.lang.String,
    autoLoad: js.UndefOr[scala.Boolean] = js.undefined,
    autoPlay: js.UndefOr[scala.Boolean] = js.undefined,
    from: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    loops: scala.Int | scala.Double = null,
    multiShot: js.UndefOr[scala.Boolean] = js.undefined,
    multiShotEvents: js.UndefOr[scala.Boolean] = js.undefined,
    onerror: () => scala.Unit = null,
    onfinish: () => scala.Unit = null,
    onid3: () => scala.Unit = null,
    onload: () => scala.Unit = null,
    onpause: () => scala.Unit = null,
    onplay: () => scala.Unit = null,
    onposition: () => scala.Unit = null,
    onresume: () => scala.Unit = null,
    onstop: () => scala.Unit = null,
    pan: scala.Int | scala.Double = null,
    playbackRate: scala.Int | scala.Double = null,
    position: scala.Int | scala.Double = null,
    stream: js.UndefOr[scala.Boolean] = js.undefined,
    to: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    usePolicyFile: js.UndefOr[scala.Boolean] = js.undefined,
    volume: scala.Int | scala.Double = null,
    whileloading: () => scala.Unit = null,
    whileplaying: () => scala.Unit = null
  ): SoundProperties = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad)
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (loops != null) __obj.updateDynamic("loops")(loops.asInstanceOf[js.Any])
    if (!js.isUndefined(multiShot)) __obj.updateDynamic("multiShot")(multiShot)
    if (!js.isUndefined(multiShotEvents)) __obj.updateDynamic("multiShotEvents")(multiShotEvents)
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
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(usePolicyFile)) __obj.updateDynamic("usePolicyFile")(usePolicyFile)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (whileloading != null) __obj.updateDynamic("whileloading")(js.Any.fromFunction0(whileloading))
    if (whileplaying != null) __obj.updateDynamic("whileplaying")(js.Any.fromFunction0(whileplaying))
    __obj.asInstanceOf[SoundProperties]
  }
}

