package typings
package sipDotJsLib.libSessionMod.SessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DtmfOptions extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var interToneGap: js.UndefOr[scala.Double] = js.undefined
}

object DtmfOptions {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    extraHeaders: js.Array[java.lang.String] = null,
    interToneGap: scala.Int | scala.Double = null
  ): DtmfOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    if (interToneGap != null) __obj.updateDynamic("interToneGap")(interToneGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtmfOptions]
  }
}

