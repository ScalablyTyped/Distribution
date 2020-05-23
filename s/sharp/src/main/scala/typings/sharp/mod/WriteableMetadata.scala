package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteableMetadata extends js.Object {
  /** Number value of the EXIF Orientation header, if present */
  var orientation: js.UndefOr[Double] = js.undefined
}

object WriteableMetadata {
  @scala.inline
  def apply(orientation: js.UndefOr[Double] = js.undefined): WriteableMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(orientation)) __obj.updateDynamic("orientation")(orientation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteableMetadata]
  }
}

