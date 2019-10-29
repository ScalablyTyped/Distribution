package typings.reDashResizable.reDashResizableMod

import typings.reDashResizable.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizableState extends js.Object {
  var direction: js.UndefOr[ResizableDirection] = js.undefined
  var height: Double | String
  var isResizing: js.UndefOr[Boolean] = js.undefined
  var original: js.UndefOr[Anon_Height] = js.undefined
  var resizeCursor: String
  var width: Double | String
}

object ResizableState {
  @scala.inline
  def apply(
    height: Double | String,
    resizeCursor: String,
    width: Double | String,
    direction: ResizableDirection = null,
    isResizing: js.UndefOr[Boolean] = js.undefined,
    original: Anon_Height = null
  ): ResizableState = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resizeCursor = resizeCursor, width = width.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(isResizing)) __obj.updateDynamic("isResizing")(isResizing)
    if (original != null) __obj.updateDynamic("original")(original)
    __obj.asInstanceOf[ResizableState]
  }
}

