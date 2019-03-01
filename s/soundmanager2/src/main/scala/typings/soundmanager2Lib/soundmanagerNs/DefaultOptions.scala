package typings
package soundmanager2Lib.soundmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOptions extends js.Object {
  var autoLoad: js.UndefOr[scala.Boolean] = js.undefined
  var autoPlay: js.UndefOr[scala.Boolean] = js.undefined
  var from: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var loops: js.UndefOr[scala.Double] = js.undefined
  var multiShot: js.UndefOr[scala.Boolean] = js.undefined
  var multiShotEvents: js.UndefOr[scala.Boolean] = js.undefined
  var onerror: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var onfinish: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var onid3: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var onload: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var onpause: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var onplay: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var onposition: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var onresume: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var onstop: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var pan: js.UndefOr[scala.Double] = js.undefined
  var playbackRate: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var stream: js.UndefOr[scala.Boolean] = js.undefined
  var to: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var `type`: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var usePolicyFile: js.UndefOr[scala.Boolean] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
  var whileloading: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var whileplaying: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
}

object DefaultOptions {
  @scala.inline
  def apply(
    autoLoad: js.UndefOr[scala.Boolean] = js.undefined,
    autoPlay: js.UndefOr[scala.Boolean] = js.undefined,
    from: scala.Int | scala.Double = null,
    loops: scala.Int | scala.Double = null,
    multiShot: js.UndefOr[scala.Boolean] = js.undefined,
    multiShotEvents: js.UndefOr[scala.Boolean] = js.undefined,
    onerror: js.Function0[scala.Unit] = null,
    onfinish: js.Function0[scala.Unit] = null,
    onid3: js.Function0[scala.Unit] = null,
    onload: js.Function0[scala.Unit] = null,
    onpause: js.Function0[scala.Unit] = null,
    onplay: js.Function0[scala.Unit] = null,
    onposition: js.Function0[scala.Unit] = null,
    onresume: js.Function0[scala.Unit] = null,
    onstop: js.Function0[scala.Unit] = null,
    pan: scala.Int | scala.Double = null,
    playbackRate: scala.Int | scala.Double = null,
    position: scala.Int | scala.Double = null,
    stream: js.UndefOr[scala.Boolean] = js.undefined,
    to: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    usePolicyFile: js.UndefOr[scala.Boolean] = js.undefined,
    volume: scala.Int | scala.Double = null,
    whileloading: js.Function0[scala.Unit] = null,
    whileplaying: js.Function0[scala.Unit] = null
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad)
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (loops != null) __obj.updateDynamic("loops")(loops.asInstanceOf[js.Any])
    if (!js.isUndefined(multiShot)) __obj.updateDynamic("multiShot")(multiShot)
    if (!js.isUndefined(multiShotEvents)) __obj.updateDynamic("multiShotEvents")(multiShotEvents)
    if (onerror != null) __obj.updateDynamic("onerror")(onerror)
    if (onfinish != null) __obj.updateDynamic("onfinish")(onfinish)
    if (onid3 != null) __obj.updateDynamic("onid3")(onid3)
    if (onload != null) __obj.updateDynamic("onload")(onload)
    if (onpause != null) __obj.updateDynamic("onpause")(onpause)
    if (onplay != null) __obj.updateDynamic("onplay")(onplay)
    if (onposition != null) __obj.updateDynamic("onposition")(onposition)
    if (onresume != null) __obj.updateDynamic("onresume")(onresume)
    if (onstop != null) __obj.updateDynamic("onstop")(onstop)
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(usePolicyFile)) __obj.updateDynamic("usePolicyFile")(usePolicyFile)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (whileloading != null) __obj.updateDynamic("whileloading")(whileloading)
    if (whileplaying != null) __obj.updateDynamic("whileplaying")(whileplaying)
    __obj.asInstanceOf[DefaultOptions]
  }
}

