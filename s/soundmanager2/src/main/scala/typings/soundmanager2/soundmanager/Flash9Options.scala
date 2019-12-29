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
    isMovieStar: `true` = null,
    onbufferchange: () => Unit = null,
    ondataerror: () => Unit = null,
    onfailure: () => Unit = null,
    useEQData: js.UndefOr[Boolean] = js.undefined,
    usePeakData: js.UndefOr[Boolean] = js.undefined,
    useWaveformData: js.UndefOr[Boolean] = js.undefined
  ): Flash9Options = {
    val __obj = js.Dynamic.literal()
    if (isMovieStar != null) __obj.updateDynamic("isMovieStar")(isMovieStar.asInstanceOf[js.Any])
    if (onbufferchange != null) __obj.updateDynamic("onbufferchange")(js.Any.fromFunction0(onbufferchange))
    if (ondataerror != null) __obj.updateDynamic("ondataerror")(js.Any.fromFunction0(ondataerror))
    if (onfailure != null) __obj.updateDynamic("onfailure")(js.Any.fromFunction0(onfailure))
    if (!js.isUndefined(useEQData)) __obj.updateDynamic("useEQData")(useEQData.asInstanceOf[js.Any])
    if (!js.isUndefined(usePeakData)) __obj.updateDynamic("usePeakData")(usePeakData.asInstanceOf[js.Any])
    if (!js.isUndefined(useWaveformData)) __obj.updateDynamic("useWaveformData")(useWaveformData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flash9Options]
  }
}

