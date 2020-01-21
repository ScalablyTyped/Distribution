package typings.qrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuality extends js.Object {
  /**
    * A Number between 0 and 1 indicating image quality if the requested type is image/jpeg or image/webp.
    * Default: 0.92
    */
  var quality: js.UndefOr[Double] = js.undefined
}

object AnonQuality {
  @scala.inline
  def apply(quality: Int | Double = null): AnonQuality = {
    val __obj = js.Dynamic.literal()
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQuality]
  }
}

