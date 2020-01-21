package typings.reResizable.mod

import typings.reResizable.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizableState extends js.Object {
  var direction: js.UndefOr[ResizableDirection] = js.undefined
  var height: Double | String
  var isResizing: js.UndefOr[Boolean] = js.undefined
  var original: js.UndefOr[AnonHeight] = js.undefined
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
    original: AnonHeight = null
  ): ResizableState = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resizeCursor = resizeCursor.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizing)) __obj.updateDynamic("isResizing")(isResizing.asInstanceOf[js.Any])
    if (original != null) __obj.updateDynamic("original")(original.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizableState]
  }
}

