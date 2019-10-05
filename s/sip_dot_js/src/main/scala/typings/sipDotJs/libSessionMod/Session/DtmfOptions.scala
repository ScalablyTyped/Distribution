package typings.sipDotJs.libSessionMod.Session

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
    duration: Int | Double = null,
    extraHeaders: js.Array[String] = null,
    interToneGap: Int | Double = null
  ): DtmfOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    if (interToneGap != null) __obj.updateDynamic("interToneGap")(interToneGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtmfOptions]
  }
}

