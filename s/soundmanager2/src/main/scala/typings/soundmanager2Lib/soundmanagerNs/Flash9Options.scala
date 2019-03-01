package typings
package soundmanager2Lib.soundmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flash9Options extends js.Object {
  var isMovieStar: js.UndefOr[soundmanager2Lib.soundmanager2LibNumbers.`true` | scala.Null] = js.undefined
  var onbufferchange: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var ondataerror: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var onfailure: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var useEQData: js.UndefOr[scala.Boolean] = js.undefined
  var usePeakData: js.UndefOr[scala.Boolean] = js.undefined
  var useWaveformData: js.UndefOr[scala.Boolean] = js.undefined
}

object Flash9Options {
  @scala.inline
  def apply(
    isMovieStar: soundmanager2Lib.soundmanager2LibNumbers.`true` = null,
    onbufferchange: js.Function0[scala.Unit] = null,
    ondataerror: js.Function0[scala.Unit] = null,
    onfailure: js.Function0[scala.Unit] = null,
    useEQData: js.UndefOr[scala.Boolean] = js.undefined,
    usePeakData: js.UndefOr[scala.Boolean] = js.undefined,
    useWaveformData: js.UndefOr[scala.Boolean] = js.undefined
  ): Flash9Options = {
    val __obj = js.Dynamic.literal()
    if (isMovieStar != null) __obj.updateDynamic("isMovieStar")(isMovieStar)
    if (onbufferchange != null) __obj.updateDynamic("onbufferchange")(onbufferchange)
    if (ondataerror != null) __obj.updateDynamic("ondataerror")(ondataerror)
    if (onfailure != null) __obj.updateDynamic("onfailure")(onfailure)
    if (!js.isUndefined(useEQData)) __obj.updateDynamic("useEQData")(useEQData)
    if (!js.isUndefined(usePeakData)) __obj.updateDynamic("usePeakData")(usePeakData)
    if (!js.isUndefined(useWaveformData)) __obj.updateDynamic("useWaveformData")(useWaveformData)
    __obj.asInstanceOf[Flash9Options]
  }
}

