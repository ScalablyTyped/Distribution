package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteableMetadata extends js.Object {
  /** Number value of the EXIF Orientation header, if present */
  var orientation: js.UndefOr[scala.Double] = js.undefined
}

object WriteableMetadata {
  @scala.inline
  def apply(orientation: scala.Int | scala.Double = null): WriteableMetadata = {
    val __obj = js.Dynamic.literal()
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteableMetadata]
  }
}

