package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputOptions extends js.Object {
  /** Force format output, otherwise attempt to use input format (optional, default true) */
  var force: js.UndefOr[Boolean] = js.undefined
  /** Quality, integer 1-100 (optional, default 80) */
  var quality: js.UndefOr[Double] = js.undefined
}

object OutputOptions {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined, quality: js.UndefOr[Double] = js.undefined): OutputOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputOptions]
  }
}

