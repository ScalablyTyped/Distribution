package typings.soundmanager2.soundmanager

import typings.soundmanager2.soundmanager2Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flash9Options extends js.Object {
  var isMovieStar: js.UndefOr[`true` | Null] = js.undefined
  var onbufferchange: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var ondataerror: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onfailure: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var useEQData: js.UndefOr[Boolean] = js.undefined
  var usePeakData: js.UndefOr[Boolean] = js.undefined
  var useWaveformData: js.UndefOr[Boolean] = js.undefined
}

object Flash9Options {
  @scala.inline
  def apply(
    isMovieStar: js.UndefOr[Null | `true`] = js.undefined,
    onbufferchange: js.UndefOr[Null | (() => Unit)] = js.undefined,
    ondataerror: js.UndefOr[Null | (() => Unit)] = js.undefined,
    onfailure: js.UndefOr[Null | (() => Unit)] = js.undefined,
    useEQData: js.UndefOr[Boolean] = js.undefined,
    usePeakData: js.UndefOr[Boolean] = js.undefined,
    useWaveformData: js.UndefOr[Boolean] = js.undefined
  ): Flash9Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isMovieStar)) __obj.updateDynamic("isMovieStar")(isMovieStar.asInstanceOf[js.Any])
    if (!js.isUndefined(onbufferchange)) __obj.updateDynamic("onbufferchange")(if (onbufferchange != null) js.Any.fromFunction0(onbufferchange.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(ondataerror)) __obj.updateDynamic("ondataerror")(if (ondataerror != null) js.Any.fromFunction0(ondataerror.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(onfailure)) __obj.updateDynamic("onfailure")(if (onfailure != null) js.Any.fromFunction0(onfailure.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(useEQData)) __obj.updateDynamic("useEQData")(useEQData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usePeakData)) __obj.updateDynamic("usePeakData")(usePeakData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useWaveformData)) __obj.updateDynamic("useWaveformData")(useWaveformData.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flash9Options]
  }
}

