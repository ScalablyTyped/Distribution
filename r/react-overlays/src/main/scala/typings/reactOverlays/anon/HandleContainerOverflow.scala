package typings.reactOverlays.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleContainerOverflow extends js.Object {
  var handleContainerOverflow: js.UndefOr[Boolean] = js.undefined
  var hideSiblingNodes: js.UndefOr[Boolean] = js.undefined
}

object HandleContainerOverflow {
  @scala.inline
  def apply(
    handleContainerOverflow: js.UndefOr[Boolean] = js.undefined,
    hideSiblingNodes: js.UndefOr[Boolean] = js.undefined
  ): HandleContainerOverflow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(handleContainerOverflow)) __obj.updateDynamic("handleContainerOverflow")(handleContainerOverflow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSiblingNodes)) __obj.updateDynamic("hideSiblingNodes")(hideSiblingNodes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleContainerOverflow]
  }
}

