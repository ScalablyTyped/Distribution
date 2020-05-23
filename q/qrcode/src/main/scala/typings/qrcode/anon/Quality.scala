package typings.qrcode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quality extends js.Object {
  /**
    * A Number between 0 and 1 indicating image quality if the requested type is image/jpeg or image/webp.
    * Default: 0.92
    */
  var quality: js.UndefOr[Double] = js.undefined
}

object Quality {
  @scala.inline
  def apply(quality: js.UndefOr[Double] = js.undefined): Quality = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quality]
  }
}

