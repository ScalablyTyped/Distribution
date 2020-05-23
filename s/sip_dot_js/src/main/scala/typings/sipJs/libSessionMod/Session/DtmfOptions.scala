package typings.sipJs.libSessionMod.Session

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DtmfOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var interToneGap: js.UndefOr[Double] = js.undefined
}

object DtmfOptions {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    extraHeaders: js.Array[String] = null,
    interToneGap: js.UndefOr[Double] = js.undefined
  ): DtmfOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(interToneGap)) __obj.updateDynamic("interToneGap")(interToneGap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtmfOptions]
  }
}

