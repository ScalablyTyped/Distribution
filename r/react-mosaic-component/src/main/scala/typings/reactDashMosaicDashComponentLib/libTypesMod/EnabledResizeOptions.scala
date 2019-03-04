package typings
package reactDashMosaicDashComponentLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnabledResizeOptions extends ResizeOptions {
  var minimumPaneSizePercentage: js.UndefOr[scala.Double] = js.undefined
}

object EnabledResizeOptions {
  @scala.inline
  def apply(minimumPaneSizePercentage: scala.Int | scala.Double = null): EnabledResizeOptions = {
    val __obj = js.Dynamic.literal()
    if (minimumPaneSizePercentage != null) __obj.updateDynamic("minimumPaneSizePercentage")(minimumPaneSizePercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnabledResizeOptions]
  }
}

