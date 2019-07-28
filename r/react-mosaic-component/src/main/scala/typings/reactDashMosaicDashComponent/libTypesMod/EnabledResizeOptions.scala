package typings.reactDashMosaicDashComponent.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnabledResizeOptions extends ResizeOptions {
  var minimumPaneSizePercentage: js.UndefOr[Double] = js.undefined
}

object EnabledResizeOptions {
  @scala.inline
  def apply(minimumPaneSizePercentage: Int | Double = null): EnabledResizeOptions = {
    val __obj = js.Dynamic.literal()
    if (minimumPaneSizePercentage != null) __obj.updateDynamic("minimumPaneSizePercentage")(minimumPaneSizePercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnabledResizeOptions]
  }
}

