package typings
package qrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Quality extends js.Object {
  /**
    * A Number between 0 and 1 indicating image quality if the requested type is image/jpeg or image/webp.
    * Default: 0.92
    */
  var quality: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Quality {
  @scala.inline
  def apply(quality: scala.Int | scala.Double = null): Anon_Quality = {
    val __obj = js.Dynamic.literal()
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Quality]
  }
}

